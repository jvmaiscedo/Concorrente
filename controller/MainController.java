package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import model.Coordenada;
import model.Trem;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author jvmaiscedo
 */
public class MainController implements Initializable {

  Coordenada coordenada1 = new Coordenada(351, 560);
  Coordenada coordenada2 = new Coordenada(412, 560);
  Coordenada coordenada3 = new Coordenada(351, 10);
  Coordenada coordenada4 = new Coordenada(412, 10);
  ArrayList<Coordenada> coordenadas = new ArrayList<>();

  @FXML
  private Slider velocidadeDireito;
  @FXML
  private Slider velocidadeEsquerdo;
  @FXML
  private ImageView trem1;
  @FXML
  private ImageView trem2;
  @FXML
  private RadioButton cimaParaBaixo;
  @FXML
  private RadioButton baixoParaCima;
  @FXML
  private RadioButton opostamente;
  @FXML
  private RadioButton opostamenteInverso;

  
  
 
  boolean iniciou;
  private KeyFrame AnimacaoTremVermelho;
  private KeyFrame AnimacaoTremVerde;
  private Timeline timeline;
  private Trem tremVermelho;
  private Trem tremVerde;
  private int movimentoTremEsquerdo;
  private int movimentoTremDireito;
  private int coordenadaTremDireito;
  private int coordenadaTremEsquerdo;
  private ActionEvent e;
  
  
  
  
  

  @FXML
  public void criarKeyFrames() {
    int vel1 = (int) velocidadeDireito.getValue();
    int vel2 = (int) velocidadeEsquerdo.getValue();
    tremVerde = new Trem(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaX(), coordenadas.get(coordenadaTremEsquerdo).getCoordenadaY(), vel2);
    tremVermelho = new Trem(coordenadas.get(coordenadaTremDireito).getCoordenadaX(), coordenadas.get(coordenadaTremDireito).getCoordenadaY(), vel1);

    AnimacaoTremVerde = new KeyFrame(Duration.millis(20), e -> {
      if (iniciou) {
        tremVerde.movimento(movimentoTremEsquerdo);
        trem1.setLayoutX(tremVerde.getPosicaoX());
        trem1.setLayoutY(tremVerde.getPosicaoY());
        tremVerde.setVelocidade((int) velocidadeEsquerdo.getValue());
      }
    });
    
    AnimacaoTremVermelho = new KeyFrame(Duration.millis(20), e -> {
      if (iniciou) {
        tremVermelho.movimento(movimentoTremDireito);
        trem2.setLayoutX(tremVermelho.getPosicaoX());
        trem2.setLayoutY(tremVermelho.getPosicaoY());
        tremVermelho.setVelocidade((int) velocidadeDireito.getValue());
      }
    });

    timeline = new Timeline(); // Inicialize a timeline uma única vez
    timeline.setCycleCount(Timeline.INDEFINITE);
    timeline.getKeyFrames().addAll(AnimacaoTremVermelho, AnimacaoTremVerde);
  }
  
  @FXML
  public void iniciarMovimento(ActionEvent event) {
    cimaParaBaixo.setDisable(true);
    baixoParaCima.setDisable(true);
    opostamente.setDisable(true);
    opostamenteInverso.setDisable(true);
    if (!iniciou) {
      criarKeyFrames(); // Crie as keyframes somente uma vez
      iniciou = true;
    }

    // Resto do seu código...
    timeline.play();
  }
  @FXML
  public void resetarMovimento(ActionEvent e) {
    cimaParaBaixo.setDisable(false);
    baixoParaCima.setDisable(false);
    opostamente.setDisable(false);
    opostamenteInverso.setDisable(false);
    iniciou = false;
    timeline.stop();
    trem1.setLayoutX(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaX());
    trem1.setLayoutY(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaY());
    trem2.setLayoutX(coordenadas.get(coordenadaTremDireito).getCoordenadaX());
    trem2.setLayoutY(coordenadas.get(coordenadaTremDireito).getCoordenadaY());

  }
  @FXML
  public void posicao1(ActionEvent e){
    baixoParaCima.setSelected(false);
    opostamente.setSelected(false);
    opostamenteInverso.setSelected(false);
    movimentoTremEsquerdo = 3;
    movimentoTremDireito = 4;
    coordenadaTremEsquerdo = 2;
    coordenadaTremDireito = 3;
    trem1.setRotate(180);
    trem2.setRotate(180);
    trem1.setLayoutX(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaX());
    trem1.setLayoutY(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaY());
    trem2.setLayoutX(coordenadas.get(coordenadaTremDireito).getCoordenadaX());
    trem2.setLayoutY(coordenadas.get(coordenadaTremDireito).getCoordenadaY());
    
  }
  public void posicao2(ActionEvent e){
    cimaParaBaixo.setSelected(false);
    opostamente.setSelected(false);
    opostamenteInverso.setSelected(false);
    movimentoTremEsquerdo = 1;
    movimentoTremDireito = 2;
    coordenadaTremEsquerdo = 0;
    coordenadaTremDireito = 1;
    trem1.setLayoutX(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaX());
    trem1.setLayoutY(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaY());
    trem2.setLayoutX(coordenadas.get(coordenadaTremDireito).getCoordenadaX());
    trem2.setLayoutY(coordenadas.get(coordenadaTremDireito).getCoordenadaY());
    trem1.setRotate(360);
    trem2.setRotate(360);
    
  }
  public void posicao3(ActionEvent e){
    cimaParaBaixo.setSelected(false);
    baixoParaCima.setSelected(false);
    opostamenteInverso.setSelected(false);
    movimentoTremEsquerdo = 3;
    movimentoTremDireito = 2;
    coordenadaTremEsquerdo = 2;
    coordenadaTremDireito = 1;
    trem1.setRotate(180);
    trem1.setLayoutX(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaX());
    trem1.setLayoutY(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaY());
    trem2.setLayoutX(coordenadas.get(coordenadaTremDireito).getCoordenadaX());
    trem2.setLayoutY(coordenadas.get(coordenadaTremDireito).getCoordenadaY());
    if(trem2.getRotate()==180){
      trem2.setRotate(360);
    }
  }
  public void posicao4(ActionEvent e){
    cimaParaBaixo.setSelected(false);
    baixoParaCima.setSelected(false);
    opostamente.setSelected(false);
    movimentoTremEsquerdo = 1;
    movimentoTremDireito = 4;
    coordenadaTremEsquerdo = 0;
    coordenadaTremDireito = 3;
    trem2.setRotate(180);
    trem1.setLayoutX(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaX());
    trem1.setLayoutY(coordenadas.get(coordenadaTremEsquerdo).getCoordenadaY());
    trem2.setLayoutX(coordenadas.get(coordenadaTremDireito).getCoordenadaX());
    trem2.setLayoutY(coordenadas.get(coordenadaTremDireito).getCoordenadaY());
    if(trem1.getRotate()==180){
      trem1.setRotate(360);
    }
  }
  
 
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    velocidadeDireito.setValue(5);
    velocidadeEsquerdo.setValue(5);
    coordenadas.add(coordenada1);
    coordenadas.add(coordenada2);
    coordenadas.add(coordenada3);
    coordenadas.add(coordenada4);
    this.posicao1(e);
    cimaParaBaixo.setSelected(true);

  }

}
