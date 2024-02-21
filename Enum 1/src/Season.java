public enum Season {

    WINTER("Cold", 90), SPRING("Framework?", 92),
    SUMMER("Warm", 92), AUTUMN("In America, it's fall", 91);

    private int countOfDays;
    private String descriotion;


    Season(String descriotion, int countOfDays) {
        this.countOfDays = countOfDays;
        this.descriotion = descriotion;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public void setCountOfDays(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public String getDescriotion() {
        return descriotion;
    }

    public void setDescriotion(String descriotion) {
        this.descriotion = descriotion;
    }

    public static Season nextSeason(Season s) {

        Season[] seasons = Season.values();
        int shifter = s.ordinal() + 1;
        if (shifter == 4) {
            shifter = 0;
        }
        return seasons[shifter];

    }

}
