import java.util.Scanner;;

public class AssignQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double si, p, roi;
        int t;
        System.out.println("Enter Principle Amount: ");
        p = sc.nextDouble();
        System.out.println("Enter RoI in percent: ");
        roi = (sc.nextDouble()) / 100;
        System.out.println("Enter time in Years: ");
        t = sc.nextInt();
        si = p * roi * t;
        System.out.println("Simple Interest for given data is: " + si);
        sc.close();
    }
}
