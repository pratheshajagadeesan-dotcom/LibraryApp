package org.example.exceptions;

public class MemberLimitException
        extends Exception {

    public MemberLimitException(
            String message) {

        super(message);
    }
}