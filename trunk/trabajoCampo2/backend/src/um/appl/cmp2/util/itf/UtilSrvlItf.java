/**
 * 
 */
package um.appl.cmp2.util.itf;

import java.util.Date;

/**
 * @author Mariano
 *
 */
public interface UtilSrvlItf {

	public java.util.Date getFechaActual();
	public String getFechaFormateada(Date fecha, String formato);
	public String getFechaActualFormateda();
}
