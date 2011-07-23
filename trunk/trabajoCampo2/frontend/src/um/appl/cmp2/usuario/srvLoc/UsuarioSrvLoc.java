/**
 * 
 */
package um.appl.cmp2.usuario.srvLoc;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.services.CallServicesWS;
import um.appl.cmp2.srvLocItf.SrvLocItf;
import um.appl.cmp2.ws.IWs;

/**
 * @author Mariano
 *
 */
@SuppressWarnings("serial")
public class UsuarioSrvLoc extends Common implements SrvLocItf 
{
	public UsuarioSrvLoc(){}
	
	/**
	 * 
	 */
	public IWs getService() {
		
		return CallServicesWS.getInterface().srv;
	}

}
