package kr.kro.nineto6.web.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    public static ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/api/hello")
    public ResponseEntity<Object> test() {
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("message", "hello World");

        String result = objectNode.toString();
        return ResponseEntity.ok().body(result);
    }
}
