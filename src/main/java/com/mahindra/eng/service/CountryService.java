package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Country;
import com.mahindra.eng.model.CountryDTO;

import java.util.List;

public interface CountryService {
    public Country saveCountry(CountryDTO countryDTO);
    public List<Country> getCountryList();
    public Country saveOrUpdate(Long id, CountryDTO countryDTO);

}
