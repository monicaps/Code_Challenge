import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/*
 * 
 * import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Transaccion {
    String naturaleza;
    double importe;
    String concepto;

    // Constructor y getters/setters
    // ...
}

public class EliminarSinParejaObjetos {
    public static void main(String[] args) {
        List<Transaccion> transacciones = new ArrayList<>();
        // ... agregar transacciones a la lista

        Map<Double, Integer> frecuencias = new HashMap<>();
        for (Transaccion transaccion : transacciones) {
            double valorAbsoluto = Math.abs(transaccion.getImporte());
            frecuencias.put(valorAbsoluto, frecuencias.getOrDefault(valorAbsoluto, 0) + 1);
        }

        transacciones.removeIf(transaccion -> frecuencias.get(Math.abs(transaccion.getImporte())) == 1);

        System.out.println(transacciones);
    }
}*/

public class EliminarParesOpuestos {
    public static void main(String[] args) {
    	List<Double> lista = new ArrayList<>();
        lista.add(-5.5);//pareja1
        lista.add(123.54);//pareja2
        lista.add(1.2);//pareja3
        lista.add(5.5);//pareja1
        lista.add(-1.2);//pareja3
        lista.add(-4.2);
        lista.add(-123.54);//pareja2
        lista.add(-2.5);
        lista.add(9.3);
        lista.add(10.23);

        Map<Double, Integer> frecuencias = new HashMap<>();
        for (double num : lista) {
            double valorAbsoluto = Math.abs(num);
            frecuencias.put(valorAbsoluto, frecuencias.getOrDefault(valorAbsoluto, 0) + 1);
        }

        lista.removeIf(num -> frecuencias.get(Math.abs(num)) == 1);

        System.out.println(lista);
    }
}