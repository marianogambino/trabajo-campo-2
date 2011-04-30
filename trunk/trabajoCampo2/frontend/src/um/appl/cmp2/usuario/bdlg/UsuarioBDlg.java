/**
 * 
 */
package um.appl.cmp2.usuario.bdlg;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.itf.UsuarioSrvItf;
import um.appl.cmp2.usuario.itf.UsuarioSrvLocItf;

/**
 * @author Mariano
 *
 */
@SuppressWarnings("serial")
public class UsuarioBDlg extends Common implements UsuarioSrvItf 
{
	private UsuarioSrvLocItf usuarioSrvLoc;
	
	public UsuarioBDlg(){}
	
	/**
	 * 
	 */
	public void actualizarUsuario(UsuarioCObj usuario) throws Exception 
	{
		this.getUsuarioSrvLoc().getService().actualizarUsuario(usuario);
	}

	/**
	 * 
	 */
	public void crearUsuario(UsuarioCObj usuario) throws Exception 
	{	
		this.getUsuarioSrvLoc().getService().crearUsuario(usuario);
	}

	/**
	 * @throws Exception 
	 * 
	 */
	public UsuarioCObj findById(Long id) throws Exception 
	{	
		return this.getUsuarioSrvLoc().getService().findById(id);
	}

	/**
	 * @return the usuarioSrvLoc
	 */
	public UsuarioSrvLocItf getUsuarioSrvLoc() {
		return usuarioSrvLoc;
	}

	/**
	 * @param usuarioSrvLoc the usuarioSrvLoc to set
	 */
	public void setUsuarioSrvLoc(UsuarioSrvLocItf usuarioSrvLoc) {
		this.usuarioSrvLoc = usuarioSrvLoc;
	}

	/**
	 * 
	 */
	public Boolean validarPassword(String nomUsu, String pass) throws Exception 
	{		
		return this.getUsuarioSrvLoc().getService().validarPassword(nomUsu, pass);
	}

	/**
	 * 
	 */
	public Boolean validarUsuario(String nomUsu) throws Exception 
	{		
		return this.getUsuarioSrvLoc().getService().validarUsuario(nomUsu);
	}
	
}
