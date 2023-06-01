package ro.ase.csie.cts.design_patterns.proxy;

public abstract class AbstractChatServerClient {
    private String serverIP;
    public abstract void sendMessage(String username, String message);
    public abstract void sendMessageToAll(String message);
    public abstract void getMessagesForUser(String username);
}
