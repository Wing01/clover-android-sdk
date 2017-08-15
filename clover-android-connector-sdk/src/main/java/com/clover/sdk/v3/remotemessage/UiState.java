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

package com.clover.sdk.v3.remotemessage;

import android.os.Parcelable;
import android.os.Parcel;

/**
 * This is an auto-generated Clover data enum.
 */
@SuppressWarnings("all")
public enum UiState implements Parcelable {
  START, FAILED, FATAL, TRY_AGAIN, INPUT_ERROR, PIN_BYPASS_CONFIRM, CANCELED, TIMED_OUT, DECLINED, VOIDED, CONFIGURING, PROCESSING, REMOVE_CARD, PROCESSING_GO_ONLINE, PROCESSING_CREDIT, PROCESSING_SWIPE, SELECT_APPLICATION, PIN_PAD, MANUAL_CARD_NUMBER, MANUAL_CARD_CVV, MANUAL_CARD_CVV_UNREADABLE, MANUAL_CARD_EXPIRATION, SELECT_ACCOUNT, CASHBACK_CONFIRM, CASHBACK_SELECT, CONTACTLESS_TAP_REQUIRED, VOICE_REFERRAL_RESULT, CONFIRM_PARTIAL_AUTH, PACKET_EXCEPTION, CONFIRM_DUPLICATE_CHECK, FORCE_ACCEPTANCE, VERIFY_SIGNATURE_ON_PAPER, VERIFY_SIGNATURE_ON_PAPER_CONFIRM_VOID, VERIFY_SIGNATURE_ON_SCREEN, VERIFY_SIGNATURE_ON_SCREEN_CONFIRM_VOID, ADD_SIGNATURE, SIGNATURE_ON_SCREEN_FALLBACK, RETURN_TO_MERCHANT, SIGNATURE_REJECT, ADD_SIGNATURE_CANCEL_CONFIRM, ADD_TIP, RECEIPT_OPTIONS, HANDLE_TENDER, SELECT_LANGUAGE, APPROVED, OFFLINE_PAYMENT_CONFIRM, CUSTOM_ACTIVITY, STARTING_CUSTOM_ACTIVITY;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<UiState> CREATOR = new Creator<UiState>() {
    @Override
    public UiState createFromParcel(final Parcel source) {
      return UiState.valueOf(source.readString());
    }

    @Override
    public UiState[] newArray(final int size) {
      return new UiState[size];
    }
  };
}
