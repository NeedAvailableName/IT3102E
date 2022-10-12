package week3;
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
			/*if(this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
				if(day <= 31) {
                	this.day = day;
            	}
			}*/
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
    public int getDay() {
		return day;
	}

	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
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
