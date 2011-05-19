/**
 * 
 */
package um.appl.cmp2.menu;

import javax.faces.bean.ManagedBean;
import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;

/**
 * 
 * @author Mariano
 *
 */
@ManagedBean(name="menuBean")
public class MenuBean {
	
	private MenuModel model;

	public MenuBean() {
		
		model = new DefaultMenuModel();
	//Primer submenu
		Submenu submenu = new Submenu();
		submenu.setLabel("Cliente");
		
		MenuItem item = new MenuItem();
		item.setValue("Alta Cliente");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Consultar Cliente");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Modificar Cliente");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Baja Cliente");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		
		model.addSubmenu(submenu);
	
	//Segundo submenu
		submenu = new Submenu();
		submenu.setLabel("Consumo");
		item = new MenuItem();
		item.setValue("Alta consumo de energia");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Alta consumo de energia");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Consulta Consumo por cliente");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Modificar consumo de energia");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		model.addSubmenu(submenu);
		
	//Tercero submenu
		submenu = new Submenu();
		submenu.setLabel("Consultas");
		item = new MenuItem();
		item.setValue("Consultar de Historico de Consumo");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Consultar Estadisticas de Consumo");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Consulta Facturacion");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Consulta de control y verificacion de consumos");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		model.addSubmenu(submenu);
		
	//Tercero submenu
		submenu = new Submenu();
		submenu.setLabel("Medidor");
		item = new MenuItem();
		item.setValue("Administrar Medidores");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		model.addSubmenu(submenu);
		
	//Cuarto submenu
		submenu = new Submenu();
		submenu.setLabel("Estado Medidor");
		item = new MenuItem();
		item.setValue("Administrar Estads de Medidor");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		model.addSubmenu(submenu);
		
	//Quinto submenu
		submenu = new Submenu();
		submenu.setLabel("Impuesto");
		item = new MenuItem();
		item.setValue("Administrar Impuesto");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		model.addSubmenu(submenu);
	
	//Sexto submenu
		submenu = new Submenu();
		submenu.setLabel("Tipo de Tarifa");
		item = new MenuItem();
		item.setValue("Administrar Tipo de Tarifa");
		item.setUrl("#");
		submenu.getChildren().add(item);	
		
		model.addSubmenu(submenu);
		
	//Septimo submenu
		submenu = new Submenu();
		submenu.setLabel("Tarifa");
		item = new MenuItem();
		item.setValue("Administrar Tarifa");
		item.setUrl("#");
		submenu.getChildren().add(item);	
		
		model.addSubmenu(submenu);
		
	//Octavo submenu
		submenu = new Submenu();
		submenu.setLabel("Tipo Punto Suministro");
		item = new MenuItem();
		item.setValue("Administrar Tipo Punto Suministro");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		model.addSubmenu(submenu);
	}

	public MenuModel getModel() {
		return model;
	}
}