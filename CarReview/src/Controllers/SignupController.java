package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SignupController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private RadioButton male;

    @FXML
    private RadioButton female;

    @FXML
    private TextField location;

    @FXML
    private Button signUp;

    @FXML
    private Button login;
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		username.setStyle("-fx-text-inner-color: white");
//		password.setStyle("-fx-text-inner-color: white");
		
	}
	
	@FXML
	public void registeredSignUp(ActionEvent e) {
		
		PauseTransition pt = new PauseTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setOnFinished(e2 -> {
			
			System.out.println("SignUp Success");
		});
		
		pt.play();
		
	}
	
	@FXML
	public void loginAction(ActionEvent e2) throws IOException {
		
		// får scenen til dette vinduet og hjemmer det bort
		signUp.getScene().getWindow().hide();
		
		// lager en ny scene, og setter den til Login via FXML
		Stage login = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
		Scene scene = new Scene(root);
		login.setScene(scene);
		login.show();
		login.setResizable(false);
		
		
		
	}
	
	
	
	
	
	
	
	

}
