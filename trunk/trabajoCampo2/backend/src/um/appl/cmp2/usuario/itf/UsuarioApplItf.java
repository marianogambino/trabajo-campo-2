package um.appl.cmp2.usuario.itf;

import um.appl.cmp2.commons.itf.ApplItf;
import um.appl.cmp2.exeptions.BackendException;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;

public interface UsuarioApplItf extends ApplItf 
{
	
	public UsuarioCObj findByNameUser(String nomUsu) throws BackendException;
	
	
}
