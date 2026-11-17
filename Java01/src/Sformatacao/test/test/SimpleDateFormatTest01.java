package Sformatacao.test.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brazil' 'dia' dd 'de' MMM 'de' yyyy  'Ás' HH:mm:ss 'horas' z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

    }
}
