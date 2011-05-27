package um.appl.cmp2.usuario.itf;

import um.appl.cmp2.exeptions.BackendException;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;

/**
 * 
 * @author Mariano
 *
 */
public interface UsuarioSrvItf
{
	public void crearUsuario(UsuarioCObj usuario) throws BackendException;
	
	public void actualizarUsuario(UsuarioCObj usuario) throws BackendException;
		
	public UsuarioCObj findById(Long id) throws BackendException;
	
	public UsuarioCObj validarUsuario(String nomUsu) throws BackendException;
	
	public UsuarioCObj validarUsuarioPassword(String nomUsu, String pass) throws BackendException;
		
}
