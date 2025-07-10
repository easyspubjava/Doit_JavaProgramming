package enumclass;

public enum GameLevel {
    BEGINNER_LEVEL(1, "초보자"),
    ADVANCED_LEVEL(2, "숙련자"),
    SUPER_LEVEL(3, "고수");

    private int level;
    private String name;

    GameLevel(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        GameLevel gameLevel = GameLevel.ADVANCED_LEVEL;
        System.out.println(gameLevel.getName());
    }

}
