package com.company;
import java.time.ZoneId;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //enter in birthday mm/dd/yyyy
        System.out.println("Enter your birth year: ");
        Scanner scan= new Scanner(System.in);
        int bYear= scan.nextInt();
        System.out.println("Enter in your birth month");
        int bMonth= scan.nextInt();
        System.out.println("Enter in your birth day of month");
        int bDay= scan.nextInt();

        //current date nums
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day= localDate.getDayOfMonth();
        int year= localDate.getYear();
        //System.out.println(month +"   "+ day +"  " +year);

        //subtract nums from year and caluclate age
        int yearDif= year- bYear;
        if((month-bMonth)>0){
            System.out.println("you are " + yearDif +" years old" ); }
        else if(((month-bMonth)<0)){
            System.out.println("you are "+ (yearDif-1) + " years old");}
        else{
            if(day>=bDay){
                System.out.println("you are " + yearDif +" years old" );
            }
            else{
                System.out.println("you are "+ (yearDif-1) + " years old");
            }
        }

    }
}
