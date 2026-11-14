import java.util.Scanner;

public class StudentGradeCalculator {
    public String meth1(double per) {
        if (per >= 90) {
            return "A+";
        } else if (per >= 80)
            return "A";
        else if (per >= 70)
            return "B";
        else if (per >= 60)
            return "C";
        else if (per >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        if (m1 < 0 || m1 > 100 ||
                m2 < 0 || m2 > 100 ||
                m3 < 0 || m3 > 100 ||
                m4 < 0 || m4 > 100 ||
                m5 < 0 || m5 > 100) {

            System.out.println("Invalid marks! Marks must be between 0 and 100.");
            sc.close();
            return;
        }
        int total = (m1 + m2 + m3 + m4 + m5);
        double per = (total / 500.0) * 100;
        System.out.println("Student Name: " + s);
        System.out.println("Total Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", per);
        System.out.println("Grade: " + new StudentGradeCalculator().meth1(per));
    }
}
