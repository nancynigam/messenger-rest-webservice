package com.naadworks.learn.messaging.service;

import com.naadworks.learn.messaging.dao.MessageDAO;
import com.naadworks.learn.messaging.model.Message;

import java.util.List;

public class MessageService {

    MessageDAO messageDAO;

    public MessageService() {
        messageDAO = new MessageDAO();
    }

    public Message getMessage(Long id){
        return messageDAO.getMessage(id);
    }

    public List<Message> getAllMessage(){
        return messageDAO.getMessages();
    }

    public Message createMessage(Message message){
        return messageDAO.createMessage(message);
    }

    public Message updateMessage(Message message){
        return messageDAO.updateMessage(message);
    }
    public void deleteMessage(Message message){
        messageDAO.updateMessage(message);
    }

}
