package net.ityizhan.creational.prototype;

/**
 * @ClassName Main
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/27 13:18
 * @Version V1.0.0
 **/
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println("p1.loc == p2.loc? " + (p1.getLoc() == p2.getLoc()));
    }

}