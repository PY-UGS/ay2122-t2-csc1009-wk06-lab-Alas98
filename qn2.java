import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class qn2 {
    public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){
        int element1 = list.get(indexOne);
        int element2 = list.get(indexTwo);
        list.set(indexOne,element2);
        list.set(indexTwo,element1);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));
        int index1, index2;
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter first index value(from 0 to 5) : ");
        index1 = input.nextInt();
        System.out.println("\n Enter second index value(from 0 to 5): ");
        index2 = input.nextInt();

        System.out.println("Linked list before change: ");
        System.out.println(linkedList);

        swapValues(linkedList,index1,index2);

        System.out.println("Linked list after change: ");
        System.out.println(linkedList);
    }
}
