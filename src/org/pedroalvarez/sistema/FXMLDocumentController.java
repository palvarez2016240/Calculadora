/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedroalvarez.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
    float dato1, dato2, resultado;
    int op;
    
    @FXML private TextField txtValores;
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMas;
    @FXML private Button btnMenos;
    @FXML private Button btnMasMenos;
    @FXML private Button btnMulti;
    @FXML private Button btn1x;
    @FXML private Button btnPorcen;
    @FXML private Button btnDivi;
    @FXML private Button btnXy;
    @FXML private Button btnPunto;
    @FXML private Button btnigual;
    @FXML private Button btnC;
    @FXML private Button btnCE;
    
   
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btnUno)
        txtValores.setText(txtValores.getText()+"1");
        
        else if (event.getSource() == btnDos)
        txtValores.setText(txtValores.getText()+"2");
        
        else if (event.getSource() == btnTres)
        txtValores.setText(txtValores.getText()+"3");
        
        else if (event.getSource() == btnCuatro)
        txtValores.setText(txtValores.getText()+"4");
        
        else if (event.getSource() == btnCinco)
        txtValores.setText(txtValores.getText()+"5");
        
        else if (event.getSource() == btnSeis)
        txtValores.setText(txtValores.getText()+"6");
        
        else if (event.getSource() == btnSiete)
        txtValores.setText(txtValores.getText()+"7");
        
        else if (event.getSource() == btnOcho)
        txtValores.setText(txtValores.getText()+"8");
        
        else if (event.getSource() == btnNueve)
        txtValores.setText(txtValores.getText()+"9");
        
        else if (event.getSource() == btnCero)
        txtValores.setText(txtValores.getText()+"0");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {     
        // TODO
    }    
    
}
