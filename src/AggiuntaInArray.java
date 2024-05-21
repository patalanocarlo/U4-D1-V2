import java.util.Scanner;
public class AggiuntaInArray {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);


        String[] arrayDiStringhe = new String[5];
        for(int i=0; i< 5;i++) {

            System.out.println("Inserisci una Stringa:" );

            arrayDiStringhe[i] = value.nextLine();
        }

            System.out.println("Inserisci una Stringa aggiuntiva:");

            String stringaAggiuntiva= value.nextLine();

            String[] arrayRisultante = new String[6];

            arrayRisultante[0]= arrayDiStringhe[0];

            arrayRisultante[1]= arrayDiStringhe[1];

            arrayRisultante[2]= stringaAggiuntiva;

            arrayRisultante[3] = arrayDiStringhe[2];

            arrayRisultante[4] = arrayDiStringhe[3];

            arrayRisultante[5] = arrayDiStringhe[4];
            System.out.println("Risultato finale:");
                    for(String stringa : arrayRisultante){
                System.out.println(stringa);
            };
value.close();

        }
    }

