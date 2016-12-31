package com.digitalsanctum.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Shane Witbeck
 * @since 12/31/16
 */
@RunWith(MockitoJUnitRunner.class)
public class HandlerTest {
  
  private Handler handler;
  
  @Mock
  private Context context;
  
  @Before
  public void setup() throws Exception {
    handler = new Handler();
  }
  
  @Test
  public void testHandleRequest() throws Exception {
    String response = handler.handleRequest("Shane", context);
    assertThat(response, is("Hello, Shane"));
  }  
}
