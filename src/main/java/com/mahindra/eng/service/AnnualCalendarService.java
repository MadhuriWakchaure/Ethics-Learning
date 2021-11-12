package com.mahindra.eng.service;

import com.mahindra.eng.infrastructure.entity.AnnualCalendar;
import com.mahindra.eng.model.AnnualCalendarDTO;

public interface AnnualCalendarService {
    public AnnualCalendar saveAnnualCalendar(AnnualCalendarDTO annualCalendarDTO);
    public AnnualCalendar getAnnualCalendarList(Long id);
    public AnnualCalendar saveOrUpdate(Long id, AnnualCalendarDTO annualCalendarDTO);

}
