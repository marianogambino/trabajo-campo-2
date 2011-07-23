/**
 * 
 */
package um.appl.cmp2.usuario.form;

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.usuario.bdlg.UsuarioBDlg;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.itf.UsuarioCObjItf;
import um.appl.cmp2.util.constantes.Constantes;

/**
 * @author Mariano
 *
 */
@SuppressWarnings("serial")
@Controller
//@ManagedBean(name="usuarioLogin")
@SessionScoped
public class UsuarioLoginForm extends Common
{
	private UsuarioCObjItf usuario; // ver
	private String message;
	private UsuarioBDlg blg;
	
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
		this.blg = usuarioBlg;
		usuario = new UsuarioCObj();
	}
	
	public UsuarioLoginForm(){
		
		usuario = new UsuarioCObj();
	}
	
	/**
	 * @return the blg
	 */
	public UsuarioBDlg getBlg() {
		return blg;
	}

	/**
	 * @param blg the blg to set
	 */
	public void setBlg(UsuarioBDlg blg) {
		this.blg = blg;
	}
	
	/**
	 * 
	 * @return
	 */
	public String validarUsuario()
	{
		String path = null;
		
		usuario = (UsuarioCObjItf) this.getBlg().validarUsuarioPassword("","");//getNombre() ,getPass());
		
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
