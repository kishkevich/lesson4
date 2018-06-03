import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) throws IOException{
        Scanner scan = new Scanner(System.in);
//Patient patient = new Patient();
        Patient patient1 = new Patient();
        patient1.addInfo();
        Patient patient2 = new Patient();
        patient2.addInfo();
        Patient patient3 = new Patient();
        patient3.addInfo();

        Patient[] patientsArray = {patient1, patient2, patient3};


        for (Patient patient : patientsArray) {
            printPatient(patient);
        }

        System.out.println("\nВыбери критерий поиска 1 - поиск по имени; 2 - поиск по возрасту.");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        switch (i) {
            case 1:
                findName(patientsArray);
                break;
            case 2:
                findAge(patientsArray);
                break;
            default:
                System.out.println("Отказ в поиске");
                break;
        }

    }

    private static void findAge(Patient[] patientsArray) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст пациента:");

        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < patientsArray.length; i++) {
            if (patientsArray[i].getAge() == t) {
                printPatient(patientsArray[i]);
            }
        }
    }

    private static void findName(Patient[] patientsArray) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя пациента:");

        String t = bufferedReader.readLine();
        for (int i = 0; i < patientsArray.length; i++)
            if (patientsArray[i].getName().toUpperCase().contains(t.toUpperCase())) {
                printPatient(patientsArray[i]);
            }
    }
    private static void printPatient(Patient patient) {
        System.out.println("Пациент  " + patient.getName() + " - Возраст = " + patient.getAge());

    }
//int searchAge ;
//System.out.println("Введите возраст"+ searchAge);
       // searchAge=scan.nextInt();

        //Patient [] patiens = {patient1,patient2,patient3};
        //System.out.println(patiens);
/*System.out.println("введите имя" );

    String  inp =scan.next();
    String name = scan.nextLine();
    int i;
    for(i=0; i < patient.length; i++){
        if((patient[i].equals(inp[1])) && (patient[i][0].equals(inp[0]))) {
            System.out.println(numbers[i][0]+ ": " + numbers[i][1]);
            break;

    }*/

}


