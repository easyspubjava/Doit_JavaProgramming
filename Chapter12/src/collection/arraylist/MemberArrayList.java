package collection.arraylist;

import collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList(){
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member){  //ArrayList �� ��� �߰�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId){
		
		for(int i =0; i<arrayList.size(); i++){
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId){
				arrayList.remove(i);
				return true;
			}
		}
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;                   
	}
	
	public void showAllMember(){

		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()){
			Member member = ir.next();
			System.out.println(member);
		}

	}
}
