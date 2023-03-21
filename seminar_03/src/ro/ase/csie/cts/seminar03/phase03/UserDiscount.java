package ro.ase.csie.cts.seminar03.phase03;

public class UserDiscount {
    public static final int MIN_ACCOUNT_AGE = 10;
    public static final float MAX_USER_BONUS = 0.15f;

    public static float GetUserDiscount(int userAccountAge) {
        return (userAccountAge > MIN_ACCOUNT_AGE) ? MAX_USER_BONUS : (float) userAccountAge / 100;
    }
}
