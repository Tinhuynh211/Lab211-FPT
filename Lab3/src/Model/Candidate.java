
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Candidate {
   protected int CandidateId;
   protected String Firstname;
   protected String Lastname;
   protected int Birthdate;
   protected String Address;
   protected String Phone;
   protected String Email;
   protected int Candidatetype;
   public Candidate(){
}

    public Candidate(int CandidateId, String Firstname, String Lastname, int Birthdate, String Address, String Phone, String Email, int Candidatetype) {
        this.CandidateId = CandidateId;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Birthdate = Birthdate;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.Candidatetype = Candidatetype;
    }

    public int getCandidateId() {
        return CandidateId;
    }

    public void setCandidateId(int CandidateId) {
        this.CandidateId = CandidateId;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public int getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(int Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCandidatetype() {
        return Candidatetype;
    }

    public void setCandidatetype(int  Candidatetype) {
        this.Candidatetype = Candidatetype;
    }

    @Override
    public String toString() {
        return " " + Firstname + " " + Lastname +  "|" + Address + "| " + Phone + "|" + Email + "|" + Candidatetype ;
    }
    
}
