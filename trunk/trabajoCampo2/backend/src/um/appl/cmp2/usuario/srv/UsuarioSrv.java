/**
 * 
 */
package um.appl.cmp2.usuario.srv;

import org.springframework.stereotype.Service;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.dobj.UsuarioDO;
import um.appl.cmp2.usuario.itf.UsuarioApplItf;
import um.appl.cmp2.usuario.itf.UsuarioSrvItf;
import crm.tools.dzr.DzrUtils;

/**
 * @author Mariano
 * @param <T>
 *
 *  RECORDATORIO -> armar una clase Servicios con su Itf correspondiente y que este tenga el tratamiento de la Exception personalizada.
 *  
 *
 */
@SuppressWarnings({"serial"})
@Service
public class UsuarioSrv extends Common implements UsuarioSrvItf 
{
	
	private UsuarioApplItf usuarioAppl;
	
	
	public UsuarioSrv(){}
	
	/**
	 * 
	 */
	public void actualizarUsuario(UsuarioCObj usuario) throws Exception 
	{		
		this.getUsuarioAppl().update(getDO(usuario));
	}

	/**
	 * 
	 */
	public void crearUsuario(UsuarioCObj usuario) throws Exception 
	{
		this.getUsuarioAppl().save(getDO(usuario));
	}
	
	/**
	 * @throws Exception 
	 * 
	 */
	public UsuarioCObj findById(Long id) throws Exception 
	{	
		return getCObj((UsuarioDO)this.getUsuarioAppl().findById(id));
	}


	/**
	 * @return the usuarioAppl
	 */
	public UsuarioApplItf getUsuarioAppl() {
		return usuarioAppl;
	}


	/**
	 * @param usuarioAppl the usuarioAppl to set
	 */
	public void setUsuarioAppl(UsuarioApplItf usuarioAppl) {
		this.usuarioAppl = usuarioAppl;
	}
	
	/**
	 * 
	 * @param usu
	 * @return
	 */
	private UsuarioDO getDO(UsuarioCObj usu)
	{
		return DzrUtils.convert(usu, UsuarioDO.class);
	}
	
	/**
	 * 
	 * @param usu
	 * @return
	 */
	private UsuarioCObj getCObj(UsuarioDO usu)
	{
		return DzrUtils.convert(usu, UsuarioCObj.class);
	}

	/**
	 * 
	 */
	public Boolean validarPassword(String nomUsu, String pass) throws Exception
	{
		UsuarioDO usu = this.getUsuarioAppl().findByNameUser(nomUsu);
		
		if(usu != null)
		{
			if(usu.getPassword().equalsIgnoreCase(pass))
				return true;			
		}
		return false;
	}

	/**
	 * 
	 */
	public Boolean validarUsuario(String nomUsu) throws Exception 
	{	
		UsuarioDO usu = this.getUsuarioAppl().findByNameUser(nomUsu);
		
		if(usu != null)
			return true;
		return false;
	}
	

}
