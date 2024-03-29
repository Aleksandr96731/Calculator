import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        //-------------------------------------------------
        while(true) {
            System.out.print("Введите строку: ");

            String str = scanner.nextLine();
            if(str.equals("quit"))  break;


            String[] parts = str.split(" ");

            if(parts.length != 3 | parts[1].length() != 1){
                System.out.println("throws Exception");
                continue;
            }
//          if (parts[1].length() != 1) { System.out.println("throws Exception");  continue;   }
            //-------------------------------------------------
            int num1 = Integer.parseInt(parts[0]);
            char oper = parts[1];
            int num2 = Integer.parseInt(parts[0]);
            System.out.println("Вы ввели строку: " + parts[0]);
            System.out.println("Вы ввели строку: " + parts[1]);
            System.out.println("Вы ввели строку: " + parts[2]);}

        }
//        String str = scanner.next();                // до пробела
//        int i = scanner.nextInt();
//        String line = scanner.nextLine();

//while(true){    if(scanner.hasNext()){
//        String line1 = scanner.nextLine();    }}


    }
}