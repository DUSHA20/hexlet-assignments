package exercise.connections;

// BEGIN
import exercise.TcpConnection;

public class Disconnected implements Connection {
    private TcpConnection connection;

    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void write(String data) {
        System.out.println("Error! Cannot write data. Connection is not established.");
    }

    @Override
    public void connect() {
        System.out.println("Connecting...");
        connection.changeState(new Connected(connection));
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection already disconnected.");
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }
}
// END
