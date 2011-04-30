package um.appl.cmp2.cliente.dobj;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import um.appl.cmp2.factura.dobj.FacturaDO;
import um.appl.cmp2.persona.dobj.PersonaDO;
import um.appl.cmp2.puntoSuministro.dobj.PuntoSuministroDO;

/**
 * 
 * @author xx
 *
 */
@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("C")
@PrimaryKeyJoinColumn(name="PER_ID")
@Table(name = "CLIENTE")
public class ClienteDO extends PersonaDO 
{
	//private Long cliId;
	private Set<PuntoSuministroDO> puntosDeSuministro;
	private Set<FacturaDO> facturas;
	
	/**
	 * @return the id
	 */
	//@Column(name="PER_ID")
	//public Long getCliId() {
	//	return cliId;
	//}
	/**
	 * @param id the id to set
	 */
	//public void setCliId(Long cliId) {
//		this.cliId = cliId;
//	}
	
	/**
	 * @return the puntosDeSuministro
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="PDS_CLI_ID", nullable = false)
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<PuntoSuministroDO> getPuntosDeSuministro() {
		return puntosDeSuministro;
	}
	/**
	 * @param puntosDeSuministro the puntosDeSuministro to set
	 */
	public void setPuntosDeSuministro(Set<PuntoSuministroDO> puntosDeSuministro) {
		this.puntosDeSuministro = puntosDeSuministro;
	}
	/**
	 * @return the facturas
	 */
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY, mappedBy = "cliente")
	@Cascade({org.hibernate.annotations.CascadeType.ALL,
			  org.hibernate.annotations.CascadeType.DELETE})
	public Set<FacturaDO> getFacturas() {
		return facturas;
	}
	/**
	 * @param facturas the facturas to set
	 */
	public void setFacturas(Set<FacturaDO> facturas) {
		this.facturas = facturas;
	}
}
