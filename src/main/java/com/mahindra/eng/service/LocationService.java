package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.Location;
import com.mahindra.eng.model.LocationDTO;

import java.util.List;

public interface LocationService {

    public List<Location> getLocationList(Long id);
    public Location saveLocation(LocationDTO locationDTO);
    public Location saveOrUpdate(Long id, LocationDTO locationDTO);

}
