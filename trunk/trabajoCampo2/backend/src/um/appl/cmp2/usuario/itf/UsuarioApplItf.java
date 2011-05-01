package um.appl.cmp2.usuario.itf;

import um.appl.cmp2.commons.itf.ApplItf;

public interface UsuarioApplItf extends ApplItf 
{
	
	public <T> T findByNameUser(String nomUsu) throws Exception;
}
