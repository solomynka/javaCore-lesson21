package lesson21partTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Time {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);

		LocalDate locDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(locDate);

		LocalTime locTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
		System.out.println(locTime);

		LocalDateTime ldt = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println(ldt);
	}

}
