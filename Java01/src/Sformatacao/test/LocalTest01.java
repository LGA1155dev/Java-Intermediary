package Sformatacao.test;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeUSA = new Locale("en", "US");
        Locale localeCanadian = new Locale("en", "CA");
        Locale localeHindi = new Locale("hi", "IN");

        Calendar calendar = Calendar.getInstance();
        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dfCH = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat dfUSA = DateFormat.getDateInstance(DateFormat.FULL, localeUSA);
        DateFormat dfCanadian = DateFormat.getDateInstance(DateFormat.FULL, localeCanadian);
        DateFormat dfIndian = DateFormat.getDateInstance(DateFormat.FULL, localeHindi);

        System.out.println("Italy: " + dfIT.format(calendar.getTime()));
        System.out.println("Suíça: " + dfCH.format(calendar.getTime()));
        System.out.println("USA: " + dfUSA.format(calendar.getTime()));
        System.out.println("Canadian: " + dfCanadian.format(calendar.getTime()));
        System.out.println("Indian: " + dfIndian.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeCanadian.getDisplayCountry());
        System.out.println(localeUSA.getDisplayCountry());
        System.out.println(localeHindi.getDisplayCountry());
    }
}
