package enumtest;

public enum Color {
    RED(1),
    GREEN(2),
    BLANK(3),
    YELLOW(4);

    private int number;
    private Color(int number){
        this.number = number;
    }


}
