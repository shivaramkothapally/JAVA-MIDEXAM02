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
public class jobholder extends Person {
	
	private int jobholderId;
	
	public jobholder(String name, String gender, int jobholderid) {
		super(name, gender);
		this.jobholderId=jobholderid;
	}

	@Override
	public void work() {
		if(this.jobholderId == 0){
			System.out.println("Not doing anywork");
		}else{
			System.out.println("doing some work!!");
		}
	}

    @Override
    public String toString() {
        return "jobholder{" + "jobholderId=" + jobholderId + '}';
    }
        
}
