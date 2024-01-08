/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;
    private Candidate candidate;
   
    public Experience(Candidate candidate,int expInYear, String proSkill) {
        this.candidate = candidate;
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
    
    public Experience(int CandidateId, String Firstname, String Lastname, int Birthdate, String Address, String Phone, String Email, int Candidatetype,int expInYear, String proSkill) {
        super(CandidateId, Firstname, Lastname, Birthdate, Address, Phone, Email, Candidatetype);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
     
    public int getexpInYear() {
        return expInYear;
    }

    public void setexpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getproSkill() {
        return proSkill;
    }

    public void setproSkill(String proSkill) {
        this.proSkill = proSkill;
    }

   @Override
    public String toString() {
        return  candidate.CandidateId + "|" + candidate.Firstname + "|" + candidate.Lastname +  "|" + candidate.Address + "|" + candidate.Phone + "|" + candidate.Email + "|" + candidate.Candidatetype ;
    }
    
}
