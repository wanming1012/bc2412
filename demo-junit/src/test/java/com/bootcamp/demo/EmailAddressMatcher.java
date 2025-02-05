package com.bootcamp.demo;

import org.hamcrest.TypeSafeMatcher;

public class EmailAddressMatcher extends TypeSafeMatcher<String> {
  @Override
  protected boolean matchesSafely(String email) {
    return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
  }

  @Override
  public void describeTo(org.hamcrest.Description description) {
    description.appendText("valid email address");
  }

  public static EmailAddressMatcher isValid() {
    return new EmailAddressMatcher();
  }
  
}
