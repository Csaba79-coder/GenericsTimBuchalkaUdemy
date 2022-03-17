package model.type;

import java.util.ArrayList;

public class TypeParameterArrayList {

    public void testType() {
        // Type is in between <>
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private void printDoubled(ArrayList<Integer> items) {
        for (Integer i : items) {
            System.out.println(i * 2);
        }
    }
}
