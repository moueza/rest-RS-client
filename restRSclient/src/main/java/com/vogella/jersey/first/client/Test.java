package com.vogella.jersey.first.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

//import com.google.common.collect.ImmutableBiMap.Builder;

import javax.ws.rs.client.Invocation.Builder;

/** http://www.vogella.com/tutorials/REST/article.html */
public class Test {

	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();

		Client client = ClientBuilder.newClient(config);

		WebTarget target = client.target(getBaseURI());

		/** http://localhost:9025/restRS/rest/hello */
		// String response =
		// target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(Response.class).toString();

		// String plainAnswer =
		// target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		WebTarget a = target.path("rest");
		WebTarget b = a.path("hello");
		Builder c = b.request();
		Builder d = c.accept(MediaType.TEXT_PLAIN);
		String response = d.get(Response.class).toString();

		// String plainAnswer =
		// target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		WebTarget a2 = target.path("rest");
		WebTarget b2 = a2.path("hello");
		Builder c2 = b2.request();
		Builder d2 = c2.accept(MediaType.TEXT_PLAIN);
		// String plainAnswer = d2.get(String.class); //TODO par String
		String plainAnswer = d2.get(Response.class).toString();

		// String xmlAnswer =
		// target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);//TODO
		String xmlAnswer = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(Response.class)
				.toString();

		// String htmlAnswer =
		// target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);//TODO
		String htmlAnswer = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(Response.class)
				.toString();

		System.out.println(response);
		System.out.println(plainAnswer);
		System.out.println(xmlAnswer);
		System.out.println(htmlAnswer);
	}

	private static URI getBaseURI() {
		// return
		// UriBuilder.fromUri("http://localhost:8080/com.vogella.jersey.first").build();
		return UriBuilder.fromUri("http://localhost:9025/restRS").build();
	}
}