package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Message;
import com.mahindra.eng.model.MessageDTO;

public interface MessageService {
    public Message getMessageList(Long id);
    public Message saveMessage(MessageDTO messageDTO);
    public Message saveOrUpdate(Long id, MessageDTO messageDTO);

}
