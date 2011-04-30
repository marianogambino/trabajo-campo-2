/**
 * 
 */
package um.appl.cmp2.usuario.form;

import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Controller;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.usuario.bdlg.UsuarioBDlg;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
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
	private String nomUsuario;
	private String password;
	
	private UsuarioCObj usuario; // ver
	
	private String message;
	
	private UsuarioBDlg blg;
	
	/**
	 * 
	 * @param usuarioBlg
	 */
	public UsuarioLoginForm(UsuarioBDlg usuarioBlg)
	{
		this.blg = usuarioBlg;
	}
	
	public UsuarioLoginForm(){}
	
	/**
	 * @return the nomUsuario
	 */
	public String getNomUsuario() {
		return nomUsuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param nomUsuario the nomUsuario to set
	 */
	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
		try 
		{
			if(this.getBlg().validarUsuario(this.nomUsuario))
			{
				if(this.getBlg().validarPassword(this.nomUsuario,this.password))
					path = "/tc2/main/main.xhtml?faces-redirect=true";//Constantes.MAIN;
			}			
		}
		catch (Exception e) 
		{		
			e.printStackTrace();
		}
		this.setMessage(Constantes.ERROR_USUARIO);
		return path;
	}

	/**
	 * @return the usuario
	 */
	public UsuarioCObj getUsuario() {
		return usuario;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioCObj usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
