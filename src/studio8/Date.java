package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	/**
	 * 
	 * @param tempMonth
	 * @param tempDay
	 * @param tempYear
	 * @param tempIsHoliday
	 */
	
	public Date (int tempMonth, int tempDay, int tempYear, boolean tempIsHoliday) {
		month = tempMonth; 
		day = tempDay;
		year = tempYear; 
		isHoliday = tempIsHoliday; 
	}
	/**
	 * return to string
	 */
	public String toString() {
		return (month + "/" + day + "/" + year);
	}

    public static void main(String[] args) {
    	Date today = new Date (11, 17, 2022, false);
    	Date myBirthday = new Date (06, 22, 2004, true);
    	Date fourthJuly = new Date (07, 04, 2022, true);
    	Date todaytwo = new Date (11, 17, 2022, false);
    	Date tomorrow = new Date (11, 18, 2022, false);
    	
    	if (today.equals(todaytwo) ) {
    		System.out.println("true");
    	}
    	
    	if (today.equals(myBirthday) ) {
    		System.out.println("true");
    	}
    	
    	if (today.hashCode() == todaytwo.hashCode() ) {
    		System.out.println("2true");
    	}
    	
    	if (today.hashCode() == myBirthday.hashCode() ) {
    		System.out.println("3true");
    	}
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	
    	list.add(tomorrow);
    	list.add(todaytwo);
    	list.add(fourthJuly);
    	list.add(myBirthday);
    	list.add(today);
    	
    	System.out.println(list);
    	
    	LinkedList<Date> listTwo = new LinkedList<Date>();
    	listTwo.add(tomorrow);
    	listTwo.add(tomorrow);
    	listTwo.add(tomorrow);
    	
    	System.out.println(listTwo);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	
    	set.add(tomorrow);
    	set.add(todaytwo);
    	set.add(fourthJuly);
    	set.add(today);
    	set.add(tomorrow);
    	
    	System.out.println(set);
    	
    	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
