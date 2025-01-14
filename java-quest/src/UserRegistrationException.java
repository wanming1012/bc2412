public class UserRegistrationException extends Exception {
  public UserRegistrationException() {
    super();
  }
  
  public UserRegistrationException(String msg) {
    super(msg);
  }

  public UserRegistrationException(String msg, Throwable e) {
    super(msg, e);
  }
}
