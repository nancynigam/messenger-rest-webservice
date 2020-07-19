package com.naadworks.learn.messaging.controller;

import com.naadworks.learn.messaging.model.Message;
import com.naadworks.learn.messaging.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("messages")
public class MessageController {

    MessageService messageService;

    public MessageController() {
        messageService = new MessageService();
    }

    @GET
    //@Produces(MediaType.APPLICATION_XML) - for XML
    @Path("/")
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages(){
        return messageService.getAllMessage();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessage(@PathParam("id") Long id){
        return messageService.getMessage(id);
    }
}
