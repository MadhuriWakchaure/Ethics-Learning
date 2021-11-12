package com.mahindra.eng.controller;

import com.mahindra.eng.infrastructure.entity.*;
import com.mahindra.eng.model.*;
import com.mahindra.eng.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.Module;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private AnnualCalendarServiceImpl annualCalendarServiceImpl;
    private CodeOfViolationServiceImpl codeOfViolationServiceImpl;
    private CompanyServiceImpl companyServiceImpl;
    private ContantServiceImpl contantServiceImpl;
    private CountryServiceImpl countryServiceImpl;
    private EthicsCounselorImpl ethicsCounselorImpl;
    private EthicsPolicyServiceImpl ethicsPolicyServiceImpl;
    private LocationServiceImpl locationServiceImpl;
    private MaterialServiceImpl materialServiceImpl;
    private MessageServiceImpl messageServiceImpl;
    private ModuleServiceImpl moduleServiceImpl;
    private UserServiceImpl userServiceImpl;

    @Autowired(required = true)
    public void AnnualCalendarController(AnnualCalendarServiceImpl annualCalendarServiceImpl, CodeOfViolationServiceImpl codeOfViolationServiceImpl, CompanyServiceImpl companyServiceImpl, ContantServiceImpl contantServiceImpl, CountryServiceImpl countryServiceImpl
            , EthicsCounselorImpl ethicsCounselorImpl, EthicsPolicyServiceImpl ethicsPolicyServiceImpl, LocationServiceImpl locationServiceImpl, MaterialServiceImpl materialServiceImpl, MessageServiceImpl messageServiceImpl
            , ModuleServiceImpl moduleServiceImpl, UserServiceImpl userServiceImpl) {
        this.annualCalendarServiceImpl = annualCalendarServiceImpl;
        this.codeOfViolationServiceImpl = codeOfViolationServiceImpl;
        this.companyServiceImpl = companyServiceImpl;
        this.contantServiceImpl = contantServiceImpl;
        this.countryServiceImpl = countryServiceImpl;
        this.ethicsCounselorImpl = ethicsCounselorImpl;
        this.ethicsPolicyServiceImpl = ethicsPolicyServiceImpl;
        this.locationServiceImpl = locationServiceImpl;
        this.materialServiceImpl = materialServiceImpl;
        this.messageServiceImpl = messageServiceImpl;
        this.moduleServiceImpl = moduleServiceImpl;
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/calendar/insert")
    public AnnualCalendar insertAnnualCalendar(@RequestBody AnnualCalendarDTO annualCalendarDTO) {
        return annualCalendarServiceImpl.saveAnnualCalendar(annualCalendarDTO);
    }

    @GetMapping("/calendar/get/{id}")
    public AnnualCalendar getAnnualCalendarById(@PathVariable Long id) {
        // return "ID:"+id;
        return annualCalendarServiceImpl.getAnnualCalendarList(id);
    }

    @PutMapping("/calendar/update/{id}")
    private AnnualCalendar update(@PathVariable("id") Long id, @RequestBody AnnualCalendarDTO annualCalendarDTO) {
        return annualCalendarServiceImpl.saveOrUpdate(id, annualCalendarDTO);
    }

    @PostMapping("/codeOfViolation/insert")
    public CodeOfViolation insertCodeOfViolation(@RequestBody CodeOfViolationDTO codeOfViolationDTO) {
        return codeOfViolationServiceImpl.saveCodeOfViolation(codeOfViolationDTO);
    }

    @GetMapping("/codeOfViolation/get/{id}")
    public CodeOfViolation getCodeOfViolationById(@PathVariable Long id) {
        // return "ID:"+id;
        return codeOfViolationServiceImpl.getCodeOfViolationList(id);
    }

    @PutMapping("/codeOfViolation/update/{id}")
    private CodeOfViolation update(@PathVariable("id") Long id, @RequestBody CodeOfViolationDTO codeOfViolationDTO) {
        return codeOfViolationServiceImpl.saveOrUpdate(id, codeOfViolationDTO);
    }

    @PostMapping("/company/insert")
    public Company insertCompany(@RequestBody CompanyDTO companyDTO) {
        return companyServiceImpl.saveCompany(companyDTO);
    }

    @GetMapping("/company/get/{id}")
    public Company getCompanyById(@PathVariable Long id) {
        // return "ID:"+id;
        return companyServiceImpl.getCompanyList(id);
    }

    @PutMapping("/company/update/{id}")
    private Company update(@PathVariable("id") Long id, @RequestBody CompanyDTO companyDTO) {
        return companyServiceImpl.saveOrUpdate(id, companyDTO);
    }

    @PostMapping("/contact/insert")
    public Contant insertContant(@RequestBody ContantDTO contantDTO) {
        return contantServiceImpl.saveContant(contantDTO);
    }

    @GetMapping("/contact/get/{id}")
    public Contant getContantById(@PathVariable Long id) {
        // return "ID:"+id;
        return contantServiceImpl.getContantList(id);
    }

    @PutMapping("/contact/update/{id}")
    private Contant update(@PathVariable("id") Long id, @RequestBody ContantDTO contantDTO) {
        return contantServiceImpl.saveOrUpdate(id, contantDTO);
    }

    @PostMapping("/country/insert")
    public Country insertCountry(@RequestBody CountryDTO countryDTO) {
        return countryServiceImpl.saveCountry(countryDTO);
    }

    @PutMapping("/country/update/{id}")
    private Country update(@PathVariable("id") Long id, @RequestBody CountryDTO countryDTO) {
        return countryServiceImpl.saveOrUpdate(id, countryDTO);
    }

    @GetMapping("/ethics-counselor/get/{id}")
    public EthicsCounselor getEthicsCounselorById(@PathVariable Long id) {
        return ethicsCounselorImpl.getEthicsCounselorList(id);
    }

    @PostMapping("/ethics-counselor/insert")
    public EthicsCounselor insertEthicsCounselor(@RequestBody EthicsCounselorDTO ethicsCounselorDTO) {

        return ethicsCounselorImpl.saveEthicsCounselor(ethicsCounselorDTO);
    }

    @PutMapping("/ethics-counselor/update/{id}")
    private EthicsCounselor update(@PathVariable("id") Long id, @RequestBody EthicsCounselorDTO ethicsCounselorDTO) {
        return ethicsCounselorImpl.saveOrUpdate(id, ethicsCounselorDTO);
    }

    @PostMapping("/ethics-policy/insert")
    public EthicsPolicy insertEthicsPolicy(@RequestBody EthicsPolicyDTO ethicsPolicyDTO) {

        return ethicsPolicyServiceImpl.saveEthicsPolicy(ethicsPolicyDTO);
    }

    @PutMapping("/ethics-policy/update/{id}")
    private EthicsPolicy update(@PathVariable("id") Long id, @RequestBody EthicsPolicyDTO ethicsPolicyDTO) {
        return ethicsPolicyServiceImpl.saveOrUpdate(id, ethicsPolicyDTO);
    }

    @PostMapping("/location/insert")
    public Location insertLocation(@RequestBody LocationDTO locationDTO) {

        return locationServiceImpl.saveLocation(locationDTO);
    }

    @PutMapping("/location/update/{id}")
    private Location update(@PathVariable("id") Long id, @RequestBody LocationDTO locationDTO) {
        return locationServiceImpl.saveOrUpdate(id, locationDTO);
    }

    @PostMapping("/material/insert")
    public Material insertMaterial(@RequestBody MaterialDTO materialDTO) {
        return materialServiceImpl.saveMaterial(materialDTO);
    }

    @GetMapping("/material/get/{id}")
    public Material getMaterialById(@PathVariable Long id) {
        return materialServiceImpl.getMaterialList(id);
    }

    @PutMapping("/material/update/{materialid}")
    private Material update(@PathVariable("materialid") Long id, @RequestBody MaterialDTO materialDTO) {
        return materialServiceImpl.saveOrUpdate(id, materialDTO);
    }

    @GetMapping("/messages/get/{id}")
    public Message getMessageById(@PathVariable Long id) {
        return messageServiceImpl.getMessageList(id);
    }

    @PostMapping("/messages/insert")
    public Message insertMessage(@RequestBody MessageDTO messageDTO) {
        return messageServiceImpl.saveMessage(messageDTO);
    }

    @PutMapping("/messages/update/{id}")
    private Message update(@PathVariable("id") Long id, @RequestBody MessageDTO messageDTO) {
        return messageServiceImpl.saveOrUpdate(id, messageDTO);
    }

    @GetMapping("/modules/get/{id}")
    public ELModule getModuleById(@PathVariable Long id) {
        return moduleServiceImpl.getModuleList(id);
    }

    @PostMapping("/modules/insert")
    public ELModule insertModule(@RequestBody ModuleDTO moduleDTO) {
        return moduleServiceImpl.saveModule(moduleDTO);
    }

    @PutMapping("/modules/update/{id}")
    private ELModule update(@PathVariable("id") Long id, @RequestBody ModuleDTO moduleDTO) {
        return moduleServiceImpl.saveOrUpdate(id, moduleDTO);
    }

    @PostMapping("/user/insert")
    public User insertUser(@RequestBody UserDTO userDTO) {
        return userServiceImpl.saveUser(userDTO);
    }

    @PutMapping("/user/update/{userid}")
    private User update(@PathVariable("userid") Long id, @RequestBody UserDTO userDTO) {
        return userServiceImpl.saveOrUpdate(id, userDTO);
    }
}
