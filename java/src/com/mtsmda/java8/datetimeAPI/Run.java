package com.mtsmda.java8.datetimeAPI;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		localDateTime();
		System.out.println("--------------------------");
		zonedDateTime();
		System.out.println("--------------------------");
		chronoUnitsEnum();
		System.out.println("--------------------------");
		testPeriod();
		System.out.println("--------------------------");
		testDuration();
		System.out.println("--------------------------");
		testAdjusters();
		System.out.println("--------------------------");
		backwardCompatability();
	}
	
	private static void backwardCompatability(){
		Date currentDate = new Date();
		
		Instant now = currentDate.toInstant();
		ZoneId zoneId = ZoneId.systemDefault();
		
		LocalDateTime localDateTime = LocalDateTime.ofInstant(now, zoneId);
		System.out.println(localDateTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, zoneId);
		System.out.println(zonedDateTime);
		
	}

	private static void testAdjusters() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate nextTuesday = localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(nextTuesday);

		LocalDate firstInYear = LocalDate.of(localDate.getYear(), localDate.getMonth(), 1);
		LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY))
				.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println(firstInYear);
		System.out.println(secondSaturday);

	}

	private static void testDuration() {
		LocalTime localTime = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);

		LocalTime localTime2 = localTime.plus(twoHours);
		Duration duration = Duration.between(localTime, localTime2);
		System.out.println(duration);
	}

	private static void testPeriod() {
		LocalDate now = LocalDate.now();
		System.out.println(now);

		LocalDate localDate = now.plus(1, ChronoUnit.MONTHS);
		System.out.println(localDate);

		Period period = Period.between(now, localDate);
		System.out.println(period);
		period = Period.between(localDate, now);
		System.out.println(period);

	}

	private static void localDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("current - " + localDateTime);

		LocalDate localDate = localDateTime.toLocalDate();
		System.out.println("current date - " + localDate);

		Month month = localDateTime.getMonth();
		System.out.println(month.getValue() + " - " + month);
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getSecond());

		LocalDateTime localDateTime2 = localDateTime.withDayOfMonth(1).withYear(2015).withMonth(1);
		System.out.println(localDateTime2);

		LocalDate localDate2 = LocalDate.of(2012, Month.FEBRUARY, 29);
		System.out.println(localDate2);

		LocalTime localTime = LocalTime.of(22, 15);
		System.out.println(localTime);

		LocalTime localTime2 = LocalTime.parse("20:15:45");
		System.out.println(localTime2);

		System.out.println();

	}

	private static void zonedDateTime() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		System.out.println(zonedDateTime.getZone().getId());

		ZoneId zoneId = ZoneId.of("America/Phoenix");
		System.out.println(zoneId);

		ZoneId zoneId2 = ZoneId.systemDefault();
		System.out.println(zoneId2);

	}

	private static void chronoUnitsEnum() {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println(nextWeek);

		LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
		System.out.println(nextMonth);

		LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
		System.out.println(nextYear);

		LocalDate nextDecades = today.plus(1, ChronoUnit.DECADES);
		System.out.println(nextDecades);

	}

}