/*
 * Copyright (c) 2018. Haroldo Ramirez da Nobrega
 */

package models;

import io.ebean.Model;
import play.data.format.Formats;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseModel extends Model {

   @Id
   public Long id;
}
