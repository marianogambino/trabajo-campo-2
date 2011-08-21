/**
 * 
 */
package um.appl.cmp2.usuario.bdlg;

import org.springframework.stereotype.Component;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.srvLoc.SrvLoc;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.itf.UsuarioBDlgItf;
import um.appl.cmp2.usuario.itf.UsuarioCObjItf;


/**
 * @author Mariano
 *
 */
@Component("usuarioBDlg") 
public class UsuarioBDlg extends Common implements UsuarioBDlgItf 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6763975009451890312L;
	private SrvLoc srvLoc;
	
	public UsuarioBDlg(){}
	
	/**
	 * 
	 */
	public void actualizarUsuario(UsuarioCObj usuario)
	{
		this.getSrvLoc().getService().actualizarUsuario(usuario);
	}

	/**
	 * 
	 */
	public void crearUsuario(UsuarioCObj usuario)
	{	
		this.getSrvLoc().getService().crearUsuario(usuario);
	}

	/**
	 * @throws Exception 
	 * 
	 */
	public UsuarioCObjItf findById(Long id)
	{	
		return this.getSrvLoc().getService().findById(id);
	}

	/**
	 * @return the usuarioSrvLoc
	 */
	public SrvLoc getSrvLoc() {
		
		return srvLoc;
	}

	/**
	 * @param usuarioSrvLoc the usuarioSrvLoc to set
	 */
	public void setSrvLoc(SrvLoc srvLoc) {
		this.srvLoc = srvLoc;
	}

	/**
	 * 
	 */
	public UsuarioCObjItf validarUsuarioPassword(String nomUsu, String pass)
	{		
		//srvLoc = new SrvLoc();
		return getSrvLoc().getService().validarUsuarioPassword(nomUsu, pass);
	}

	/**
	 * 
	 */
	public UsuarioCObjItf validarUsuario(String nomUsu)
	{		
		return this.getSrvLoc().getService().validarUsuario(nomUsu);
	}
	
}
