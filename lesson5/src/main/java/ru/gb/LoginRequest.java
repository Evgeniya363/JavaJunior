package ru.gb;

/**
 * {
 *   "type": "login",
 *   "login": "nagibator"
 * }
 */
public class LoginRequest extends AbstractRequest {
  public LoginRequest(String login) {
    this();
    this.login = login;
  }

  public LoginRequest() {
    setType("LoginRequest");
  }

  private String login;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

}
