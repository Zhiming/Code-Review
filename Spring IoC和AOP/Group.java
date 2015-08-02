package ac.nz.unitec.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Group {
	Set<User> set = new HashSet<User>();
	List<User> list = new LinkedList<User>();
	Map<Integer, User> map = new HashMap<Integer, User>();

	public Set<User> getSet() {
		return set;
	}

	public void setSet(Set<User> set) {
		this.set = set;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public Map<Integer, User> getMap() {
		return map;
	}

	public void setMap(Map<Integer, User> map) {
		this.map = map;
	}
	
	public void aopIsAround(String msgFromAdvisor){
		System.out.println("in group, msgFromAdvisor: " + msgFromAdvisor);
	}
	
	public void aopIsBefore(){
		System.out.println("in group");
	}
	
	public void aopWhenThrow() throws Exception{
		System.out.println("In try in group");
		throw new Exception();
	}

}
