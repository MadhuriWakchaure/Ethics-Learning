package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.Message;
import com.mahindra.eng.infrastructure.repository.MessageRepository;
import com.mahindra.eng.model.MessageDTO;
import com.mahindra.eng.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    private MessageRepository messageRepository;

    @Autowired
    public void MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message getMessageList(Long id) {
        return messageRepository.findById(id).get();
    }

    public Message saveMessage(MessageDTO messageDTO) {
        Message message=Message.builder()
                .id(messageDTO.getId())
                .name(messageDTO.getName())
                .designation(messageDTO.getDesignation())
                .message(messageDTO.getMessage())
                .image(messageDTO.getImage())
                .createdBy(messageDTO.getCreatedBy())
                .createdDate(messageDTO.getCreatedDate())
                .updatedBy(messageDTO.getUpdatedBy())
                .updatedDate(messageDTO.getUpdatedDate())
                .status(messageDTO.getStatus())
                .build();
        return messageRepository.save(message);
    }

    public Message saveOrUpdate(Long id, MessageDTO messageDTO) {
        if(messageRepository.existsById(id)){
            Message message=messageRepository.findById(id).get();
            message.setName(messageDTO.getName());
            message.setImage(messageDTO.getImage());
            message.setDesignation(messageDTO.getDesignation());
            message.setMessage(messageDTO.getMessage());
            message.setCreatedDate(messageDTO.getCreatedDate());
            message.setCreatedBy(messageDTO.getCreatedBy());
            message.setUpdatedBy(messageDTO.getUpdatedBy());
            message.setUpdatedDate(messageDTO.getUpdatedDate());
            message.setStatus(messageDTO.getStatus());
            return messageRepository.save(message);
        }
        else{
            return null;
        }


    }


}
