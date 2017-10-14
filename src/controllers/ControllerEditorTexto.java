package controllers;
import models.ModelEditorTexto;
import views.ViewEditorTexto;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;


public class ControllerEditorTexto {
    
    private FileWriter fw;
    private FileReader fr = null ;
    private JFileChooser jfc = new JFileChooser ();
    ModelEditorTexto model_editortexto;
    ViewEditorTexto view_editortexto;
    
    
    public ControllerEditorTexto(ModelEditorTexto model_editortexto,ViewEditorTexto view_editortexto){
        
        this.model_editortexto = model_editortexto;
        this.view_editortexto = view_editortexto;
        view_editortexto.jbtn_abrir.addActionListener(event -> jbtn_abrir_click());
        view_editortexto.jbtn_guardar.addActionListener(event -> jbtn_guardar_click());
        view_editortexto.jbtn_salir.addActionListener(event -> jbtn_salir_click());
        
    }
    
    public void jbtn_abrir_click(){
        try{
            jfc.showOpenDialog(view_editortexto);
            model_editortexto.setArchivo(jfc.getSelectedFile());
            fr = new FileReader(model_editortexto.getArchivo());
            int character = 0;
            String texto = "";
            while((character = fr.read())!=-1){
                texto+=(char) character;
            }
            fr.close();
            view_editortexto.jta_archivo.setText(texto);
            
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo No encontrado");
        }
        catch(IOException e){
            System.err.println("Error con el Archivo");
            
        }
        finally{
        try{
            fr.close();
        }
        catch(IOException e){
            System.err.println("Error al cerrar");
        }  
        }
    }
    
    public void jbtn_guardar_click(){
        try{
        //jfc.showSaveDialog(view_editortexto);
        fw = new FileWriter(model_editortexto.getArchivo());
        System.out.println("archivo guardado "+model_editortexto.archivo.getName());
        fw.write(view_editortexto.jta_archivo.getText());
        fw.close();
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo No encontrado");
        }
        catch(IOException e){
            System.err.println("Error con el Archivo");   
        }
    }
    
    public void jbtn_salir_click(){
        System.exit(0);
    }

    
    
}
