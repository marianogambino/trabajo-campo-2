package um.appl.cmp2.empleado.dobj;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import um.appl.cmp2.persona.dobj.PersonaDO;
import um.appl.cmp2.usuario.dobj.UsuarioDO;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("E")
@PrimaryKeyJoinColumn(name="PER_ID")
@Table(name="EMPLEADO")
public class EmpleadoDO extends PersonaDO 
{
	//private Long empId;
	private UsuarioDO usuario;
	
	/**
	 * @return the id
	 */
	//@Column(name="PER_ID")
//	public Long getEmpId() {
	//	return empId;
//	}
	/**
	 * @param id the id to set
	 */
	//public void setEmpId(Long id) {
	//	this.empId = id;
	//}
	
	
	/**
	 * @return the usuario
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EMP_USU_ID", nullable = true)
	@Cascade({org.hibernate.annotations.CascadeType.ALL, 
			  org.hibernate.annotations.CascadeType.DELETE})
	public UsuarioDO getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioDO usuario) {
		this.usuario = usuario;
	}
		
}
