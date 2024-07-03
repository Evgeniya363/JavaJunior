package ru.gb;

/**
 * {
 *   "type": "users"
 * }
 */
public class ListRequest extends AbstractRequest{
  public static final String TYPE = "ListRequest";


  public ListRequest() {
    setType(TYPE);
  }

}
