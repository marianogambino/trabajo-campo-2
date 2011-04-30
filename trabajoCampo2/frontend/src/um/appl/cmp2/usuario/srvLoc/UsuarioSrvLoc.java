/**
 * 
 */
package um.appl.cmp2.usuario.srvLoc;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.services.CallServicesWS;
import um.appl.cmp2.usuario.itf.UsuarioSrvLocItf;
import um.appl.cmp2.ws.IWs;

/**
 * @author Mariano
 *
 */
@SuppressWarnings("serial")
public class UsuarioSrvLoc extends Common implements UsuarioSrvLocItf 
{
	private CallServicesWS srv;
	
	public UsuarioSrvLoc(){}
	
	/**
	 * 
	 */
	public IWs getService() {
		
		return srv.getInterface().srv;
	}

	

}
