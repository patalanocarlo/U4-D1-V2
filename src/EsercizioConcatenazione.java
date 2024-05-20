import java.util.Scanner;
public class EsercizioConcatenazione {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Ora inserisci una Stringa");
        String stringaInIngresso= value.nextLine();
        System.out.println("Ora inserisci un Numero Intero");
        int numeroInIngresso = value.nextInt() ;
                String Concatenazione = concatena (stringaInIngresso, numeroInIngresso);
        System.out.println("Risultato Concatenazione :" +   Concatenazione);

    }
    public static String concatena (String str ,int num){
        return str + num;
    }

}
