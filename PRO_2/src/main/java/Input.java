import CalculationInterfaces.InputInterface;
import StyleInterfaces.CustomWindow;
import StyleInterfaces.Styled;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class Input extends JFrame implements CustomWindow, Styled, InputInterface {
    private JPanel panel;
    private JPanel p1;
    private JCheckBox randomGenericCheckBox;
    private JTextArea matrixAField;
    private JTextArea vectorField;
    private JButton generateButton;
    private JTextField nField;
    private JButton interimResultsButton;
    private JButton outputButton;
    private JPanel genericPanel;
    private JLabel informer;
    private JButton calculateButton;
    private JComboBox variantBox;
    private int n;
    int[][] A;
    int[] B;
    public Input() {
        super("PRO_LAB_BY_KO$_2020");
        draw();
        setContentPane(panel);

        nField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {
                checkIfNIsNumeric();
            }
        });
        randomGenericCheckBox.addActionListener(e -> {
            if(randomGenericCheckBox.isSelected()){
                generateButton.setText("Генерувати");
            }
            else{
                generateButton.setText("Далі");
            }
        });
        calculateButton.addActionListener(e -> {
            interimResultsButton.setVisible(true);
            outputButton.setVisible(true);


            calculateButton.setVisible(false);
                });
        generateButton.addActionListener(e -> {
            try {
                if (checkIfNIsNumeric()) {
                    if (randomGenericCheckBox.isSelected()) {
                        vectorField.setText("Будь ласка, зачекайте.\nПроводиться генерація чисел....");
                        randomInputMatrix(n);
                    }
                    else{
                        notRandomInputMatrix(n);
                    }
                    int i, j;
                    StringBuilder data = new StringBuilder();
                    for (i = 0; i < n; i++) {
                        for (j = 0; j < n; j++) {
                            data.append(A[i][j]).append("\t");
                        }
                        data.append("\n");
                    }
                    vectorBGenerator(n);
                    StringBuilder data2 = new StringBuilder();
                    for (i = 0; i < n; i++) {
                            data2.append(B[i]).append("\t");
                    }
                    informer.setText("");
                    matrixAField.setText(data.toString());
                    vectorField.setText(data2.toString());
                    informer.setForeground(GREEN1);
                    informer.setText("Операція успішно проведена.");
                    calculateButton.setVisible(true);
                }else {
                    calculateButton.setVisible(false);
                }
            }
            catch(Exception ex){
                informer.setForeground(Color.RED);
                informer.setText("Вибачте, сталася помилка. Скоріше за все ви помилилися з розрядністю матриці. Перевірте все і спробуйте ще раз.");
            }
        });
    }
    private void vectorBGenerator(int n){
        B = new int[n];
        int i;
        System.out.println("B[i]");
        try {
            for (i = 0; i < B.length; i++) {
                B[i] = GET_B(i+1, (variantBox.getSelectedIndex() + 1));
            }
            for (i = 0; i < B.length; i++) {
                System.out.print(B[i] + " ");
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    private void randomInputMatrix(int n){
        int i,j;
        System.out.println("A[i][j]");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                A[i][j] = (int)(Math.random() * n * 10);
                System.out.print(A[i][j] + (j == n - 1?"\n":"\t"));
            }
        }
    }
    private void notRandomInputMatrix(int n){
        List<String> mat = new LinkedList<>();
        String[][] matrixS = new String[n][n];
        for (String line : matrixAField.getText().split("\\n")) mat.add(line);
        int i,j;
        for(i=0;i<mat.size();i++){
            String line = mat.get(i);
            String[] numbers =  line.split(" ");
            for (j = 0; j < numbers.length; j++) {
                matrixS[i][j] = numbers[j];
            }
        }
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                A[i][j] = Integer.parseInt(matrixS[i][j]);
                System.out.print(A[i][j] + (j == n - 1?"\n":"\t"));
            }
        }
    }
    public void draw() {
        this.setVisible(true);
        this.setEnabled(true);
        setStyle();
    }
    public void setStyle() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(HALF_SCREEN);
        this.setPreferredSize(HALF_SCREEN);
        this.setBounds(BOUNDS(HALF_WIDTH, HALF_HEIGHT));
        //matrixAField.setLineWrap(true);
        //vectorField.setLineWrap(true);
        matrixAField.setWrapStyleWord(true);
        vectorField.setWrapStyleWord(true);
        matrixAField.setTabSize(3);
        vectorField.setTabSize(3);
        calculateButton.setVisible(false);
        interimResultsButton.setVisible(false);
        outputButton.setVisible(false);
    }
    public void close() {
        this.dispose();
    }
    private boolean checkIfNIsNumeric(){
        if("-".equals(nField.getText())){
            n = 1;
            JOptionPane.showMessageDialog(null, "Уявіть собі квадратну матрицю розмірності n із n у діапазоні -oo <= n <= 0.\n" +
                    "Отже мінімальне n=1", "Увага", JOptionPane.PLAIN_MESSAGE);
            nField.setText(""+n);
        }
        if(isNumeric(nField.getText())){
            n = Integer.parseInt(nField.getText());
            if(n>5000){
                n = 5000;
                JOptionPane.showMessageDialog(null, "Не дозволяється використовувати квадратну матрицю із n>5000.\n" +
                        "Обмеження накладається лише через проблеми із пам'яттю комп'ютера", "Увага", JOptionPane.PLAIN_MESSAGE);
                nField.setText(""+n);
            }
            if(n<1){
                n = 1;
                JOptionPane.showMessageDialog(null, "Уявіть собі квадратну матрицю розмірності n із n у діапазоні -oo <= n <= 0.\n" +
                        "Отже мінімальне n=1", "Увага", JOptionPane.PLAIN_MESSAGE);
                nField.setText(""+n);
            }
            A = new int[n][n];
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Розмірність матриці неправильна.\nНе число.", "Хмммм", JOptionPane.PLAIN_MESSAGE);
            return false;
        }
    }
}
