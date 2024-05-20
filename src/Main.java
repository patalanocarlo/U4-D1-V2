public class Main {
    public static void main(String[] args) {
        System.out.println("Ciao a tutti!");
        System.out.println("Il mio prima programma in back-end");
        //Tutto dovrà essere tipizzato.
        boolean myBoolean = true ;
        myBoolean = false;
        System.out.println(myBoolean);


        byte numeroPiccolo = 100 ;
short numeroUnPoMenoPiccolo = 1000;
int numeroIntero= 10000;
long numeroInteroGrandissimo=10000000;
numeroInteroGrandissimo= numeroPiccolo;
        System.out.println(numeroInteroGrandissimo);
        double numDecimale= 0.5;
        float altroDecimale = 0.5f;
        System.out.println(numDecimale);
        //------------------String---------------//
       String presentazioneDiMe = "Ciao a tutti";
        System.out.println("La lunghezza della stringa è :" + presentazioneDiMe.length());
        System.out.println(presentazioneDiMe);
        System.out.println(presentazioneDiMe.toUpperCase());
        System.out.println("La stringa inizia con:" + presentazioneDiMe.charAt(0));
    }
}