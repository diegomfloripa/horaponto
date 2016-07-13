package br.com.diegomelodev.horaponto.util;

import java.util.Date;
import java.util.Calendar;

/**
 * Created by Diego on 12/07/2016.
 */
public class DateUtil {

    private DateUtil() {

    };

    public static Date inicioManha() {
        return createCalendar(8, 30).getTime();
    }

    public static Date fimManha() {
        return createCalendar(12, 0).getTime();
    }

    public static Date inicioTarde() {
        return createCalendar(13, 15).getTime();
    }

    public static Date fimTarde() {
        return createCalendar(18, 30).getTime();
    }

    private static Calendar createCalendar(int hora, int minuto) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hora);
        calendar.set(Calendar.MINUTE, minuto);
        return calendar;
    }

    public static Integer diaAtual() {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    public static Integer mesAtual() {
        return Calendar.getInstance().get(Calendar.MONTH);
    }

    public static Integer horaAtual() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public static Integer minutoAtual() {
        return Calendar.getInstance().get(Calendar.MINUTE);
    }
}
