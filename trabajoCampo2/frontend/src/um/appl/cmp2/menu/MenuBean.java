/**
 * 
 */
package um.appl.cmp2.menu;

import javax.faces.bean.ManagedBean;
import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;

@ManagedBean(name="menuBean")
public class MenuBean {
	
	private MenuModel model;

	public MenuBean() {
		
		model = new DefaultMenuModel();
		//First submenu
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
		
		model.addSubmenu(submenu);
	//Second submenu
		submenu = new Submenu();
		submenu.setLabel("Consumo");
		item = new MenuItem();
		item.setValue("Alta consumo de energia");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		item = new MenuItem();
		item.setValue("Consulta Consumo por cliente");
		item.setUrl("#");
		submenu.getChildren().add(item);
		
		 model.addSubmenu(submenu);
	}

	public MenuModel getModel() {
		return model;
	}
}