package um.appl.cmp2.ws;

import javax.jws.WebService;

import um.appl.cmp2.usuario.cobj.UsuarioCObj;

/**
 * 
 * @author Mariano
 *
 */
@WebService(endpointInterface="um.appl.cmp2.ws.IWs")
public class Servicios implements IWs{

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
		return null;
	}

	@Override
	public Boolean validarUsuario(String nomUsu) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validarPassword(String nomUsu, String pass) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
