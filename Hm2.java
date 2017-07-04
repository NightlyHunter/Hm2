import java.util.Scanner;

/**
 * Created by night on 02.07.2017.
 */
public class Hm2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner city = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner hobby = new Scanner(System.in);
        Scanner var = new Scanner(System.in);

        System.out.print("Name:");
        String line1 = name.nextLine();
        System.out.print("City:");
        String line2 = city.nextLine();
        System.out.print("Age:");
        int line3 = age.nextInt();
        System.out.print("Hobby:");
        String line4 = hobby.nextLine();
        System.out.println("Выбирете вариант вывода: \n1 - табличный; \n2 - текстовый; \n3 - иной.");
        int line5 = var.nextInt();

        switch (line5) {

            case 1:
                System.out.println("Name:" + line1 + "\nCity:" + line2 + "\nAge:" + line3 + "\nHobby:" + line4);
                break;
            case 2:
                System.out.println("Человек по имени " + line1 + " живет в городе " + line2 + ".\nЭтому человеку " + line3 + " лет и любит он заниматься " + line4 + ".");
                break;
            case 3:
                System.out.println(line1 + " - name\n" + line2 + " - city\n" + line3 + " - age\n" + line4 + " - hobby");
                break;
        }
    }

}
