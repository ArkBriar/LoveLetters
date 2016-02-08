public class LoveYouMoreEveryDay {
    static Integer MAX_OF_LOVE = 2147483647;

    public static void whenWeFallInLove() {
        int myLoveToYou = 100;
        int theDayWeMessSinceEpoch = 16782;
        while (myLoveToYou < MAX_OF_LOVE) {
            if (aDayHasGone()) {
                theDayWeMessSinceEpoch++;
                myLoveToYou++;
            }
        }
    }
}
