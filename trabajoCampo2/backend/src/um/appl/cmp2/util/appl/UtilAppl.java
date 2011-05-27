package um.appl.cmp2.util.appl;

import java.util.Date;

import org.joda.time.DateTime;

import um.appl.cmp2.commons.itf.CommonsItf;
import um.appl.cmp2.util.itf.UtilApplItf;

/**
 * Servicio de Utilidades-
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
public class UtilAppl implements CommonsItf, UtilApplItf
{
	public static final String FORMATO_FECHA = "dd/MM/yyyy";
	
	/**
	 * Devuelve la fecha actual del sistema.
	 * @return una fecha.
	 */ 
	public java.util.Date getFechaActual()
	{
		DateTime date = new DateTime();
		return date.toDate();
	}
	
	/**
	 * 
	 * @param fecha
	 * @param formato
	 * @return
	 */
	public String getFechaFormateada(Date fecha, String formato)
	{
		DateTime date = new DateTime(fecha);
		return date.toString(formato);
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFechaActualFormateda(){
		return getFechaFormateada(getFechaActual(), FORMATO_FECHA);
	}
	
	
}
