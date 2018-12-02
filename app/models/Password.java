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
public class Password extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String userName;

    @Constraints.Required
    public String userPassword;

    public String url;

    public String notes;

    @ManyToOne
    public Group group;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date introduced;

    @Formats.DateTime(pattern="yyyy-MM-dd")
    public Date discontinued;

}
