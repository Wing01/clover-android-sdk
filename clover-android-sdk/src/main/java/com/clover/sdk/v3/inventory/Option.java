/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.inventory;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getAttribute attribute}</li>
 * <li>{@link #getItems items}</li>
 * </ul>
 * <p>
 * @see com.clover.sdk.v3.inventory.IInventoryService
 */
@SuppressWarnings("all")
public class Option extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Name of the option
   */
  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  public com.clover.sdk.v3.base.Reference getAttribute() {
    return genClient.cacheGet(CacheKey.attribute);
  }

  /**
   * Items associated with this option
   */
  public java.util.List<com.clover.sdk.v3.base.Reference> getItems() {
    return genClient.cacheGet(CacheKey.items);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Option> {
    id {
      @Override
      public Object extractValue(Option instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Option instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    attribute {
      @Override
      public Object extractValue(Option instance) {
        return instance.genClient.extractRecord("attribute", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    items {
      @Override
      public Object extractValue(Option instance) {
        return instance.genClient.extractListRecord("items", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<Option> genClient;

  /**
  * Constructs a new empty instance.
  */
  public Option() {
    genClient = new GenericClient<Option>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected Option(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Option(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public Option(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Option(Option src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateNull(getName(), "name");
    genClient.validateLength(getName(), 255);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'attribute' field is set and is not null */
  public boolean isNotNullAttribute() {
    return genClient.cacheValueIsNotNull(CacheKey.attribute);
  }

  /** Checks whether the 'items' field is set and is not null */
  public boolean isNotNullItems() {
    return genClient.cacheValueIsNotNull(CacheKey.items);
  }

  /** Checks whether the 'items' field is set and is not null and is not empty */
  public boolean isNotEmptyItems() { return isNotNullItems() && !getItems().isEmpty(); }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'attribute' field has been set, however the value could be null */
  public boolean hasAttribute() {
    return genClient.cacheHasKey(CacheKey.attribute);
  }

  /** Checks whether the 'items' field has been set, however the value could be null */
  public boolean hasItems() {
    return genClient.cacheHasKey(CacheKey.items);
  }


  /**
   * Sets the field 'id'.
   */
  public Option setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'name'.
   */
  public Option setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'attribute'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public Option setAttribute(com.clover.sdk.v3.base.Reference attribute) {
    return genClient.setRecord(attribute, CacheKey.attribute);
  }

  /**
   * Sets the field 'items'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public Option setItems(java.util.List<com.clover.sdk.v3.base.Reference> items) {
    return genClient.setArrayRecord(items, CacheKey.items);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'attribute' field, the 'has' method for this field will now return false */
  public void clearAttribute() {
    genClient.clear(CacheKey.attribute);
  }
  /** Clears the 'items' field, the 'has' method for this field will now return false */
  public void clearItems() {
    genClient.clear(CacheKey.items);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public Option copyChanges() {
    Option copy = new Option();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Option src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Option(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Option> CREATOR = new android.os.Parcelable.Creator<Option>() {
    @Override
    public Option createFromParcel(android.os.Parcel in) {
      Option instance = new Option(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Option[] newArray(int size) {
      return new Option[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Option> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Option>() {
    @Override
    public Option create(org.json.JSONObject jsonObject) {
      return new Option(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean NAME_IS_REQUIRED = true;
    public static final long NAME_MAX_LEN = 255;
    public static final boolean ATTRIBUTE_IS_REQUIRED = false;
    public static final boolean ITEMS_IS_REQUIRED = false;

  }

}
