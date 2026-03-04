package se.lexicon;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExercises {
    static void main() {

    //Exercise 1 – Current Date

        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " +today);

    //Exercise 2 – Formatted Current Date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee, dd MMMM");
        String formattedDate = LocalDate.now().format(formatter);
        System.out.println("Formatted Current Date: " +formattedDate);

    //Exercise 3 – Last Monday and the Entire Week

        LocalDate specificDate = LocalDate.of(2026,2,23);
        for (int i = 0; i < 7; i ++) {
        LocalDate followingDay = specificDate.plusDays(i);
        System.out.println("Entire week: " + followingDay);
        }

    //Exercise 4 – Parse Date from String

        String dateString = "2026-03-04";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("ParsedDate: " + parsedDate);

    //Exercise 5 – Day of the Week

        LocalDate birthDate = LocalDate.of(2026,8,16);
        DayOfWeek birthDay = birthDate.getDayOfWeek();
        System.out.println("This Year your Birthday comes on: " +birthDay);

    //Exercise 6 – Future and Past Date

        LocalDate date = LocalDate.now();
        LocalDate futureDate = date.plusYears(10).minusMonths(10);
        System.out.println("Future month of the Date is: " +futureDate.getMonth());

    //Exercise 7 – Period Between Dates

        Period timeBetween = Period.between(birthDate, futureDate);
        System.out.println("Elapsed Time: " + timeBetween.getYears() + " years " + timeBetween.getMonths() + " months " + timeBetween.getDays() + " days ");

    //Exercise 8 – Add Period to Current Date

        Period createdPeriod = Period.of( 4,7,29);
        LocalDate currentDate = LocalDate.now().plus(createdPeriod);
        System.out.println("Period added: " + currentDate);

    //Exercise 9 – Current Time

        LocalTime time = LocalTime.now();
        System.out.println("Current Time is: " +time);

    //Exercise 10 – Nanoseconds of LocalTime

        int nano = LocalTime.now().getNano();
        System.out.println("Nanoseconds: " +nano);

    //Exercise 11 – Parse Time from String

        String timeString = "14:30:45";
        System.out.println("Parsed Time: " +timeString);

    //Exercise 12 – Formatted Current Time

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatter1);
        System.out.println("Formatted Current Time: " + formattedTime);

    //Exercise 13 – Specific LocalDateTime

        LocalDate thisDate = LocalDate.now();
        LocalTime thisTime = LocalTime.now();
        LocalDateTime thisDateTime = LocalDateTime.now();
        System.out.println("Date: " + thisDate+ "," + "Time: " + thisTime);

    //Exercise 14 – Formatted LocalDateTime

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("eeee dd MMMM HH:mm");
        String formattedDateTime = thisDateTime.format(formatter2);
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);

    //Exercise 15 – Combine Date and Time

        LocalDateTime combined = LocalDateTime.of(thisDate, thisTime);
        System.out.println("Combined Date and Time: " + combined);

    //Exercise 16 - Extract Components from LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("Local Date and Time: " + localDateTime);
        System.out.println("Just Date: " + localDate);
        System.out.println("Just Time: " + localTime);





    }
}
