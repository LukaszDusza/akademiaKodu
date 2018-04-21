package serverTCP;

public class Main {

    public static void main(String[] args) {

        ServerTCP server8080 = new ServerTCP("server8080", 8081);

        server8080.start();
    }
}
