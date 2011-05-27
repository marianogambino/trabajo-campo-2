/**
 * 
 */
package um.appl.cmp2.util.srv;

import java.util.Date;

import um.appl.cmp2.util.itf.UtilApplItf;
import um.appl.cmp2.util.itf.UtilSrvlItf;

/**
 * @author Mariano
 *
 */
public class UtilSrv implements UtilSrvlItf {

	private UtilApplItf utilAppl;
	
	/**
	 * 
	 */
	public UtilSrv() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date getFechaActual() {
		return utilAppl.getFechaActual();
	}

	@Override
	public String getFechaFormateada(Date fecha, String formato) {
		return utilAppl.getFechaFormateada(fecha, formato);
	}

	@Override
	public String getFechaActualFormateda() {
		return utilAppl.getFechaActualFormateda();
	}

	/**
	 * @return the utilAppl
	 */
	public UtilApplItf getUtilAppl() {
		return utilAppl;
	}

	/**
	 * @param utilAppl the utilAppl to set
	 */
	public void setUtilAppl(UtilApplItf utilAppl) {
		this.utilAppl = utilAppl;
	}
	
	

}
