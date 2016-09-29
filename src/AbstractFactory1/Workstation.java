package AbstractFactory1;

public class Workstation extends Computer{

	@Override
	public Parts getRAM() {
		// TODO Auto-generated method stub
		return new Parts("1 GB");
	}

	@Override
	public Parts getProcessor() {
		// TODO Auto-generated method stub
		return new Parts("Intel P 3");
	}

	@Override
	public Parts getMonitor() {
		// TODO Auto-generated method stub
		return new Parts("19 inches");
	}
	
}
