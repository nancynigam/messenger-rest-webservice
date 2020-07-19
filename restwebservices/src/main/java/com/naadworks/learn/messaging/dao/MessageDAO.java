package com.naadworks.learn.messaging.dao;

import com.naadworks.learn.messaging.model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageDAO {

    private Map<Long, Message> messages;

    public MessageDAO() {
        messages = new HashMap<>();
        Message m1  = new Message(1,"Hello World", "Raj");
        Message m2  = new Message(2,"Hakuna Matata", "Eric");
        Message m3  = new Message(3,"Bla bla", "Dustin");
        messages.put(1L,m1);
        messages.put(2L,m2);
        messages.put(3L,m3);
    }

    public List<Message> getMessages() {
        return new ArrayList<>(messages.values());
    }

    public Message getMessage(Long id){
        return messages.get(id);
    }

    public Message createMessage(Message message){
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }

    public Message updateMessage(Message message){
        if(messages.containsKey(message))
            messages.put(message.getId(),message);
        else
            System.out.println("Cannot update as the message with this ID doesn't exist");
        return message;
    }

    public void deleteMessage(Message message){
        if(messages.containsKey(message))
            messages.remove(message.getId());
        else
            System.out.println("Message with this ID doesn't exist in the database");
    }
}
