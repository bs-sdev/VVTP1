package system;

/**
 * Created by benjamin on 23/09/14.
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class TestPhonyList {
    /*
     * Helper method to create lists.
     */
    private PhonyList<Integer> list(Integer... content) {
        PhonyList<Integer> list = new PhonyList<>();
        for (Integer i : content)
            list.add(i);
        return list;
    }

    /*
    * Helper method to create a big list [1,2,3,...,10000]
    */
    private PhonyList<Integer> thousandElementsList() {
        PhonyList<Integer> thousandElementsList = new PhonyList<>();
        for (int i = 1; i <= 10000; i++) {
            thousandElementsList.add(i);
        }
        return thousandElementsList;
    }
}
