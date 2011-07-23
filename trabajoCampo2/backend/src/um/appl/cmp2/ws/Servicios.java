package um.appl.cmp2.ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import um.appl.cmp2.exeptions.BackendException;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.itf.UsuarioCObjItf;
import um.appl.cmp2.usuario.itf.UsuarioSrvItf;
import um.appl.cmp2.util.itf.UtilSrvlItf;

/**
 * 
 * @author Mariano
 *
 */
@WebService(endpointInterface="um.appl.cmp2.ws.IWs")
public class Servicios implements IWs{

	@Autowired
	private UsuarioSrvItf usuarioSrv;
	
	@Autowired 
	private UtilSrvlItf utilSrv;
	
	
	/**
	 * @return the usuarioSrv
	 */
	public UsuarioSrvItf getUsuarioSrv() {
		return usuarioSrv;
	}

	/**
	 * @param usuarioSrv the usuarioSrv to set
	 */
	public void setUsuarioSrv(UsuarioSrvItf usuarioSrv) {
		this.usuarioSrv = usuarioSrv;
	}

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "HOLA";
	}

	@Override
	public void crearUsuario(UsuarioCObj usuario){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuario(UsuarioCObj usuario){
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuarioCObjItf findById(Long id){
		
		UsuarioCObjItf cobj = null;
		try {
			cobj = getUsuarioSrv().findById(id);
		} catch (BackendException e) {
			e.setMensaje(cobj);
		}
		return cobj;
		
	}

	@Override
	public UsuarioCObjItf validarUsuario(String nomUsu){
		UsuarioCObjItf cobj = null;
		try {
			cobj =  getUsuarioSrv().validarUsuario(nomUsu);
		} catch (BackendException e) {
			e.setMensaje(cobj);
		}
		return cobj;
	}

	@Override
	public UsuarioCObjItf validarUsuarioPassword(String nomUsu, String pass){
		UsuarioCObjItf cobj = new UsuarioCObj();
		try {
			cobj = getUsuarioSrv().validarUsuarioPassword(nomUsu, pass);
		}catch (BackendException e) {
			e.setMensaje(cobj);
		}
		return cobj;
	}

	@Override
	public String getFechaActual() {
		return utilSrv.getFechaActualFormateda();
	}

	/**
	 * @return the utilSrv
	 */
	public UtilSrvlItf getUtilSrv() {
		return utilSrv;
	}

	/**
	 * @param utilSrv the utilSrv to set
	 */
	public void setUtilSrv(UtilSrvlItf utilSrv) {
		this.utilSrv = utilSrv;
	}
	
	
	
	

}
