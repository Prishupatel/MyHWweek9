package solution;

import java.util.Scanner;

public class MarkSheet
{
    public static void main(String[] args) {
        String studentName;
        int rollno, mathMark, scienceMark, englishMark;


        Scanner scanInput = new Scanner(System.in);

        System.out.println("Enter Student Name : ");
        studentName = scanInput.nextLine();
        System.out.println("Enter student's roll number : ");
        rollno = scanInput.nextInt();
        System.out.println("Enter Maths mark : ");
        mathMark = scanInput.nextInt();
        System.out.println("Enter Science mark : ");
        scienceMark = scanInput.nextInt();
        System.out.println("Enter English mark : ");
        englishMark = scanInput.nextInt();
        //  scanInput.close();


        while (mathMark < 0 || mathMark > 100 || scienceMark < 0 || scienceMark > 100 || englishMark < 0 || englishMark > 100) {
            System.out.println("invalid entry of marks");
        }
        //  else { //valid entry --> checks grades and pass fail condition.

        int total = mathMark + englishMark + scienceMark;             //total of three subject

        //calculating percentage

        double cent=total/3;
        scanInput.close();
        //define grades

        String gradeAplus= "A+";
        String gradeA="A";
        String gradeB="B";
        String gradeC="C";
        String pass="Pass";
        String fail="Fail";
        String finalGrade=" ";
        String result="";
        String advise="";

        //if any subject have less than 35 mark. student would be failed.

        if(englishMark<35 || mathMark<35 ||scienceMark<35){
            result= fail;
            advise="Study 40 hours per week";
        }else {
            //passing criteria and grade using nested if else

            if(cent>=80){
                String a1=gradeAplus;  //A+
                System.out.println(cent + "%");
                finalGrade=gradeAplus;
                result=pass;
            }else if(cent>=60  && cent<80){
                String a=gradeA;   //A
                System.out.println(cent + "%");
                finalGrade=gradeA;
                result=pass;
            }else if(cent>=50 && cent <60){
                String b= gradeB; //B
                System.out.println( cent + "%");
                finalGrade=gradeB;
                result=pass;
            }else  if(cent>=35 && cent<50){
                String c=gradeC;
                System.out.println(cent + "%");
                finalGrade=gradeC;
                result=pass;
            }else {
                System.out.println("-");

            }

        }

        System.out.println("|--------------------------|");
        System.out.println("|                          |");
        System.out.println("|   M A R K S H E E T      |");
        System.out.println("|Name      :    " + studentName + "     |");
        System.out.println("|Roll      :    " + rollno      + "        |");
        System.out.println("|--------------------------|");
        System.out.println("Subjects   :  Marks        ");
        System.out.println("|--------------------------|");
        System.out.println("|Maths      :  "+mathMark      + "          |");
        System.out.println("|English    :  "+englishMark +   "          |");
        System.out.println("|Science    :  "+scienceMark + "          |");
        System.out.println("|--------------------------|");
        System.out.println("Total       :  "+total    + "         |");
        System.out.println("|--------------------------|");
        System.out.println("|Percentage :  "+cent     + "        |");
        System.out.println("|Result     :  "+result   + "        |");
        System.out.println("|Grade      :   "+finalGrade + "         |");
        System.out.println("|--------------------------|");
        System.out.println(advise);
        System.out.println("|--------------------------|");


    }
}
