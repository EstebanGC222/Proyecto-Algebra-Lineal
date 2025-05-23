import javax.swing.*;

public class ProyectoLineal {

    public static void main(String[] args) {

        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas (materiales):"));

        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas (productos):"));

        double[][] matriz = new double[filas][columnas + 1];

        JOptionPane.showMessageDialog(null,"Ingrese los datos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas + 1; j++) {
                matriz[i][j]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dato de la fila " + (i + 1) + " y la columna " + (j + 1) + ":"));

            }
        }

        // Aplicamos el método de eliminación de Gauss
        for (int k = 0; k < matriz.length - 1; k++) {
            // Buscamos el pivote máximo en la columna k
            int max = k;
            for (int i = k + 1; i < matriz.length; i++) {
                if (Math.abs(matriz[i][k]) > Math.abs(matriz[max][k])) {
                    max = i;
                }
            }
            // Intercambiamos la fila k con la fila del pivote máximo
            if (max != k) {
                double[] temp = matriz[k];
                matriz[k] = matriz[max];
                matriz[max] = temp;
            }
            // Verificamos que el pivote no sea cero
            if (matriz[k][k] != 0) {
                // Eliminamos los elementos debajo del pivote
                for (int i = k + 1; i < matriz.length; i++) {
                    double factor = matriz[i][k] / matriz[k][k];
                    for (int j = k; j < matriz[0].length; j++) {
                        matriz[i][j] = matriz[i][j] - factor * matriz[k][j];
                    }
                }
            }
        }

        // Aplicamos la sustitución regresiva
        double[] solucion = new double[matriz.length]; // Array para guardar la solución
        for (int i = matriz.length - 1; i >= 0; i--) {
            // Calcular el valor de la variable i
            double suma = 0;
            for (int j = i + 1; j < matriz.length; j++) {
                suma = suma + matriz[i][j] * solucion[j];
            }
            solucion[i] = (matriz[i][matriz[0].length - 1] - suma) / matriz[i][i];
        }

        System.out.println("La solución del sistema es:");
        for (int i = 0; i < solucion.length; i++) {
            System.out.println("Producto " + (i + 1) + " = " + solucion[i]);
        }
    }
}