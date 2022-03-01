import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class qn3 {

    public static int findValue(LinkedList<Integer> list, int searchVal){
        if (list.contains(searchVal)){
            return list.indexOf(searchVal);
        }
        else {
            return -1;
        }
    }

    public static void main (String[] args){

        LinkedList<Integer> linkedList = new LinkedList<>();
        Random randomizer = new Random();

        int i;
        for (i = 0; i < 500; i++)
        {
            linkedList.add(randomizer.nextInt(1000,9999));
        }

        int randomValue = randomizer.nextInt(1000,9999);
        int position = findValue(linkedList,randomValue);
        System.out.println("random number generated is: " + randomValue + " and is at index: " + position);

    }

}
