/**
 * 
 */
package com.seedbackend.service;

import java.io.IOException;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;




/**
 * @author Abdenour BAHLOUL
 *
 */
@Path("/indicateur")

@ManagedBean
public class WebserviceExample {


	@Inject
	private ServiceBean serviceBean;


	ServiceBean service = new ServiceBean();

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) throws JsonGenerationException, JsonMappingException, IOException {

		String output  = serviceBean.bouchonDonnees().get(0).getChampA();

		return Response
				.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers",
						"origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", 
						"GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(output)
				.build();
	}

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsgJson() throws JsonGenerationException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();

		String jsonInString = mapper.writeValueAsString(serviceBean.bouchonDonnees().get(0));
		String jsonInString1 = mapper.writeValueAsString(serviceBean.bouchonDonnees().get(1));
		String jsonInString2 = mapper.writeValueAsString(serviceBean.bouchonDonnees().get(2));
		String jsonInString3 = mapper.writeValueAsString(serviceBean.bouchonDonnees().get(3));
		String jsonInString4 = mapper.writeValueAsString(serviceBean.bouchonDonnees().get(4));
		String jsonInString5 = mapper.writeValueAsString(serviceBean.bouchonDonnees().get(5));
		String jsonInString6 = mapper.writeValueAsString(serviceBean.bouchonDonnees().get(6));

		String output = "[" + jsonInString + "," 
				+ jsonInString1 + "," 
				+ jsonInString2 + ","
				+ jsonInString3 + ","
				+ jsonInString4 + ","
				+ jsonInString5 + ","
				+ jsonInString6  + "]";

		return Response
				.status(200)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Credentials", "true")
				.header("Access-Control-Allow-Headers",
						"origin, content-type, accept, authorization")
				.header("Access-Control-Allow-Methods", 
						"GET, POST, PUT, DELETE, OPTIONS, HEAD")
				.entity(output)
				.build();

	}


}
