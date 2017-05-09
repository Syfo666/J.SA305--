
public class Star  {
	int x;
	int y;
	int z;

	public Star() {
		super();
		this.x = (int) (Math.random() * Board.width);
		this.y = (int) (Math.random() * Board.height);
		this.z = (int) (Math.random() * Board.width);
			}

	
	public void show() {

	}


}
