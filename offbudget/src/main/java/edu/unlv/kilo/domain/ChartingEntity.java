package edu.unlv.kilo.domain;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class ChartingEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    @NotNull
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    @NotNull
    private Date endDate;

    @NotNull
    @Size(min = 1)
    private long day_Interval;
}
