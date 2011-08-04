/**
 * 
 */
package um.appl.cmp2.tarifa.cobj;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import um.appl.cmp2.mensajeGenerico.MensajeGenerico;
import um.appl.cmp2.tarifa.itf.ImpuestoItf;

/**
 * @author Mariano
 *
 */
public class ImpuestoCObj extends MensajeGenerico implements ImpuestoItf{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 131721513496965694L;

	public static class Adapter extends XmlAdapter<ImpuestoCObj, ImpuestoItf> {
		@Override
		public ImpuestoCObj marshal(ImpuestoItf v) throws Exception {
		    return (ImpuestoCObj) v;
		}
		
		@Override
		public ImpuestoItf unmarshal(ImpuestoCObj v) throws Exception {
		    return v;
		}
	}
	
	private Long id;
	private BigDecimal valorPorcentaje;
	private String descripcion;
	private String estado;
	private String usuarioModif;
	private Date fechaUltMod;
	private Date fechaCambioEstado;
	private Long optimisticLock;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the valorPorcenaje
	 */
	public BigDecimal getValorPorcentaje() {
		return valorPorcentaje;
	}
	/**
	 * @param valorPorcenaje the valorPorcenaje to set
	 */
	public void setValorPorcentaje(BigDecimal valorPorcentaje) {
		this.valorPorcentaje = valorPorcentaje;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the usuarioModif
	 */
	public String getUsuarioModif() {
		return usuarioModif;
	}
	/**
	 * @param usuarioModif the usuarioModif to set
	 */
	public void setUsuarioModif(String usuarioModif) {
		this.usuarioModif = usuarioModif;
	}
	/**
	 * @return the fechaUltMod
	 */
	public Date getFechaUltMod() {
		return fechaUltMod;
	}
	/**
	 * @param fechaUltMod the fechaUltMod to set
	 */
	public void setFechaUltMod(Date fechaUltMod) {
		this.fechaUltMod = fechaUltMod;
	}
	/**
	 * @return the fechaCambioEstado
	 */
	public Date getFechaCambioEstado() {
		return fechaCambioEstado;
	}
	/**
	 * @param fechaCambioEstado the fechaCambioEstado to set
	 */
	public void setFechaCambioEstado(Date fechaCambioEstado) {
		this.fechaCambioEstado = fechaCambioEstado;
	}
	/**
	 * @return the optimisticLock
	 */
	public Long getOptimisticLock() {
		return optimisticLock;
	}
	/**
	 * @param optimisticLock the optimisticLock to set
	 */
	public void setOptimisticLock(Long optimisticLock) {
		this.optimisticLock = optimisticLock;
	}
	
	
}
