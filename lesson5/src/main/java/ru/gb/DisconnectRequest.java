package ru.gb;

public class DisconnectRequest extends AbstractRequest{
    public static final String TYPE = "DisconnectRequest";


    public DisconnectRequest() {
        setType(TYPE);
    }

}
