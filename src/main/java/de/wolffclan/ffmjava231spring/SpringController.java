package de.wolffclan.ffmjava231spring;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class SpringController {
List<Message> messageList = new ArrayList<>();


    @PostMapping("/message")
    public String  postMessage(@RequestParam String id, String name, String message){
        Message newMessage = new Message(id,name,message);
        messageList.add(newMessage);
        System.out.println(messageList);
        return "It works...:" +newMessage;
    }
    @GetMapping("/message")
    public String getMessageList(){
        return messageList.toString();
        //return messageList;
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/hello/{name}")
    public String getHelloMessage(@PathVariable String name){
        return "Hello wie geht es dir, " + name;
    }

    @Override
    public String toString() {
        return "SpringController{" +
                "messageList=" + messageList +
                '}';
    }
}
