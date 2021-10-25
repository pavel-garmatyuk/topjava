public class Player {
    private final String name;
    private int number;
    private boolean isWinner;

    public Player(String name) {
        this.name = name;
        this.isWinner = false;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }
}
