package AbstractFactory1;

public class PC extends Computer {

	@Override
	public Parts getRAM() {
		// TODO Auto-generated method stub
		return new Parts("512 MB");
	}

	@Override
	public Parts getProcessor() {
		// TODO Auto-generated method stub
		return new Parts("Celeron");
	}

	@Override
	public Parts getMonitor() {
		// TODO Auto-generated method stub
		return new Parts("15 inches");
	}

}
