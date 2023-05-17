package ro.ase.csie.cts.design_patterns.proxy;

public class TestProxy {
    public static void main(String[] args) {
        AbstractChatServerClient chatServer = new ChatServerClient();
        chatServer.sendMessage("Luke", "Vader is coming!");
        chatServer.sendMessageToAll("May the force be with you!");

        System.out.println();

        // with proxy
        chatServer = new ChatServerFilterProxy(chatServer);
        chatServer.sendMessage("Luke", "Vader is coming! He will hit you!");
        chatServer.sendMessageToAll("May the force be with you!");
    }
}
