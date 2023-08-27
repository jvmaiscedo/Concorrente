/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author jvmaiscedo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Slider velocidadeDireito;
    @FXML
    private Button iniciarMovimento;
    @FXML
    private ImageView trem2;
    //int vel = (int) velocidadeDireito.getValue();
    //Trem trem = new Trem(419,550,5);
    int n =0;
    @FXML
  
private void iniciarMovimento(ActionEvent event) {
      int vel = (int) velocidadeDireito.getValue();
      Trem trem = new Trem(419,550, vel);
        Timeline timeline = new Timeline();
        
        KeyFrame keyFrame = new KeyFrame(Duration.millis(20), e -> {
            if (n < 1000) {
                trem.movimento(1);
                trem2.setLayoutX(trem.getPosicaoX());
                trem2.setLayoutY(trem.getPosicaoY());
                n++;
                trem.setVelocidade((int) velocidadeDireito.getValue());
            }
        });
        
        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      velocidadeDireito.setValue(5);
        
    }    
    
}
