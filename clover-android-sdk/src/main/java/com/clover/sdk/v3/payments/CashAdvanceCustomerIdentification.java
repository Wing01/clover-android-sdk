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

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getIdType idType}</li>
 * <li>{@link #getSerialNumber serialNumber}</li>
 * <li>{@link #getMaskedSerialNumber maskedSerialNumber}</li>
 * <li>{@link #getEncryptedSerialNumber encryptedSerialNumber}</li>
 * <li>{@link #getExpirationDate expirationDate}</li>
 * <li>{@link #getIssuingState issuingState}</li>
 * <li>{@link #getIssuingCountry issuingCountry}</li>
 * <li>{@link #getCustomerName customerName}</li>
 * <li>{@link #getAddressStreet1 addressStreet1}</li>
 * <li>{@link #getAddressStreet2 addressStreet2}</li>
 * <li>{@link #getAddressCity addressCity}</li>
 * <li>{@link #getAddressState addressState}</li>
 * <li>{@link #getAddressZipCode addressZipCode}</li>
 * <li>{@link #getAddressCountry addressCountry}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CashAdvanceCustomerIdentification extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.payments.IdType getIdType() {
    return genClient.cacheGet(CacheKey.idType);
  }

  /**
   * Identification serial number
   */
  public String getSerialNumber() {
    return genClient.cacheGet(CacheKey.serialNumber);
  }

  /**
   * Masked identification serial number
   */
  public String getMaskedSerialNumber() {
    return genClient.cacheGet(CacheKey.maskedSerialNumber);
  }

  /**
   * Encrypted identification serial number
   */
  public String getEncryptedSerialNumber() {
    return genClient.cacheGet(CacheKey.encryptedSerialNumber);
  }

  /**
   * Expiration date in format MMDDYYYY
   */
  public String getExpirationDate() {
    return genClient.cacheGet(CacheKey.expirationDate);
  }

  /**
   * State in which identification was issued
   */
  public String getIssuingState() {
    return genClient.cacheGet(CacheKey.issuingState);
  }

  /**
   * Country in which identification was issued
   */
  public String getIssuingCountry() {
    return genClient.cacheGet(CacheKey.issuingCountry);
  }

  /**
   * Full customer name
   */
  public String getCustomerName() {
    return genClient.cacheGet(CacheKey.customerName);
  }

  public String getAddressStreet1() {
    return genClient.cacheGet(CacheKey.addressStreet1);
  }

  public String getAddressStreet2() {
    return genClient.cacheGet(CacheKey.addressStreet2);
  }

  public String getAddressCity() {
    return genClient.cacheGet(CacheKey.addressCity);
  }

  public String getAddressState() {
    return genClient.cacheGet(CacheKey.addressState);
  }

  public String getAddressZipCode() {
    return genClient.cacheGet(CacheKey.addressZipCode);
  }

  public String getAddressCountry() {
    return genClient.cacheGet(CacheKey.addressCountry);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<CashAdvanceCustomerIdentification> {
    idType {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractEnum("idType", com.clover.sdk.v3.payments.IdType.class);
      }
    },
    serialNumber {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("serialNumber", String.class);
      }
    },
    maskedSerialNumber {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("maskedSerialNumber", String.class);
      }
    },
    encryptedSerialNumber {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("encryptedSerialNumber", String.class);
      }
    },
    expirationDate {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("expirationDate", String.class);
      }
    },
    issuingState {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("issuingState", String.class);
      }
    },
    issuingCountry {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("issuingCountry", String.class);
      }
    },
    customerName {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("customerName", String.class);
      }
    },
    addressStreet1 {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("addressStreet1", String.class);
      }
    },
    addressStreet2 {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("addressStreet2", String.class);
      }
    },
    addressCity {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("addressCity", String.class);
      }
    },
    addressState {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("addressState", String.class);
      }
    },
    addressZipCode {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("addressZipCode", String.class);
      }
    },
    addressCountry {
      @Override
      public Object extractValue(CashAdvanceCustomerIdentification instance) {
        return instance.genClient.extractOther("addressCountry", String.class);
      }
    },
      ;
  }

  private GenericClient<CashAdvanceCustomerIdentification> genClient;

  /**
  * Constructs a new empty instance.
  */
  public CashAdvanceCustomerIdentification() {
    genClient = new GenericClient<CashAdvanceCustomerIdentification>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected CashAdvanceCustomerIdentification(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CashAdvanceCustomerIdentification(String json) throws IllegalArgumentException {
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
  public CashAdvanceCustomerIdentification(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CashAdvanceCustomerIdentification(CashAdvanceCustomerIdentification src) {
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

    genClient.validateLength(getSerialNumber(), 64);

    genClient.validateLength(getMaskedSerialNumber(), 64);

    genClient.validateLength(getExpirationDate(), 8);

    genClient.validateLength(getIssuingState(), 64);

    genClient.validateLength(getIssuingCountry(), 64);

    genClient.validateLength(getCustomerName(), 128);

    genClient.validateLength(getAddressStreet1(), 128);

    genClient.validateLength(getAddressStreet2(), 128);

    genClient.validateLength(getAddressCity(), 128);

    genClient.validateLength(getAddressState(), 64);

    genClient.validateLength(getAddressZipCode(), 64);

    genClient.validateLength(getAddressCountry(), 64);
  }

  /** Checks whether the 'idType' field is set and is not null */
  public boolean isNotNullIdType() {
    return genClient.cacheValueIsNotNull(CacheKey.idType);
  }

  /** Checks whether the 'serialNumber' field is set and is not null */
  public boolean isNotNullSerialNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.serialNumber);
  }

  /** Checks whether the 'maskedSerialNumber' field is set and is not null */
  public boolean isNotNullMaskedSerialNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.maskedSerialNumber);
  }

  /** Checks whether the 'encryptedSerialNumber' field is set and is not null */
  public boolean isNotNullEncryptedSerialNumber() {
    return genClient.cacheValueIsNotNull(CacheKey.encryptedSerialNumber);
  }

  /** Checks whether the 'expirationDate' field is set and is not null */
  public boolean isNotNullExpirationDate() {
    return genClient.cacheValueIsNotNull(CacheKey.expirationDate);
  }

  /** Checks whether the 'issuingState' field is set and is not null */
  public boolean isNotNullIssuingState() {
    return genClient.cacheValueIsNotNull(CacheKey.issuingState);
  }

  /** Checks whether the 'issuingCountry' field is set and is not null */
  public boolean isNotNullIssuingCountry() {
    return genClient.cacheValueIsNotNull(CacheKey.issuingCountry);
  }

  /** Checks whether the 'customerName' field is set and is not null */
  public boolean isNotNullCustomerName() {
    return genClient.cacheValueIsNotNull(CacheKey.customerName);
  }

  /** Checks whether the 'addressStreet1' field is set and is not null */
  public boolean isNotNullAddressStreet1() {
    return genClient.cacheValueIsNotNull(CacheKey.addressStreet1);
  }

  /** Checks whether the 'addressStreet2' field is set and is not null */
  public boolean isNotNullAddressStreet2() {
    return genClient.cacheValueIsNotNull(CacheKey.addressStreet2);
  }

  /** Checks whether the 'addressCity' field is set and is not null */
  public boolean isNotNullAddressCity() {
    return genClient.cacheValueIsNotNull(CacheKey.addressCity);
  }

  /** Checks whether the 'addressState' field is set and is not null */
  public boolean isNotNullAddressState() {
    return genClient.cacheValueIsNotNull(CacheKey.addressState);
  }

  /** Checks whether the 'addressZipCode' field is set and is not null */
  public boolean isNotNullAddressZipCode() {
    return genClient.cacheValueIsNotNull(CacheKey.addressZipCode);
  }

  /** Checks whether the 'addressCountry' field is set and is not null */
  public boolean isNotNullAddressCountry() {
    return genClient.cacheValueIsNotNull(CacheKey.addressCountry);
  }



  /** Checks whether the 'idType' field has been set, however the value could be null */
  public boolean hasIdType() {
    return genClient.cacheHasKey(CacheKey.idType);
  }

  /** Checks whether the 'serialNumber' field has been set, however the value could be null */
  public boolean hasSerialNumber() {
    return genClient.cacheHasKey(CacheKey.serialNumber);
  }

  /** Checks whether the 'maskedSerialNumber' field has been set, however the value could be null */
  public boolean hasMaskedSerialNumber() {
    return genClient.cacheHasKey(CacheKey.maskedSerialNumber);
  }

  /** Checks whether the 'encryptedSerialNumber' field has been set, however the value could be null */
  public boolean hasEncryptedSerialNumber() {
    return genClient.cacheHasKey(CacheKey.encryptedSerialNumber);
  }

  /** Checks whether the 'expirationDate' field has been set, however the value could be null */
  public boolean hasExpirationDate() {
    return genClient.cacheHasKey(CacheKey.expirationDate);
  }

  /** Checks whether the 'issuingState' field has been set, however the value could be null */
  public boolean hasIssuingState() {
    return genClient.cacheHasKey(CacheKey.issuingState);
  }

  /** Checks whether the 'issuingCountry' field has been set, however the value could be null */
  public boolean hasIssuingCountry() {
    return genClient.cacheHasKey(CacheKey.issuingCountry);
  }

  /** Checks whether the 'customerName' field has been set, however the value could be null */
  public boolean hasCustomerName() {
    return genClient.cacheHasKey(CacheKey.customerName);
  }

  /** Checks whether the 'addressStreet1' field has been set, however the value could be null */
  public boolean hasAddressStreet1() {
    return genClient.cacheHasKey(CacheKey.addressStreet1);
  }

  /** Checks whether the 'addressStreet2' field has been set, however the value could be null */
  public boolean hasAddressStreet2() {
    return genClient.cacheHasKey(CacheKey.addressStreet2);
  }

  /** Checks whether the 'addressCity' field has been set, however the value could be null */
  public boolean hasAddressCity() {
    return genClient.cacheHasKey(CacheKey.addressCity);
  }

  /** Checks whether the 'addressState' field has been set, however the value could be null */
  public boolean hasAddressState() {
    return genClient.cacheHasKey(CacheKey.addressState);
  }

  /** Checks whether the 'addressZipCode' field has been set, however the value could be null */
  public boolean hasAddressZipCode() {
    return genClient.cacheHasKey(CacheKey.addressZipCode);
  }

  /** Checks whether the 'addressCountry' field has been set, however the value could be null */
  public boolean hasAddressCountry() {
    return genClient.cacheHasKey(CacheKey.addressCountry);
  }


  /**
   * Sets the field 'idType'.
   */
  public CashAdvanceCustomerIdentification setIdType(com.clover.sdk.v3.payments.IdType idType) {
    return genClient.setOther(idType, CacheKey.idType);
  }

  /**
   * Sets the field 'serialNumber'.
   */
  public CashAdvanceCustomerIdentification setSerialNumber(String serialNumber) {
    return genClient.setOther(serialNumber, CacheKey.serialNumber);
  }

  /**
   * Sets the field 'maskedSerialNumber'.
   */
  public CashAdvanceCustomerIdentification setMaskedSerialNumber(String maskedSerialNumber) {
    return genClient.setOther(maskedSerialNumber, CacheKey.maskedSerialNumber);
  }

  /**
   * Sets the field 'encryptedSerialNumber'.
   */
  public CashAdvanceCustomerIdentification setEncryptedSerialNumber(String encryptedSerialNumber) {
    return genClient.setOther(encryptedSerialNumber, CacheKey.encryptedSerialNumber);
  }

  /**
   * Sets the field 'expirationDate'.
   */
  public CashAdvanceCustomerIdentification setExpirationDate(String expirationDate) {
    return genClient.setOther(expirationDate, CacheKey.expirationDate);
  }

  /**
   * Sets the field 'issuingState'.
   */
  public CashAdvanceCustomerIdentification setIssuingState(String issuingState) {
    return genClient.setOther(issuingState, CacheKey.issuingState);
  }

  /**
   * Sets the field 'issuingCountry'.
   */
  public CashAdvanceCustomerIdentification setIssuingCountry(String issuingCountry) {
    return genClient.setOther(issuingCountry, CacheKey.issuingCountry);
  }

  /**
   * Sets the field 'customerName'.
   */
  public CashAdvanceCustomerIdentification setCustomerName(String customerName) {
    return genClient.setOther(customerName, CacheKey.customerName);
  }

  /**
   * Sets the field 'addressStreet1'.
   */
  public CashAdvanceCustomerIdentification setAddressStreet1(String addressStreet1) {
    return genClient.setOther(addressStreet1, CacheKey.addressStreet1);
  }

  /**
   * Sets the field 'addressStreet2'.
   */
  public CashAdvanceCustomerIdentification setAddressStreet2(String addressStreet2) {
    return genClient.setOther(addressStreet2, CacheKey.addressStreet2);
  }

  /**
   * Sets the field 'addressCity'.
   */
  public CashAdvanceCustomerIdentification setAddressCity(String addressCity) {
    return genClient.setOther(addressCity, CacheKey.addressCity);
  }

  /**
   * Sets the field 'addressState'.
   */
  public CashAdvanceCustomerIdentification setAddressState(String addressState) {
    return genClient.setOther(addressState, CacheKey.addressState);
  }

  /**
   * Sets the field 'addressZipCode'.
   */
  public CashAdvanceCustomerIdentification setAddressZipCode(String addressZipCode) {
    return genClient.setOther(addressZipCode, CacheKey.addressZipCode);
  }

  /**
   * Sets the field 'addressCountry'.
   */
  public CashAdvanceCustomerIdentification setAddressCountry(String addressCountry) {
    return genClient.setOther(addressCountry, CacheKey.addressCountry);
  }


  /** Clears the 'idType' field, the 'has' method for this field will now return false */
  public void clearIdType() {
    genClient.clear(CacheKey.idType);
  }
  /** Clears the 'serialNumber' field, the 'has' method for this field will now return false */
  public void clearSerialNumber() {
    genClient.clear(CacheKey.serialNumber);
  }
  /** Clears the 'maskedSerialNumber' field, the 'has' method for this field will now return false */
  public void clearMaskedSerialNumber() {
    genClient.clear(CacheKey.maskedSerialNumber);
  }
  /** Clears the 'encryptedSerialNumber' field, the 'has' method for this field will now return false */
  public void clearEncryptedSerialNumber() {
    genClient.clear(CacheKey.encryptedSerialNumber);
  }
  /** Clears the 'expirationDate' field, the 'has' method for this field will now return false */
  public void clearExpirationDate() {
    genClient.clear(CacheKey.expirationDate);
  }
  /** Clears the 'issuingState' field, the 'has' method for this field will now return false */
  public void clearIssuingState() {
    genClient.clear(CacheKey.issuingState);
  }
  /** Clears the 'issuingCountry' field, the 'has' method for this field will now return false */
  public void clearIssuingCountry() {
    genClient.clear(CacheKey.issuingCountry);
  }
  /** Clears the 'customerName' field, the 'has' method for this field will now return false */
  public void clearCustomerName() {
    genClient.clear(CacheKey.customerName);
  }
  /** Clears the 'addressStreet1' field, the 'has' method for this field will now return false */
  public void clearAddressStreet1() {
    genClient.clear(CacheKey.addressStreet1);
  }
  /** Clears the 'addressStreet2' field, the 'has' method for this field will now return false */
  public void clearAddressStreet2() {
    genClient.clear(CacheKey.addressStreet2);
  }
  /** Clears the 'addressCity' field, the 'has' method for this field will now return false */
  public void clearAddressCity() {
    genClient.clear(CacheKey.addressCity);
  }
  /** Clears the 'addressState' field, the 'has' method for this field will now return false */
  public void clearAddressState() {
    genClient.clear(CacheKey.addressState);
  }
  /** Clears the 'addressZipCode' field, the 'has' method for this field will now return false */
  public void clearAddressZipCode() {
    genClient.clear(CacheKey.addressZipCode);
  }
  /** Clears the 'addressCountry' field, the 'has' method for this field will now return false */
  public void clearAddressCountry() {
    genClient.clear(CacheKey.addressCountry);
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
  public CashAdvanceCustomerIdentification copyChanges() {
    CashAdvanceCustomerIdentification copy = new CashAdvanceCustomerIdentification();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CashAdvanceCustomerIdentification src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CashAdvanceCustomerIdentification(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CashAdvanceCustomerIdentification> CREATOR = new android.os.Parcelable.Creator<CashAdvanceCustomerIdentification>() {
    @Override
    public CashAdvanceCustomerIdentification createFromParcel(android.os.Parcel in) {
      CashAdvanceCustomerIdentification instance = new CashAdvanceCustomerIdentification(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CashAdvanceCustomerIdentification[] newArray(int size) {
      return new CashAdvanceCustomerIdentification[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CashAdvanceCustomerIdentification> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CashAdvanceCustomerIdentification>() {
    @Override
    public CashAdvanceCustomerIdentification create(org.json.JSONObject jsonObject) {
      return new CashAdvanceCustomerIdentification(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean IDTYPE_IS_REQUIRED = false;
    public static final boolean SERIALNUMBER_IS_REQUIRED = false;
    public static final long SERIALNUMBER_MAX_LEN = 64;
    public static final boolean MASKEDSERIALNUMBER_IS_REQUIRED = false;
    public static final long MASKEDSERIALNUMBER_MAX_LEN = 64;
    public static final boolean ENCRYPTEDSERIALNUMBER_IS_REQUIRED = false;
    public static final boolean EXPIRATIONDATE_IS_REQUIRED = false;
    public static final long EXPIRATIONDATE_MAX_LEN = 8;
    public static final boolean ISSUINGSTATE_IS_REQUIRED = false;
    public static final long ISSUINGSTATE_MAX_LEN = 2;
    public static final boolean ISSUINGCOUNTRY_IS_REQUIRED = false;
    public static final long ISSUINGCOUNTRY_MAX_LEN = 64;
    public static final boolean CUSTOMERNAME_IS_REQUIRED = false;
    public static final long CUSTOMERNAME_MAX_LEN = 128;
    public static final boolean ADDRESSSTREET1_IS_REQUIRED = false;
    public static final long ADDRESSSTREET1_MAX_LEN = 128;
    public static final boolean ADDRESSSTREET2_IS_REQUIRED = false;
    public static final long ADDRESSSTREET2_MAX_LEN = 128;
    public static final boolean ADDRESSCITY_IS_REQUIRED = false;
    public static final long ADDRESSCITY_MAX_LEN = 128;
    public static final boolean ADDRESSSTATE_IS_REQUIRED = false;
    public static final long ADDRESSSTATE_MAX_LEN = 2;
    public static final boolean ADDRESSZIPCODE_IS_REQUIRED = false;
    public static final long ADDRESSZIPCODE_MAX_LEN = 64;
    public static final boolean ADDRESSCOUNTRY_IS_REQUIRED = false;
    public static final long ADDRESSCOUNTRY_MAX_LEN = 64;

  }

}
