package ch.ffhs.hdo.client.ui.einstellungen;

import java.util.Observable;
import java.util.Observer;

import ch.ffhs.hdo.client.ui.base.Controller;
/**
 * 
 * @author Denis Bittante
 */
public class EinstellungController extends Controller<EinstellungModel, EinstellungView> {

	public EinstellungController() {
		super();

		
		
		getModel().addObserver(new Observer() {

			public void update(Observable o, Object arg) {
				EinstellungModel ein = (EinstellungModel)(arg);
			
			}
		});

	}

}
