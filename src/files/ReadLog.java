package files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadLog {

    public String countStatus(String date) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("data.txt"), StandardCharsets.UTF_8);

//        List<String> result;
//        try (Stream<String> lines2 = Files.lines(Paths.get("data.txt"))) {
//            result = lines.collect(Collectors.toList());
//        }

        Map<String, Integer> map = new HashMap<>();
        for(String s: lines) {
            if (s.contains(date)) {
                String[] splitS = s.split(" ");
                String urlWithStatusCode  = splitS[2] + " " + splitS[3] + " " + splitS[4];
                map.put(urlWithStatusCode, map.getOrDefault(urlWithStatusCode,0)+1);
            }
        }
        StringBuilder result  = new StringBuilder();
        for (Map.Entry<String, Integer> k: map.entrySet()) {
            result.append(k.getKey() + " - " + k.getValue() + " times");
            result.append("\n");
        }
        return result.toString();
    }


    public static void main(String[] args) throws IOException {
        ReadLog test = new ReadLog();
        String todaysDate = "01-12-2022";

        System.out.println(test.countStatus(todaysDate));
    }


}

//    GET /user 200 - 100 times
//POST /user 201 - 50 times

