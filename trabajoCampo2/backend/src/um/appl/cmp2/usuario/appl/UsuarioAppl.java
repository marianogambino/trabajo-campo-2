package um.appl.cmp2.usuario.appl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import crm.tools.dzr.DzrUtils;

import um.appl.cmp2.commons.appl.Appl;
import um.appl.cmp2.exeptions.BackendException;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;
import um.appl.cmp2.usuario.dobj.UsuarioDO;
import um.appl.cmp2.usuario.itf.UsuarioApplItf;

/**
 * 
 * @author Mariano
 * 
 */
@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
public class UsuarioAppl extends Appl implements UsuarioApplItf 
{
	public static Long UNO = 1L;
	
	public UsuarioAppl(){}
	
	/**
	 * 
	 */
	public UsuarioCObj findByNameUser(String nomUsu) throws BackendException
	{		
		UsuarioCObj usuCObj = new UsuarioCObj();
		
		//Retornar solo DOs
		try{
			Query q = getEm().createQuery("select u from UsuarioDO u where u.nombre =:nom ");
			q.setParameter("nom", nomUsu);		
			UsuarioDO usu = (UsuarioDO) q.getSingleResult();
			usuCObj = DzrUtils.convert(usu, UsuarioCObj.class);			
			
		}catch(RuntimeException e){
			throw new BackendException(e);
		}catch(Exception e){
			throw new BackendException(e);
		}
		return usuCObj;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public <T> void delete(T t) throws BackendException {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public <T> T find(T t) throws BackendException {
		
		return (T) getEm().find(UsuarioDO.class, (UsuarioDO) t);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public UsuarioDO findById(Long t) throws BackendException
	{		
		UsuarioDO usu;
		
		//Retornar solo DOs
		try{
			Query q = getEm().createQuery("select u from UsuarioDO u where u.id = :id ");
			q.setParameter("id", t);		
			usu = (UsuarioDO) q.getResultList().get(0);
			
		}catch(RuntimeException e){
			throw new BackendException(e);
		}catch(Exception e){
			throw new BackendException(e);
		}
		return usu;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public <T> void save(T t) throws BackendException
	{
		getEm().persist((UsuarioDO)t);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public <T> void update(T t) throws BackendException
	{		
		getEm().merge((UsuarioDO)t);
	}
	
}
