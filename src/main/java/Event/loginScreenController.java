package Event;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginScreenController {
	
	@FXML
	private TextField username;
	
	@FXML
	private TextField password;
	
	@FXML
	Label errorMessage;
	
	public void loginButtonClick() {
		System.out.println(username.getText());
		System.out.println(password.getText());
	}
}
