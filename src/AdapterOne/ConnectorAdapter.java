package AdapterOne;

public class ConnectorAdapter  implements Socket {
	public String getOutput() {
		Plug plug = new Plug();
		String output = plug.getInput();
		return output;
	}

}
