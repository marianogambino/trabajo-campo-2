/**
 * 
 */
package um.appl.cmp2.srvLoc;

import um.appl.cmp2.services.CallServicesWS;
import um.appl.cmp2.srvLocItf.SrvLocItf;
import um.appl.cmp2.ws.IWs;

/**
 * @author Mariano
 *
 */
public class SrvLoc implements SrvLocItf {

	
	public SrvLoc(){}
	
	@Override
	public IWs getService() {
		
		return CallServicesWS.getInterface().srv;
	}

}
