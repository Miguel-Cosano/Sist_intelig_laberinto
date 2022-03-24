public class Nodo {
    int cordX,cordY;
    int costeG;
    Nodo padre;

    public Nodo(int cordX,int cordY,Nodo padre){

    }

    boolean mismaPos(Nodo n){
        return this.cordX==n.cordX && this.cordY==n.cordY;
    }
}
