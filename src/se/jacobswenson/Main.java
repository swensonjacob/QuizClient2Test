package se.jacobswenson;

public class Main {

public static void runner(){
    ServerHandler serverHandler = new ServerHandler();
    Gui gui = new Gui(serverHandler);
    serverHandler.setGui(gui);
    new Thread(serverHandler).start();
}
    public static void main(String[] args) {
       runner();

    }
}
