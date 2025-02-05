package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  @Test
  void testBasic() {
    assertThat(Calculator.sum2(1, 2), is(equalTo(3)));
    assertThat(10, is(greaterThan(9)));
    assertThat("Hello World", containsString("Hello"));
    assertThat("Hello World", not(containsString("!")));
    String s = null;
    assertThat(s, nullValue());
    assertThat("hello", is(not(nullValue())));
  }

  @Test
  void testList() {
    List<String> names = Arrays.asList("John", "Freddy", "Sam");
    assertThat(names, hasItem("Sam"));
    assertThat(names, hasSize(3));
  }

  @Test
  void testCustomerMatcher() {
    assertThat("wanming1012@gmail.com", EmailAddressMatcher.isValid());

  }
}
