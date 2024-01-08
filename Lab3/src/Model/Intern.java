/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Intern extends Candidate{
    private String Major;
    private String Semester;
    private String Universityname;
    private Candidate candidate;

    public Intern(String Major, String Semester, String Universityname, Candidate candidate) {
        this.Major = Major;
        this.Semester = Semester;
        this.Universityname = Universityname;
        this.candidate = candidate;
    }

    public Intern(Candidate candidate) {
        this.candidate = candidate;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
    
    public Intern(String Major, String Semester, String Universityname, int CandidateId, String Firstname, String Lastname, int Birthdate, String Address, String Phone, String Email, int Candidatetype) {
        super(CandidateId, Firstname, Lastname, Birthdate, Address, Phone, Email, Candidatetype);
        this.Major = Major;
        this.Semester = Semester;
        this.Universityname = Universityname;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniversityname() {
        return Universityname;
    }

    public void setUniversityname(String Universityname) {
        this.Universityname = Universityname;
    }

    @Override
    public String toString() {
       return candidate.CandidateId + "|" + candidate.Firstname + "|" + candidate.Lastname +  "|" + candidate.Address + "|" + candidate.Phone + "|" + candidate.Email + "|" + candidate.Candidatetype ;
    }
    
}
