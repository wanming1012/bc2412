public class LoginManager {
  private String username;
  private String password;

  public LoginManager(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public static class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
      super(message);
    }
  }

  public static class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
      super(message);
    }
  }

  // Throw IllegalArgumentException if String username is null or empty string
  public void validateUsername() {
    if (this.username == null || this.username.isEmpty()) {
      throw new InvalidUsernameException("Username is invalid: " + this.username);
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  public void validatePassword() {
    if (this.password == null || this.password.length() < 8 || 
    (!this.password.contains("!") && !this.password.contains("@") && !this.password.contains("$") &&  
     !this.password.contains("&") && !this.password.contains("_"))) {
      throw new InvalidPasswordException("Password is invalid: " + this.password);
    }
  }

  // Throw IllegalArgumentException if String username is null or empty string
  public void validateUsername2() {
    if (this.username == null || this.username.isEmpty()) {
      throw BusinessRuntimeException.of(SysError.INVALID_USERNAME);
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  public void validatePassword2() {
    if (this.password == null || this.password.length() < 8 || 
    (!this.password.contains("!") && !this.password.contains("@") && !this.password.contains("$") &&  
     !this.password.contains("&") && !this.password.contains("_"))) {
      throw BusinessRuntimeException.of(SysError.INVALID_PASSWORD);
    }
  }

  public static void main(String[] args) {
    LoginManager loginManager = new LoginManager("jackwong", "abcd1234");
    System.out.println("Approach 1");
    try {
      loginManager.validateUsername();
      loginManager.validatePassword();
      System.out.println("Login Success.");
    } catch (InvalidUsernameException e) {
      System.out.println(e.getMessage());
    } catch (InvalidPasswordException e) {
      System.out.println(e.getMessage());
    }

    // approach 2
    System.out.println("Approach 2");
    try {
      loginManager.validateUsername2();
      loginManager.validatePassword2();
      System.out.println("Login Success.");
    } catch (BusinessRuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}
