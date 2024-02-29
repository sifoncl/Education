public enum LoginType {


    TRACE(0),

    DEBUG(1),

    INFO(2),

    WARN(3),

    ERROR(4),

    FATAL(5);

    private int level;

    LoginType(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
