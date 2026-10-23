package com.pronoide.ddd.domain.model;

public abstract class DomainException extends RuntimeException {

  protected DomainException(String message) {
    super(message);
  }
}