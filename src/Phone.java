public class Phone {
    private String fromNumb, toNumb;
    private int minutes, remains;
    static int [][] tar = new int[][] {
            {927, 846, 2},
            {927, 917, 1},
            {927, 902, 1},
            {927, 495, 3},
            {927, 812, 4}
    };

    public String getToNumb() {
        return toNumb;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getRemains() {
        return remains;
    }

    public String getFromNumb() {
        return fromNumb;
    }

    public void setFromNumb(String fromNumb) {
        this.fromNumb = fromNumb;
    }

    public void setToNumb(String toNumb) {
        this.toNumb = toNumb;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setRemains(int remains) {
        this.remains = remains;
    }

    public void isCalling(String in, String out, int longcall) {
        this.setFromNumb(in);
        this.setToNumb(out);
        this.setMinutes(longcall);
    }
}

