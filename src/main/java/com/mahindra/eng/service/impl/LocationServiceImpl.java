package com.mahindra.eng.service.impl;

import com.mahindra.eng.infrastructure.entity.Location;
import com.mahindra.eng.infrastructure.repository.LocationRepository;
import com.mahindra.eng.model.LocationDTO;
import com.mahindra.eng.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    private LocationRepository locationRepository;
    @Autowired
    public void LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> getLocationList(Long id) {
        return locationRepository.findByCompanyId(id);
    }

    public Location saveLocation(LocationDTO locationDTO) {
        Location location=Location.builder()
                .id(locationDTO.getId())
                .location(locationDTO.getLocation())
                .countryId(locationDTO.getCountryId())
                .companyId(locationDTO.getCompanyId())
                .createdBy(locationDTO.getCreatedBy())
                .createdDate(locationDTO.getCreatedDate())
                .updatedBy(locationDTO.getUpdatedBy())
                .updatedDate(locationDTO.getUpdatedDate())
                .status(locationDTO.getStatus())
                .build();
        return locationRepository.save(location);
    }

    public Location saveOrUpdate(Long id, LocationDTO locationDTO) {
        if (locationRepository.existsById(id)) {
            Location location=locationRepository.findById(id).get();
            location.setLocation(locationDTO.getLocation());
            location.setCountryId(locationDTO.getCountryId());
            location.setCompanyId(locationDTO.getCompanyId());
            location.setCreatedBy(locationDTO.getCreatedBy());
            location.setCreatedDate(locationDTO.getCreatedDate());
            location.setUpdatedBy(locationDTO.getUpdatedBy());
            location.setUpdatedDate(locationDTO.getUpdatedDate());
            location.setStatus(locationDTO.getStatus());
            return locationRepository.save(location);
        }
        else {
            return null;
        }
    }


}
