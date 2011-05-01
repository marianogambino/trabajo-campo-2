package um.appl.cmp2.ws;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.itf.UsuarioSrvItf;

/**
 * 
 * @author Mariano
 *
 */
@WebService(endpointInterface="um.appl.cmp2.ws.IWs")
public class Servicios implements IWs{

	@Autowired
	private UsuarioSrvItf usuarioSrv;
	
	
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
	public void crearUsuario(UsuarioCObj usuario) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuario(UsuarioCObj usuario) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UsuarioCObj findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return getUsuarioSrv().findById(id);
	}

	@Override
	public Boolean validarUsuario(String nomUsu) throws Exception {
		
		return getUsuarioSrv().validarUsuario(nomUsu);
	}

	@Override
	public Boolean validarPassword(String nomUsu, String pass) throws Exception {
		// TODO Auto-generated method stub
		return getUsuarioSrv().validarPassword(nomUsu, pass);
	}
	
	
	

}
