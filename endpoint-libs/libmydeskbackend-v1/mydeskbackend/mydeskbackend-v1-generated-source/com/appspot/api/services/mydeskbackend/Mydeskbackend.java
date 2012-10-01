/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file was generated.
 *  with google-apis-code-generator 1.2.0 (build: 2012-09-27 15:13:35 UTC)
 *  on 2012-10-01 at 21:36:19 UTC 
 */

package com.appspot.api.services.mydeskbackend;

import com.google.api.client.googleapis.services.GoogleClient;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpRequest;
import com.google.api.client.http.json.JsonHttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

import java.io.IOException;

/**
 * Service definition for Mydeskbackend (v1).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link JsonHttpRequestInitializer} to initialize global parameters via its
 * {@link Builder}. Sample usage:
 * </p>
 *
 * <pre>
  public class MydeskbackendRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        MydeskbackendRequest mydeskbackendRequest = (MydeskbackendRequest)request;
        mydeskbackendRequest.setPrettyPrint(true);
        mydeskbackendRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Mydeskbackend extends GoogleClient {

  /**
   * The default encoded base path of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.8) Use "/" + {@link #DEFAULT_SERVICE_PATH}.
   */
  @Deprecated
  public static final String DEFAULT_BASE_PATH = "/_ah/api/mydeskbackend/v1/";

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://mydeskbackend.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "mydeskbackend/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Construct a Mydeskbackend instance to connect to the Mydeskbackend service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to be removed in 1.8) Use
   *             {@link #Mydeskbackend(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
  @Deprecated
  public Mydeskbackend(HttpTransport transport, JsonFactory jsonFactory) {
    super(transport, jsonFactory, DEFAULT_BASE_URL);
  }

  /**
   * Construct a Mydeskbackend instance to connect to the Mydeskbackend service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Mydeskbackend(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
  }

  /**
   * Construct a Mydeskbackend instance to connect to the Mydeskbackend service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param baseUrl The base URL of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  @Deprecated
  Mydeskbackend(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String baseUrl,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          baseUrl,
          applicationName);
  }

  /**
   * Construct a Mydeskbackend instance to connect to the Mydeskbackend service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param rootUrl The root URL of the service on the server
   * @param servicePath The service path of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   * @param suppressPatternChecks whether discovery pattern checks should be suppressed on required
   *        parameters
   */
  Mydeskbackend(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String rootUrl,
      String servicePath,
      String applicationName,
      boolean suppressPatternChecks) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          rootUrl,
          servicePath,
          applicationName,
          suppressPatternChecks);
  }

  @Override
  protected void initialize(JsonHttpRequest jsonHttpRequest) throws IOException {
    super.initialize(jsonHttpRequest);
  }

  /**
   * Returns an instance of a new builder.
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to removed in 1.8) Use
   *             {@link Builder#Builder(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
   @Deprecated
   public static Builder builder(HttpTransport transport, JsonFactory jsonFactory) {
     return new Builder(transport, jsonFactory, new GenericUrl(DEFAULT_BASE_URL));
   }

  /**
   * Create a request for the method "updateLexicon".
   *
   * This request holds the parameters needed by the the mydeskbackend server.  After setting any
   * optional parameters, call the {@link UpdateLexicon#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.mydeskbackend.model.Lexicon}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public UpdateLexicon updateLexicon(com.appspot.api.services.mydeskbackend.model.Lexicon content) throws IOException {
    UpdateLexicon result = new UpdateLexicon(content);
    initialize(result);
    return result;
  }

  public class UpdateLexicon extends MydeskbackendRequest {

    private static final String REST_PATH = "lexicon";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    UpdateLexicon(com.appspot.api.services.mydeskbackend.model.Lexicon content) {
      super(Mydeskbackend.this, HttpMethod.PUT, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }

    /**
     * Sends the "updateLexicon" request to the Mydeskbackend server.
     *
     * @return the {@link com.appspot.api.services.mydeskbackend.model.Lexicon} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.mydeskbackend.model.Lexicon execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.mydeskbackend.model.Lexicon result = response.parseAs(
          com.appspot.api.services.mydeskbackend.model.Lexicon.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "updateLexicon" request to the Mydeskbackend server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Lexicon&gt;() {

         public void onSuccess(Lexicon content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.mydeskbackend.model.Lexicon> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.mydeskbackend.model.Lexicon.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public UpdateLexicon setFields(String fields) {
      super.setFields(fields);
      return this;
    }

  }

  /**
   * Create a request for the method "removeLexicon".
   *
   * This request holds the parameters needed by the the mydeskbackend server.  After setting any
   * optional parameters, call the {@link RemoveLexicon#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public RemoveLexicon removeLexicon(String id) throws IOException {
    RemoveLexicon result = new RemoveLexicon(id);
    initialize(result);
    return result;
  }

  public class RemoveLexicon extends MydeskbackendRequest {

    private static final String REST_PATH = "lexicon/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    RemoveLexicon(String id) {
      super(Mydeskbackend.this, HttpMethod.DELETE, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    /**
     * Sends the "removeLexicon" request to the Mydeskbackend server.
     *
     * @return the {@link com.appspot.api.services.mydeskbackend.model.Lexicon} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.mydeskbackend.model.Lexicon execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.mydeskbackend.model.Lexicon result = response.parseAs(
          com.appspot.api.services.mydeskbackend.model.Lexicon.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "removeLexicon" request to the Mydeskbackend server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Lexicon&gt;() {

         public void onSuccess(Lexicon content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.mydeskbackend.model.Lexicon> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.mydeskbackend.model.Lexicon.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public RemoveLexicon setFields(String fields) {
      super.setFields(fields);
      return this;
    }

    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }

    public RemoveLexicon setId(String id) {
      this.id = id;
      return this;
    }

  }

  /**
   * Create a request for the method "getLexicon".
   *
   * This request holds the parameters needed by the the mydeskbackend server.  After setting any
   * optional parameters, call the {@link GetLexicon#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public GetLexicon getLexicon(String id) throws IOException {
    GetLexicon result = new GetLexicon(id);
    initialize(result);
    return result;
  }

  public class GetLexicon extends MydeskbackendRequest {

    private static final String REST_PATH = "lexicon/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    GetLexicon(String id) {
      super(Mydeskbackend.this, HttpMethod.GET, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    /**
     * Sends the "getLexicon" request to the Mydeskbackend server.
     *
     * @return the {@link com.appspot.api.services.mydeskbackend.model.Lexicon} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.mydeskbackend.model.Lexicon execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.mydeskbackend.model.Lexicon result = response.parseAs(
          com.appspot.api.services.mydeskbackend.model.Lexicon.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "getLexicon" request to the Mydeskbackend server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Lexicon&gt;() {

         public void onSuccess(Lexicon content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.mydeskbackend.model.Lexicon> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.mydeskbackend.model.Lexicon.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public GetLexicon setFields(String fields) {
      super.setFields(fields);
      return this;
    }

    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }

    public GetLexicon setId(String id) {
      this.id = id;
      return this;
    }

  }

  /**
   * Create a request for the method "insertLexicon".
   *
   * This request holds the parameters needed by the the mydeskbackend server.  After setting any
   * optional parameters, call the {@link InsertLexicon#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.mydeskbackend.model.Lexicon}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public InsertLexicon insertLexicon(com.appspot.api.services.mydeskbackend.model.Lexicon content) throws IOException {
    InsertLexicon result = new InsertLexicon(content);
    initialize(result);
    return result;
  }

  public class InsertLexicon extends MydeskbackendRequest {

    private static final String REST_PATH = "lexicon";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    InsertLexicon(com.appspot.api.services.mydeskbackend.model.Lexicon content) {
      super(Mydeskbackend.this, HttpMethod.POST, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }

    /**
     * Sends the "insertLexicon" request to the Mydeskbackend server.
     *
     * @return the {@link com.appspot.api.services.mydeskbackend.model.Lexicon} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.mydeskbackend.model.Lexicon execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.mydeskbackend.model.Lexicon result = response.parseAs(
          com.appspot.api.services.mydeskbackend.model.Lexicon.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "insertLexicon" request to the Mydeskbackend server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Lexicon&gt;() {

         public void onSuccess(Lexicon content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.mydeskbackend.model.Lexicon> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.mydeskbackend.model.Lexicon.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public InsertLexicon setFields(String fields) {
      super.setFields(fields);
      return this;
    }

  }

  /**
   * Create a request for the method "listLexicon".
   *
   * This request holds the parameters needed by the the mydeskbackend server.  After setting any
   * optional parameters, call the {@link ListLexicon#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public ListLexicon listLexicon() throws IOException {
    ListLexicon result = new ListLexicon();
    initialize(result);
    return result;
  }

  public class ListLexicon extends MydeskbackendRequest {

    private static final String REST_PATH = "lexicon";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    ListLexicon() {
      super(Mydeskbackend.this, HttpMethod.GET, REST_PATH, null);
    }

    /**
     * Sends the "listLexicon" request to the Mydeskbackend server.
     *
     * @return the {@link com.appspot.api.services.mydeskbackend.model.Lexicons} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.mydeskbackend.model.Lexicons execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.mydeskbackend.model.Lexicons result = response.parseAs(
          com.appspot.api.services.mydeskbackend.model.Lexicons.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "listLexicon" request to the Mydeskbackend server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Lexicons&gt;() {

         public void onSuccess(Lexicons content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.mydeskbackend.model.Lexicons> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.mydeskbackend.model.Lexicons.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public ListLexicon setFields(String fields) {
      super.setFields(fields);
      return this;
    }

  }

  /**
   * Builder for {@link Mydeskbackend}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends GoogleClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param baseUrl The base URL of the service. Must end with a "/"
     */
    @Deprecated
    Builder(HttpTransport transport, JsonFactory jsonFactory, GenericUrl baseUrl) {
      super(transport, jsonFactory, baseUrl);
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
    }

    /** Builds a new instance of {@link Mydeskbackend}. */
    @SuppressWarnings("deprecation")
    @Override
    public Mydeskbackend build() {
      if (isBaseUrlUsed()) {
        return new Mydeskbackend(
            getTransport(),
            getJsonHttpRequestInitializer(),
            getHttpRequestInitializer(),
            getJsonFactory(),
            getObjectParser(),
            getBaseUrl().build(),
            getApplicationName());
      }
      return new Mydeskbackend(
          getTransport(),
          getJsonHttpRequestInitializer(),
          getHttpRequestInitializer(),
          getJsonFactory(),
          getObjectParser(),
          getRootUrl(),
          getServicePath(),
          getApplicationName(),
          getSuppressPatternChecks());
    }

    @Override
    @Deprecated
    public Builder setBaseUrl(GenericUrl baseUrl) {
      super.setBaseUrl(baseUrl);
      return this;
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      super.setRootUrl(rootUrl);
      return this;
    }

    @Override
    public Builder setServicePath(String servicePath) {
      super.setServicePath(servicePath);
      return this;
    }

    @Override
    public Builder setJsonHttpRequestInitializer(
        JsonHttpRequestInitializer jsonHttpRequestInitializer) {
      super.setJsonHttpRequestInitializer(jsonHttpRequestInitializer);
      return this;
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      super.setHttpRequestInitializer(httpRequestInitializer);
      return this;
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      super.setApplicationName(applicationName);
      return this;
    }

    @Override
    public Builder setObjectParser(JsonObjectParser parser) {
      super.setObjectParser(parser);
      return this;
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      super.setSuppressPatternChecks(suppressPatternChecks);
      return this;
    }
  }
}
