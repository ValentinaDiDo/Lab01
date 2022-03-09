package it.polito.tdp.parole;
import java.util.*;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	Parole p = new Parole();
	
    @FXML
    private Button btnDelete;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;

    @FXML
    private TextField txtTempi;


    @FXML
    void doInsert(ActionEvent event) {
    	long start = System.nanoTime();
    	
    	String temp = txtParola.getText();
    	p.addParola(temp);
    	
    	String stampa = "";
    	List<String> l = p.getElenco();
    	
    	for(String s : l) {
    		stampa += s + "\n";
    	}
    	
    	txtResult.setText(stampa);
    	txtParola.clear();
    	
    	long time = System.nanoTime();
    	long ris = time - start;
    	txtTempi.setText(""+ris);
    }

    @FXML
    void doDelete(ActionEvent event) {
    	long start = System.nanoTime();
    	
    	String eliminata = txtResult.getSelectedText();
    	p.cancella(eliminata);
    	
    	String stampa = "";
    	List<String> l = p.getElenco();
    	
    	for(String s : l) {
    		stampa += s + "\n";
    	}
    	
    	txtResult.setText(stampa);
    	txtParola.clear();
    	
    	long time = System.nanoTime();
    	long ris = time - start;
    	txtTempi.setText(""+ris);
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	long start = System.nanoTime();
    	
    	txtParola.clear();
    	txtResult.clear();
    	
    	p.reset();
    	
    	long time = System.nanoTime();
    	long ris = time - start;
    	txtTempi.setText(""+ris);
    	// TODO
    }

}


