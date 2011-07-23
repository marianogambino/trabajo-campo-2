/**
 * 
 */
package um.appl.cmp2.usuario.cobj;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import um.appl.cmp2.mensajeGenerico.MensajeGenerico;
import um.appl.cmp2.usuario.itf.UsuarioCObjItf;


/**
 * @author Mariano
 *
 */

public class UsuarioCObj extends MensajeGenerico implements UsuarioCObjItf,Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7802757766999349577L;
	
	public static class Adapter extends XmlAdapter<UsuarioCObj, UsuarioCObjItf> {
		@Override
		public UsuarioCObj marshal(UsuarioCObjItf v) throws Exception {
		    return (UsuarioCObj) v;
		}
		
		@Override
		public UsuarioCObjItf unmarshal(UsuarioCObj v) throws Exception {
		    return v;
		}
	}
	
	
	private Long id;
	private String nombre;
	private String password;
	private String tipoPermiso;
	//Falta agregar atributo de reintentos de logueo
	//Falta Tiempo de session. al momento del alta va ser un valor default.
	private String estado;
	private String usuUltModif;
	private Date fechaUltModif;
	private Date fechaCambioEstado;
	private Long optimistickLock;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the tipoPermiso
	 */
	public String getTipoPermiso() {
		return tipoPermiso;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @return the usuUltModif
	 */
	public String getUsuUltModif() {
		return usuUltModif;
	}
	/**
	 * @return the fechaUltModif
	 */
	public Date getFechaUltModif() {
		return fechaUltModif;
	}
	/**
	 * @return the fechaCambioEstado
	 */
	public Date getFechaCambioEstado() {
		return fechaCambioEstado;
	}
	/**
	 * @return the optimistickLock
	 */
	public Long getOptimistickLock() {
		return optimistickLock;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param tipoPermiso the tipoPermiso to set
	 */
	public void setTipoPermiso(String tipoPermiso) {
		this.tipoPermiso = tipoPermiso;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @param usuUltModif the usuUltModif to set
	 */
	public void setUsuUltModif(String usuUltModif) {
		this.usuUltModif = usuUltModif;
	}
	/**
	 * @param fechaUltModif the fechaUltModif to set
	 */
	public void setFechaUltModif(Date fechaUltModif) {
		this.fechaUltModif = fechaUltModif;
	}
	/**
	 * @param fechaCambioEstado the fechaCambioEstado to set
	 */
	public void setFechaCambioEstado(Date fechaCambioEstado) {
		this.fechaCambioEstado = fechaCambioEstado;
	}
	/**
	 * @param optimistickLock the optimistickLock to set
	 */
	public void setOptimistickLock(Long optimistickLock) {
		this.optimistickLock = optimistickLock;
	}
	
	
}
