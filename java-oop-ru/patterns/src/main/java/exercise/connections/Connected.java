package exercise.connections;

// BEGIN
import exercise.TcpConnection;

public class Connected implements Connection {
    private TcpConnection tcpConnection;

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        System.out.println("Error! Connection already established");
    }

    @Override
    public void disconnect() {
        tcpConnection.changeState(new Disconnected(tcpConnection));
        System.out.println("Connection disconnected");
    }

    @Override
    public void write(String data) {
        System.out.println("Writing data: " + data);
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }
}
// END
