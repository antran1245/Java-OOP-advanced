package com.caresoft.clinicapp;

import java.util.Date;
import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
//... imports class definition...
    
	// Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    public AdminUser(Integer id, String role) {
    	super(id);
    	employeeID = id;
    	this.role = role;
    	securityIncidents = new ArrayList<String>();
    	// TODO Auto-generated constructor stub
    }
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    @Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
    	if(pin > 99999 && pin <= 999999) {
    		return true;
    	}
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(confirmedAuthID == this.id) {
			return true;
		}
		this.authIncident();
		return false;
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return securityIncidents;
	}
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
    
    // TO DO: Setters & Getters
    
}
