package org.edu;

public class Education extends Arts{
	public void ug() {
		System.out.println("Under Graduate - B.Arch.,");		
	}
    public void pg() {
    	System.out.println("Post Graduate - M.Arch.,");	
	}
    public static void main(String[] args) {
		Education e = new Education();
		e.ug();
		e.pg();
		e.bsc();
		e.bed();
		e.ba();
		e.bba();
		e.be();
		e.btech();
		e.physio();
		e.dental();
		e.mbbs();
	}
}
