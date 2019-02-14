package model.dao;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import model.vo.Ball;
import model.vo.Item;
import model.vo.Recovery;
import model.vo.Stone;

public class ItemDao {
   
   ArrayList<Item> itemList = new ArrayList<Item>();
   
   public ItemDao() {
      //ball
      Ball item0 = new Ball("������ ��",0,50,0,new ImageIcon("images/ball0").getImage(),0,70,0);
      Ball item1 = new Ball("���� ��",1,30,0,new ImageIcon("images/ball1").getImage(),0,50,1);
      Ball item2 = new Ball("���� ��",2,10,0,new ImageIcon("images/ball2").getImage(),0,20,2);
      //recovery
      Recovery item3 = new Recovery("��� ��ó��",3,30,1,new ImageIcon("images/recovery0").getImage(),0,0,100);
      Recovery item4 = new Recovery("�߱� ��ó��",4,20,1,new ImageIcon("images/recovery1").getImage(),0,1,50);
      Recovery item5 = new Recovery("�ʱ� ��ó��",5,10,1,new ImageIcon("images/recovery2").getImage(),0,2,30);
      //stone
      Stone item6 = new Stone("ȭ���� ��",6,200,2,new ImageIcon("images/stone1").getImage(),0);
      Stone item7 = new Stone("�ٴ��� ��",7,200,2,new ImageIcon("images/stone2").getImage(),0);
      Stone item8 = new Stone("������ ��",8,200,2,new ImageIcon("images/stone3").getImage(),0);
      
      //arraylist�� �ֱ�
      itemList.add(item0);
      itemList.add(item1);
      itemList.add(item2);
      itemList.add(item3);
      itemList.add(item4);
      itemList.add(item5);
      itemList.add(item6);
      itemList.add(item7);
      itemList.add(item8);
      
      
   }
   
   public ArrayList<Item> getItemList() {
      return itemList;
   }
}