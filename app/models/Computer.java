/*
 * Copyright (c) 2018. Haroldo Ramirez da Nobrega
 */

package models;

import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity 
public class Computer extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Constraints.Required
    public String name;

    @ManyToOne
    public Company company;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date introduced;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date discontinued;

}

