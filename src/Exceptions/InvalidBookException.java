package Exceptions;

class InvalidBookException extends Exception {
    public InvalidBookException(String message) {
        super(message);
    }
}