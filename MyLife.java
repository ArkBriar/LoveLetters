import java.util.*;
public class MyLife {
    static protected volatile boolean alive = true;
    static protected volatile Boy wtashi = new Boy();
    static protected volatile Girl kanojyou = null;

    public static void main(String[] args) {

        new Thread(
                () -> {
                    while(alive) {
                        doSomeThings();
                        System.out.println("我用自己的双腿 "
                                + "开始了奔跑");

                        try {
                            doFunThings(watashi, kanojyo);
                            System.out.println("谢谢你拭去堆积在我身上的灰尘。"
                                    + "其实从很久以前，我的世界就改变了，只是我没有察觉。"
                                    + "谢谢你与我相遇！"
                                    + "从那天开始，在我的世界里......"
                                    + "连键盘也变得色彩缤纷。");

                            kanojyo.dreams.stream()
                                .forEach(watashi::addThingsToDo);
                            System.out.println("迎接我们的也许是漆黑一片的夜路，"
                                    + "即便如此，也要相信自己，勇往直前。"
                                    + "星空会为我们在这条道路上点缀出淡淡星光。");
                        } catch (NullPointerException e) {
                            System.out.println(
                                    "每当心情郁闷的时候，用手托腮就好。手臂会因为帮上忙而开心的。");
                        }
                    }
                    System.out.println("要和我一起殉情吗？骗你的...我就是说说看。");
                }
        ).start();

        new Thread(
                () -> {
                    System.out.println("人啊，总是盲目地去爱啊.....");
                    while(null == kanojyo){
                        waiting();
                        Girl anata = new Girl(new Scanner(System.in).nextLine());
                        System.out.println("就好像看透了我的心思一般，你突然出现......");
                        kanojyo = new Kanojyo(anata);
                        System.out.println("\u2665"
                                + "所看到的 所听到的 所感受到的"
                                + "我周围的风景 全部都"
                                + "开始染成了绚丽多彩的颜色"
                                + "世界在散发着光辉");
                    }
                    System.out.println("喜欢的人喜欢别人不是很正常吗。");
                }
        ).start();
    }
}
