package um.appl.cmp2.ws;

import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.itf.UsuarioCObjItf;
import javax.jws.WebService;

/**
 * 
 * @author Mariano
 *
 */
@WebService
public interface IWs {
	
	public String hello();
	
	public void crearUsuario(UsuarioCObj usuario);
	public void actualizarUsuario(UsuarioCObj usuario);
	public UsuarioCObjItf findById(Long id);
	public UsuarioCObjItf validarUsuario(String nomUsu);
	public UsuarioCObjItf validarUsuarioPassword(String nomUsu, String pass);
	public String getFechaActual();

}
