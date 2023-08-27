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
    private Slider velocidadeEsquerdo;
    @FXML
    private Button iniciarMovimento;
    @FXML
    private ImageView trem1;
    @FXML
    private ImageView trem2;
    int n =0;
    @FXML
  
private void iniciarMovimento(ActionEvent event) {
      int vel1 = (int) velocidadeDireito.getValue();
      int vel2 = (int) velocidadeEsquerdo.getValue();
      Trem tremVermelho = new Trem(419,550, vel1);
      Trem tremVerde = new Trem(335,550,vel2);
        Timeline timeline = new Timeline();
        
        KeyFrame keyFrame1 = new KeyFrame(Duration.millis(20), e -> {
            if (n < 1000) {
                tremVermelho.movimento(1);
                trem2.setLayoutX(tremVermelho.getPosicaoX());
                trem2.setLayoutY(tremVermelho.getPosicaoY());
                n++;
                tremVermelho.setVelocidade((int) velocidadeDireito.getValue());
            }
        });
        
        
        timeline.getKeyFrames().add(keyFrame1);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
        
        KeyFrame keyFrame2 = new KeyFrame(Duration.millis(20), e -> {
            if (n < 1000) {
                tremVerde.movimento(2);
                trem1.setLayoutX(tremVerde.getPosicaoX());
                trem1.setLayoutY(tremVerde.getPosicaoY());
                n++;
                tremVerde.setVelocidade((int) velocidadeEsquerdo.getValue());
            }
        });
        timeline.getKeyFrames().add(keyFrame2);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      velocidadeDireito.setValue(5);
      velocidadeEsquerdo.setValue(5);
        
    }    
    
}
