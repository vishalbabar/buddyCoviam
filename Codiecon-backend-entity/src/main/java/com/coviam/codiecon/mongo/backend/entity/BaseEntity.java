package com.coviam.codiecon.mongo.backend.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Vishal B
 * @since 19/12/18
 */
public abstract class BaseEntity implements Serializable {

  public static final String MARK_FOR_DELETE = "markForDelete";

  public static final String UPDATED_DATE = "updatedDate";

  public static final String CREATED_DATE = "createdDate";

  public static final String VERSION = "version";

  public static final String STORE_ID = "storeId";

  public static final String ID = "ID";
  public static final String CREATED_BY = "createdBy";
  public static final String UPDATED_BY = "updatedBy";
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
  @SequenceGenerator(name = "SEQ", sequenceName = "SEQ", allocationSize = 1)
  private String id;

  @Version
  @Field(value = BaseEntity.VERSION)
  private Long version;

  @CreatedDate
  @Field(value = BaseEntity.CREATED_DATE)
  private Date createdDate;

  @CreatedBy
  @Field(value = BaseEntity.CREATED_BY)
  private String createdBy;

  @LastModifiedDate
  @Field(value = BaseEntity.UPDATED_DATE)
  private Date updatedDate;

  @LastModifiedBy
  @Field(value = BaseEntity.UPDATED_BY)
  private String updatedBy;

  @Field(value = BaseEntity.STORE_ID)
  private String storeId;

  public String getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * @return the createdDate
   */
  public Date getCreatedDate() {
    return this.createdDate;
  }

  /**
   * @param createdDate the createdDate to set
   */
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the storeId
   */
  public String getStoreId() {
    return storeId;
  }

  /**
   * @param storeId the storeId to set
   */
  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public String getUpdatedBy() {
    return this.updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  /**
   * @return the updatedDate
   */
  public Date getUpdatedDate() {
    return this.updatedDate;
  }

  /**
   * @param updatedDate the updatedDate to set
   */
  public void setUpdatedDate(Date updatedDate) {
    this.updatedDate = updatedDate;
  }

  /**
   * @return the version
   */
  public Long getVersion() {
    return this.version;
  }

  /**
   * @param version the version to set
   */
  public void setVersion(Long version) {
    this.version = version;
  }


  /*
   * (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return String.format(
        "GdnBaseMongoEntity [id=%s, version=%s, createdDate=%s, createdBy=%s, updatedDate=%s, updatedBy=%s, toString()=%s]",
        id, version, createdDate, createdBy, updatedDate, updatedBy, super.toString());
  }

}
