package exercise.connections;

// BEGIN
//import exercise.TcpConnection;

public class Connected implements Connection {
    private Connection connection;

    public Connected(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void write(String data) {
        System.out.println("Writing data: " + data);
    }

    @Override
    public void connect() {
        System.out.println("Error! Connection already established.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting...");
        connection.changeState(new Disconnected(connection));
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }
}
// END
