package codewarsstylerankingsystem;

public class User {

	protected final int[] ranksToShow = { -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8 };
	protected int rank;
	protected int rankCounter;
	protected int progress;
	protected final int progressThreshold = 100;

	public User() {
		this.rankCounter = 0;
		this.rank = ranksToShow[rankCounter];
		this.progress = 0;
	}

	int rank() {
		return this.rank;
	}

	int progress() {
		return this.progress;
	}

	void incProgress(int rank) throws IllegalArgumentException {

		if (rank < -8 || rank == 0 || rank > 8) {
			throw new IllegalArgumentException();
		}

		int ranksToAdd = 0;
		int ranksDifference = 0;


		if (this.rank < 0 && rank > 0) {
			ranksDifference = rank - this.rank - 1;
		} else if (this.rank > 0 && rank < 0) {
			ranksDifference = rank - this.rank + 1;
		} else {
			ranksDifference = rank - this.rank;
		}

		if (this.rank == 8) {
			return;
		}

		switch (ranksDifference) {
		case 0:
			this.progress += 3;
			break;
		case -1:
			this.progress += 1;
			break;
		case -2:
		case -3:
		case -4:
		case -5:
		case -6:
		case -7:
		case -8:
		case -9:
		case -10:
		case -11:
		case -12:
		case -13:
		case -14:
		case -15:
			break;
		default:
			this.progress += (10 * ranksDifference * ranksDifference);
			break;
		}

		if (this.progress >= progressThreshold) {
			ranksToAdd = this.progress / progressThreshold;
			this.progress = this.progress % 100;
		}

		this.rankCounter += ranksToAdd;
		if (this.rankCounter >= 15) {
			this.rankCounter = 15;
			this.progress = 0;
		}
		this.rank = ranksToShow[rankCounter];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		System.out.println(user.rank());
		System.out.println(user.progress());
		user.incProgress(1);
		System.out.println(user.rank());
		System.out.println(user.progress());
		user.incProgress(-1);
		System.out.println(user.rank());
		System.out.println(user.progress());

	}

}
