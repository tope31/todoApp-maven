package todoEnums;

public enum Status {
    OPEN(0, "OPEN"),
    DONE(1, "DONE");

    private String message;
    private int code;

    Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
