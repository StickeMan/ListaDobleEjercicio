import javax.swing.JOptionPane;

/**
 * @author Francisco Delgado Martínez.
 * */
public class ListaEstudiante {

    Nodo first, last;
    
    public ListaEstudiante() {
        this.first = null;
        this.last = null;
    }

    public void saveInicio(Nodo nuevoNodo) {
        if (first == null && last == null) {
            first = last = nuevoNodo;
        } else {
            nuevoNodo.setAfter(first);
            first.setBefore(nuevoNodo);
            first = nuevoNodo;
        }
    }
    
    public void saveFinal(Nodo nuevoNodo) {
        if (first == null && last == null) {
            first = last = nuevoNodo;
        } else {
            nuevoNodo.setBefore(last);
            last.setAfter(nuevoNodo);
            last = nuevoNodo;
        }
    }
    
    public String enlistarAlumnos(){
        Nodo Aux=first;
        int index = 1;
        String result = "";
        while(Aux!=null){
            String temp = String.format("%s-%s %s %s (%d) [%s]\n", 
                    index,Aux.getDato().getApellidoP(),Aux.getDato().getApellidoM(),
                    Aux.getDato().getNombre(),Aux.getDato().getMatricula(),
                    Aux.getDato().getCarrera());
            result += temp;
            Aux=Aux.getAfter();
            index += 1;
        }
        return result;
    }
    
    public int CantidadAlumnos(){
        Nodo Aux=first;
        int result = 0;
        while(Aux!=null){
            Aux=Aux.getAfter();
            result += 1;
        }
        return result;
    }
    
    public void buscarMatricula(int search){
        Nodo Aux=first;
        while(Aux!=null){
            if(Aux.dato.getMatricula()==search){
                JOptionPane.showMessageDialog(null,"Dato encontrado: "+Aux.getDato()); 
               break;
            }
            Aux=Aux.After;
        }
        JOptionPane.showMessageDialog(null,"Dato no encontrado");
    }
    
    //public void eliminarApellidoP(String ApelliP){}
    
    public String imprimirListaFinal(){
        Nodo Aux=first;
        String Cadena="<=>";
        while(Aux!=null){
            Cadena = Cadena + "["+Aux.dato+"]<=>";
            Aux=Aux.getAfter();
        }
        return Cadena;
    }
    
    public String imprimirListaInicio(){
        Nodo Aux=last;
        String Cadena="<=>";
        while(Aux!=null){
            Cadena = Cadena + "["+Aux.dato+"]<=>";
            Aux=Aux.getBefore();
        }
        return Cadena;
    }
}
