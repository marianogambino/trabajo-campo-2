/**
 * 
 */
package um.appl.cmp2.usuario.itf;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import um.appl.cmp2.mensajeGenerico.itf.MensajeGenericoItf;
import um.appl.cmp2.usuario.cobj.UsuarioCObj;

/**
 * @author Mariano
 *
 */
@XmlJavaTypeAdapter(UsuarioCObj.Adapter.class)
public interface UsuarioCObjItf extends MensajeGenericoItf{
	
	public Long getId();
	public String getNombre();
	public String getPassword();
	public String getTipoPermiso();
	public String getEstado();
	public String getUsuUltModif();
	public Date getFechaUltModif();
	public Date getFechaCambioEstado();
	public Long getOptimistickLock();
	public void setId(Long id);
	public void setNombre(String nombre);
	public void setPassword(String password);
	public void setTipoPermiso(String tipoPermiso);
	public void setEstado(String estado);
	public void setUsuUltModif(String usuUltModif);
	public void setFechaUltModif(Date fechaUltModif);
	public void setFechaCambioEstado(Date fechaCambioEstado);
	public void setOptimistickLock(Long optimistickLock);

}
