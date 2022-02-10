package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;


public class LoginController implements Initializable {

	 	@FXML
	    private PasswordField password;

	    @FXML
	    private TextField username;

	    @FXML
	    private Button signUp;

	    @FXML
	    private Button login;

	    @FXML
	    private CheckBox rememberMe;

	    @FXML
	    private Button forgotPassword;
	    
	    @FXML
	    private ImageView carGif;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		username.setStyle("-fx-text-inner-color: white");
		password.setStyle("-fx-text-inner-color: white");
		
	}
	
	@FXML
	public void loginAction(ActionEvent e) {
		
		PauseTransition pt = new PauseTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setOnFinished(ev -> {
			
			System.out.println("Login Sucsess");
		});
		
		pt.play();
		
	}
	
	@FXML
	public void signupPage(ActionEvent e1) throws IOException {
				
		login.getScene().getWindow().hide();
		
		Stage signup = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/SignUP.fxml"));
		Scene scene = new Scene(root);
		signup.setScene(scene);
		signup.show();
		signup.setResizable(false);
		
	}
	
	


	
}
