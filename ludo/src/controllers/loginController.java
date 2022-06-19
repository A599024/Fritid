package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView bildeLudo;

    @FXML
    private Label ludoTekst;

    @FXML
    private Button spillKnapp;
    
    @FXML
    private Slider slider;

    @FXML
    void spillGo(ActionEvent event) throws IOException {
    	
    	/*
    	 * SLider vil kunne avgjøre hvor mange spillere som ønsker å spille
    	 * TODO
    	 */
    	
    	PauseTransition pt = new PauseTransition();
    	pt.setDuration(Duration.seconds(2));
    	pt.setOnFinished(ev -> {
    		System.out.println("Starter game");
        	spillKnapp.getScene().getWindow().hide();
        	Stage spillStage = new Stage();
        	Parent root = null;
			try {
				root = FXMLLoader.load(getClass().getResource("/FXML/ludoSpill.fxml"));
			} catch (IOException e) {
				e.printStackTrace();
			}
        	Scene scene = new Scene(root);
        	spillStage.setScene(scene);
        	spillStage.show();
        	spillStage.setResizable(false);
    	});
    	
    	pt.play();
    	    	
    }

    @FXML
    void initialize() {
        assert bildeLudo != null : "fx:id=\"bildeLudo\" was not injected: check your FXML file 'login.fxml'.";
        assert ludoTekst != null : "fx:id=\"ludoTekst\" was not injected: check your FXML file 'login.fxml'.";
        assert spillKnapp != null : "fx:id=\"spillKnapp\" was not injected: check your FXML file 'login.fxml'.";

    }

}
