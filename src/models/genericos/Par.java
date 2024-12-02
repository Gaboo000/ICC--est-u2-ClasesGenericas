package models.genericos;

public class Par <K,V> {
    private K clave;
     private V valor;

     
    public K getClave() {
        return clave;
    }
    public void setClave(K clave) {
        this.clave = clave;
    }
    public V getValor() {
        return valor;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }

     

    
}
