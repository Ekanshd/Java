package com.jun4;

interface Player{
	void score(int s);
}
class India{
	public void play(int s) {
		System.out.println("Current India score:"+s);
	}
}
public class InstanceMethodReferenceImpl {

	public static void main(String[] args) {
		India i1=new India();
		
		Player p1=i1::play;
		p1.score(5000/10);

	}

}
