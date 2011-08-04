/**
 * 
 */
package um.appl.cmp2.tarifa.itf;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import um.appl.cmp2.mensajeGenerico.itf.MensajeGenericoItf;
import um.appl.cmp2.tarifa.cobj.ImpuestoCObj;

/**
 * @author Mariano
 *
 */
@XmlJavaTypeAdapter(ImpuestoCObj.Adapter.class)
public interface ImpuestoItf extends MensajeGenericoItf {

	
	public Long getId();
	public void setId(Long id);
	public BigDecimal getValorPorcentaje();
	public void setValorPorcentaje(BigDecimal valorPorcentaje);
	public String getDescripcion();
	public void setDescripcion(String descripcion);
	public String getEstado();
	public void setEstado(String estado);
	public String getUsuarioModif();
	public void setUsuarioModif(String usuarioModif);
	public Date getFechaUltMod();
	public void setFechaUltMod(Date fechaUltMod);
	public Date getFechaCambioEstado();
	public void setFechaCambioEstado(Date fechaCambioEstado);
	public Long getOptimisticLock();
	public void setOptimisticLock(Long optimisticLock);
	
}
