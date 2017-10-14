package main;
import models.ModelMayor;
import views.ViewMayor;
import controllers.ControllerMayor;

import models.ModelOperaciones;
import views.ViewOperaciones;
import controllers.ControllerOperaciones;

import models.ModelOrdenamiento;
import views.ViewOrdenamiento;
import controllers.ControllerOrdenamiento;

import models.ModelEditorTexto;
import views.ViewEditorTexto;
import controllers.ControllerEditorTexto;

import models.ModelMain;
import views.ViewMain;
import controllers.ControllerMain;
public class Main {

    public static void main(String[] args) {
        
        ModelMayor model_mayor = new ModelMayor();
        ViewMayor view_mayor = new ViewMayor();
        ControllerMayor controller_mayor = new ControllerMayor(model_mayor,view_mayor);
       
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaciones = new ViewOperaciones();
        ControllerOperaciones controller_operciones = new ControllerOperaciones(model_operaciones ,view_operaciones);
        
        ModelOrdenamiento model_ordenamiento = new ModelOrdenamiento();
        ViewOrdenamiento view_ordenamiento = new ViewOrdenamiento();
        ControllerOrdenamiento controller_ordenamiento = new ControllerOrdenamiento(model_ordenamiento,view_ordenamiento);
        
        ModelEditorTexto model_editortexto = new ModelEditorTexto();
        ViewEditorTexto view_editortexto = new ViewEditorTexto();
        ControllerEditorTexto controller_editortexto = new ControllerEditorTexto(model_editortexto,view_editortexto);
        
        
        ModelMain model_main = new ModelMain();
        ViewMain view_main = new ViewMain();
        Object views[] =new Object [5];
        views[0] = view_mayor;
        views[1] = view_operaciones;
        views[2] = view_ordenamiento;
        views[3] = view_editortexto;
        views[4] = view_main;
        
        ControllerMain controller_principal= new ControllerMain(model_main,views);
    }
    
}
