package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.User;
import com.mahindra.eng.infrastructure.entity.UserModule;
import com.mahindra.eng.infrastructure.repository.UserModuleRepository;
import com.mahindra.eng.model.UserDTO;
import com.mahindra.eng.model.UserModuleDTO;
import com.mahindra.eng.service.UserModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserModuleImpl implements UserModuleService {

    @Autowired
    private UserModuleRepository userModuleRepository;


    @Override
    public List<UserModule> getUserProfile(Long userId) {

        return userModuleRepository.findByUserId(userId);
    }

    @Override
    public UserModule getModuleList(Long id) {

        return userModuleRepository.findById(id).get();
    }


    public UserModule saveModule(UserModuleDTO userModuleDTO) {

        UserModule userModules = UserModule.builder()
                .id(userModuleDTO.getId())
                .userId(userModuleDTO.getUserId())
                .moduleId(userModuleDTO.getModuleId())
                .type(userModuleDTO.getType())
                .createdBy(userModuleDTO.getCreatedBy())
                .createdDate(userModuleDTO.getCreatedDate())
                .updatedBy(userModuleDTO.getUpdatedBy())
                .updatedDate(userModuleDTO.getUpdatedDate())
                .status(userModuleDTO.getStatus())
                .build();

        return userModuleRepository.save(userModules);
    }


    public UserModule saveOrUpdate(Long id, UserModuleDTO userModuleDTO) {

        if(userModuleRepository.existsById(id)) {
            UserModule userModules = userModuleRepository.findById(id).get();
            userModules.setId(userModuleDTO.getId());
            userModules.setUserId(userModuleDTO.getUserId());
            userModules.setModuleId(userModuleDTO.getModuleId());
            userModules.setType(userModuleDTO.getType());
            userModules.setCreatedBy(userModuleDTO.getCreatedBy());
            userModules.setCreatedDate(userModuleDTO.getCreatedDate());
            userModules.setUpdatedBy(userModuleDTO.getUpdatedBy());
            userModules.setUpdatedDate(userModuleDTO.getUpdatedDate());
            userModules.setStatus(userModuleDTO.getStatus());

            return userModuleRepository.save(userModules);
        }
        else{

            return null;

        }
    }

}