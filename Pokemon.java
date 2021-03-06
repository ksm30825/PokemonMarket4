package model.vo;

import java.awt.Image;
import java.util.ArrayList;

public class Pokemon {
	
	private String pName;	//포켓몬 이름
	private int pNo;		//포켓몬 번호
	private int pLevel;		//포켓몬 레벨
	private int pType;		//포켓몬 타입 -> 0 : 노말 / 1 : 불 / 2 : 물 / 3 : 풀
	private int pHp;		//포켓몬 HP
	private int pSpeed;		//포켓몬 스피드
	private Item pItem;		//포켓몬 아이템
	private boolean pEvoType;	//포켓몬 진화 방법 -> true : 진화의 돌 / false : 레벨업
	private Image pImg;		//포켓몬 이미지
	private int grade;		//포켓몬 등급 -> 0 : 상 / 1 : 중 / 2 : 하
	
	private int exp;		//현재 경험치
	private int pMaxExp;	//최대 경험치, 맥스에 도달하면 레벨업
	private int setExp;		//잡으면 얻게 되는 경험치
	
	private ArrayList<Skill> pSkill;		//포켓몬 스킬
	
	
	public Pokemon() {}
	
	public Pokemon(String pName, int pNo, int pType, boolean pEvoType, Image pImg, int grade) {
		this.pName =pName;
		this.pNo =pNo;
		this.pType = pType;
		this.pEvoType = pEvoType;
		this.pImg = pImg;
		this.grade = grade;
		
		
	}
	
	public Pokemon(String pName, int pNo, int pLevel, int pType, int pHp, int pSpeed, Item pItem,
			boolean pEvoType, Image pImg, int grade, int exp, int pMaxExp, int setExp) {
		this.pName = pName;  //1
		this.pNo = pNo;      //2
		this.pLevel = pLevel;
		this.pType = pType;  //3
		this.pHp = pHp;
		this.pSpeed = pSpeed;
		this.pItem = pItem;
		this.pEvoType = pEvoType;  //4
		this.pImg = pImg;          //5
		this.grade = grade;        //6
		this.exp = exp;
		this.pMaxExp = pMaxExp;
		this.setExp = setExp;
	}


	public String getpName() {
		return pName;
	}


	public int getpNo() {
		return pNo;
	}


	public int getpLevel() {
		return pLevel;
	}


	public int getpType() {
		return pType;
	}


	public int getpHp() {
		return pHp;
	}


	public int getpSpeed() {
		return pSpeed;
	}


	public Item getpItem() {
		return pItem;
	}


	public boolean ispEvoType() {
		return pEvoType;
	}


	public Image getpImg() {
		return pImg;
	}


	public int getGrade() {
		return grade;
	}


	public int getExp() {
		return exp;
	}


	public int getpMaxExp() {
		return pMaxExp;
	}


	public int getSetExp() {
		return setExp;
	}


	public ArrayList getpSkill() {
		return pSkill;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public void setpNo(int pNo) {
		this.pNo = pNo;
	}


	public void setpLevel(int pLevel) {
		this.pLevel = pLevel;
	}


	public void setpType(int pType) {
		this.pType = pType;
	}


	public void setpHp(int pHp) {
		this.pHp = pHp;
	}


	public void setpSpeed(int pSpeed) {
		this.pSpeed = pSpeed;
	}


	public void setpItem(Item pItem) {
		this.pItem = pItem;
	}


	public void setpEvoType(boolean pEvoType) {
		this.pEvoType = pEvoType;
	}


	public void setpImg(Image pImg) {
		this.pImg = pImg;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public void setpMaxExp(int pMaxExp) {
		this.pMaxExp = pMaxExp;
	}


	public void setSetExp(int setExp) {
		this.setExp = setExp;
	}


	public void setpSkill(ArrayList pSkill) {
		this.pSkill = pSkill;
	}
}
