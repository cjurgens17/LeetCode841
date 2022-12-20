import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC841Test {

    @org.junit.Test
    public void canVisitAllRooms() {

        List<List<Integer>> rooms1 = new ArrayList<>();
        rooms1.add(Arrays.asList(1));
        rooms1.add(Arrays.asList(2));
        rooms1.add(Arrays.asList(3));
        rooms1.add(Arrays.asList());

        boolean actual1 = LC841.canVisitAllRooms(rooms1);

        List<List<Integer>> rooms2 = new ArrayList<>();
        rooms2.add(Arrays.asList(1,3));
        rooms2.add(Arrays.asList(3,0,1));
        rooms2.add(Arrays.asList(2));
        rooms2.add(Arrays.asList(0));

        boolean actual2 = LC841.canVisitAllRooms(rooms2);

        assertTrue(actual1);
        assertFalse(actual2);
    }

    @org.junit.Test
    public void diffRooms() {

        return;
    }
}