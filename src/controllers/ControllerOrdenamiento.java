package controllers;
import models.ModelOrdenamiento;
import views.ViewOrdenamiento;
import javax.swing.DefaultListModel;

public class ControllerOrdenamiento {
    ModelOrdenamiento model_ordenamiento;
    ViewOrdenamiento view_ordenamiento;
    DefaultListModel<String> valores = new DefaultListModel<>();
    
    public ControllerOrdenamiento(ModelOrdenamiento model_ordenamiento,ViewOrdenamiento view_ordenamiento){
        
        this.model_ordenamiento = model_ordenamiento;
        this.view_ordenamiento = view_ordenamiento;
        this.view_ordenamiento.jbtn_agregar.addActionListener(e -> jbtn_agregar_click());
        this.view_ordenamiento.jbtn_asc.addActionListener(e -> jbtn_asc_click());
        this.view_ordenamiento.jbtn_desc.addActionListener(e -> jbtn_desc_click());
        this.view_ordenamiento.jlist_valores.setModel(valores);
        
        
    }
    
    public void initView(){
        
    }
    
     public void jbtn_agregar_click(){
        valores.addElement(view_ordenamiento.jtf_valor.getText());
        view_ordenamiento.jtf_valor.setText("");
        view_ordenamiento.jtf_valor.setFocusable(true);
        
    }
    
    public void jbtn_asc_click(){
        model_ordenamiento.setValores(valores);
        model_ordenamiento.asc();
        valores = model_ordenamiento.getValores();
    }
    
    public void jbtn_desc_click(){
        model_ordenamiento.setValores(valores);
        model_ordenamiento.desc();
        valores = model_ordenamiento.getValores();
    }
    
   
}
