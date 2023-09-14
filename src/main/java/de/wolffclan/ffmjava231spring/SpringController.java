package de.wolffclan.ffmjava231spring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SpringController {
private final List<Message> messageList = new ArrayList<>();

    @PutMapping("/messages/{id}")
    public Message deleteMessage(@PathVariable String id) {
        String errorMessage = "Message with id: " + id + " not found!";
        Message message = new Message("0000", "System", errorMessage);
        for (Message m : messageList) {
            if (m.id.equals(id)) {
                message = m;
                messageList.remove(m);
                return message;
            }
        }
        return message;
    }

    @PostMapping("/messages")
    public Message addMessage(@RequestBody Message message) {
        messageList.add(message);
        return message;
    }

    @GetMapping("/messages")
    public List<Message> getMessageList(){
        return messageList;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String getHelloMessage(@PathVariable String name){

        return "Hello wie geht es dir, " + name;
    }

}
