package edu.mum.main;

 import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import edu.mum.rest.service.ProductRestService;

 	public class RestConfig extends ResourceConfig {
		
		public RestConfig() {
  
 		    register(RequestContextFilter.class);   // Filter to provide a bridge between JAX-RS and Spring request attributes.
 		    register(ProductRestService.class);
		}
	}

