import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Ordenamiento {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(54);
        num.add(20);
        num.add(8);
        num.add(12);
        num.add(98);
        MostrarNumeros(num);
        System.out.println();
        Ordenar(num);
        MostrarNumeros(num);
    }
    public static List<Integer> Ordenar(List<Integer> num){
            for(int i = 0; i < num.size(); i++){
                for(int j = 0; j < num.size(); j++){
                    // Ordenar numeros de una lista
                    // (mayor a menor: <)(menor a mayor: >)
                    if(num.get(j) > num.get(i)){
                        Collections.swap(num,i,j);
                    }
                }
            }
            return num;
    }
    public static void MostrarNumeros(List<Integer> numeross){
        System.out.print("[ ");
        for(int i = 0; i < numeross.size(); i++){
            System.out.print(numeross.get(i)+",");
        }
        System.out.print(" ]");
    }
}