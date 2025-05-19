package testpackage;

public class SwitchCase {
	
	public void dayOfTheWeek() {
		
		String day = "MONDAY";

		switch (day) {
		    case "MONDAY":
		    case "TUESDAY":
		    case "WEDNESDAY":
		    case "THURSDAY":
		    case "FRIDAY":
		        System.out.println("It's a weekday.");
		        break;
		    case "SATURDAY":
		    case "SUNDAY":
		        System.out.println("It's the weekend.");
		        break;
		    default:
		        System.out.println("Invalid day.");
		}

	}
	
	public void yourDay(String urDay) {
		
		String day = urDay;

		switch (day) {
		    case "MONDAY":
		    case "TUESDAY":
		    case "WEDNESDAY":
		    case "THURSDAY":
		    case "FRIDAY":
		        System.out.println("It's a weekday.");
		        break;
		    case "SATURDAY":
		    case "SUNDAY":
		        System.out.println("It's the weekend.");
		        break;
		    default:
		        System.out.println("Invalid day.");
		}
		
	}

	public static void main(String[] args) {
		
		SwitchCase obj = new SwitchCase();
		
		obj.dayOfTheWeek();
		
		obj.yourDay("MONDAY");
		
;	}
}


