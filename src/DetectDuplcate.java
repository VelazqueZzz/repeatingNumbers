import java.io.FileWriter;
import java.util.*;

public class DetectDuplcate {

    public static void main(String args[]) {
        List<Integer> numbers = List.of(11, 2, 3, 4, 3, 1, 2);
        List<Object> duplicates = new ArrayList<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    duplicates.add(numbers.get(i));
                }
            }
        }
        System.out.println(duplicates);
    }
}

