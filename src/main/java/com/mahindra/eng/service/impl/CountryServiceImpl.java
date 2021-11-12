package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.Country;
import com.mahindra.eng.infrastructure.repository.CountryRepository;
import com.mahindra.eng.model.CountryDTO;
import com.mahindra.eng.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public void CountryServiceImpl(CountryRepository countryRepository) {

        this.countryRepository = countryRepository;
    }

    @Override
    public Country saveCountry(CountryDTO countryDTO) {
        Country country = Country.builder()
                .id(countryDTO.getId())
                .name(countryDTO.getName())
                .code(countryDTO.getCode())
                .createdBy(countryDTO.getCreatedBy())
                .createdDate(countryDTO.getCreatedDate())
                .updatedBy(countryDTO.getUpdatedBy())
                .updatedDate(countryDTO.getUpdatedDate())
                .build();
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getCountryList() {
        return countryRepository.findAll();
    }

    @Override
    public Country saveOrUpdate(Long id,CountryDTO countryDTO) {
        if (countryRepository.existsById(id)) {
            Country country = countryRepository.findById(id).get();
            country.setName(countryDTO.getName());
            country.setCode(countryDTO.getCode());
            country.setCreatedBy(countryDTO.getCreatedBy());
            country.setCreatedDate(country.getCreatedDate());
            country.setUpdatedBy(countryDTO.getUpdatedBy());
            country.setUpdatedDate(countryDTO.getUpdatedDate());
            country.setStatus(countryDTO.getStatus());
            return countryRepository.save(country);
        } else {
            return null;
        }
    }


}
