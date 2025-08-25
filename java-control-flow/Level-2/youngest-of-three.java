import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Heights
        System.out.print("Enter height of Amar: ");
        int hAmar = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        int hAkbar = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        int hAnthony = sc.nextInt();

        // Youngest
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Tallest
        if (hAmar >= hAkbar && hAmar >= hAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (hAkbar >= hAmar && hAkbar >= hAnthony) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        sc.close();
    }
