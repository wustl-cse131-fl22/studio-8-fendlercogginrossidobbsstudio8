package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	
	private Date date; 
	private Time time; 
	
	public Appointment (Date tempDate, Time tempTime) {
		date = tempDate;
		time = tempTime; 
	}
	
	

	@Override
	public String toString() {
		return "Appointment [date = " + date + ", time = " + time + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}



	public static void main(String[] args) {
		Date today = new Date (11, 17, 2022, false);
		Time now = new Time (12, 9, false);
		Date tomorrow = new Date (11,18,2022, false);
		Time next = new Time (12,43, false);
		Date Friday = new Date (11, 18, 2022, false);
		Time aTime = new Time (8, 0, false);
		Appointment one = new Appointment (today, now);
		Appointment two = new Appointment (tomorrow, next);
		Appointment three = new Appointment (Friday, aTime);

    	HashSet<Appointment> set = new HashSet<Appointment>();

    	set.add(one);
    	set.add(two);
    	set.add(three); 
    	
    	System.out.println(set);

	}

}
