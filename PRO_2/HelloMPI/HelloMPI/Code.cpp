#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<mpi.h>
#include<iostream>
#include<time.h>

using namespace std;

// I used one-dimensional array, because no difference that is vector-column or vector-row,
// that will be defined by the result of a function and in which function you`re using your vector-argument

void AddMatrix(double** A, double** B, double** C, int n);
void MulMatrix(double** A, double** B, double** C, int n);
void AddColumnWithConstMul(double* A, double* B, double* C, int n); // adding of two vectors, one of wich is multiplied by a constant
void AddColumn(double* A, double* B, double* C, int n);
void MulMatrixAndVector(double** A, double* B, double* C, int n);
void MulVectorAndMatrix(double* A, double** B, double* C, int n);
double MulColumnAndRow(double* A, double* B, int n);
void MulNumberAndColumn(double A, double* B, double* C, int n);


void main(int argc, char* argv[])
{
	int rank, n;
	// here must be reading of the dimension from file
	double start_time, end_time;
	MPI_Status status;

	// Start data
	int** A = new int*[n];
	int** A1 = new int*[n];
	int** A2 = new int*[n];
	int** B2 = new int*[n];
	int* b1 = new int[n];
	int* c1 = new int[n];
	double** C2 = new double*[n];
	double* b = new double[n];
	// Intermediate data
	double **B2_plus_C2 = new double*[n];
	double *y1 = new double[n];
	double *y2 = new double[n];
	double **Y3 = new double*[n];
	double *b1_plus_4_c1 = new double[n];
	double *Y3_mul_y1 = new double[n];
	double **Y3_sqr = new double*[n];
	double trans_y2_mul_y1;
	double *Y3_sqr_mul_y2 = new double[n];
	double *y2y1_mul_Y3y1 = new double[n];
	double *Y3y1_plus_Y3sqr_y2 = new double[n];
	double *Y3y1_plus_Y3sqr_y2_plus_y2y1Y3y1 = new double[n];
	double *result = new double[n];

	for (int i = 0; i < n; i++)
	{
		A[i] = new int[n];
		A1[i] = new int[n];
		A2[i] = new int[n];
		B2[i] = new int[n];
		C2[i] = new double[n];
		B2_plus_C2[i] = new double[n];
		Y3[i] = new double[n];
		Y3_sqr[i] = new double[n];
	}


	// -----------------------------------------------------------
	//
	// Here must be filling the start data from file
	//
	// -----------------------------------------------------------

	MPI_Init(&argc, &argv);
	MPI_Comm_rank(MPI_COMM_WORLD, &rank);

	if (rank == 0)
	{
		// -----------------------------------------------------------
		//
		// Between these statements must be the code, that writes the intermediate data in the file 
		// that will be shown by the interface, but I fuck this shit, I`m too lazy, I prefer to
		// fap at the nude bithes, be drunk, feel the boobs of Halia 3.5 and fuck about.
		//
		// -----------------------------------------------------------
		start_time = MPI_Wtime();
		AddMatrix((double**)B2, (double**)C2, B2_plus_C2, n);
		MulMatrix((double**)A2, B2_plus_C2, Y3, n);
		MPI_Send(Y3, n*n, MPI_DOUBLE, 1, 0, MPI_COMM_WORLD);
		MPI_Send(Y3, n*n, MPI_DOUBLE, 2, 0, MPI_COMM_WORLD);
		MPI_Recv(y1, n, MPI_DOUBLE, 1, 0, MPI_COMM_WORLD, &status);
		MulMatrixAndVector(Y3, y1, Y3_mul_y1, n);
		MPI_Send(Y3_mul_y1, n, MPI_DOUBLE, 2, 0, MPI_COMM_WORLD);
		MPI_Recv(Y3_sqr_mul_y2, n, MPI_DOUBLE, 1, 0, MPI_COMM_WORLD, &status);
		AddColumn(Y3_mul_y1, Y3_sqr_mul_y2, Y3y1_plus_Y3sqr_y2, n);
		MPI_Recv(y2y1_mul_Y3y1, n, MPI_DOUBLE, 2, 0, MPI_COMM_WORLD, &status);
		AddColumn(Y3y1_plus_Y3sqr_y2, y2y1_mul_Y3y1, Y3y1_plus_Y3sqr_y2_plus_y2y1Y3y1, n);
		MulVectorAndMatrix(Y3y1_plus_Y3sqr_y2_plus_y2y1Y3y1, Y3, result, n);
		end_time = MPI_Wtime();
		
		// These will be also written in the file, maybe we`ll make the diagram using this shit, 
		// now I don`t give a fuck

		// cout << "Clock resolution: " << MPI_Wtick() << " secs" << endl;
		// cout << "Thread " << rank << " execution time: " << end_time - start_time << endl;
	}

	if (rank == 1)
	{
		MulMatrixAndVector((double**)A, b, y1, n);
		MPI_Send(y1, n, MPI_DOUBLE, 0, 0, MPI_COMM_WORLD);
		MPI_Recv(y2, n, MPI_DOUBLE, 2, 0, MPI_COMM_WORLD, &status);
		trans_y2_mul_y1 = MulColumnAndRow(y2, y1, n);
		MPI_Send(&trans_y2_mul_y1, 1, MPI_DOUBLE, 2, 0, MPI_COMM_WORLD);
		MPI_Recv(Y3, n*n, MPI_DOUBLE, 0, 0, MPI_COMM_WORLD, &status);
		MulMatrix(Y3, Y3, Y3_sqr, n);
		MulMatrixAndVector(Y3, y2, Y3_sqr_mul_y2, n);
		MPI_Send(Y3_sqr_mul_y2, 1, MPI_DOUBLE, 0, 0, MPI_COMM_WORLD);
	}

	if (rank == 2)
	{
		AddColumnWithConstMul((double*)b1, (double*)c1, b1_plus_4_c1, n);
		MulMatrixAndVector((double**)A1, b1_plus_4_c1, y2, n);
		MPI_Send(y2, n, MPI_DOUBLE, 1, 0, MPI_COMM_WORLD);
		MPI_Recv(&trans_y2_mul_y1, 1, MPI_DOUBLE, 1, 0, MPI_COMM_WORLD, &status);
		MPI_Recv(Y3_mul_y1, 1, MPI_DOUBLE, 0, 0, MPI_COMM_WORLD, &status);
		MulNumberAndColumn(trans_y2_mul_y1, Y3_mul_y1, y2y1_mul_Y3y1, n);
		MPI_Send(y2y1_mul_Y3y1, 1, MPI_DOUBLE, 0, 0, MPI_COMM_WORLD);
		
	}

	MPI_Finalize();

	for (int i = 0; i < n; i++) {
		delete[] A[i];
		delete[] A1[i];
		delete[] A2[i];
		delete[] B2[i];
		delete[] C2[i];
		delete[] Y3[i];
		delete[] B2_plus_C2[i];
		delete[] Y3_sqr[i];
	}

	delete[] b1;
	delete[] b;
	delete[] c1;
	delete[] y1;
	delete[] y2;
	delete[] b1_plus_4_c1;
	delete[] Y3_mul_y1;
	delete[] Y3_sqr_mul_y2;
	delete[] y2y1_mul_Y3y1;
	delete[] Y3y1_plus_Y3sqr_y2;
	delete[] Y3y1_plus_Y3sqr_y2_plus_y2y1Y3y1;
	delete[] result;

}

