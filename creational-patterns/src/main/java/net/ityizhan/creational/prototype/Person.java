package net.ityizhan.creational.prototype;

import java.io.Serializable;

/**
 * @ClassName Person
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/27 11:12
 * @Version V1.0.0
 **/
public class Person implements Cloneable {
    private Integer age = 18;
    private Integer score = 100;

    private Location loc = new Location("首南街道", "99号");

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.loc = (Location) loc.clone();
        return p;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getScore() {
        return score;
    }

    public Location getLoc() {
        return loc;
    }
}