/**
 * 
 */
package um.appl.cmp2.usuario.srv;

import org.springframework.stereotype.Service;

import um.appl.cmp2.commons.common.Common;
import um.appl.cmp2.exeptions.BackendException;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.dobj.UsuarioDO;
import um.appl.cmp2.usuario.itf.UsuarioApplItf;
import um.appl.cmp2.usuario.itf.UsuarioSrvItf;
import um.appl.cmp2.util.constantes.Constantes;
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
	public void actualizarUsuario(UsuarioCObj usuario)
	{		
		//this.getUsuarioAppl().update(getDO(usuario));
	}

	/**
	 * 
	 */
	public void crearUsuario(UsuarioCObj usuario)
	{
		//this.getUsuarioAppl().save(getDO(usuario));
	}
	
	
	/**
	 * @throws BackendException 
	 * @throws Exception 
	 * 
	 */
	public UsuarioCObj findById(Long id) throws BackendException
	{	
		UsuarioCObj cobj = null;
		UsuarioDO usu;
		usu = (UsuarioDO) this.getUsuarioAppl().findById(id);
		cobj = DzrUtils.convert(usu, UsuarioCObj.class);
		return cobj;
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
	 */
	public UsuarioCObj validarUsuarioPassword(String nomUsu, String pass)
	{
		UsuarioCObj usuCObj = new UsuarioCObj();
		
		try{
			if(nomUsu!=null){
				usuCObj = this.getUsuarioAppl().findByNameUser(nomUsu);
				
				//si el usuario y contraseña no son validos	
				if(!usuCObj.getNombre().equalsIgnoreCase(nomUsu)||!usuCObj.getPassword().equalsIgnoreCase(pass)){
					usuCObj.setMensaje(true);
					usuCObj.setDescripcionMensaje(Constantes.ERRROR_USUARIO_CONTRASEÑA);
				}
			}else{
				usuCObj.setMensaje(true);
				usuCObj.setDescripcionMensaje(Constantes.ERRROR_USUARIO_CONTRASEÑA);
			}
			
		}catch(BackendException e){
			e.setMensaje(usuCObj);
		}
		return usuCObj;
	}

	/**
	 * 
	 */
	public UsuarioCObj validarUsuario(String nomUsu) 
	{	
		UsuarioCObj usuCObj = null;
		try {
			usuCObj = this.getUsuarioAppl().findByNameUser(nomUsu);
		} catch (BackendException e) {
			e.setMensaje(usuCObj);
		}
		return usuCObj;
	}
	

}
