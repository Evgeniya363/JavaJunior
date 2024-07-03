package ru.gb;

public class ListClientsRequest extends AbstractRequest {
    public static final String TYPE = "BroadcastMessage";

    public ListClientsRequest() {
        setType(TYPE);
    }
}
