
import java.util.Scanner;

public class Gradecalci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks obtained in subject 1 : ");
        int sub1=sc.nextInt();
        System.out.print("enter marks obtained in subject 2 : ");
        int sub2=sc.nextInt();
        System.out.print("enter marks obtained in subject 3 : ");
        int sub3=sc.nextInt();
        System.out.print("enter marks obtained in subject 4 : ");
        int sub4=sc.nextInt();
        System.out.print("enter marks obtained in subject 5 : ");
        int sub5=sc.nextInt();

//        calculate total marks...
        int totalMark=sub1+sub2+sub3+sub4+sub5;

//        calculate average percentage...
        float avgPercent=(float) totalMark/500*100;

//        grade calculation
        String grade;
        if (avgPercent>=90)
            grade="A+";
        else if (avgPercent>=80)
            grade="A";
        else if(avgPercent>=70)
            grade="B+";
        else if(avgPercent>=60)
            grade="B";
        else if(avgPercent>=50)
            grade="C+";
        else if (avgPercent>=40)
            grade="C";
        else
            grade="Fail";

        System.out.println("Total marks: "+totalMark+"\nAverage Percentage: "+avgPercent+"\nGrade: "+grade);
    }
}
