/*
 * Copyright (c) 2018. Haroldo Ramirez da Nobrega
 */

package models;

import io.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel extends Model {

   @Id
   public Long id;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      BaseModel baseModel = (BaseModel) o;

      return id != null ? id.equals(baseModel.id) : baseModel.id == null;
   }

   @Override
   public int hashCode() {
      return id != null ? id.hashCode() : 0;
   }

   @Override
   public String toString() {
      return "BaseModel{" +
              "id=" + id +
              '}';
   }

}
