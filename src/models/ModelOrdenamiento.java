package models;
import javax.swing.DefaultListModel;

public class ModelOrdenamiento {
    
    private DefaultListModel<String> valores;
    
    public DefaultListModel<String>getValores(){
        return valores;
    }
    public void setValores(DefaultListModel<String> valores){
        this.valores = valores;                
    }
    
    
    public void asc(){
        int size = valores.getSize();
        for(int i = 0;1 < size;i++){
            for(int j = 0;j < size;i++){
                int fila = Integer.parseInt(valores.elementAt(i));
                int columna = Integer.parseInt(valores.elementAt(j));
                if(fila > columna){
                    int tmp = fila;
                    fila = columna;
                    columna = tmp;
                }
                valores.setElementAt(String.valueOf(fila),i);
                valores.setElementAt(String.valueOf(columna),j);
            }
            
        }
    }
    
    public void desc(){
        int size = valores.getSize();
        for(int i = 0;1 < size;i++){
            for(int j = 0;j < size;i++){
                int fila = Integer.parseInt(valores.elementAt(i));
                int columna = Integer.parseInt(valores.elementAt(j));
                if(fila < columna){
                    int tmp = fila;
                    fila = columna;
                    columna = tmp;
                }
                valores.setElementAt(String.valueOf(fila),i);
                valores.setElementAt(String.valueOf(columna),j);
            }   
        }   
    }
    
    public void promedio(){
        
    }
}
