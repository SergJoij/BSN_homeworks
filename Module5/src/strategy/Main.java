package strategy;

import strategy.wall.Brick;
import strategy.wall.Wooden;

public class Main {
    static public void main(String[] args){
        // �������, �����������, ��������� �������
        House mansion = new Mansion(3, 100f, new Brick());
        // 2-���������� ����������� ���������� ��������������� ���
        House townHouse = new TownHouse(2, 74f, new Wooden());

        System.out.println(mansion.getPrice());
        System.out.println(townHouse.getPrice());
    }
}
