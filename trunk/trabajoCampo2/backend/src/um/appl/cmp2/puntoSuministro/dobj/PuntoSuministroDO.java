package um.appl.cmp2.puntoSuministro.dobj;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;

import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.consumo.dobj.ConsumoDO;
import um.appl.cmp2.medidor.dobj.MedidorDO;
import um.appl.cmp2.util.Utilidades;

@SuppressWarnings("serial")
@Entity
@Table(name="Punto_De_Suministro")
@SequenceGenerator(name="SEQ_GEN", sequenceName="PDS_ID_SEQ_001",allocationSize=1)
public class PuntoSuministroDO extends DObj 
{
	private Long id;
	private String numero;
	private String calle;
	private String entreCalle1;
	private String entreCalle2;
	private BigDecimal potenciaInstalada;
	private LocalidadDO localidad;
	private TipoPuntoSuministroDO tipoPuntoSuministro;
	private MedidorDO medidor;
	private Set<ConsumoDO> consumos;
	private String estado;
	private String usuarioModif;
	private Date fechaUltMod;
	private Date fechaCambioEstado;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@Column(name="PDS_ID" , nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN" ) 
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
	 * @return the numero
	 */
	@Column(name="PDS_NUMERO" , nullable = true)
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the calle
	 */
	@Column(name="PDS_CALLE" , nullable = true)
	public String getCalle() {
		return calle;
	}
	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * @return the entreCalle1
	 */
	@Column(name="PDS_ENTRE_CALLE1" , nullable = true)
	public String getEntreCalle1() {
		return entreCalle1;
	}
	/**
	 * @param entreCalle1 the entreCalle1 to set
	 */
	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}
	/**
	 * @return the entreCalle2
	 */
	@Column(name="PDS_ENTRE_CALLE2" , nullable = true)
	public String getEntreCalle2() {
		return entreCalle2;
	}
	/**
	 * @param entreCalle2 the entreCalle2 to set
	 */
	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}
	/**
	 * @return the potenciaInstalada
	 */
	@Column(name="PDS_PONTENCIA_INSTALADA" , nullable = true)
	public BigDecimal getPotenciaInstalada() {
		return potenciaInstalada;
	}
	/**
	 * @param potenciaInstalada the potenciaInstalada to set
	 */
	public void setPotenciaInstalada(BigDecimal potenciaInstalada) {
		this.potenciaInstalada = potenciaInstalada;
	}
	/**
	 * @return the localidad
	 */
	@ManyToOne
	@JoinColumn(name="PDS_LOC_ID" , nullable = false)
	public LocalidadDO getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(LocalidadDO localidad) {
		this.localidad = localidad;
	}
	/**
	 * @return the tipoPuntoSuministro
	 */
	@ManyToOne
	@JoinColumn(name="PDS_TPS_ID", nullable = false)
	public TipoPuntoSuministroDO getTipoPuntoSuministro() {
		return tipoPuntoSuministro;
	}
	/**
	 * @param tipoPuntoSuministro the tipoPuntoSuministro to set
	 */
	public void setTipoPuntoSuministro(TipoPuntoSuministroDO tipoPuntoSuministro) {
		this.tipoPuntoSuministro = tipoPuntoSuministro;
	}
	/**
	 * @return the medidor
	 */
	@OneToOne
	@JoinColumn(name="PDS_MED_ID", nullable = false)
	public MedidorDO getMedidor() {
		return medidor;
	}
	/**
	 * @param medidor the medidor to set
	 */
	public void setMedidor(MedidorDO medidor) {
		this.medidor = medidor;
	}
	/**
	 * @return the consumos
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "puntoSuministro")
	@Cascade({org.hibernate.annotations.CascadeType.ALL, 
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<ConsumoDO> getConsumos() {
		return consumos;
	}
	/**
	 * @param consumos the consumos to set
	 */
	public void setConsumos(Set<ConsumoDO> consumos) {
		this.consumos = consumos;
	}
	
	/**
	 * @return the estado
	 */
	@Column(name="PDS_ESTADO" , nullable = false)
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
	@Column(name="PDS_USU_ULT_MOD" , nullable= false)
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
	@Column(name="PDS_FECHA_ULT_MOD" , nullable = false)
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
	@Column(name="PDS_FECHA_CAMBIO_ESTADO" , nullable = false)
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
	@Version
	@Column(name="LOCK_CONTROL", nullable = false)
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
		this.fechaCambioEstado = Utilidades.getFechaActual();
		this.fechaUltMod = Utilidades.getFechaActual();
	}
	
	@PreUpdate
	public void preUpdate()
	{
		this.fechaUltMod = Utilidades.getFechaActual();
	}
}
