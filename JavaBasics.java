import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte age = 22;
        System.out.println(age);
        int a = 3;
        int b = 5;
        int c = a;
        System.out.println(a == c);
        a++;
        c += 3;
        System.out.println("a is " + a + " and c is " + c);
        String name = sc.nextLine();
        System.out.println("Your Name is " + name);
    }
}
