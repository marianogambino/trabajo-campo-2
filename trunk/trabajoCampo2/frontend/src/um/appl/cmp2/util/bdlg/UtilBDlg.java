package um.appl.cmp2.util.bdlg;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.srvLocItf.SrvLocItf;
import um.appl.cmp2.util.itf.UtilItf;

@SuppressWarnings("serial")
public class UtilBDlg extends Common implements UtilItf {
	
	private SrvLocItf srv;
	

	@Override
	public String getFechaActual() {
		return srv.getService().getFechaActual();
	}
	
	
	
	

}
