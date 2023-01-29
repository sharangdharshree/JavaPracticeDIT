import java.util.Scanner;;

public class AssignQues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bs, ns, gs;
        double hra = 0.5d;
        double ta = 0.3d;
        double ma = 0.25d;
        double pf = 0.1d;
        double tax = 0.1d;
        System.out.println("Enter Basic Salary");
        bs = sc.nextDouble();
        gs = bs + bs * hra + bs * ta + bs * ma;
        ns = gs - tax * gs - pf * bs;
        sc.close();
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("\t\t   Salary Slip");
        System.out.println("--------------------------------------------------");
        System.out.println("Name: Sharangdhar Shree");
        System.out.println("--------------------------------------------------\n");
        System.out.println("Basic Salary:    " + bs);
        System.out.println("HRA              " + hra * bs);
        System.out.println("TA               " + ta * bs);
        System.out.println("MA               " + ma * bs);
        System.out.println("Gross Salary:    " + gs + "\n");
        System.out.println("PF Deduction:    " + pf * bs);
        System.out.println("TAX Deduction:   " + tax * gs + "\n");
        System.out.println("Net Salary:      " + ns);
        System.out.println("\n--------------------------------------------------");

    }
}
