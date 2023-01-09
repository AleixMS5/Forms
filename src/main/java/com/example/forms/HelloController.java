package com.example.forms;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField Primer;
    @FXML
    private TextField Segon;
    @FXML
    private Label resultat;



    @FXML




    public void onClickmas() {
        try{
        resultat.setText(" "+(Float.valueOf(Primer.getText()) + Float.valueOf(Segon.getText())));
        }catch (Exception ex){
            resultat.setText("per favor no posis lletres o comes ja que estas sumant nombres i has de posar punts");
        }
    }
    public void onClickmenos() {
        try{
        resultat.setText(" "+(Float.valueOf(Primer.getText()) - Float.valueOf(Segon.getText())));
    }catch (Exception ex){
        resultat.setText("per favor no posis lletres o comes ja que estas sumant nombres i has de posar punts");
    }
    }
    public void onClickpor() {
        try{
        resultat.setText(" "+(Float.valueOf(Primer.getText()) * Float.valueOf(Segon.getText())));
    }catch (Exception ex){
        resultat.setText("per favor no posis lletres o comes ja que estas sumant nombres i has de posar punts");
        }
    }
    public void onClickentre() {
        try{
        resultat.setText(" "+((double)Float.valueOf(Primer.getText()) / (double)Float.valueOf(Segon.getText())));
        }catch (Exception ex){
        resultat.setText("per favor no posis lletres o comes ja que estas sumant nombres i has de posar punts");
        }
    }



}