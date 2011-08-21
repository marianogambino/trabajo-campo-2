/**
 * 
 */
package um.appl.cmp2.mensajeGenerico.itf;

import java.io.Serializable;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import um.appl.cmp2.mensajeGenerico.MensajeGenerico;


/**
 * @author Mariano
 *
 */
@XmlJavaTypeAdapter(MensajeGenerico.Adapter.class)
public interface MensajeGenericoItf extends Serializable{
	
	 public void setMensaje(Boolean isMensaje);
     public void setTipoMensaje(String tipoMensaje);
     public void setDescripcionMensaje(String mensajeError);
     public Boolean isMensaje();
     public String getTipoMensaje();
     public String getDescripcionMensaje();
}
