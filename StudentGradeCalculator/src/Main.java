import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");

        int num = sc.nextInt();
        int[] sub = new int[num];
        int sum=0;
        System.out.println("Enter the marks for subjects:");
        for (int i = 0; i < num; i++) {
            sub[i]=sc.nextInt();
            sum+=sub[i];
        }
        double avg = (double) sum/num;

        String grade = grade(avg);

        System.out.println("Result");

        System.out.format("Marks Obtained: %d\nOut of: %d\n", sum, num*100);
        System.out.println("Average Percentage: " + avg);
        System.out.println("Grade:" + grade);
    }

    public static String grade(double avg) {
        if(avg > 90) {
            return "A+";
        }
        else if(avg <= 90 && avg > 80) {
            return "A";
        }
        else if(avg <= 80 && avg > 70) {
            return "B+";
        }
        else if(avg <= 70 && avg > 60) {
            return "B";
        }
        else if(avg <= 60 && avg > 50) {
            return "C+";
        }
        else if(avg <= 50 && avg > 40) {
            return "C";
        }
        else {
            return "F";
        }
    }
}