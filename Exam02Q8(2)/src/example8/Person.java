/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example8;

/**
 *
 * @author S542269
 */
public abstract class Person {
	
	private String name;
	private String gender;
	
	public Person(String name, String gender){
		this.name=name;
		this.gender=gender;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name="+this.name+"::Gender="+this.gender;
	}

	
}

