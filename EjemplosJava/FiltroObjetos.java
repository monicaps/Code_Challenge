import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Objeto {
    String naturaleza;
    double importe;
    String concepto;
    String descripcion;

    public Objeto(String naturaleza, double importe, String concepto, String descripcion) {
        this.naturaleza = naturaleza;
        this.importe = importe;
        this.concepto = concepto;
        this.descripcion = descripcion;
    }
}

public class FiltroObjetos {
    public static boolean filtrarYSumar(List<Objeto> objetos, String conceptoInicial, String conceptoAEliminar) {
        List<Objeto> listaAuxiliar = objetos.stream()
                .filter(obj -> obj.concepto.equals(conceptoInicial))
                .collect(Collectors.toList());

        double sumaImportes = listaAuxiliar.stream()
                .mapToDouble(obj -> obj.importe)
                .sum();

        if (sumaImportes == 0) {
            return true;
        } else {
            listaAuxiliar = listaAuxiliar.stream()
                    .filter(obj -> !obj.concepto.equals(conceptoAEliminar))
                    .collect(Collectors.toList());
            sumaImportes = listaAuxiliar.stream()
                    .mapToDouble(obj -> obj.importe)
                    .sum();
            return sumaImportes == 0;
        }
    }

    public static void main(String[] args) {
        List<Objeto> listaObjetos = new ArrayList<>();

        String conceptoInicial = "A";
        String conceptoAEliminar = "B";

        boolean bandera = filtrarYSumar(listaObjetos, conceptoInicial, conceptoAEliminar);

        if (bandera) {
            System.out.println("La suma de los importes es cero.");
        } else {
            System.out.println("La suma de los importes no es cero.");
        }
    }
}