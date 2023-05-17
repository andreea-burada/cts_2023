package ro.ase.csie.cts.design_patterns.proxy;

public class ChatServerClient extends AbstractChatServerClient {
    @Override
    public void sendMessage(String username, String message) {
        System.out.printf("Sending message \"%s\" to %s ...%n",
                message,
                username
        );
    }

    @Override
    public void sendMessageToAll(String message) {
        System.out.printf("Sending message \"%s\" to all ...%n", message);
    }

    @Override
    public void getMessagesForUser(String username) {
        System.out.printf("Getting messages for user %s%n", username);
    }
}
