package um.appl.cmp2.commons.itf;

/**
 * 
 * @author Mariano
 * @param <T>
 *
 */
public interface ApplItf 
{
	public <T> void save(T t) throws Exception;
	
	public <T> void delete(T t) throws Exception;
	
	public <T> T findById(Long t) throws Exception;
	
	public <T> T find(T t) throws Exception;
	
	public <T> void update(T t) throws Exception;
	
}
