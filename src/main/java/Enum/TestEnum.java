package Enum;

public class TestEnum {

    // private static final int DOG = 0;
    //  private static final int CAT = 1;
    // private static final int FROG = 2;

    public static void main(String[] args) {
//        Season season = Season.AUTUMN;
//        Animal animal = Animal.CAT;
//        System.out.println(season.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season winter = Season.AUTUMN;
        System.out.println(winter.ordinal());


    }
}
