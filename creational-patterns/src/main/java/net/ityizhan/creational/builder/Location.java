package net.ityizhan.creational.builder;

/**
 * @ClassName Location
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/27 11:00
 * @Version V1.0.0
 **/
public class Location {
    private String street;
    private String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}