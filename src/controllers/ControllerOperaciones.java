package controllers;
import models.ModelOperaciones;
import views.ViewOperaciones;

public class ControllerOperaciones {
    ModelOperaciones model_operaciones;
    ViewOperaciones view_operaciones;
    
    
    public ControllerOperaciones(ModelOperaciones model_operaciones,ViewOperaciones view_operaciones){
        this.model_operaciones = model_operaciones;
        this.view_operaciones = view_operaciones;
        initView();
        view_operaciones.jbtn_suma.addActionListener(event -> jbtn_suma_click());
        view_operaciones.jbtn_resta.addActionListener(event -> jbtn_resta_click());
        view_operaciones.jbtn_multiplicacion.addActionListener(event -> jbtn_multiplicacion_click());
        view_operaciones.jbtn_division.addActionListener(event -> jbtn_division_click());
        
    }
    
    public void initView(){
        view_operaciones.jtf_n1.setText(String.valueOf(model_operaciones.getN1()));
        view_operaciones.jtf_n2.setText(String.valueOf(model_operaciones.getN2()));
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
        view_operaciones.setVisible(true);
    }
    
    public void jbtn_suma_click(){
        model_operaciones.setN1(Integer.parseInt(view_operaciones.jtf_n1.getText()));
        model_operaciones.setN2(Integer.parseInt(view_operaciones.jtf_n2.getText()));
        model_operaciones.suma();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
    }
    
    public void jbtn_resta_click(){
        model_operaciones.setN1(Integer.parseInt(view_operaciones.jtf_n1.getText()));
        model_operaciones.setN2(Integer.parseInt(view_operaciones.jtf_n2.getText()));
        model_operaciones.resta();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
    }
    
    public void jbtn_multiplicacion_click(){
        model_operaciones.setN1(Integer.parseInt(view_operaciones.jtf_n1.getText()));
        model_operaciones.setN2(Integer.parseInt(view_operaciones.jtf_n2.getText()));
        model_operaciones.multiplicacion();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
        
    }
    
    public void jbtn_division_click(){
        model_operaciones.setN1(Integer.parseInt(view_operaciones.jtf_n1.getText()));
        model_operaciones.setN2(Integer.parseInt(view_operaciones.jtf_n2.getText()));
        model_operaciones.division();
        view_operaciones.jtf_resultado.setText(String.valueOf(model_operaciones.getResultado()));
        
    }
}
