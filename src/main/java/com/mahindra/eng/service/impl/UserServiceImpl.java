package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.Material;
import com.mahindra.eng.infrastructure.entity.User;
import com.mahindra.eng.infrastructure.entity.UserModule;
import com.mahindra.eng.infrastructure.repository.CompanyRepository;
import com.mahindra.eng.infrastructure.repository.MaterialRepository;
import com.mahindra.eng.infrastructure.repository.UserRepository;
import com.mahindra.eng.model.UserDTO;
import com.mahindra.eng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository adminRepository;
    private MaterialRepository materialRepository;



    @Autowired
    public void UserServiceImple(UserRepository adminRepository, MaterialRepository materialRepository,CompanyRepository companyRepository) {
        this.adminRepository = adminRepository;
        this.materialRepository = materialRepository;

    }

    @Override
    public User saveUser(UserDTO userDTO) {
        User users = User.builder()
                .id(userDTO.getId())
                .name(userDTO.getName())
                .mobileNo(userDTO.getMobileNo())
                .emailId(userDTO.getEmailId())
                .companyId(userDTO.getCompanyId())
                .password(userDTO.getPassword())
                .locationId(userDTO.getLocationId())
                .designation(userDTO.getDesignation())
                .unit(userDTO.getUnit())
                .subUnit(userDTO.getSubUnit())
                .sector(userDTO.getSector())
                .roleId(userDTO.getRoleId())
                .projectManager(userDTO.getProjectManager())
                .projectCode(userDTO.getProjectCode())
                .createdBy(userDTO.getCreatedBy())
                .createdDate(userDTO.getCreatedDate())
                .updatedBy(userDTO.getUpdatedBy())
                .updatedDate(userDTO.getUpdatedDate())
                .status(userDTO.getStatus())
                .build();
        return adminRepository
                .save(users);
    }
    public User getMaterialList(Long id) {
        return adminRepository.findById(id).get();}


    @Override
    public User saveOrUpdate(Long id, UserDTO userDTO) {
        if (adminRepository.existsById(id)) {
            User users = adminRepository.findById(id).get();
            users.setName(userDTO.getName());
            users.setMobileNo(userDTO.getMobileNo());
            users.setUnit(userDTO.getUnit());
            users.setEmailId(userDTO.getEmailId());
            users.setSubUnit(userDTO.getSubUnit());
            users.setProjectCode(userDTO.getProjectCode());
            users.setProjectManager(userDTO.getProjectManager());
            users.setLocationId(userDTO.getLocationId());
            users.setDesignation(userDTO.getDesignation());
            users.setSector(userDTO.getSector());
            users.setRoleId(userDTO.getRoleId());
            users.setCreatedBy(userDTO.getCreatedBy());
            users.setCreatedDate(userDTO.getCreatedDate());
            users.setUpdatedBy(userDTO.getUpdatedBy());
            users.setUpdatedDate(userDTO.getUpdatedDate());
            users.setStatus(userDTO.getStatus());
            return adminRepository.save(users);
             //return updatedUser(updatedUser.getId(), updatedUser.getName(), updatedUser.getMobileNo(),updatedUser.getCompanyId(),updatedUser.getProjectCode(),updatedUser.getUpdatedBy(),updatedUser.getUpdatedDate(),updatedUser.getCreatedBy(),updatedUser.getUpdatedDate(),updatedUser.getDesignation(),updatedUser.getEmailId(),updatedUser.getLocationId(),updatedUser.getRoleId(),updatedUser.getProjectManager(),updatedUser.getStatus(),updatedUser.getPassword());
       }
        else {
            return null;
        }
    }

    public List<Material> getAllMaterial() {
        return materialRepository.findAll();}


    public User getHelpDetails(Integer companyId) {

        return adminRepository.findByCompanyId(companyId);
    }
    public List<User> getHomePageData(Long id, Integer companyId) {
        return adminRepository.findByIdAndCompanyId(id, companyId);
    }
}

        //return adminRepository.save(id);


        //public User delete(Long id) {
        //return null;

