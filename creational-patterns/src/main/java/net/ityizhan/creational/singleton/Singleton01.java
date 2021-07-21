package net.ityizhan.creational.singleton;

/**
 * @ClassName Singleton01
 * @Description 饿汉式
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/21 15:05
 * @Version V1.0.0
 **/
public class Singleton01 {

    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}