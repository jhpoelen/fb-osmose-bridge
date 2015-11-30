package com.github.jhpoelen.fbob;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;

@Path("config")
public class Config {

    @GET
    @Produces("application/zip")
    public Response configArchive() {
        return Response.ok(getClass().getResourceAsStream("osmose_config.zip")).header("Content-Disposition", "attachment; filename=osmose_config.zip").build();
    }
}