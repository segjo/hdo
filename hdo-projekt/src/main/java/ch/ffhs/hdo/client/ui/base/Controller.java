package ch.ffhs.hdo.client.ui.base;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public abstract class Controller<M extends Model, V extends View<M>> {

	// weiter Informationen :
	// https://docs.oracle.com/javase/tutorial/i18n/resbundle/concept.html

	ResourceBundle resourceBundle;
	JFrame frame;

	public Controller() {

		resourceBundle = ResourceBundle.getBundle("ch/ffhs/hdo/client/ui/resourceBundle", Locale.getDefault(),
				this.getClass().getClassLoader());
		frame = new JFrame();

	}

	public ResourceBundle getResourceBundle() {
		return resourceBundle;

	}

	public JFrame getMainWindow() {
		frame.setTitle("title");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocation(100, 100);

		return frame;
	}

}
