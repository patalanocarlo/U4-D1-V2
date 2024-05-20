import java.util.Scanner;
public class Esercizio3PerimetroRettangolo {
    public static void main(String[] args) {
Scanner value= new Scanner(System.in);

System.out.println("Inserisci la lunghezza del primo lato del rettangolo:");
        double primoLato = value.nextDouble();

        System.out.println("Inserisci la lunghezza del secondo lato del rettangolo:");
        double secondoLato = value.nextDouble();

        double perimetro  = rettangolo(primoLato , secondoLato);
        System.out.println("Il perimetro del rettangolo è :" + perimetro);
        value.close();

    }
    public static double rettangolo ( double primoLato , double secondoLato){
        return  2*(primoLato + secondoLato);
    }
}
