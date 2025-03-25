import java.time.ZonedDateTime;
import java.time.ZoneId;
class TimeZones{
	public static void main(String[] args){
		System.out.println("Current time in GMT: "+ ZonedDateTime.now(ZoneId.of("GMT")));
		System.out.println("Current time in IST: "+ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		System.out.println("Current time in PST: "+ ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		
	}
}