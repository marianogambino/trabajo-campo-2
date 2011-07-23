package um.appl.cmp2.usuario.itf;

import um.appl.cmp2.usuario.cobj.UsuarioCObj;

/**
 * 
 * @author Mariano
 *
 */
public interface UsuarioBDlgItf
{
	public void crearUsuario(UsuarioCObj usuario);
	public void actualizarUsuario(UsuarioCObj usuario);
	public UsuarioCObjItf findById(Long id);
	public UsuarioCObjItf validarUsuario(String nomUsu);
	public UsuarioCObjItf validarUsuarioPassword(String nomUsu, String pass);
		
}
