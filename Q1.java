import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Q1 {

    public static void addAndSort(LinkedList<Integer> list, int value) {
        list.add(value);
        Collections.sort(list);
    }

    public static void main (String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));

        System.out.println("Linked list before change: ");
        System.out.println(linkedList);

        addAndSort(linkedList, 4);
        System.out.println("\n Linked list after change: ");
        System.out.println(linkedList);
    }
}
