package studio8;

import java.util.Objects;

public class Time {
	
	private int hour; 
	private int minute; 
	private boolean isMilitaryTime; 
	
	/**
	 * 
	 * @param tempHour
	 * @param tempMinute
	 * @param tempIsMilitaryTime
	 */
	
	public Time (int tempHour, int tempMinute, boolean tempIsMilitaryTime) {
		hour = tempHour;
		minute = tempMinute;
		isMilitaryTime = tempIsMilitaryTime; 
	}
	/**
	 * 
	 * @return to string 
	 */
	public String toSting() {
		return (hour + ":" + minute);
	}

	@Override
	public String toString() {
		return "Time [hour = " + hour + ", minute = " + minute + "]";
	}
	public static void main(String[] args) {
		Time now = new Time (11, 47, false);
		Time next = new Time (18, 3, true);
		Time again = new Time (1, 54, false);
		Time nowTwo = new Time (11, 47, false);
		
		if (now.equals(nowTwo)) {
			System.out.println("true");
		}
    	
    }
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}