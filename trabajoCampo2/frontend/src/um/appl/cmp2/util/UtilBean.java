/**
 * 
 */
package um.appl.cmp2.util;

import um.appl.cmp2.util.itf.UtilItf;

/**
 * @author Mariano
 *
 */
public class UtilBean {
	
	private UtilItf utilBDlg; 
	
	public UtilBean (UtilItf util){
		this.utilBDlg = util;
	}
	
	public String getFechaActual(){
		return utilBDlg.getFechaActual();
	}

}
