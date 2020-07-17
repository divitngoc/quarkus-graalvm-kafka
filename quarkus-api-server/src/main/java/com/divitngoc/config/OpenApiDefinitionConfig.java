package com.divitngoc.config;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

/*
 * 
 * Because a JAX-RS Application class is not required in Quarkus, we will likely have to create one. It can simply be an empty class
 *  that extends javax.ws.rs.core.Application. This empty class can then be annotated with various OpenAPI annotations
 *   such as @OpenAPIDefinition.
 * 
 */

// @formatter:off
@OpenAPIDefinition(info = @Info(
                       title="Quarkus API",
                       version = "1.0.0",
                       contact = @Contact(
                           name = "Divit Bui",
                           email = "divitngoc@gmail.com"),
                       license = @License(
                           name = "Apache 2.0",
                           url = "http://www.apache.org/licenses/LICENSE-2.0.html"))
                   )
//@formatter:on
public class OpenApiDefinitionConfig extends Application {}
