import java.util.*;
public class Solution {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      //Swapping two numbers without using a third variable
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("value of a  "+a+" Value of b "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a "+a+" Value of b "+b);

     //Largest of three numbers
        System.out.println("Enter the 3 numbers to compare");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.print("largest no is ");
        if(x>y  &&  x>z){
            System.out.print(x);
        }
        else if(y>x && y>z){
            System.out.print(y);
        }
        else{
            System.out.print(z);
        }
        System.out.println();
     //grading the student
        System.out.println("Enter the mark of the student");
        int mark=sc.nextInt();
        if(mark>=95){
            System.out.println("Grade is S");
    }
        else if(mark>=90){
            System.out.println("Grade is A");
        }
        else if(mark>=80){
            System.out.println("Grade is B");
        }
        else if(mark>=70){
            System.out.println("Grade is C");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println();

     // Number of days in a month
     System.out.println("enter the year and month");
     int year=sc.nextInt();
     String month=sc.next();
     switch(month)
        {
            case "January":
            case "March":
            case  "May":
            case  "July":
            case "August":
            case "October":
            case "December":
                System.out.println("There are 31 days ");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("There are 30 days");
                break;
            case "February":
                if(year%4==0){
                    System.out.println("There are 29 days");}
                else{
                    System.out.println("28 days");}
                break;
            default:
                System.out.println("Invalid");
               break;
        }
    //Calculating the commision for the sales agent
        System.out.println("Enter the sales amount and the years of experience");
        int amount=sc.nextInt();
        int years=sc.nextInt();
        int com=0;
        if(years<5 && amount<50000)
        {
            com=amount*15/100;
        }
        else if(years>5 && amount<50000){
            com=amount*10/100;
        }
        else if(amount>50000 && amount<100000 && years<10)
        {
            com=amount*20/100;
        }
        else if(amount>50000 && amount<100000 && years>10)
        {
            com=amount*15/100;
        }
        else if(amount>100000 && years<15)
        {
            com=amount*25/100;
        }
        else if(amount>100000 && years>15)
        {
            com=amount*20/100;
        }
        System.out.println(com);

    }

}
