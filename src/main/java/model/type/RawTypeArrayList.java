package model.type;

import java.util.ArrayList;

public class RawTypeArrayList {

    public void test() {

        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        // items.add("Tim"); // we get a ClassCastException!!!
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private void printDoubled(ArrayList items) {
        for (Object i : items) {
            System.out.println((Integer) i * 2);
        }
    }
}
