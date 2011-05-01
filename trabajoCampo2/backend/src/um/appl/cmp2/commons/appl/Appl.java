/**
 * 
 */
package um.appl.cmp2.commons.appl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Mariano
 *
 */
public class Appl 
{
	@PersistenceContext
	protected EntityManager em;
	
	public Appl(){
	}
	
	/**
	 * @param em the em to set
	 */	
	public void setEm(EntityManager em) {
		this.em = em;
	}


	/**
	 * @return the em
	 */
	public EntityManager getEm() {
		return em;
	}
}
