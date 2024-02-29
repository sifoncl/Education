import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        byte[] jsonData = Files.readAllBytes(Paths.get("JSON 1/json.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        Someone someone = objectMapper.readValue(jsonData, Someone.class);
someone.setName("12131");
        objectMapper.writeValue(new File("JSON 1/json2.json"),someone);
        System.out.println(someone);
    }
}