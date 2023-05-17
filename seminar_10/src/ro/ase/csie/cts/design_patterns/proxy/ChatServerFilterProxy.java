package ro.ase.csie.cts.design_patterns.proxy;

import java.util.ArrayList;

public class ChatServerFilterProxy extends AbstractChatServerClient {
    AbstractChatServerClient chatServer;
    ArrayList<String> forbiddenWordsList = new ArrayList<>();

    public ChatServerFilterProxy(AbstractChatServerClient chatServer) {
        super();
        this.chatServer = chatServer;
        this.forbiddenWordsList.add("hate");
        this.forbiddenWordsList.add("hit");
    }

    @Override
    public void sendMessage(String username, String message) {
        if (this.isMessageValid(message))
            this.chatServer.sendMessage(username, message);
    }

    @Override
    public void sendMessageToAll(String message) {
        if (this.isMessageValid(message))
            this.chatServer.sendMessageToAll(message);
    }

    @Override
    public void getMessagesForUser(String username) {
        this.chatServer.getMessagesForUser(username);
    }

    private boolean isMessageValid(String message) {
        for(String word : forbiddenWordsList) {
            if (message.toLowerCase().contains(word))
                return false;
        }
        return true;
    }
}
