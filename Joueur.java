
public class Joueur {
	private String name;
	private int score;
	private boolean win;

	
	public Joueur(String name, int score, boolean win){
		this.name = name;
		this.score = score;
		this.win = win;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isWin() {
		return win;
	}
	public void setWin(boolean win) {
		this.win = win;
	}
	
}
