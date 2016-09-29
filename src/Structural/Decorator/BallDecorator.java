package Structural.Decorator;

public class BallDecorator extends Decorator {
	public BallDecorator(ChristmasTree tree) {
		Branch branch = tree.getBranch();
		place(branch);
	}

	public void place(Branch branch) {
		branch.put("ball");
	}
}
