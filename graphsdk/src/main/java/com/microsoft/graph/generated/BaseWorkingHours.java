// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Working Hours.
 */
public class BaseWorkingHours implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Days Of Week.
     * The days of the week on which the user works.
     */
    @SerializedName("daysOfWeek")
    @Expose
    public java.util.List<DayOfWeek> daysOfWeek;

    /**
     * The Start Time.
     * The time of the day that the user starts working.
     */
    @SerializedName("startTime")
    @Expose
    public com.microsoft.graph.model.TimeOfDay startTime;

    /**
     * The End Time.
     * The time of the day that the user stops working.
     */
    @SerializedName("endTime")
    @Expose
    public com.microsoft.graph.model.TimeOfDay endTime;

    /**
     * The Time Zone.
     * The time zone to which the working hours apply.
     */
    @SerializedName("timeZone")
    @Expose
    public TimeZoneBase timeZone;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;

    }
}
