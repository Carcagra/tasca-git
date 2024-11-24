
package ud4funciones;

public class Ejercicio43 {
        static void dibujarRectangulo(int ancho, int alto) {
                
                if (ancho <= 0 || alto <= 0) {
                        System.out.println("Error: El ancho y el alto deben ser valores positivos.");
                        return; // Salir de la función si hay un error
                }

                for (int i = 0; i < alto; i++) {
                        for (int j = 0; j < ancho; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args) {
                dibujarRectangulo(-5, 8);
                dibujarRectangulo(5, 8);
        }
}
