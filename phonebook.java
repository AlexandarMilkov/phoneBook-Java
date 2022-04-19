import java.util.Scanner;
import java.util.TreeMap;

public class phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        TreeMap<String,String> phonebook = new TreeMap<>();

        while (!input.equals("search")){
            String[] nameAndPhone = input.split("-");
            String name = nameAndPhone[0];
            String number = nameAndPhone[1];
            phonebook.put(name,number);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")){

            if (phonebook.containsKey(input)){
                System.out.println(input + " -> " + phonebook.get(input));
            }
            else {
                System.out.println("Contact "+ input +" does not exist.");
            }
            input = scanner.nextLine();
        }
    }
}