void AddMatrix(double** A, double** B, double** C, int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			C[i][j] = A[i][j] + B[i][j];
		}
	}
}

void MulMatrix(double** A, double** B, double** C, int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			C[i][j] = 0;
			for (int loop = 0; loop < n; loop++)
				C[i][j] += A[i][loop] * B[loop][j];
		}
	}
}

void AddColumnWithConstMul(double* A, double* B, double* C, int n) {
	for (int i = 0; i < n; i++) {
		C[i] = A[i] + 4 * B[i];
	}
}

void AddColumn(double* A, double* B, double* C, int n) {
	for (int i = 0; i < n; i++) {
		C[i] = A[i] + B[i];
	}
}

void MulMatrixAndVector(double** A, double* B, double* C, int n) {
	for (int i = 0; i < n; i++) {
		C[i] = 0;
		for (int loop = 0; loop < n; loop++)
			C[i] += A[i][loop] * B[loop];
	}
}

void MulVectorAndMatrix(double* A, double** B, double* C, int n) {
	for (int i = 0; i < n; i++) {
		C[i] = 0;
		for (int loop = 0; loop < n; loop++)
			C[i] += A[loop] * B[i][loop];
	}
}

double MulColumnAndRow(double* A, double* B, int n) {
	double C = 0;
	for (int i = 0; i < n; i++)
		C += A[i] * B[i];
	return C;
}

void MulNumberAndColumn(double A, double* B, double* C, int n) {
	for (int i = 0; i < n; i++)
		C[i] = A * B[i];
}

