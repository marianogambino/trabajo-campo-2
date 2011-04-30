package um.appl.cmp2.usuario.appl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import um.appl.cmp2.commons.appl.Appl;
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
	
	@SuppressWarnings("unchecked")
	public <T> T findByNameUser(String nomUsu) throws Exception 
	{		
		Query q = getEm().createQuery("select u from UsuarioDO u where u.nombre =:nom ");
		q.setParameter("nom", nomUsu);		
		return (T) q.getResultList().get(0);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public <T> void delete(T t) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public <T> T find(T t) throws Exception {
		
		return (T) getEm().find(UsuarioDO.class, (UsuarioDO) t);
	}

	@SuppressWarnings("unchecked")
	public <T> T findById(Long t) throws Exception 
	{		
		Query q = getEm().createQuery("select u from UsuarioDO u where u.id =:id ");
		q.setParameter(":id", t);		
		return (T) q.getResultList().get(0);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public <T> void save(T t) throws Exception 
	{
		getEm().persist((UsuarioDO)t);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
	public <T> void update(T t) throws Exception 
	{		
		getEm().merge((UsuarioDO)t);
	}
	
}
