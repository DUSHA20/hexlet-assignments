package exercise.connections;

// BEGIN
public class Disconnected implements Connection {
    private Connection connection;

    public Disconnected(Connection connection) {
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
