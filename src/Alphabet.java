import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your alphabets");
        char alpha;
        alpha=sc.nextLine().charAt(0);
        switch (alpha){
            case 'a':
            case 'A':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'B':
                System.out.println("Consonant");
                break;
            case 'c':
            case 'C':
                System.out.println("Consonant");
                break;
            case 'd':
            case 'D':
                System.out.println("Consonant");
                break;
            case 'e':
            case 'E':
                System.out.println("Vowel");
                break;
            case 'f':
            case 'F':
                System.out.println("Consonant");
                break;
            case 'g':
            case 'G':
                System.out.println("Consonant");
                break;
            case 'h':
            case 'H':
                System.out.println("Consonant");
                break;
            case 'i':
            case 'I':
                System.out.println("Vowel");
                break;
            case 'j':
            case 'J':
                System.out.println("Consonant");
                break;
            case 'k':
            case 'K':
                System.out.println("Consonant");
                break;
            case 'l':
            case 'L':
                System.out.println("Consonant");
                break;
            case 'm':
            case 'M':
                System.out.println("Consonant");
                break;
            case 'n':
            case 'N':
                System.out.println("Consonant");
                break;
            case 'o':
            case 'O':
                System.out.println("Vowel");
                break;
            case 'p':
            case 'P':
                System.out.println("Consonant");
                break;
            case 'q':
            case 'Q':
                System.out.println("Consonant");
                break;
            case 'r':
            case 'R':
                System.out.println("Consonant");
                break;
            case 's':
            case 'S':
                System.out.println("Consonant");
                break;
            case 't':
            case 'T':
                System.out.println("Consonant");
                break;
            case 'u':
            case 'U':
                System.out.println("Vowel");
                break;
            case 'v':
            case 'V':
                System.out.println("Consonant");
                break;
            case 'w':
            case 'W':
                System.out.println("Consonant");
                break;
            case 'x':
            case 'X':
                System.out.println("Consonant");
                break;
            case 'y':
            case 'Y':
                System.out.println("Consonant");
                break;
            case 'z':
            case 'Z':
                System.out.println("Consonant");
                break;
            default:
                System.out.println("Please enter valid alphabet");
        }


    }
}
