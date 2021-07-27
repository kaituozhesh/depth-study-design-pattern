package net.ityizhan.creational.prototype;

/**
 * @ClassName Location
 * @Description
 * @Author 骚豪 程序驿站: https://www.ityizhan.net
 * @Date 2021/7/27 11:12
 * @Version V1.0.0
 **/
public class Location implements Cloneable{
    private String street;
    private String roomNo;

    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getStreet() {
        return street;
    }

    public String getRoomNo() {
        return roomNo;
    }
}