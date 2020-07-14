package com.divitngoc.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import io.vertx.core.http.HttpServerRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Provider
public class LoggingRequestFilter implements ContainerRequestFilter {

    @Context
    private UriInfo info;

    @Context
    private HttpServerRequest request;

    @Override
    public void filter(ContainerRequestContext context) {

        final String method = context.getMethod();
        final String path = info.getPath();
        final String address = request.remoteAddress().toString();

        log.info("Request: {} {} from IP {}", method, path, address);
    }
}