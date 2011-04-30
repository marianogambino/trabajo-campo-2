package um.appl.cmp2.ws;

import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import javax.jws.WebService;

/**
 * 
 * @author Mariano
 *
 */
@WebService
public interface IWs {
	
	public String hello();
	
	public void crearUsuario(UsuarioCObj usuario) throws Exception;
	public void actualizarUsuario(UsuarioCObj usuario) throws Exception;
	public UsuarioCObj findById(Long id) throws Exception;
	public Boolean validarUsuario(String nomUsu) throws Exception;
	public Boolean validarPassword(String nomUsu, String pass) throws Exception;

}
