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
 *  with google-apis-code-generator 1.2.0 (build: 2012-10-03 02:48:15 UTC)
 *  on 2012-10-25 at 18:36:10 UTC 
 */

package com.appspot.api.services.genericendpt;

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
 * Service definition for Genericendpt (v1).
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
  public class GenericendptRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        GenericendptRequest genericendptRequest = (GenericendptRequest)request;
        genericendptRequest.setPrettyPrint(true);
        genericendptRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Genericendpt extends GoogleClient {

  /**
   * The default encoded base path of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.8) Use "/" + {@link #DEFAULT_SERVICE_PATH}.
   */
  @Deprecated
  public static final String DEFAULT_BASE_PATH = "/_ah/api/genericendpt/v1/";

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
  public static final String DEFAULT_SERVICE_PATH = "genericendpt/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Construct a Genericendpt instance to connect to the Genericendpt service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to be removed in 1.8) Use
   *             {@link #Genericendpt(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
  @Deprecated
  public Genericendpt(HttpTransport transport, JsonFactory jsonFactory) {
    super(transport, jsonFactory, DEFAULT_BASE_URL);
  }

  /**
   * Construct a Genericendpt instance to connect to the Genericendpt service.
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
  public Genericendpt(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
  }

  /**
   * Construct a Genericendpt instance to connect to the Genericendpt service.
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
  Genericendpt(
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
   * Construct a Genericendpt instance to connect to the Genericendpt service.
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
  Genericendpt(
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
   * Create a request for the method "updateGenericBuffer".
   *
   * This request holds the parameters needed by the the genericendpt server.  After setting any
   * optional parameters, call the {@link UpdateGenericBuffer#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.genericendpt.model.GenericBuffer}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public UpdateGenericBuffer updateGenericBuffer(com.appspot.api.services.genericendpt.model.GenericBuffer content) throws IOException {
    UpdateGenericBuffer result = new UpdateGenericBuffer(content);
    initialize(result);
    return result;
  }

  public class UpdateGenericBuffer extends GenericendptRequest {

    private static final String REST_PATH = "genericbuffer";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    UpdateGenericBuffer(com.appspot.api.services.genericendpt.model.GenericBuffer content) {
      super(Genericendpt.this, HttpMethod.PUT, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }

    /**
     * Sends the "updateGenericBuffer" request to the Genericendpt server.
     *
     * @return the {@link com.appspot.api.services.genericendpt.model.GenericBuffer} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.genericendpt.model.GenericBuffer execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.genericendpt.model.GenericBuffer result = response.parseAs(
          com.appspot.api.services.genericendpt.model.GenericBuffer.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "updateGenericBuffer" request to the Genericendpt server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;GenericBuffer&gt;() {

         public void onSuccess(GenericBuffer content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.genericendpt.model.GenericBuffer> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.genericendpt.model.GenericBuffer.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public UpdateGenericBuffer setFields(String fields) {
      super.setFields(fields);
      return this;
    }

  }

  /**
   * Create a request for the method "insertGenericBuffer".
   *
   * This request holds the parameters needed by the the genericendpt server.  After setting any
   * optional parameters, call the {@link InsertGenericBuffer#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.genericendpt.model.GenericBuffer}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public InsertGenericBuffer insertGenericBuffer(com.appspot.api.services.genericendpt.model.GenericBuffer content) throws IOException {
    InsertGenericBuffer result = new InsertGenericBuffer(content);
    initialize(result);
    return result;
  }

  public class InsertGenericBuffer extends GenericendptRequest {

    private static final String REST_PATH = "genericbuffer";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    InsertGenericBuffer(com.appspot.api.services.genericendpt.model.GenericBuffer content) {
      super(Genericendpt.this, HttpMethod.POST, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }

    /**
     * Sends the "insertGenericBuffer" request to the Genericendpt server.
     *
     * @return the {@link com.appspot.api.services.genericendpt.model.GenericBuffer} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.genericendpt.model.GenericBuffer execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.genericendpt.model.GenericBuffer result = response.parseAs(
          com.appspot.api.services.genericendpt.model.GenericBuffer.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "insertGenericBuffer" request to the Genericendpt server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;GenericBuffer&gt;() {

         public void onSuccess(GenericBuffer content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.genericendpt.model.GenericBuffer> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.genericendpt.model.GenericBuffer.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public InsertGenericBuffer setFields(String fields) {
      super.setFields(fields);
      return this;
    }

  }

  /**
   * Create a request for the method "listGenericBuffer".
   *
   * This request holds the parameters needed by the the genericendpt server.  After setting any
   * optional parameters, call the {@link ListGenericBuffer#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public ListGenericBuffer listGenericBuffer() throws IOException {
    ListGenericBuffer result = new ListGenericBuffer();
    initialize(result);
    return result;
  }

  public class ListGenericBuffer extends GenericendptRequest {

    private static final String REST_PATH = "genericbuffer";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    ListGenericBuffer() {
      super(Genericendpt.this, HttpMethod.GET, REST_PATH, null);
    }

    /**
     * Sends the "listGenericBuffer" request to the Genericendpt server.
     *
     * @return the {@link com.appspot.api.services.genericendpt.model.GenericBuffers} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.genericendpt.model.GenericBuffers execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.genericendpt.model.GenericBuffers result = response.parseAs(
          com.appspot.api.services.genericendpt.model.GenericBuffers.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "listGenericBuffer" request to the Genericendpt server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;GenericBuffers&gt;() {

         public void onSuccess(GenericBuffers content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.genericendpt.model.GenericBuffers> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.genericendpt.model.GenericBuffers.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public ListGenericBuffer setFields(String fields) {
      super.setFields(fields);
      return this;
    }

  }

  /**
   * Create a request for the method "removeGenericBuffer".
   *
   * This request holds the parameters needed by the the genericendpt server.  After setting any
   * optional parameters, call the {@link RemoveGenericBuffer#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public RemoveGenericBuffer removeGenericBuffer(String id) throws IOException {
    RemoveGenericBuffer result = new RemoveGenericBuffer(id);
    initialize(result);
    return result;
  }

  public class RemoveGenericBuffer extends GenericendptRequest {

    private static final String REST_PATH = "genericbuffer/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    RemoveGenericBuffer(String id) {
      super(Genericendpt.this, HttpMethod.DELETE, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    /**
     * Sends the "removeGenericBuffer" request to the Genericendpt server.
     *
     * @return the {@link com.appspot.api.services.genericendpt.model.GenericBuffer} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.genericendpt.model.GenericBuffer execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.genericendpt.model.GenericBuffer result = response.parseAs(
          com.appspot.api.services.genericendpt.model.GenericBuffer.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "removeGenericBuffer" request to the Genericendpt server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;GenericBuffer&gt;() {

         public void onSuccess(GenericBuffer content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.genericendpt.model.GenericBuffer> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.genericendpt.model.GenericBuffer.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public RemoveGenericBuffer setFields(String fields) {
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

    public RemoveGenericBuffer setId(String id) {
      this.id = id;
      return this;
    }

  }

  /**
   * Create a request for the method "getTest".
   *
   * This request holds the parameters needed by the the genericendpt server.  After setting any
   * optional parameters, call the {@link GetTest#execute()} method to invoke the remote operation.
   *
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public GetTest getTest() throws IOException {
    GetTest result = new GetTest();
    initialize(result);
    return result;
  }

  public class GetTest extends GenericendptRequest {

    private static final String REST_PATH = "genericbuffer";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    GetTest() {
      super(Genericendpt.this, HttpMethod.GET, REST_PATH, null);
    }

    /**
     * Sends the "getTest" request to the Genericendpt server.
     *
     * @return the {@link com.appspot.api.services.genericendpt.model.GenericBuffer} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.genericendpt.model.GenericBuffer execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.genericendpt.model.GenericBuffer result = response.parseAs(
          com.appspot.api.services.genericendpt.model.GenericBuffer.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "getTest" request to the Genericendpt server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;GenericBuffer&gt;() {

         public void onSuccess(GenericBuffer content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.genericendpt.model.GenericBuffer> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.genericendpt.model.GenericBuffer.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public GetTest setFields(String fields) {
      super.setFields(fields);
      return this;
    }

  }

  /**
   * Create a request for the method "getGenericBuffer".
   *
   * This request holds the parameters needed by the the genericendpt server.  After setting any
   * optional parameters, call the {@link GetGenericBuffer#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public GetGenericBuffer getGenericBuffer(String id) throws IOException {
    GetGenericBuffer result = new GetGenericBuffer(id);
    initialize(result);
    return result;
  }

  public class GetGenericBuffer extends GenericendptRequest {

    private static final String REST_PATH = "genericbuffer/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    GetGenericBuffer(String id) {
      super(Genericendpt.this, HttpMethod.GET, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    /**
     * Sends the "getGenericBuffer" request to the Genericendpt server.
     *
     * @return the {@link com.appspot.api.services.genericendpt.model.GenericBuffer} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.genericendpt.model.GenericBuffer execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.genericendpt.model.GenericBuffer result = response.parseAs(
          com.appspot.api.services.genericendpt.model.GenericBuffer.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "getGenericBuffer" request to the Genericendpt server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;GenericBuffer&gt;() {

         public void onSuccess(GenericBuffer content, GoogleHeaders responseHeaders) {
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
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.genericendpt.model.GenericBuffer> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.genericendpt.model.GenericBuffer.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public GetGenericBuffer setFields(String fields) {
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

    public GetGenericBuffer setId(String id) {
      this.id = id;
      return this;
    }

  }

  /**
   * Builder for {@link Genericendpt}.
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

    /** Builds a new instance of {@link Genericendpt}. */
    @SuppressWarnings("deprecation")
    @Override
    public Genericendpt build() {
      if (isBaseUrlUsed()) {
        return new Genericendpt(
            getTransport(),
            getJsonHttpRequestInitializer(),
            getHttpRequestInitializer(),
            getJsonFactory(),
            getObjectParser(),
            getBaseUrl().build(),
            getApplicationName());
      }
      return new Genericendpt(
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
