import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        oldSorter();
        lambdaSorter();
    }

    private static void oldSorter() {
        System.out.println("--------- OLD SORTER ----------");
        List<String> names = Arrays.asList("ania", "paweł", "antoś", "piotrek", "heniek");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String name : names)
            System.out.println(name);
    }

    private static void lambdaSorter() {
        System.out.println("--------- LAMBDA SORTER START----------");
        List<String> names;

        // First way
        names = Arrays.asList("ania", "paweł", "antoś", "piotrek", "heniek");
        Collections.sort(names, (String o1, String o2) -> {
            return o1.compareTo(o2);
        });

        // Second way
        names = Arrays.asList("ania", "paweł", "antoś", "piotrek", "heniek");
        Collections.sort(names, (String o1, String o2) -> o1.compareTo(o2));

        // Third way
        names = Arrays.asList("ania", "paweł", "antoś", "piotrek", "heniek");
        names.sort((o1,o2) -> o1.compareTo(o2));

        System.out.println("--------- LAMBDA SORTER STOP----------");
    }
}
