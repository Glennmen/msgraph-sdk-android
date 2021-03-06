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
 * The class for the Base Workbook Functions Small Request Builder.
 */
public class BaseWorkbookFunctionsSmallRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSmall
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsSmallRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement k) {
        super(requestUrl, client, requestOptions);
        mBodyParams.put("array", array);
        mBodyParams.put("k", k);
    }

    /**
     * Creates the IWorkbookFunctionsSmallRequest
     *
     * @return The IWorkbookFunctionsSmallRequest instance
     */
    public IWorkbookFunctionsSmallRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSmallRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsSmallRequest instance
     */
    public IWorkbookFunctionsSmallRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsSmallRequest request = new WorkbookFunctionsSmallRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("array")) {
            request.mBody.array = getParameter("array");
        }

        if (hasParameter("k")) {
            request.mBody.k = getParameter("k");
        }

        return request;
    }
}
