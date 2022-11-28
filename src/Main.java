import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UDPClient client = new UDPClient();
        System.out.println(client.sendEcho("Hello"));
    }
}
