package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controller {
    @FXML Label lblReceta;
    @FXML Label lblIngredientes;
    @FXML Label lblPreparacion;
    @FXML Label lblPreguntas;
    @FXML TextArea txtReceta;
    @FXML TextArea txtIngredientes;
    @FXML TextArea txtPreparacion;
    @FXML TextArea txtPreguntas;
    @FXML protected void initialize(){
        try{
            File f=new File("./src/sample/archivo.txt");
            BufferedReader br=new BufferedReader((new FileReader(f)));
            String texto="";
            while((texto = br.readLine())!=null){
                txtReceta.appendText("\n"+texto);
            }
        } catch (Exception e){
            txtReceta.setText(e.getMessage());
        }
        try{
            File f=new File("./src/sample/ingredientes.txt");
            BufferedReader br=new BufferedReader((new FileReader(f)));
            String texto="";
            while((texto = br.readLine())!=null){
                txtIngredientes.appendText("\n"+texto);
            }
        } catch (Exception e){
            txtIngredientes.setText(e.getMessage());
        }
        try{
            File f=new File("./src/sample/preparacion.txt");
            BufferedReader br=new BufferedReader((new FileReader(f)));
            String texto="";
            while((texto = br.readLine())!=null){
                txtPreparacion.appendText("\n"+texto);
            }
        } catch (Exception e){
            txtPreparacion.setText(e.getMessage());
        }
        try{
            File f=new File("./src/sample/.txt");
            BufferedReader br=new BufferedReader((new FileReader(f)));
            String texto="";
            while((texto = br.readLine())!=null){
                txtPreguntas.appendText("\n"+texto);
            }
        } catch (Exception e){
            txtPreguntas.setText(e.getMessage());
        }
    }
    public void procesar(ActionEvent event){
        String[] arregloIngredientes = txtReceta.getText().split("\n");
        lblIngredientes.setText("ingredientes: "+arregloIngredientes.length);
        boolean encontro=false;
        String[] arregloPreparacion = txtPreparacion.getText().split("\n");
        lblIngredientes.setText("Preparacion: "+arregloPreparacion.length);
        boolean encontrar=false;
        String[] arregloPreguntas = txtReceta.getText().split("\n");
        lblPreguntas.setText("preguntas: "+arregloPreguntas.length);
        boolean encuentra=false;
        for(int x=0;x<arregloIngredientes.length;x++){
            if(arregloIngredientes[x].contains("pulpa de cerdo")){
                String[] arr2=arregloIngredientes[x].split(" ");
                System.out.println(arr2[0]);
            }
            if (arregloIngredientes[x].contains("cebolla grande")){
                String[] arr2= arregloIngredientes[x].split(" ");
                System.out.println("unidad: "+arr2[1]);
            }
            if (encontro){

                System.out.println(arregloIngredientes[x]);
            }
            
        }
    }
}
