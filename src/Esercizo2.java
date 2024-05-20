import java.util.Scanner;
public class Esercizo2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa :");
        String primaStringa= value.nextLine();

        System.out.println("Inserisci la seconda stringa :");
        String secondaStringa= value.nextLine();

        System.out.println("Inserisci la terza stringa :" );
        String terzaStringa= value.nextLine();

        String concatenazioneOrdinata = (primaStringa + " " + secondaStringa + " " + terzaStringa);
        String concatenazioneInversa = (terzaStringa + " " + secondaStringa + " " + primaStringa);

        System.out.println("Concatenazione in senso ordinato:" + concatenazioneOrdinata);
        System.out.println("Concatenazione in senso Contrario" + concatenazioneInversa);
    value.close();
    }
}
