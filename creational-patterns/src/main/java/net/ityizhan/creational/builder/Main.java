package net.ityizhan.creational.builder;

/**
 * @ClassName Main
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/27 11:04
 * @Version V1.0.0
 **/
public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().basicInfo(1, "tom", 18)
                .stature(189.5D)
                .weight(75D)
                .loc("首南街道", "959号")
                .build();


    }
}