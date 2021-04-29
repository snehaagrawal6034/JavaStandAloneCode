package String;

import java.util.*;

public class Destinationcity {
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        Set<String> pickup = new HashSet<>();
        for (List<String> path : paths) {

            cities.addAll(path);
            pickup.add(path.get(0));
        }
        for (String city : cities) {
            if (pickup.contains(city)) {
                continue;
            }
            return city;
        }
        return null;
    }

    public static void main(String[] args) {
        Destinationcity ls = new Destinationcity();
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("London","New York"));
        input.add(Arrays.asList("New York","Lima"));
        input.add(Arrays.asList("Lima","Sao Paulo"));
        System.out.println(new Destinationcity().destCity(input));

    }
}
