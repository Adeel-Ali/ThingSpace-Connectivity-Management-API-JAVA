/*
 * ThingSpaceConnectivityManagementAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 10/05/2016
 */
package com.example.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.example.*;
import com.example.models.*;
import com.example.exceptions.*;
import com.example.http.client.HttpClient;
import com.example.http.client.HttpContext;
import com.example.http.request.HttpRequest;
import com.example.http.response.HttpResponse;
import com.example.http.response.HttpStringResponse;
import com.example.http.client.APICallBack;
import com.example.controllers.syncwrapper.APICallBackCatcher;

public class SmsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SmsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SmsController class 
     */
    public static SmsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SmsController();
            }
        }
        return instance;
    }

    /**
     * Starts delivery of queued SMS messages for the specific account.
     * @param    aname    Required parameter: Account name
     * @param    vZM2MToken    Required parameter: M2M-MC Session Token
     * @return    Returns the RestSuccessResponse response from the API call 
     */
    public RestSuccessResponse updateStartSmsCallbackUsingPUT(
                final String aname,
                final String vZM2MToken
    ) throws Throwable {
        APICallBackCatcher<RestSuccessResponse> callback = new APICallBackCatcher<RestSuccessResponse>();
        updateStartSmsCallbackUsingPUTAsync(aname, vZM2MToken, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Starts delivery of queued SMS messages for the specific account.
     * @param    aname    Required parameter: Account name
     * @param    vZM2MToken    Required parameter: M2M-MC Session Token
     * @return    Returns the void response from the API call 
     */
    public void updateStartSmsCallbackUsingPUTAsync(
                final String aname,
                final String vZM2MToken,
                final APICallBack<RestSuccessResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sms/{aname}/startCallbacks");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5309628039389541826L;
            {
                    put( "aname", aname );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5240623154700755978L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "VZ-M2M-Token", vZM2MToken );
                    put( "api_key", Configuration.apiKey );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().put(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new RestErrorResponseException("Error Response", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            RestSuccessResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RestSuccessResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Retrieves queued SMS messages sent by all M2M MC devices associated with an account.
     * @param    aname    Required parameter: Account name
     * @param    vZM2MToken    Required parameter: M2M-MC Session Token
     * @param    next    Optional parameter: Continue the previous query from the URL in Location Header
     * @return    Returns the SmsMessagesResponse response from the API call 
     */
    public SmsMessagesResponse getSmsMessagesUsingGET(
                final String aname,
                final String vZM2MToken,
                final Long next
    ) throws Throwable {
        APICallBackCatcher<SmsMessagesResponse> callback = new APICallBackCatcher<SmsMessagesResponse>();
        getSmsMessagesUsingGETAsync(aname, vZM2MToken, next, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Retrieves queued SMS messages sent by all M2M MC devices associated with an account.
     * @param    aname    Required parameter: Account name
     * @param    vZM2MToken    Required parameter: M2M-MC Session Token
     * @param    next    Optional parameter: Continue the previous query from the URL in Location Header
     * @return    Returns the void response from the API call 
     */
    public void getSmsMessagesUsingGETAsync(
                final String aname,
                final String vZM2MToken,
                final Long next,
                final APICallBack<SmsMessagesResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sms/{aname}/history");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5270794711276051817L;
            {
                    put( "aname", aname );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5325676094474278621L;
            {
                    put( "next", next );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4861864358879564787L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "VZ-M2M-Token", vZM2MToken );
                    put( "api_key", Configuration.apiKey );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new RestErrorResponseException("Error Response", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            SmsMessagesResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SmsMessagesResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Sends an SMS message to one or more devices.
     * @param    request    Required parameter: SMS Request
     * @param    vZM2MToken    Required parameter: M2M-MC Session Token
     * @return    Returns the RequestResponse response from the API call 
     */
    public RequestResponse createSendSmsMessageUsingPOST(
                final SMSSendRequest request,
                final String vZM2MToken
    ) throws Throwable {
        APICallBackCatcher<RequestResponse> callback = new APICallBackCatcher<RequestResponse>();
        createSendSmsMessageUsingPOSTAsync(request, vZM2MToken, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Sends an SMS message to one or more devices.
     * @param    request    Required parameter: SMS Request
     * @param    vZM2MToken    Required parameter: M2M-MC Session Token
     * @return    Returns the void response from the API call 
     */
    public void createSendSmsMessageUsingPOSTAsync(
                final SMSSendRequest request,
                final String vZM2MToken,
                final APICallBack<RequestResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/sms");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4866058726371791551L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
                    put( "VZ-M2M-Token", vZM2MToken );
                    put( "api_key", Configuration.apiKey );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(request));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 400)
                                throw new RestErrorResponseException("Error Response", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            RequestResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<RequestResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}