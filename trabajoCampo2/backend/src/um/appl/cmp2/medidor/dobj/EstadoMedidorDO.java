package um.appl.cmp2.medidor.dobj;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import um.appl.cmp2.commons.dobj.DObj;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Estado_Medidor")
@SequenceGenerator(name="SEQ_GEN", sequenceName="EMD_ID_SEQ_001")
public class EstadoMedidorDO extends DObj 
{
	private Long id;
	private Date fecha;
	private BigDecimal lecturaMedidor;
	private TipoEstadoMedidorDO tipoEstadoMedidor;
	private String usuarioMod;
	private Date fechaUltModif;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "SEQ_GEN")
	@Column(name="EMD_ID" , nullable = false)
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
	 * @return the fecha
	 */
	@Column(name="EMD_FECHA",nullable=false)
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the lecturaMedidor
	 */
	@Column(name="EMD_LECTURA_MEDIDOR",nullable=false)
	public BigDecimal getLecturaMedidor() {
		return lecturaMedidor;
	}
	/**
	 * @param lecturaMedidor the lecturaMedidor to set
	 */
	public void setLecturaMedidor(BigDecimal lecturaMedidor) {
		this.lecturaMedidor = lecturaMedidor;
	}
	/**
	 * @return the tipoEstadoMedidor
	 */
	@OneToOne
	@JoinColumn(name="EMD_TEM_ID", nullable = false)
	public TipoEstadoMedidorDO getTipoEstadoMedidor() {
		return tipoEstadoMedidor;
	}
	/**
	 * @param tipoEstadoMedidor the tipoEstadoMedidor to set
	 */
	public void setTipoEstadoMedidor(TipoEstadoMedidorDO tipoEstadoMedidor) {
		this.tipoEstadoMedidor = tipoEstadoMedidor;
	}
	/**
	 * @return the usuarioMod
	 */
	@Column(name="EMD_USU_ULT_MOD",nullable=false)
	public String getUsuarioMod() {
		return usuarioMod;
	}
	/**
	 * @param usuarioMod the usuarioMod to set
	 */
	public void setUsuarioMod(String usuarioMod) {
		this.usuarioMod = usuarioMod;
	}
	/**
	 * @return the fechaUltModif
	 */
	@Column(name="EMD_FECHA_ULT_MOD",nullable = false)
	public Date getFechaUltModif() {
		return fechaUltModif;
	}
	/**
	 * @param fechaUltModif the fechaUltModif to set
	 */
	public void setFechaUltModif(Date fechaUltModif) {
		this.fechaUltModif = fechaUltModif;
	}
	/**
	 * @return the optimisticLock
	 */
	@Version
	@Column(name="LOCK_CONTROL",nullable=false)
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
