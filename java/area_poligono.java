import java.util.Scanner;
void main() {
    Scanner scanner = new Scanner(System.in);
    int i;
    do {
        System.out.print("Introduzca el número de lados de un polígono (3-4)");
        i = scanner.nextInt();
        if (i < 3 || i > 4) {
            System.out.println("Error: El número debe estar entre 3 y 10. Inténtelo de nuevo.");
        }
    } while (i < 3 || i > 10); // La condición del bucle: se repite si 'i' no está en el rango
    System.out.println("Número válido introducido: " + i);
    System.out.println("Introduzca la altura del poligono");
    int a = scanner.nextInt();
    System.out.println("Introduzca la base del poligono");
    int b = scanner.nextInt();
    if (i==3){
        int c=(b*a)/2;
        System.out.println("El área es= " + c );
    }
    if (i==4){
        int d =b*a;
        System.out.println("El área es= " + d);
    }
}
