import java.util.*;

public class EqualizeTheArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int elements = in.nextInt();

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < elements; i++) {
            list.add(in.nextInt());
        }

        list.stream()
            .map(
                    x -> hashMap.put(x, Collections.frequency(list, x))
                ).count();

        Optional<Integer> max = hashMap
            .values()
            .stream()
            .max(Comparator.naturalOrder());

        int minDeletions = list.size() - max.get();

        System.out.println(minDeletions);
    }
}

