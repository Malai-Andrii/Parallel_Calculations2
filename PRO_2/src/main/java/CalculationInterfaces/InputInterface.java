package CalculationInterfaces;

import javax.swing.*;

import static java.lang.Math.abs;

public interface InputInterface {
    default int GET_B(int i, int variant) {
        i = abs(i);
        if (variant == 1) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 1 / (i * i + 2);
                } else {//не парне
                    return 1 / i;
                }
            }
        }
        if (variant == 2) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 1 / (i * i + 2 + i);
                } else {//не парне
                    return 1 / i;
                }
            }
        }
        if (variant == 3) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 3 / (i * i + 3);
                } else {//не парне
                    return 3 / i;
                }
            }
        }
        if (variant == 4) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 4 / (i * i * i + 3);
            }
        }
        if (variant == 5) {
            return 5 * i * i * i;
        }
        if (variant == 6) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 6 / (i * i);
            }
        }
        if (variant == 7) {
            return 7*i;
        }
        if (variant == 8) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 8 / i;
            }
        }
        if (variant == 9) {
                return 9*i;
        }
        if (variant == 10) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 10 / (i * i + 1);
            }
        }
        if (variant == 11) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {
                    return 11 * i * i;
                } else {//не парне
                    return 11 / i;
                }
            }
        }
        if (variant == 12) {
            if (i % 2 == 0) {//парне
                return (i*i)/12;
            } else {//не парне
                return i;
            }
        }
        if (variant == 13) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 13 / (i + 2);
                } else {//не парне
                    return 13 / (i * i);
                }
            }
        }
        if (variant == 14) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 14 / (i * i * i);
                } else {//не парне
                    return 1 / (i + 14);
                }
            }
        }
        if (variant == 15) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return i;
                } else {//не парне
                    return 15 / i;
                }
            }
        }
        if (variant == 16) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 16 / (i * i * i);
            }
        }
        if (variant == 17) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який нульовий i, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 17 / (i * i);
            }

        }
        if (variant == 18) {
            return 18 / ((i + 18) * (i + 18));
        }
        if (variant == 19) {
                if (i % 2 == 0) {//парне
                    return 19 / (i * i + 1);
                } else {//не парне
                    return 19;
                }
        }
        if (variant == 20) {
            return 20/(i*i*i+20);
        }
        if (variant == 21) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який i=0, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 21 / (i * i * i * i);
            }
        }
        if (variant == 22) {
                if (i % 2 == 0) {//парне
                    return 22*i;
                } else {//не парне
                    return 22;
                }
        }
        if (variant == 23) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який i=0, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 23 / i;
                } else {//не парне
                    return 23 / (i * i);
                }
            }
        }
        if (variant == 24) {
                if (i % 2 == 0) {//парне
                    return 24/(i*i+4) ;
                } else {//не парне
                    return 24;
                }
        }
        if (variant == 25) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який i=0, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 25;
                } else {//не парне
                    return 25 / (i * i * i);
                }
            }
        }
        if (variant == 26) {
            return 26*i*i*i;
        }
        if (variant == 27) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який i=0, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 27 / (i * i);
            }
        }
        if (variant == 28) {
            return 28*i;
        }
        if (variant == 29) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який i=0, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                return 29 / i;
            }
        }
        if (variant == 30) {
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Ти чо, який i=0, глянь у знаменник свого варіанту", "Хмммм", JOptionPane.PLAIN_MESSAGE);
                return 9999999;
            } else {
                if (i % 2 == 0) {//парне
                    return 30 / i;
                } else {//не парне
                    return 30 / (i * i);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Варіант не знайдено", "Помилка", JOptionPane.PLAIN_MESSAGE);
            return 0;
        }
    }
}