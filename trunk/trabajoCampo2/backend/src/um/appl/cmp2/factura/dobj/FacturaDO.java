package um.appl.cmp2.factura.dobj;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import um.appl.cmp2.cliente.dobj.ClienteDO;
import um.appl.cmp2.commons.dobj.DObj;
import um.appl.cmp2.consumo.dobj.ConsumoDO;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name="Factura")
@SequenceGenerator(name="SEQ_GEN", sequenceName = "FAC_ID_SEQ_001" , allocationSize = 1 )
public class FacturaDO extends DObj 
{
	private Long id;
	private Date fechaEmision;
	private Date fechaVencimiento;
	private BigDecimal importe;
	private BigDecimal totalAPagar;
	private ClienteDO cliente;
	private ConsumoDO consumo;
	private Long optimisticLock;
	
	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "SEQ_GEN")
	@Column(name="FAC_ID")
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
	 * @return the fechaEmision
	 */
	@Column(name="FAC_FECHA_EMISION" , nullable = false)
	public Date getFechaEmision() {
		return fechaEmision;
	}
	/**
	 * @param fechaEmision the fechaEmision to set
	 */
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	/**
	 * @return the fechaVencimiento
	 */
	@Column(name="FAC_FECHA_VEC" , nullable = false)
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	/**
	 * @param fechaVencimiento the fechaVencimiento to set
	 */
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	/**
	 * @return the importe
	 */
	@Column(name="FAC_IMPORTE" )
	public BigDecimal getImporte() {
		return importe;
	}
	/**
	 * @param importe the importe to set
	 */
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	/**
	 * @return the totalAPagar
	 */
	@Column(name="FAC_TOTAL_PAGAR")
	public BigDecimal getTotalAPagar() {
		return totalAPagar;
	}
	/**
	 * @param totalAPagar the totalAPagar to set
	 */
	public void setTotalAPagar(BigDecimal totalAPagar) {
		this.totalAPagar = totalAPagar;
	}
	/**
	 * @return the cliente
	 */
	@ManyToOne
	@JoinColumn(name="FAC_CLI_ID", nullable = false)
	public ClienteDO getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteDO cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the consumo
	 */
	@OneToOne
	@JoinColumn(name="FAC_CON_ID", nullable = false)
	public ConsumoDO getConsumo() {
		return consumo;
	}
	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(ConsumoDO consumo) {
		this.consumo = consumo;
	}
	/**
	 * @return the optimisticLock
	 */
	@Version
	@Column(name="LOCK_CONTROL")
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
