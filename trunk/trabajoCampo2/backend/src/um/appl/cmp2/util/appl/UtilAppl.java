package um.appl.cmp2.util.appl;

import java.util.Date;

import org.joda.time.DateTime;

import um.appl.cmp2.commons.appl.CommonsAppl;
import um.appl.cmp2.commons.itf.CommonsItf;

/**
 * Servicio de Utilidades-
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
public class UtilAppl extends CommonsAppl implements CommonsItf 
{
	public static final String FORMATO_FECHA = "dd/MM/yyyy";
	
	/**
	 * Devuelve la fecha actual del sistema.
	 * @return una fecha.
	 */ 
	public static java.util.Date getFechaActual()
	{
		DateTime date = new DateTime();
		return date.toDate();
	}
	
	public static String getFechaFormateada(Date fecha, String formato)
	{
		DateTime date = new DateTime(fecha);
		return date.toString(formato);
	}
	
	
}
