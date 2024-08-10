package application;

public class ParametrosInvalidosException extends Exception {

    public String msg;

    public ParametrosInvalidosException(String msg) {
        this.msg = msg;
    }
}
