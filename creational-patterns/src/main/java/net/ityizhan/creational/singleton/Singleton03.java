package net.ityizhan.creational.singleton;

/**
 * @ClassName Singleton03
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/21 15:22
 * @Version V1.0.0
 **/
public class Singleton03 {
    private static class SingletonInstance {
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private Singleton03() {

    }

}