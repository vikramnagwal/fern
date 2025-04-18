/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.object;

import com.seed.object.core.ClientOptions;
import com.seed.object.core.Environment;

public final class SeedObjectClientBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private Environment environment;

    public SeedObjectClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    /**
     * Sets the timeout (in seconds) for the client
     */
    public SeedObjectClientBuilder timeout(int timeout) {
        this.clientOptionsBuilder.timeout(timeout);
        return this;
    }

    public SeedObjectClient build() {
        clientOptionsBuilder.environment(this.environment);
        return new SeedObjectClient(clientOptionsBuilder.build());
    }
}
