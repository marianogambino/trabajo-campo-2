package um.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.joda.time.DateTime;

import um.appl.cmp2.util.appl.UtilAppl;

public class TestFechaActual {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{		
		System.out.println(getFechaFormateada(getFechaActual()));
		System.out.println((new UtilAppl()).getFechaFormateada(new DateTime().toDate(), UtilAppl.FORMATO_FECHA));
	}
	
	public static Date getFechaActual()
	{
		Calendar cal = new GregorianCalendar();
		return cal.getTime();
	}
	
	public static StringBuffer getFechaFormateada(Date fecha)
	{
		Calendar cal = new GregorianCalendar();
		cal.setTime(fecha);
		StringBuffer str = new StringBuffer();
		str.append(cal.get(Calendar.DATE));
		str.append("/");
		str.append(cal.get(Calendar.MONTH));
		str.append("/");
		str.append(cal.get(Calendar.YEAR));
		return str;
	}

}
