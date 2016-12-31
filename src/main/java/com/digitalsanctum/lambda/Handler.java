package com.digitalsanctum.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.log4j.Logger;

public class Handler implements RequestHandler<String, String> {
  
  private static final Logger log = Logger.getLogger(Handler.class);
  
  public String handleRequest(String input, Context context) {
    log.info("reached handleRequest");
    return String.format("Hello, %s", input);
  }
}
