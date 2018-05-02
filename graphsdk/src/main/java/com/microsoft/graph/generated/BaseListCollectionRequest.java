// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
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
 * The class for the Base List Collection Request.
 */
public class BaseListCollectionRequest extends BaseCollectionRequest<BaseListCollectionResponse, IListCollectionPage> implements IBaseListCollectionRequest {

    /**
     * The request builder for this collection of List
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseListCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, BaseListCollectionResponse.class, IListCollectionPage.class);
    }

    public void get(final ICallback<IListCollectionPage> callback) {
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

    public IListCollectionPage get() throws ClientException {
        final BaseListCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final List newList, final ICallback<List> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ListRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newList, callback);
    }

    public List post(final List newList) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ListRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newList);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IListCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ListCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IListCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ListCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    public IListCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ListCollectionRequest)this;
    }

    public IListCollectionPage buildFromResponse(final BaseListCollectionResponse response) {
        final IListCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ListCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ListCollectionPage page = new ListCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}