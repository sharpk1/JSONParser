package model;

public class Month {
	
	private String month;
	private int year;
	private Days days;
	
	
	public Days getDays() {
		return days;
	}
	public void setDays(Days days) {
		this.days = days;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
