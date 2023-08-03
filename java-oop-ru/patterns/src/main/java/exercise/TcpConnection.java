package exercise;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection currentState;
    private String ipAddress;
    private int port;

    public TcpConnection(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.currentState = new Disconnected(this);
    }

    public void changeState(Connection state) {
        this.currentState = state;
    }

    public String getCurrentState() {
        return currentState.getCurrentState();
    }

    public void write(String data) {
        currentState.write(data);
    }

    public void connect() {
        currentState.connect();
    }

    public void disconnect() {
        currentState.disconnect();
    }
}
// END
