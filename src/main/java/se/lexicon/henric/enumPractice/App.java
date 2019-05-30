package se.lexicon.henric.enumPractice;


import java.lang.invoke.SwitchPoint;
import java.time.LocalDate;

public class App 
{
    public static void main( String[] args )
    {
    	LocalDate date= LocalDate.now();  
    	
    	Weekdays weekday = Weekdays.UNKOWN;
    	//kinda redudant but just for fun and practice
       for (Weekdays day: Weekdays.values()) {
		if(date.getDayOfWeek().toString() == day.toString()) {
			System.out.println("Dude today is:"+day);
			weekday = day;
		}
    	  
       }
       
       switch (weekday) {
		case MONDAY: System.out.println("I get off at 16:30");
			break;
		case TUESDAY:System.out.println("I get off at 16:30");
			break;
		case WENDESDAY: System.out.println("I get off at 16:30");
			break;
		case THURSDAY: System.out.println("I have the day off today, its a holiday!");
			break;
		case FRIDAY: System.out.println("I get off at 16:30");
			break;
		case SATURDAY: System.out.println("Dude, it's the weekend!");
			break;
		case SUNDAY: System.out.println("Dude, it's the weekend!");
			break;
			

		default:
			break;
		}
    }
}
