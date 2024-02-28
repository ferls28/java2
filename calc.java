import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner ElCreador = new Scanner(System.in);

        System.out.println("¿Quieres ver el programa? (Si/No)");
        String R1 = ElCreador.nextLine();

        if (R1.equalsIgnoreCase("si")) {
            System.out.println("aquí está, mamada");

        } else if (R1.equalsIgnoreCase("no")) {
            System.out.println("entonces pa que andas chingando? >:(");
            ElCreador.close();
            return;
        }

        System.out.println("como te llamas pa?");
        String N = ElCreador.nextLine();

        System.out.println("hola " + N + " que quieres calcular,triangulo o cuadrado? 1 = cuadrado, 2 triangulo");
        String R2 = ElCreador.nextLine();

        if (R2.equalsIgnoreCase("1")) {
            System.out.println("quieres el area o el perimetro? 1 = area, 2 perimetro");
            String O1 = ElCreador.nextLine();

            if (O1.equalsIgnoreCase("1")) {
                System.out.println("dime el valor el lado 1 ");
                double L1 = ElCreador.nextDouble();


                double area = L1 * L1;

                System.out.println(" el area de tu cuadrado es " + area);
                ElCreador.close();
            }

            if (O1.equalsIgnoreCase("2")) {
                System.out.println("dime el valor de un lado del cuadrado");
                double l1 = ElCreador.nextDouble();

                double perimetro = l1 * 4;

                System.out.println("el perimetro de tu cuadrado es " + perimetro);
                ElCreador.close();
            }
        }

        if (R2.equalsIgnoreCase("2")) {

            System.out.println("quieres el area o el perimetro? 1 = area, 2 perimetro");
            String T1 = ElCreador.nextLine();

            if (T1.equalsIgnoreCase("1")) {
                System.out.println("dime la base");
                double B1 = ElCreador.nextDouble();

                System.out.println("dime la altura");
                double A1 = ElCreador.nextDouble();

                double areaT = (B1 * A1) / 2;

                System.out.println("el area de tu triangulo es " + areaT);
            }

            if (T1.equalsIgnoreCase("2")) {
                System.out.println("dime el valor de un lado del triangulo");
                double TA1 = ElCreador.nextDouble();

                double perimetroT = TA1 * 3;

                System.out.println("el perimetro de tu triangulo es " + perimetroT);
                ElCreador.close();
            }
        }
    }
}
