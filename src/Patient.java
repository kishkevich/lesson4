import javax.naming.Name;
import java.util.Arrays;
import java.util.Scanner;

public class Patient {

    Scanner scan = new Scanner(System.in);
    //String fullName ;
    String name;
    String lastName;
    int age ;
    Boolean healthy;
    String[] arrName ;
    int [] arrayAge;
    Patient[] patientsArray;
    //int index =0;

    /*Patient (String fullName, int age, Boolean healthy){
    this.fullName;
    this.age;
    this.healthy;
}*/
public void addInfo (){
    //fullName = scan.nextLine();
    lastName = scan.nextLine();
    name = scan.next();
    age = scan.nextInt();
    healthy = scan.nextBoolean();
    System.out.println("Пациент -  "+ lastName + name);
    System.out.println("Возраст - "+ age);
    if (healthy==true){
        System.out.println("Состояние здоровья - здоров");
    }
    else System.out.println("Состояние здоровья - болен");

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
/*public void addName(){
    for (int i=0;i<arrName.length;i++){
        arrName[i]=name;
    }
//arrName [index] = name;
//index++;
//System.out.println(Arrays.toString(arrName));
}

    public void addAge() {
    for (int i=0;i<arrayAge.length;i++ )
        arrayAge [i]= age;
            }*/
}
