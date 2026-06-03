import models.*;
public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Double> cajaDouble = new Caja<>();

        cajaString.setT("Andres");
        cajaInteger.setT(2);
        cajaDouble.setT(6.7);
        System.out.println("=== PRACTICA DE CLASES GENERIAS ===");

        System.out.println("—-- Uso de Caja<T> —--");

        System.out.println("Caja de texto: " + cajaString);
        System.out.println("Caja de entero " + cajaInteger);
        System.out.println("Caja de decimal " + cajaDouble);

        if(cajaString.isEmpty()){
            System.out.println("¿La caja de texto está vacía? " + cajaString.isEmpty());
        }else{
            System.out.println("¿La caja de texto está vacía? " + cajaString.isEmpty());
        }

        System.out.println("--- Uso de Par<K, V> ---");

        Par<Integer,String> cajaIS = new Par<>();
        Par<String, Integer> cajaSI = new Par<>();
        Par <String,Double> cajaSD = new Par<>();

        cajaIS.setK(1);
        cajaIS.setV("Juan Perez");
        cajaSI.setK("Edad");
        cajaSI.setV(20);
        cajaSD.setK("Promedio");
        cajaSD.setV(8.79);
        System.out.println(cajaIS);
        System.out.println(cajaSI);
        System.out.println(cajaSD);
        
        
    }
}












      // //LISTADO ESTATICO
        // int[] arr = new int[8];
        // // LISTADO DINAMICO
        // ArrayList<Integer> lista = new ArrayList<>(); // --> arraylist crea un arreglo de 10 posiciones por default
        // lista.add(1);
        // lista.add(2);
        // lista.add(3);
        // lista.add(4);
        // lista.add(5);
        // lista.add(6);
        // lista.add(7);
        // lista.add(8);
        // lista.add(9);
        // lista.add(10);
        // //Apesar de llegar al limite por default se le puede seguir aumentando datos
        // lista.add(11);
        // //El arraylist aumenta de 10 en 10 cada vez que superamos el limite default 
        // //ArrayList no guarda los elemetos guarda la referencias (Direccion en la memoria ram) de un elemento.

