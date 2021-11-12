package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Material;
import com.mahindra.eng.infrastructure.entity.User;
import com.mahindra.eng.infrastructure.entity.UserModule;
import com.mahindra.eng.model.UserDTO;

import java.util.List;

public interface UserService {

    public User saveUser(UserDTO userDTO);
    public User getMaterialList(Long id);
    public User saveOrUpdate(Long id,UserDTO userDTO);
    public List<Material> getAllMaterial();
    public User getHelpDetails(Integer companyId);
    public List<User> getHomePageData(Long id, Integer companyId);







}