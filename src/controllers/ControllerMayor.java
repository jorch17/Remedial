package controllers;
import models.ModelMayor;
import views.ViewMayor;

public class ControllerMayor {
    ModelMayor model_mayor;
    ViewMayor view_mayor;
    
    public ControllerMayor(ModelMayor model_mayor, ViewMayor view_mayor){
        this.model_mayor = model_mayor;
        this.view_mayor = view_mayor;
        initView();
        view_mayor.jbtn_mayor.addActionListener(event -> jbtn_mayor_click());
        view_mayor.jbtn_menor.addActionListener(event -> jbtn_menor_click());
        
    
}
    public void initView(){
        view_mayor.jtf_n1.setText(String.valueOf(model_mayor.getN1()));
        view_mayor.jtf_n2.setText(String.valueOf(model_mayor.getN2()));
        view_mayor.jtf_n3.setText(String.valueOf(model_mayor.getN3()));
        view_mayor.jtf_resultado.setText(String.valueOf(model_mayor.getResultado()));
        view_mayor.setVisible(true);
        
    }
    
    public void jbtn_mayor_click(){
        model_mayor.setN1(Integer.parseInt(view_mayor.jtf_n1.getText()));
        model_mayor.setN2(Integer.parseInt(view_mayor.jtf_n2.getText()));
        model_mayor.setN3(Integer.parseInt(view_mayor.jtf_n3.getText()));
        model_mayor.mayor();
        view_mayor.jtf_resultado.setText(String.valueOf(model_mayor.getResultado()));
        
    }
    
    public void jbtn_menor_click(){
        model_mayor.setN1(Integer.parseInt(view_mayor.jtf_n1.getText()));
        model_mayor.setN2(Integer.parseInt(view_mayor.jtf_n2.getText()));
        model_mayor.setN3(Integer.parseInt(view_mayor.jtf_n3.getText()));
        model_mayor.menor();
        view_mayor.jtf_resultado.setText(String.valueOf(model_mayor.getResultado()));
        
    }
}
