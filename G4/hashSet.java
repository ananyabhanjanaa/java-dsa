package G4;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(123);
        set.add(1);
        set.add(650);
        set.add(700);
        set.add(800);
        set.add(null);

        System.out.println(set);
    }
}
