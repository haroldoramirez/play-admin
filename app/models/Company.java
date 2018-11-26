/*
 * Copyright (c) 2018. Haroldo Ramirez da Nobrega
 */

package models;

import play.data.validation.Constraints;
import javax.persistence.Entity;

@Entity 
public class Company extends BaseModel {

    private static final long serialVersionUID = 1L;

    @Constraints.Required
    public String name;

}

