package AbstractFactory1;

public class Server extends Computer{

	@Override
	public Parts getRAM() {
		// TODO Auto-generated method stub
		return new Parts("4 GB");
	}

	@Override
	public Parts getProcessor() {
		// TODO Auto-generated method stub
		return new Parts("Intel P 4");
	}

	@Override
	public Parts getMonitor() {
		// TODO Auto-generated method stub
		return new Parts("17 inches");
	}

}
