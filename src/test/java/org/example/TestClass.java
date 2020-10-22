package org.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.apache.commons.compress.utils.ArchiveUtils;
import org.junit.Test;

public class TestClass {

  @Test
  public void test1() {
    String sdfds = ArchiveUtils.sanitize("sdfds");
    assertThat(sdfds, is("sdfds"));
  }
}
