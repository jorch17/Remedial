package controllers;

import models.ModelMain;
import views.ViewMain;
import views.ViewMayor;
import views.ViewOperaciones;
import views.ViewOrdenamiento;
import views.ViewEditorTexto;

public class ControllerMain {
    
    ModelMain model_main;
    ViewMain view_main;
    ViewMayor view_mayor;
    ViewOperaciones view_operaciones;
    ViewOrdenamiento view_ordenamiento;
    ViewEditorTexto view_editortexto;
    
    
    
    public ControllerMain(ModelMain model_main,Object views[]){
        
        this.model_main = model_main;
        this.view_mayor = (ViewMayor)views[0];
        this.view_operaciones = (ViewOperaciones)views[1];
        this.view_ordenamiento = (ViewOrdenamiento)views[2];
        this.view_editortexto = (ViewEditorTexto)views[3];
        this.view_main = (ViewMain) views[4];
        initView();
        view_main.jmi_mayor.addActionListener(event -> jmi_mayor_click());
        view_main.jmi_operaciones.addActionListener(event -> jmi_operaciones_click());
        view_main.jmi_ordenar_asc.addActionListener(event -> jmi_ordenar_asc_click());
        view_main.jmi_block_notas.addActionListener(event -> jmi_block_notas_click());
        
    }
    
        public void initView(){
            view_main.setTitle("Aplicacón de Recuperacion");
            view_main.setLocationRelativeTo(null);
            view_main.setVisible(true);
        
    }
    
        public void jmi_mayor_click(){
            view_main.setContentPane(view_mayor);
            view_main.revalidate();
            view_main.repaint();
            
        }
        
        public void jmi_operaciones_click(){
            view_main.setContentPane(view_operaciones);
            view_main.revalidate();
            view_main.repaint(); 
        }
        
        public void jmi_ordenar_asc_click(){
            view_main.setContentPane(view_ordenamiento);
            view_main.revalidate();
            view_main.repaint();
        }
        
        public void jmi_block_notas_click(){
            view_main.setContentPane(view_editortexto);
            view_main.revalidate();
            view_main.repaint();
        }
}
