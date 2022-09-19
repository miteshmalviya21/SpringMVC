package some.other;

import org.springframework.stereotype.Component;

@Component
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		day=21;
		month=7;
		year=1997;
		System.out.println("MyDate Constructor called");
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}
