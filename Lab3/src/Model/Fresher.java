/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Fresher extends Candidate{
    private int Graduationdate;
    private String Graduationrank;
    private String Education;   
    private Candidate candidate;

    public Fresher(int Graduationdate, String Graduationrank, String Education, Candidate candidate) {
        this.Graduationdate = Graduationdate;
        this.Graduationrank = Graduationrank;
        this.Education = Education;
        this.candidate = candidate;
    }

    public Fresher(Candidate candidate) {
        this.candidate = candidate;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    

    public Fresher(int Graduationdate, String Graduationrank, String Education, int CandidateId, String Firstname, String Lastname, int Birthdate, String Address, String Phone, String Email, int Candidatetype) {
        super(CandidateId, Firstname, Lastname, Birthdate, Address, Phone, Email, Candidatetype);
        this.Graduationdate = Graduationdate;
        this.Graduationrank = Graduationrank;
        this.Education = Education;
    }

    public int getGraduationdate() {
        return Graduationdate;
    }

    public void setGraduationdate(int Graduationdate) {
        this.Graduationdate = Graduationdate;
    }

    public String getGraduationrank() {
        return Graduationrank;
    }

    public void setGraduationrank(String Graduationrank) {
        this.Graduationrank = Graduationrank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    @Override
    public String toString() {
        return candidate.CandidateId + "|" + candidate.Firstname + "|" + candidate.Lastname +  "|" + candidate.Address + "|" + candidate.Phone + "|" + candidate.Email + "|" + candidate.Candidatetype ; 
    }
       
}
