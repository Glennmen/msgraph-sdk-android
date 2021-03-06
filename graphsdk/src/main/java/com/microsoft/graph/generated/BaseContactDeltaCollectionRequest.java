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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Contact Delta Collection Request.
 */
public class BaseContactDeltaCollectionRequest extends BaseCollectionRequest<BaseContactDeltaCollectionResponse, IContactDeltaCollectionPage> implements IBaseContactDeltaCollectionRequest {


    /**
     * The request for this ContactDelta
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseContactDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseContactDeltaCollectionResponse.class, IContactDeltaCollectionPage.class);
    }


    public void get(final ICallback<IContactDeltaCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IContactDeltaCollectionPage get() throws ClientException {
        final BaseContactDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IContactDeltaCollectionPage buildFromResponse(final BaseContactDeltaCollectionResponse response) {
        final IContactDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ContactDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IContactDeltaCollectionPage page = new ContactDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IContactDeltaCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IContactDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IContactDeltaCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IContactDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IContactDeltaCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IContactDeltaCollectionRequest)this;
    }

}
