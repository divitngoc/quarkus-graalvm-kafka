package com.divitngoc.resource;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import com.divitngoc.model.Collaborator;

/**
 *
 * This endpoint is meant for testing. See also collaborators.html in resources
 *
 */
@Path("/collaborators")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Collaborators API", description = "Testing API for devs")
public class CollaboratorResource {

    private Set<Collaborator> collaborators = Collections.synchronizedSet(new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName())));

    public CollaboratorResource() {
        collaborators.add(Collaborator.builder().name("Divit").yoe(2).build());
        collaborators.add(Collaborator.builder().name("Derrick").yoe(2).build());
        collaborators.add(Collaborator.builder().name("John").yoe(2.5).build());
        collaborators.add(Collaborator.builder().name("Yassine").yoe(2.5).build());
        collaborators.add(Collaborator.builder().name("Andrei").yoe(1.5).build());
    }

    @GET
    @APIResponse(content = @Content(schema = @Schema(implementation = Collaborator.class, type = SchemaType.ARRAY)))
    public Set<Collaborator> list() {
        return collaborators;
    }

    @POST
    @APIResponse(content = @Content(schema = @Schema(implementation = Collaborator.class, type = SchemaType.ARRAY)))
    public Set<Collaborator> add(final Collaborator collab) {
        collaborators.add(collab);
        return collaborators;
    }

    @DELETE
    @APIResponse(content = @Content(schema = @Schema(implementation = Collaborator.class, type = SchemaType.ARRAY)))
    public Set<Collaborator> delete(final Collaborator collab) {
        collaborators.removeIf(collaborator -> collaborator.getName().contentEquals(collab.getName()));
        return collaborators;
    }

}