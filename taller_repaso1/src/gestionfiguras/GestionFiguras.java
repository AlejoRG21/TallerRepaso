package gestionfiguras; import java.util.Scanner;

public class GestionFiguras {
    public static void main(String[] args) {
        String color;
        int op;
        float base, altura, radio;
        Scanner teclado = new Scanner(System.in);
        do {

            System.out.println("Elija la opción: \n");
            System.out.println("1. Crear triángulo ");
            System.out.println("2. Crear rectángulo ");
            System.out.println("3. Crear círculo ");
            System.out.println("4. Salir ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    System.out.println("ingrese la base ");
                    base = teclado.nextFloat();
                    System.out.println("ingrese la altura ");
                    altura = teclado.nextFloat();
                    System.out.println("ingrese color ");
                    color = teclado.next(); //metodo
                    resul(new ClaseTriangulo(base,altura,color));
                    break;
                case 2: System.out.println("ingrese la base ");
                    base=teclado.nextFloat();
                    System.out.println("ingrese la altura ");
                    altura=teclado.nextFloat();
                    System.out.println("ingrese color ");
                    color=teclado.next(); //metodo

                    resul(new ClaseRectangulo(base, altura, color));
                    break;
                case 3:
                    System.out.println("ingrese el radio ");
                    radio = teclado.nextFloat();
                    System.out.println("ingrese color ");
                    color = teclado.next(); //metodo
                    resul(new ClaseCirculo(radio,color));
                    break;
                case 4:
                    //error no se podia salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
            }

        } while (op != 4);

    }

    public static void resul(ClaseFigura f) {
        System.out.println("el color de la figura es " + f.getcolor());
        System.out.println("el area es " + f.area());
    }

}