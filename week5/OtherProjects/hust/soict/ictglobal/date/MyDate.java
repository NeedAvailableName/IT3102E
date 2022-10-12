package week5.OtherProjects.hust.soict.ictglobal.date;

import java.time.LocalDate;
import java.util.Scanner;  
public class MyDate {	
	private int day = 0, month = 0, year = 0;
	
    public MyDate() {
		LocalDate today = LocalDate.now();
		setMonth(today.getMonthValue());
		setYear(today.getYear());
		setDay(today.getDayOfMonth());
	}

    public MyDate(int day, int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}

    public MyDate(String date) {
		String subStr[] = date.split(" ");
		this.setYear(Integer.parseInt(subStr[2]));

		if("January".equalsIgnoreCase(subStr[0])) {
			this.setMonth(1);
		}
		if("February".equalsIgnoreCase(subStr[0])) {
			this.setMonth(2);
		}
		if("March".equalsIgnoreCase(subStr[0])) {
			this.setMonth(3);
		}
		if("April".equalsIgnoreCase(subStr[0])) {
			this.setMonth(4);
		}
		if("May".equalsIgnoreCase(subStr[0])) {
			this.setMonth(5);
		}
		if("June".equalsIgnoreCase(subStr[0])) {
			this.setMonth(6);
		}
		if("July".equalsIgnoreCase(subStr[0])) {
			this.setMonth(7);
		}
		if("August".equalsIgnoreCase(subStr[0])) {
			this.setMonth(8);
		}
		if("September".equalsIgnoreCase(subStr[0])) {
			this.setMonth(9);
		}
		if("October".equalsIgnoreCase(subStr[0])) {
			this.setMonth(10);
		}
		if("November".equalsIgnoreCase(subStr[0])) {
			this.setMonth(11);
		}
		if("December".equalsIgnoreCase(subStr[0])) {
			this.setMonth(12);
		}
		
		this.setDay(Integer.parseInt(subStr[1].substring(0, subStr[1].length()-2)));
	}

	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			if(this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
				if(day <= 30) {
                    this.day = day;
                }
			}
			if(this.month == 2) {
				if(this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0) {
					if(day <= 29) {	
                        this.day = day;
                    }
				}
				else {
					if(day <= 28) {
						this.day = day;
                    }
				}
			}
			else {
				if(day <= 31) this.day = day;
			}
		}
	}

	public void setDate(String day){
        if((day.toLowerCase()).equals("first"))
            this.day = 1;
        if((day.toLowerCase()).equals("second"))
            this.day = 2;
        if((day.toLowerCase()).equals("third"))
            this.day = 3;
        if((day.toLowerCase()).equals("fourth"))
            this.day = 4;
        if((day.toLowerCase()).equals("fifth"))
            this.day = 5;
        if((day.toLowerCase()).equals("sixth"))
            this.day = 6;
        if((day.toLowerCase()).equals("seventh"))
            this.day = 7;
        if((day.toLowerCase()).equals("eighth"))
            this.day = 8;
        if((day.toLowerCase()).equals("ninth"))
            this.day = 9;
        if((day.toLowerCase()).equals("tenth"))
            this.day = 10;
        if((day.toLowerCase()).equals("eleventh"))
            this.day = 11;
        if((day.toLowerCase()).equals("twelfth"))
            this.day = 12;
        if((day.toLowerCase()).equals("thirteenth"))
            this.day = 13;
        if((day.toLowerCase()).equals("fourteenth"))
            this.day = 14;
        if((day.toLowerCase()).equals("fifteenth"))
            this.day = 15;
        if((day.toLowerCase()).equals("sixteenth"))
            this.day = 16;
        if((day.toLowerCase()).equals("seventeenth"))
            this.day = 17;
        if((day.toLowerCase()).equals("eighteenth"))
            this.day = 18;
        if((day.toLowerCase()).equals("nineteenth"))
            this.day = 19;
        if((day.toLowerCase()).equals("twentieth"))
            this.day = 20;
        if((day.toLowerCase()).equals("twenty-first"))
            this.day = 21;
        if((day.toLowerCase()).equals("twenty-second"))
            this.day = 22;
        if((day.toLowerCase()).equals("twenty-third"))
            this.day = 23;
        if((day.toLowerCase()).equals("twenty-fourth"))
            this.day = 24;
        if((day.toLowerCase()).equals("twenty-fifth"))
            this.day = 25;
        if((day.toLowerCase()).equals("twenty-sixth"))
            this.day = 26;
        if((day.toLowerCase()).equals("twenty-seventh"))
            this.day = 27;
        if((day.toLowerCase()).equals("twenty-eighth"))
            this.day = 28;
        if((day.toLowerCase()).equals("twenty-ninth"))
            this.day = 29;
        if((day.toLowerCase()).equals("thirtieth"))
            this.day = 30;
        if((day.toLowerCase()).equals("thirty-first"))
            this.day = 31;
    }
    public int getDay() {
		return day;
	}

	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		}
	}
	public void setMonth(String month) {
        switch (month.toLowerCase()) {
            case "january":
                this.month = 1;
                break;

            case "february":
                this.month = 2;
                break;

            case "march":
                this.month = 3;
                break;

            case "april":
                this.month = 4;
                break;

            case "may":
                this.month = 5;
                break;

            case "june":
                this.month = 6;
                break;

            case "july":
                this.month = 7;
                break;

            case "august":
                this.month = 8;
                break;

            case "september":
                this.month = 9;
                break;

            case "october":
                this.month = 10;
                break;

            case "november":
                this.month = 11;
                break;

            case "december":
                this.month = 12;
                break;
            default:
                break;
        }
    }
    public int getMonth() {
		return month;
	}

    public void setYear(int year) {
		if(year > 0) {
			this.year = year;
		}
	}
	public int getYear() {
		return year;
	}

	public void accept() {
		System.out.println("Enter the date: ");
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		MyDate newDate = new MyDate(date);
		//MyDate newDate = new MyDate();
		this.setDay(newDate.day);
		this.setMonth(newDate.month);
		this.setYear(newDate.year);
        keyboard.close();
	}
	
	public void print() {
		System.out.println("The date is: " + this.day + "/" + this.month + "/" + this.year);
	}
}
