package um.appl.cmp2.consumo.dobj;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.puntoSuministro.dobj.PuntoSuministroDO;
import um.appl.cmp2.util.Utilidades;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Consumo")
@SequenceGenerator(name="SEQ_GEN",sequenceName="CON_ID_SEQ_001", allocationSize=1)
public class ConsumoDO extends DObj
{
	private Long id;
	private Date fechaConsumo;
	private BigDecimal potenciaConsumida;
	private BigDecimal kwh; //Kilowatts x hora
	private PuntoSuministroDO puntoSuministro;
	private String usuarioModif;
	private Date fechaUltMod;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "SEQ_GEN")
	@Column(name="CON_ID" , nullable=false)
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
	 * @return the fechaConsumo
	 */
	@Column(name="CON_FECHA_CONSUMO" , nullable = false)
	public Date getFechaConsumo() {
		return fechaConsumo;
	}
	/**
	 * @param fechaConsumo the fechaConsumo to set
	 */
	public void setFechaConsumo(Date fechaConsumo) {
		this.fechaConsumo = fechaConsumo;
	}
	/**
	 * @return the potenciaConsumida
	 */
	@Column(name="CON_POT_CONSUMIDA",nullable=false)
	public BigDecimal getPotenciaConsumida() {
		return potenciaConsumida;
	}
	/**
	 * @param potenciaConsumida the potenciaConsumida to set
	 */
	public void setPotenciaConsumida(BigDecimal potenciaConsumida) {
		this.potenciaConsumida = potenciaConsumida;
	}
	/**
	 * @return the kwh
	 */
	@Column(name="CON_KWH",nullable = false)
	public BigDecimal getKwh() {
		return kwh;
	}
	/**
	 * @param kwh the kwh to set
	 */
	public void setKwh(BigDecimal kwh) {
		this.kwh = kwh;
	}
	/**
	 * @return the puntoSuministro
	 */
	@ManyToOne
	@JoinColumn(name="CON_PDS_ID",nullable = false)
	public PuntoSuministroDO getPuntoSuministro() {
		return puntoSuministro;
	}
	/**
	 * @param puntoSuministro the puntoSuministro to set
	 */
	public void setPuntoSuministro(PuntoSuministroDO puntoSuministro) {
		this.puntoSuministro = puntoSuministro;
	}
	/**
	 * @return the usuarioModif
	 */
	@Column(name="CON_USU_ULT_MOD",nullable=false)
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
	@Column(name="CON_USU_FECHA_ULT_MOD", nullable=false)
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
	
	@PrePersist
	public void prePersist()
	{
		this.fechaUltMod = Utilidades.getFechaActual();
	}
	
	@PreUpdate
	public void preUpdate()
	{
		this.fechaUltMod = Utilidades.getFechaActual();
	}
}
