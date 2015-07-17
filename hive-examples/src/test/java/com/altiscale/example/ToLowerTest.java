package com.altiscale.example;

import junit.framework.Assert;

import org.apache.hadoop.io.Text;
import org.junit.Test;

public class ToLowerTest {
  
  @Test
  public void testUDF() {
    ToLower example = new ToLower();
    Assert.assertEquals("tolower", example.evaluate(new Text("TOLOWER")).toString());
  }
  
  @Test
  public void testUDFNullCheck() {
    ToLower example = new ToLower();
    Assert.assertNull(example.evaluate(null));
  }
}
