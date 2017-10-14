package models;

public class ModelOperaciones {
    private int n1 = 15;
    private int n2 = 16;
    private int resultado = 17;
    
    public int getN1(){
        return n1;
    }
    public void setN1(int n1){
        this.n1 = n1;
    }
    
    public int getN2(){
        return n2;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }
    
    public int getResultado(){
        return resultado;
    }
    public void setResultado(int resultado){
        this.resultado = resultado;
    }
    
    public void suma(){
        resultado = n1 + n2;
    }
    
    public void resta(){
        resultado = n1 - n2;
    }
    
    public void multiplicacion(){
        resultado = n1 * n2;
    }
    
    public void division(){
        resultado = n1 / n2;
    }
    
}
