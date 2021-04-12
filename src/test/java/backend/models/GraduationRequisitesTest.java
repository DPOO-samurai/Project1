package backend.models;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class GraduationRequisitesTest {

    @Test
    public void PensumJsonSerializeCheck() {
        var objectMapper = new ObjectMapper();

        var quantifiedAttributes = new HashMap<String, Integer>();
        quantifiedAttributes.put("CBPC", 2);
        var qualifiedAttributes = new ArrayList<String>();
        qualifiedAttributes.add("epsilon");

        var graduationRequisites = new GraduationRequisites(20,
            quantifiedAttributes, qualifiedAttributes);
        try {
            objectMapper
                .writeValue(new File("C:\\tmp_java\\test\\graduation_requisites.json"),
                    graduationRequisites);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String actual = new String();
        try {

            actual = Files.lines(Path.of("C:\\tmp_java\\test\\graduation_requisites.json"))
                .collect(
                    Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(
            "{\"credits\":20,\"quantifiedAttributes\":{\"CBPC\":2},\"qualifiedattributes\":[\"epsilon\"]}",
            actual
        );
    }
}