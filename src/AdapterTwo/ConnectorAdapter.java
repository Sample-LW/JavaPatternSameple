package AdapterTwo;

public class ConnectorAdapter {
	Plug5AMP plug5;
	
	public ConnectorAdapter(Plug5AMP plug) {
		this.plug5 = plug;
	}
	
	public static void main(String[] args) {
		// Taking output from the Socket
		Socket socket = new Socket();
		String outputFromSocket = socket.getOutput();
		
		// Giving away input to the Plug
		ConnectorAdapter adapter = new ConnectorAdapter(new Plug5AMP());
		String inputToPlug = adapter.getAdapterOutput(outputFromSocket);
		System.out.println("New output by adapter is: " + inputToPlug);
	}
	
	public String getAdapterOutput(String outputFromSocket) {
		// If output is same, return
		if(outputFromSocket.equals(plug5.getInput())) {
			return outputFromSocket;
		}
		// Else, override the value by adapterOutput
		else {
			String adapterOutput = plug5.getInput();
			return adapterOutput;
		}
	}
}

//This is how the Adapter pattern works. When one interface cannot be changed and has to be suited to the again 
// cannot-be-changed client, an adapter is used so that both the interfaces can work together.