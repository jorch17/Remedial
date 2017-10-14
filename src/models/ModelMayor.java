package models;


public class ModelMayor {
    
    private int n1 = 17;
    private int n2 = 16;
    private int n3 = 15;
    private int resultado = 11;
    
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
    
    public int getN3(){
        return n3;
    }
    public void setN3(int n3){
        this.n3 = n3;
    }
    
    public int getResultado(){
         return resultado;
     }
    public void setResultado(int resultado){
         this.resultado = resultado;
     }
    
    public void mayor(){
        resultado = n1;
        if(n2 > resultado ){
            resultado = n2;
        }
        if(n3 > resultado){
           resultado = n3;
        }  
    }
    
    public void menor(){
        resultado = n1;
        if(n2 < resultado ){
            n2 = resultado;
        }
        if(n3 < resultado){
            n3 = resultado;
        }
    }
}
