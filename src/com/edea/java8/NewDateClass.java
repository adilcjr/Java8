package com.edea.java8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewDateClass {

	public static void main(String[] args) {
		
		System.out.println("Local Date");
		System.out.println("-----------------------");
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString());                //2013-05-15
		System.out.println(ld.getDayOfWeek().toString()); //WEDNESDAY
		System.out.println(ld.getDayOfMonth());           //15
		System.out.println(ld.getDayOfYear());            //135
		System.out.println(ld.isLeapYear());              //false
		System.out.println(ld.plusDays(12).toString());   //2013-05-27
		System.out.println(" ");
		
		System.out.println("Local Time");
		System.out.println("-----------------------");
		//LocalTime localTime = LocalTime.now();     //toString() in format 09:57:59.744
		LocalTime localTime = LocalTime.of(12, 20);
		System.out.println(localTime.toString());    //12:20
		System.out.println(localTime.getHour());     //12
		System.out.println(localTime.getMinute());   //20
		System.out.println(localTime.getSecond());   //0
		System.out.println(localTime.MIDNIGHT);      //00:00
		System.out.println(localTime.NOON);          //12:00
		System.out.println(" ");
		
		System.out.println("Local Date and Time");
		System.out.println("-----------------------");
		LocalDateTime localDateTime = LocalDateTime.now(); 
		System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
		System.out.println(localDateTime.getDayOfMonth()); //15
		System.out.println(localDateTime.getHour());       //10
		System.out.println(localDateTime.getNano());       //911000000
		System.out.println(" ");
		
		System.out.println("Offset Date and Time");
		System.out.println("-----------------------");
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.257+05:30		 
		offsetDateTime = OffsetDateTime.now(ZoneId.of("+05:30"));
		System.out.println(offsetDateTime.toString());              //2013-05-15T10:10:37.258+05:30		 
		offsetDateTime = OffsetDateTime.now(ZoneId.of("-06:30"));
		System.out.println(offsetDateTime.toString());              //2013-05-14T22:10:37.258-06:30
		 
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zonedDateTime.toString());               //2013-05-15T06:45:45.290+02:00[Europe/Paris]
		System.out.println(" ");
		
		System.out.println("Instant");
		System.out.println("-----------------------");
		Instant instant = Instant.now();
		System.out.println(instant.toString());                                 //2013-05-15T05:20:08.145Z
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString());   //2013-05-15T05:20:13.145Z
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString());  //2013-05-15T05:20:03.145Z
		System.out.println(instant.minusSeconds(10).toString());                //2013-05-15T05:19:58.145Z
		System.out.println(" ");
		
		System.out.println("Period");
		System.out.println("-----------------------");
		Period period = Period.ofDays(6);
		System.out.println(period.getDays());     //6
		System.out.println(period.toString());    //P6D
		period = Period.ofMonths(6);
		System.out.println(period.toString());    //P6M
		period = Period.between(LocalDate.now(), 
		            LocalDate.now().plusDays(60));
		System.out.println(period.toString());   //P1M29D
		System.out.println(" ");
		
		
		
		//day-of-week to represent, from 1 (Monday) to 7 (Sunday)
		System.out.println(DayOfWeek.of(2));                    //TUESDAY 		 
		DayOfWeek day = DayOfWeek.FRIDAY;
		System.out.println(day.getValue());                     //5		 
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.with(DayOfWeek.MONDAY));  //2013-05-13  i.e. when was monday in current week ?

		



	}

}
