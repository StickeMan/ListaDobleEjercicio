/**
 * @author Francisco Delgado Martinez.
**/
public class Nodo {
    
    Nodo After;
    Nodo Before;
    Alumno dato;
    
    public Nodo(Alumno dato){
        this.After=null;
        this.Before=null;
        this.dato=dato;
    }

    public Nodo getAfter() {
        return After;
    }

    public void setAfter(Nodo After) {
        this.After = After;
    }

    public Nodo getBefore() {
        return Before;
    }

    public void setBefore(Nodo Before) {
        this.Before = Before;
    }

    public Alumno getDato() {
        return dato;
    }

    public void setDato(Alumno dato) {
        this.dato = dato;
    }
}
