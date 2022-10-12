package week5.OtherProjects.hust.soict.ictglobal.lab02;

import java.util.Scanner;
public class DaysOfMonth {
    public static int monthInt = 0;
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        String month;
        do {
            System.out.println("Enter the month: ");
            month = keyboard.nextLine();
        } while(!checkMonth(month));
        int year;
        do {
            System.out.println("Enter the year: ");
            year = keyboard.nextInt();
        } while(year < 0);
        System.out.println("Number of days : " + day(monthInt, checkYear(year)));
        keyboard.close();
    }
    public static Boolean checkMonth(String s) {
        if(s.equals("January") || s.equals("Jan") || s.equals("Jan.") || s.equals("1")) {
            monthInt = 1;
            return true;
        }
        if(s.equals("Febuary") || s.equals("Feb") || s.equals("Feb.") || s.equals("2")) {
            monthInt = 2;
            return true;
        }
        if(s.equals("March") || s.equals("Mar") || s.equals("Mar.") || s.equals("3")) {
            monthInt = 3;
            return true;
        }
        if(s.equals("April") || s.equals("Apr") || s.equals("Apr.") || s.equals("4")) {
            monthInt = 4;
            return true;
        }
        if(s.equals("May") || s.equals("May.") || s.equals("5")) {
            monthInt = 5;
            return true;
        }
        if(s.equals("June") || s.equals("Jun") || s.equals("Jun.") || s.equals("6")) {
            monthInt = 6;
            return true;
        }
        if(s.equals("July") || s.equals("Jul") || s.equals("Jul.") || s.equals("7")) {
            monthInt = 7;
            return true;
        }
        if(s.equals("August") || s.equals("Aug") || s.equals("Aug.") || s.equals("8")) {
            monthInt = 8;
            return true;
        }
        if(s.equals("September") || s.equals("Sep") || s.equals("Sep.") || s.equals("9")) {
            monthInt = 9;
            return true;
        }
        if(s.equals("October") || s.equals("Oct") || s.equals("Oct.") || s.equals("10")) {
            monthInt = 10;
            return true;
        }
        if(s.equals("November") || s.equals("Nov") || s.equals("Nov.") || s.equals("11")) {
            monthInt = 11;
            return true;
        }
        if(s.equals("December") || s.equals("Dec") || s.equals("Dec.") || s.equals("12")) {
            monthInt = 12;
            return true;
        }
        return false;
    }
    public static Boolean checkYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        return false;
    }
    public static int day(int month, boolean leapYear) {
        int numDay;
        switch(month) {
            case 1:
                numDay = 31;
                break;
            case 2:
                {
                    if(leapYear) numDay = 29;
                    else numDay = 28;
                }
                break;
            case 3:
                numDay = 31;
                break;
            case 4:
                numDay = 30;
                break;
            case 5:
                numDay = 31;
                break;
            case 6:
                numDay = 30;
                break;
            case 7:
                numDay = 31;
                break;
            case 8:
                numDay = 31;
                break;
            case 9:
                numDay = 30;
                break;
            case 10:
                numDay = 31;
                break;
            case 11:
                numDay = 30;
                break;
            case 12:
                numDay = 31;
                break;
            default:
                numDay = 0;
                break;
        }
        return numDay;
    }
}
