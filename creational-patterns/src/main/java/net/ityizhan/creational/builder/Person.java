package net.ityizhan.creational.builder;

/**
 * @ClassName Person
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/27 10:58
 * @Version V1.0.0
 **/
public class Person {

    private Integer id;
    private String name;
    private Integer age;
    private Double stature;
    private Double weight;
    private Location loc;

    /**
     * builder模式  用来构建复杂对象
     */
    public static class PersonBuilder {
        Person p = new Person();

        PersonBuilder basicInfo(Integer id, String name, Integer age) {
            p.id = id;
            p.name = name;
            p.age = age;
            return this;
        }

        PersonBuilder weight(Double weight) {
            p.weight = weight;
            return this;
        }

        PersonBuilder stature(Double stature) {
            p.stature = stature;
            return this;
        }

        PersonBuilder loc(String street, String roomNo) {
            Location loc = new Location(street, roomNo);
            p.loc = loc;
            return this;
        }

        Person build() {
            return p;
        }
    }
}