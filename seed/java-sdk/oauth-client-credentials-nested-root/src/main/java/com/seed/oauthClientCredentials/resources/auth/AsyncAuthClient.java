/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.oauthClientCredentials.resources.auth;

import com.seed.oauthClientCredentials.core.ClientOptions;
import com.seed.oauthClientCredentials.core.RequestOptions;
import com.seed.oauthClientCredentials.resources.auth.requests.GetTokenRequest;
import com.seed.oauthClientCredentials.resources.auth.types.TokenResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncAuthClient {
    protected final ClientOptions clientOptions;

    private final AsyncRawAuthClient rawClient;

    public AsyncAuthClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.rawClient = new AsyncRawAuthClient(clientOptions);
    }

    /**
     * Get responses with HTTP metadata like headers
     */
    public AsyncRawAuthClient withRawResponse() {
        return this.rawClient;
    }

    public CompletableFuture<TokenResponse> getToken(GetTokenRequest request) {
        return this.rawClient.getToken(request).thenApply(response -> response.body());
    }

    public CompletableFuture<TokenResponse> getToken(GetTokenRequest request, RequestOptions requestOptions) {
        return this.rawClient.getToken(request, requestOptions).thenApply(response -> response.body());
    }
}
