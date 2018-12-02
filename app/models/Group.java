/*
 * Copyright (c) 2018. Haroldo Ramirez da Nobrega
 */

package models;

import play.data.format.Formats;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Group extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Constraints.Required
    public String name;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date introduced;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date discontinued;
}
