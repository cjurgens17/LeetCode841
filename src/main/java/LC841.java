import java.util.*;

public class LC841 {

    public static void main(String[] args) {
        List<List<Integer>> rooms1 = new ArrayList<>();
        rooms1.add(Arrays.asList(1));
        rooms1.add(Arrays.asList(2));
        rooms1.add(Arrays.asList(3));
        rooms1.add(Arrays.asList());

        System.out.println(canVisitAllRooms(rooms1));

        List<List<Integer>> rooms2 = new ArrayList<>();
        rooms2.add(Arrays.asList(1,3));
        rooms2.add(Arrays.asList(3,0,1));
        rooms2.add(Arrays.asList(2));
        rooms2.add(Arrays.asList(0));

        System.out.println(canVisitAllRooms(rooms2));


    }
    //LeetCode # 831. Keys and Rooms

    //There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms.
    // However, you cannot enter a locked room without having its key.
    //
    //When you visit a room, you may find a set of distinct keys in it.
    // Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
    //
    //Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i,
    // return true if you can visit all the rooms, or false otherwise.


    public static boolean canVisitAllRooms(List<List<Integer>> rooms){
        //hashset so we dont visit any rooms twice, and we keep track of all rooms visited.
        Set<Integer> allKeys = new HashSet<>();
        diffRooms(rooms,0,allKeys);
        //if true we can visit all rooms, if false, we were not able to visit all rooms
        return allKeys.size() == rooms.size();
    }

    public static void diffRooms(List<List<Integer>> rooms, int key, Set<Integer> allKeys){
        //we start with room 0 , and from there we continue to the rooms of the keys in that room, so on and so forth
        allKeys.add(key);

        //iterate through each list, get all keys
        //if already visit we go to next key
        //if not visit we call recusrion to continue our search
        for(int newKey: rooms.get(key)){
            if(allKeys.contains(newKey)) continue;
            diffRooms(rooms,newKey,allKeys);
        }

    }
}
