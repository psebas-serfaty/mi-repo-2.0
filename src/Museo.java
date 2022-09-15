import java.util.ArrayList;

public class Museo {

    public RecursoMuseo recurso;
    ArrayList<RecursoMuseo> recursos = new ArrayList<RecursoMuseo>();

    public Museo() {
    }

    public ArrayList<RecursoMuseo> getRecursos() {
        return recursos;
    }

    public void setRecursos(ArrayList<RecursoMuseo> recursos) {
        this.recursos = recursos;
    }

    public boolean agregarRecurso(RecursoMuseo recurso) {

        if (recurso.getItem().getVida() == 0) {

            recursos.add(recurso);

            return true;

        } else {
            return false;
        }

    }

    public String imprimir() {
        String imprimir = "Museo ";
        for (RecursoMuseo recurso : recursos) {
            imprimir += "" + recurso.imprimir();
        }
        return imprimir;
    }

    public void imprimirRecurso() {
        for (RecursoMuseo recurso : recursos) {
            System.out.println(recurso.imprimir());
        }
    }

}
