package com.example.basic.exception;

public class ApplicationNotFoundException extends RuntimeException {
  public ApplicationNotFoundException(String exception) {
    super(exception);
}

}
