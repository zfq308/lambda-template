package com.digitalsanctum.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<String, String> {
  public String handleRequest(String input, Context context) {
    return String.format("Hello, %s", input);
  }
}
