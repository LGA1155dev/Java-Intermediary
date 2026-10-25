package Rdates;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY)
            System.out.println("No seu pais o primeiro dia da semana é domingo!");
        else
            System.out.println("O primeiro dia da semana no seu pais provavel que seja segunda");

        c.add(Calendar.DAY_OF_WEEK, 2);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.HOUR_OF_DAY, 12);
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        Date date = c.getTime();
        System.out.println(date);
    }
}
