package um.appl.cmp2.commons.itf;

import um.appl.cmp2.exeptions.BackendException;

/**
 * 
 * @author Mariano
 * @param <T>
 *
 */
public interface ApplItf 
{
	public <T> void save(T t) throws BackendException;
	
	public <T> void delete(T t) throws BackendException;
	
	public <T> T findById(Long t) throws BackendException;
	
	public <T> T find(T t) throws BackendException;
	
	public <T> void update(T t) throws BackendException;
	
}
