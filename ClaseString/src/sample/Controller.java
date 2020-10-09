package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtfrase;
    @FXML  Label lblResultado;
    @FXML ComboBox comboBox;
    @FXML protected void initialize(){
        comboBox.getItems().addAll("Char At","Ends with","compareTo","EqualsIgnoreCase","IndexOf","LastIndexOf","Replace","ReplaceFirst","Split","Startswith","Substring");
    }
    public void evento(ActionEvent event){
        String texto=txtfrase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()){
            case 0:{
                char res=texto.charAt(2);
                lblResultado.setText(res+ "");
                break;
            }
            case 1:{
                boolean res=texto.endsWith("ota");
                lblResultado.setText(res+ "");
                break;
            }
            case 2:{
                int res=texto.compareTo("4");
                lblResultado.setText(res+ "");
                break;
            }
            case 3:{
                boolean res=texto.equalsIgnoreCase("GRANDE");
                lblResultado.setText(res+ "");
                break;
            }
            case 4:{
                int res=texto.indexOf("buscar,2");
                        lblResultado.setText(res+ "");
                        break;
            }
            case 5:{
                int res=texto.lastIndexOf("tutoriales hispanos donde aprendes viendo");
                lblResultado.setText(res+ "");
                break;

            }
            case 6:{

                String res=texto.replace("2","3");
                lblResultado.setText(res+ "");
                break;
            }
            case 7:{
                String res=texto.replaceFirst("3","2");
                lblResultado.setText(res+ "");
                break;
            }
            case 8:{
                String string="123-654321";
                String[] parts=string.split("_");
                String part1=parts[0];
                String part2=parts[1];

            }
            case 9:{
                boolean res=texto.startsWith("a");
                lblResultado.setText(res+ "");
                break;
            }
            case 10:{
                String res=texto.substring(Integer.parseInt("hola mund"));
                lblResultado.setText(res+ "");
            }

        }

    }
}
