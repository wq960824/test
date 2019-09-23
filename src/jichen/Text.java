package jichen;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Text {
    public static void main(String args[]){
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime=LocalTime.now().withNano(0) ;
        System.out.println(localTime);
        LocalDateTime localDateTime=LocalDateTime.now().withNano(0);
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String createTime = dateTimeFormatter.format(localDateTime);
        System.out.println(createTime);
        LocalDate tomorrow=localDate.minusDays(285);
        System.out.println(tomorrow);
        boolean  bf=localDate.isBefore(tomorrow);
        boolean  af=localDate.isAfter(tomorrow);
        System.out.println(bf);
        System.out.println(af);
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
        int day=localDate.getDayOfMonth();
        System.out.println(day);
        int month=localDate.getMonthValue();
        System.out.println(month);
        int year=localDate.getYear();
        System.out.println(year);
        LocalDate localDate1 = LocalDate.of(1996, 8, 24);
        LocalDate localDate2 = LocalDate.of(1999, 8, 23);
        System.out.println((int) (localDate2.toEpochDay() - localDate1.toEpochDay()));
        LocalDate localDate3 = LocalDate.of(2019, 2, 5);
        System.out.println(localDate3.plusDays(210));
        int i=localDate.compareTo(localDate1);
        System.out.println(i);

    }

}
