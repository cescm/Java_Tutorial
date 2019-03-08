import java.util.ArrayList;

public class Main {
    public static void main (String [] arg){
        Coche c = new Coche();
        c.setColor("Rojo");
        c.setPotencia(200);
        c.setMarca("Mercedes");
        System.out.println(c.getInfo());

        Integer array[] = new Integer[7];

        for (int count = 0;count < 7; count++){
            array[count]=count+1;
        }
        System.out.println(array.length);

        Coche c2[] = new Coche[10]; //definimos un array de una clase
        c2[0] = new Coche();
        c2[1] = new Coche();
        c2[0].setMarca("Ford");
        c2[0].setPotencia(100);
        c2[0].setColor("Azul");
        c2[1].setMarca("Jaguar");
        c2[1].setPotencia(342);
        c2[1].setColor("Negro");
        System.out.println(c2[0].getInfo());
        System.out.println(c2[1].getInfo());

        ArrayList<Coche> c3 = new ArrayList<Coche>();//vamos a usar una lista para meter los objetos
        c3.add(c2[0]); //metemos el elemento de la posición 0 del array c2 que es un objeto de tipo Coche
        c3.add(c2[1]); //metemos el elemento de la posición 1 del array c2 que es un objeto de tipo Coche
        c3.add(c); //metemos el objeto c que también es un objeto de tipo coche
        System.out.println(c3.size());
        System.out.println(c3.get(0).getColor()); //devolvemos el color del elemento 0 de la lista cuyo color es azul



    }
}
