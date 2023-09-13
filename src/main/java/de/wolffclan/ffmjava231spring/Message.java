package de.wolffclan.ffmjava231spring;

public class Message {
    String id;
    String name;
    String message;

    public Message() {
    }

    public Message(String id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
