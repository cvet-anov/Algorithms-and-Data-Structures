package LaboratoryExercises1;
import java.util.Scanner;

public class Initials {

    static void printInitials(String name)
    {
        char[] chars = name.toCharArray();
        System.out.print(Character.toUpperCase(chars[0]));
        for (int i=0;i<name.length();i++)
        {
            if (chars[i]==' '){
                System.out.print(Character.toUpperCase(chars[i+1]));
            }
        }
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        String name;
        input.nextLine();

        for(int i=0; i<n; i++){
            name = input.nextLine();
            printInitials(name);
            System.out.println();
        }
    }
}

