import java.util.Scanner;
public class Esercizio3PerimetroTriangolo {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double primoLato= value.nextDouble();
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double secondoLato = value.nextDouble();
        double area= areatriangolo (primoLato , secondoLato);
        System.out.println("L'area del rettangolo è:" + area);
        value.close();
    }
    public static double areatriangolo(double primoLato,double secondoLato){
return 0.5 * primoLato * secondoLato;
    }
}
