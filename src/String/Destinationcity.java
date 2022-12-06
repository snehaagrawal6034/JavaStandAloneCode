package String;

import java.util.*;

public class Destinationcity {
    public String destCity(List<List<String>> paths) {
        // sourceAndDestination - London, New York, Lima, Sao Paulo
        // source -London, New york, lima
        // sourceAndDestin - for if(!source.contains)
        Set<String> source = new HashSet<>();
        Set<String> destination = new HashSet<>();
        for(List<String> path : paths){
            String sourceCity = path.get(0);
            String dest = path.get(1);
            source.add(sourceCity);
            destination.add(dest);
        }

        for(String dest : destination){
            if(!source.contains(dest)) return dest;
        }
        return null;
    }

    public static void main(String[] args) {
        Destinationcity ls = new Destinationcity();
        List<List<String>> input = new ArrayList<>();
        input.add(Arrays.asList("London", "New York"));
        input.add(Arrays.asList("New York", "Lima"));
        input.add(Arrays.asList("Lima", "Sao Paulo"));
        System.out.println(new Destinationcity().destCity(input));

    }
}
