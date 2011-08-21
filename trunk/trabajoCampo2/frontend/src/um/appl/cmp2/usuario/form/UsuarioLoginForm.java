/**
 * 
 */
package um.appl.cmp2.usuario.form;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.usuario.bdlg.UsuarioBDlg;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.itf.UsuarioCObjItf;

/**
 * @author Mariano
 *
 */

@ManagedBean
@SessionScoped
public class UsuarioLoginForm extends Common
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6511114147312440689L;
	private UsuarioCObjItf usuario;
	private String message;
	
	@ManagedProperty("#{usuarioBlg}") 
	private UsuarioBDlg usuarioBlg;
	
	private String nombre;
	private String pass;
	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioCObjItf usuario) {
		this.usuario = usuario;
	}

	/**
	 * 
	 * @param usuarioBlg
	 */
	public UsuarioLoginForm(UsuarioBDlg usuarioBlg)
	{
		this.usuarioBlg = usuarioBlg;
		usuario = new UsuarioCObj();
	}
	
	public UsuarioLoginForm(){
		
		usuario = new UsuarioCObj();
	}
	
	/**
	 * @return the usuarioBlg
	 */
	public UsuarioBDlg getUsuarioBlg() {
		return usuarioBlg;
	}

	/**
	 * @param usuarioBlg the usuarioBlg to set
	 */
	public void setUsuarioBlg(UsuarioBDlg usuarioBlg) {
		this.usuarioBlg = usuarioBlg;
	}

	/**
	 * 
	 * @return
	 */
	public String validarUsuario()
	{
		String path = null;
		usuario = (UsuarioCObjItf) this.getUsuarioBlg().validarUsuarioPassword(getNombre() ,getPass());
		
		if(!usuario.isMensaje())
			path = "/tc2/main/main.xhtml?faces-redirect=true";//Constantes.MAIN; //Agregar una constante
		else{
			//mensaje de error - mostrar
			this.setMessage(usuario.getDescripcionMensaje());
		}
		//this.setMessage(Constantes.ERROR_USUARIO); //ver
		return path;
	}

	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the usuario
	 */
	public UsuarioCObjItf getUsuario() {
		return this.usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioCObj usuario) {
		this.usuario = usuario;
	}
	
	
	
}
