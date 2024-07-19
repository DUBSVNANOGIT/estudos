package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        //DATE
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2018");
        System.out.println("y1: " + sdf1.format(y1));
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        System.out.println("y2: " + sdf2.format(y2));
        //Padrão UTC -
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("y3: " + y3);



        //Instanciar data atual
        Date x1 = new Date();
        System.out.println("x1: " + x1);
        //Outra forma
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("x2: " + x2);
        Date x3 = new Date(0L);
        System.out.println("x3: " + x3);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        System.out.println("x4: " + x4);

        System.out.println("PADRÃO");
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);

        System.out.println("SDF 1");
        System.out.println("y1: " + sdf1.format(y1));
        System.out.println("y2: " + sdf1.format(y2));
        System.out.println("y3: " + sdf1.format(y3));
        System.out.println("x1: " + sdf1.format(x1));
        System.out.println("x2: " + sdf1.format(x2));
        System.out.println("x3: " + sdf1.format(x3));
        System.out.println("x4: " + sdf1.format(x4));

        System.out.println("SDF 2");
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));


        System.out.println("SDF 3");
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));

        //CALENDAR
        //Somando uma unidade de tempo
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf4.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println(sdf4.format(d));


        //Obtendo uma unidade de tempo
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf5.format(d2));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(d2);
        int minutes = cal2.get(Calendar.MINUTE);
        int month = 1 + cal2.get(Calendar.MONTH);
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

    }
}
