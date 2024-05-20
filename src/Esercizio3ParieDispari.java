import java.util.Scanner;
public class Esercizio3ParieDispari {
    public static void main(String[] args) {
        Scanner value= new Scanner(System.in);
        System.out.println("Inserisci qui Il numero:");
        int numeroInserito=value.nextInt();
        int risultatoConfronto = ParioDispari (numeroInserito);
        if(risultatoConfronto == 0){
            System.out.println("Il numero inserito è Pari");

        }else {
            System.out.println("Il numero inserito è Dispari");
            value.close();
        }
    }
    public  static  int ParioDispari(int numeroInserito){
        if (numeroInserito % 2 == 0){
return 0;
        }else {
            return 1;
        }
    }
}
