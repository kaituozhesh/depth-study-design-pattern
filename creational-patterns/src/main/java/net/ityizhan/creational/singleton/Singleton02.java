package net.ityizhan.creational.singleton;

/**
 * @ClassName Singleton02
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/21 15:09
 * @Version V1.0.0
 **/
public class Singleton02 {
    private static Singleton02 INSTANCE;

    private Singleton02() {

    }

    public static synchronized Singleton02 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }
}