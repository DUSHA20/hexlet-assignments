package exercise.connections;

// BEGIN
public class Disconnected implements Connection {
    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        tcpConnection.changeState(new Connected(tcpConnection));
        System.out.println("Connection established");
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public void write(String data) {
        System.out.println("Error! Cannot write data. Connection is not established");
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }
}
// END
