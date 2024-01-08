/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import java.awt.Choice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Manager {
    private final static Scanner sc = new Scanner(System.in);
     private final static Scanner sb = new Scanner(System.in);
    CheckInput c = new CheckInput();
    private List<Candidate> listCandidate = new ArrayList<>();
    private List<Fresher> listFresher = new ArrayList<>();
    private List<Intern> listIntern = new ArrayList<>();
    private List<Experience> listExperience = new ArrayList<>();
    public Candidate addData(){
        int candidateId = c.checkInputID("Input Id", 0, 100000, listCandidate);
        String firstName = c.checkInputString("Enter First Name :");
        String lastName = c.checkInputString("Enter Last Name :");
        int birthday = c.checkInputBirthDay("Enter Birthday", 1900, 2023);
        String address = c.checkInputString("Enter your Address");
        String phone = c.checkPhone("Enter your phonenumber :");
        String email = c.checkEmail("Enter your email :");
        int candidateType = c.checkInputInt("Input candidate type :(0-Experience)-(1-Fresher)-(2-Intern)", 0, 3); 
        Candidate o = new Candidate(candidateId, firstName, lastName, birthday, address, phone, email, candidateType);
        listCandidate.add(o);
        return o;
    }
    public void addExperience(){ 
        Candidate experience = addData(); 
        int expInYears = c.checkYearofExperience("Input experience :", 0,((2023 -experience.getBirthdate())-18) );
        String proSkills = c.checkInputString("Input skills :");      
        Experience e = new Experience(experience, expInYears, proSkills);
        listExperience.add(e);       
    }
    public void addFresher(){
        Candidate fresher = addData();
        int graduationDate = c.checkInputInt("Input Graduation date :", 1900, 2023);
        String graduationRank = c.checkInputRank("Input rank (Excellent,Good,Fair,Poor):");
        String education = c.checkInputString("Input your education :");
        Fresher f = new Fresher(graduationDate, graduationRank, education, fresher);
        listFresher.add(f);       
    }
    public void addIntern(){
        Candidate intern = addData();
        String major = c.checkInputString("Input your Major :");
        String semester = c.checkInputString("Input your Semeter :");
        String universityName = c.checkInputString("Input your Universityname :");
        Intern i = new Intern(major, semester, universityName, intern);
        listIntern.add(i);
    }
    
    public void showListExperience(){
        if(listExperience.isEmpty()){
            System.out.println("List Experience is empty");            
        }
        System.out.println("==========LIST EXPERIENCE==========");
        for(int i = 0; i < listExperience.size();i++){
            System.out.println(listExperience.get(i).toString());
        }
    }
    public void showListFresher(){
        if(listFresher.isEmpty()){
            System.out.println("List Fresher is empty");            
        }
        System.out.println("==========LIST FRESHER==========");
        for(int i = 0; i < listFresher.size();i++){
            System.out.println(listFresher.get(i).toString());
        }
    }
    public void showListIntern(){       
        if(listIntern.isEmpty()){
            System.out.println("List Intern is empty");            
        }
        System.out.println("==========LIST INTERN==========");
        for(int i = 0; i < listIntern.size();i++){
            System.out.println(listIntern.get(i).toString());
        }
    }
    
    public void findCandidate(){
        System.out.println("Searching");
        System.out.println("1.Search by First Name");
        System.out.println("2.Search by Last Name");
        System.out.println("3.Search by Candicate Type");
        System.out.println("Your choose :");
        int choose = sc.nextInt();
        switch(choose){
            case 1 : findByFirstName();
                     break;
            case 2 : findByLastName();
                     break;
            case 3 : findByCandidateType();
                     break;
        }              
    }
    public void findByFirstName(){       
        System.out.println("Input First Name you need to search : ");
        String firstname = sb.nextLine();
        for (int i = 0; i < listExperience.size(); i++){            
            if(firstname.equals(listExperience.get(i).getCandidate().getFirstname()))
            System.out.println(listExperience.get(i).toString());
            else{
                    System.out.println("No data");
                    }
        }
        for (int i = 0 ; i < listFresher.size(); i++){
            if(firstname.equals(listFresher.get(i).getCandidate().getFirstname()))
            System.out.println(listFresher.toString());
            else{
                System.out.println("No data");
            }
        }
        for (int i = 0 ; i < listIntern.size(); i++){
            if(firstname.equals(listIntern.get(i).getCandidate().getFirstname()))
            System.out.println(listIntern.toString());
            else{
                System.out.println("No data");
            }
        }
    }
    public void findByCandidateType(){
        int count = 0;
        System.out.println("Input your Candidatetype you need to search :");
        int choose = sc.nextInt();
        switch(choose){
            case 0 :           
                for(int i = 0; i < listExperience.size(); i++){
                System.out.println(listExperience.get(i).toString());
                count += 1;
            }
            break;
            case 1 : 
                for(int i = 0; i < listFresher.size(); i++){
                System.out.println(listFresher.get(i).toString());
                count +=1;
                }                           
            break;
            case 2 : 
                for(int i = 0; i < listIntern.size(); i++){
                System.out.println(listIntern.get(i).toString());
                count += 1;
                 }
            break;
            }
        if(count == 0) System.out.println("No Data");
        
    }
    public void findByLastName(){
       System.out.println("Input Last Name you need to search : ");
        String lastname = sb.nextLine();
        for (int i = 0; i < listExperience.size(); i++){
            if(lastname.equals(listExperience.get(i).getCandidate().getLastname()))
            System.out.println(listExperience.toString());
            else{
                System.out.println("No data");
            }
        }
       
        for (int i = 0 ; i < listFresher.size(); i++){
            if(lastname.equals(listFresher.get(i).getCandidate().getLastname()))
            System.out.println(listFresher.toString());
            else{
                System.out.println("No Data");
            }
        }
        for (int i = 0 ; i < listIntern.size(); i++){
            if(lastname.equals(listIntern.get(i).getCandidate().getLastname()))
            System.out.println(listIntern.toString());
            else{
                System.out.println("No data");
            }
        }
    }
    public String checkYN(){ 
        String choose1 = " null";
        String choose = "null";
        Scanner sm = new Scanner(System.in);                
        boolean flag = false;
        while(flag == false){
            System.out.println("Do you want to continue (Y/N)?");
            choose = sm.nextLine();
            choose1 = choose.replaceAll(" ", "");          
            flag = choose1.equalsIgnoreCase("Y")||choose1.equalsIgnoreCase("N");
        }
        return choose1;               
        }
    public void CheckYNN(){
        boolean g = true;
            while(g == true){
                switch(checkYN()){
                case("Y"):addExperience();
                    g = true;
                    break;                    
                case("N"):showListExperience();                               
                    g = false;
                    break;
                }
            }           
    }
    public void CheckYNNN(){
        boolean g = true;
            while(g == true){
                switch(checkYN()){
                case("Y"):addFresher();
                    g = true;
                    break;                    
                case("N"):showListFresher();                               
                    g = false;
                    break;
                }
            }
    }
    public void CheckYNNNN(){
        boolean g = true;
            while(g == true){
                switch(checkYN()){
                case("Y"):addIntern();
                    g = true;
                    break;                    
                case("N"):showListIntern();                               
                    g = false;
                    break;
                }
            }
    }
    public void showCandidate(){
       showListExperience();
       showListFresher();
       showListIntern();
    }
                             
    public void deleteDataByCandidateType(String mess){
        System.out.println(mess);
        int count = 0;
        int input = sb.nextInt();
        for(int i = 0; i < listExperience.size(); i++){
            if(input == listExperience.get(i).getCandidatetype()){
                listExperience.remove(i);
                count += 1;
            }                
        }
        for(int i = 0; i < listFresher.size(); i++){
            if(input == listFresher.get(i).getCandidatetype()){
                listFresher.remove(i);    
                count += 1;
            }
        }
        for(int i = 0; i < listIntern.size(); i++){
            if(input == listIntern.get(i).getCandidatetype()){
                listIntern.remove(i);
                count += 1;
            }
        }
        if(count != 0) System.out.println("Delete Success");
        else System.out.println("Data do not exist ");
    }
    public void deleteByLastName(String mess){
        System.out.println(mess);
        int count = 0; 
        String input = sc.nextLine();
        for(int i = 0; i < listExperience.size(); i++){
            if(input.equals(listExperience.get(i).getLastname())){
                listExperience.remove(i);
                System.out.println("Delete success");
                count +=1;
            }           
        }        
        for(int i = 0; i < listFresher.size(); i++){
            if(input.equals(listFresher.get(i).getLastname())){
                listFresher.remove(i);
                System.out.println("Delete success");
                count +=1;
            }                       
        }        
        for(int i = 0; i < listIntern.size(); i++){
            if(input.equals(listIntern.get(i).getLastname())){
                listIntern.remove(i);
                System.out.println("Delete success");
                count +=1;
            }                           
        }
        if(count == 0) System.out.println("No data");      
    }
    public void deleteByFirstName(String mess){
        System.out.println(mess);
        int count = 0;
        String input = sb.nextLine();
        for(int i = 0; i < listExperience.size(); i++){
            if(input.equals(listExperience.get(i).getFirstname()))
                listExperience.remove(i);
                count += 1;
        }
        for(int i = 0; i < listFresher.size(); i++){
            if(input.equals(listFresher.get(i).getFirstname()))
                listFresher.remove(i);
                count += 1;
        }
        for(int i = 0; i < listIntern.size(); i++){
            if(input.equals(listIntern.get(i).getFirstname()))
                listIntern.remove(i);
                count += 1;
        }
        if(count != 0)System.out.println("Delete Success");
        else System.out.println("Data do not exist");
    }
    public void deleteData(){
        System.out.println("1.Delete By First Name");
        System.out.println("2.Delete By Last Name");
        System.out.println("3.Delete By Candidate Type");
        System.out.println("Your choose :");
        int choose = sc.nextInt();
        switch(choose){
            case 1 : deleteByFirstName("Input First Name you need to delete :");
                     break;
            case 2 : deleteByLastName("Input Last Name you need to delete :");
                     break;
            case 3 : deleteDataByCandidateType("Input your candidate type :");
                     break;                     
        }
    }
    public void updateDataByCandidateType(){       
        showCandidate();       
        System.out.println("1.Update Experience");
        System.out.println("2.Update Fresher");
        System.out.println("3.Update InternShip");
        System.out.println("Your choice :");
        int input = sc.nextInt();
        switch(input){
            case 1: System.out.println("1.Experience information");
                    System.out.println("2.Experience to Fresher");
                    System.out.println("3.Experience to InternShip");
                    System.out.println("Choosen:"); 
                    int choosen = sc.nextInt();
                    switch(choosen){
                        case 1 : 
                            int choicee;
                            boolean check = true;
                            Experience choosenE = new Experience(null, 0, "abc");
                            while(check == true){
                                System.out.println("Input id Experience to update:");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listExperience.size(); i++){
                                        if(inputId == listExperience.get(i).getCandidate().getCandidateId()){
                                            check = false;
                                            choosenE = listExperience.get(i);
                                            break;
                                        }
                                    }
                                    if(check == false) {
                                        updateCandidate(choosenE.getCandidate());
                                        do{System.out.println("Update Experience information");
                                            System.out.println("1.Experience Years");
                                            System.out.println("2.Skills");
                                            System.out.println("3.Exit");
                                            System.out.println("your choice :");
                                            choicee = sc.nextInt();
                                            switch(choicee){
                                                case 1: 
                                                    int newExpInYears = c.checkInputInt("Input new Experience", 0, 100);
                                                    choosenE.setexpInYear(newExpInYears);
                                                    break;
                                                case 2 :
                                                    String newSkills = c.checkInputString("Input new Skills");
                                                    choosenE.setproSkill(newSkills);
                                                    break;
                                                case 3:
                                                    break;
                                            }
                                         }while(choicee < 3 && choicee >=1);
                                    }else{
                                        System.out.println("Wrong id");
                                    }
                            }
                            break;
                        case 2 :
                            int choicee1;
                            Experience experience = null;
                            Candidate candidate = null;                          
                            boolean check1 = true;                            
                            while(check1 == true){
                                System.out.println("Input id Experience to update to Fresher :");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listExperience.size(); i++){
                                        if(inputId == listExperience.get(i).getCandidate().getCandidateId()){
                                            check1 = false;
                                            candidate = listExperience.get(i).getCandidate(); 
                                            experience = listExperience.get(i);
                                            break;
                                        }
                                    }                                    
                                    if(check1 == false) {
                                        updateCandidate(candidate);
                                        Fresher fresher = new Fresher(0, "", "", candidate);
                                        listExperience.remove(experience);
                                        do{System.out.println("Update Fresher information");
                                            System.out.println("1.Graduation date");
                                            System.out.println("2.Graduation rank");
                                            System.out.println("3.Education");
                                            System.out.println("4.Exit");
                                            System.out.println("your choice :");
                                            choicee1 = sc.nextInt();
                                            switch(choicee1){
                                                case 1:                                                     
                                                    int newGraduationDate = c.checkInputInt("Input new Graduation date", 1900, 2023);
                                                    fresher.setGraduationdate(newGraduationDate);                                           
                                                    break;
                                                case 2 :                                                  
                                                    String newRanks = c.checkInputRank("Input newRanks");
                                                    fresher.setGraduationrank(newRanks);
                                                    break;
                                                case 3:
                                                    String newEducation = c.checkInputString("Input new Education");
                                                    fresher.setEducation(newEducation);
                                                    break;
                                                case 4 : break;
                                            }                                           
                                         } while(choicee1 < 4 && choicee1 >=1);
                                            listFresher.add(fresher);
                                    }else{
                                        System.out.println("Wrong id");
                                    }                                                                      
                            }
                            break;
                        case 3 :
                            int choicee12;
                            Experience experience1 = null;
                            Candidate candidate1 = null;                          
                            boolean check12 = true;                            
                            while(check12 == true){
                                System.out.println("Input id Experience to update to Intern :");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listExperience.size(); i++){
                                        if(inputId == listExperience.get(i).getCandidate().getCandidateId()){
                                            check12 = false;
                                            candidate1 = listExperience.get(i).getCandidate(); 
                                            experience1 = listExperience.get(i);
                                            break;
                                        }
                                    }                                    
                                    if(check12 == false) {
                                        updateCandidate(candidate1);
                                        Intern intern = new Intern("", "", "", candidate1);
                                        listExperience.remove(experience1);
                                        do{System.out.println("Update Fresher information");
                                            System.out.println("1.Major");
                                            System.out.println("2.Semeter");
                                            System.out.println("3.University");
                                            System.out.println("4.Exit");
                                            System.out.println("your choice :");
                                            choicee12 = sc.nextInt();
                                            switch(choicee12){
                                                case 1:                                                     
                                                    String newMajor = c.checkInputString("Input Major :");
                                                    intern.setMajor(newMajor);                                           
                                                    break;
                                                case 2 :                                                  
                                                    String newSemeter = c.checkInputString("Input Semeter");
                                                    intern.setSemester(newSemeter);
                                                    break;
                                                case 3:
                                                    String newUniversity = c.checkInputString("Input University");
                                                    intern.setUniversityname(newUniversity);
                                                    break;
                                                case 4 : break;
                                            }                                           
                                         } while(choicee12 < 4 && choicee12 >=1);
                                            listIntern.add(intern);
                                    }else{
                                        System.out.println("Wrong id");
                                    }                                                                      
                            }
                            break;
        }
                    break;
            case 2: System.out.println("1.Fresher information");
                    System.out.println("2.Fresher to Experience");
                    System.out.println("3.Fresher to Internship");
                    System.out.println("Choosen :");
                    int choosen123 = sc.nextInt();
                    switch(choosen123){
                        case 1:
                            int choicefresher;
                            boolean checkF = true;
                            Fresher choosenF = new Fresher(0, "", "", null);
                            while(checkF == true){
                                System.out.println("Input id Fresher to update:");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listFresher.size(); i++){
                                        if(inputId == listFresher.get(i).getCandidate().getCandidateId()){
                                            checkF = false;
                                            choosenF = listFresher.get(i);
                                            break;
                                        }
                                    }
                                    if(checkF == false) {
                                        updateCandidate(choosenF.getCandidate());
                                        do{System.out.println("Update Fresher information");
                                            System.out.println("1.Graduationdate");
                                            System.out.println("2.Graduation rank");
                                            System.out.println("3.Education");
                                            System.out.println("4.Exit");
                                            System.out.println("your choice :");
                                            choicefresher = sc.nextInt();
                                            switch(choicefresher){
                                                case 1: 
                                                    int newGraduationDate = c.checkInputInt("Input Graduation :", 1900, 2023);
                                                    choosenF.setGraduationdate(newGraduationDate);
                                                    break;
                                                case 2 :
                                                    String newRanks = c.checkInputString("Input Ranks");
                                                    choosenF.setGraduationrank(newRanks);
                                                    break;
                                                case 3:
                                                    String education = c.checkInputString("Input Education :");
                                                    choosenF.setEducation(education);
                                                    break;
                                                case 4: break;
                                            }
                                         }while(choicefresher < 4 && choicefresher >=1);
                                    }else{
                                        System.out.println("Wrong id");
                                    }
                            }
                            break;                          
                        case 2:
                            int choicefr;
                            Fresher fresher = null;
                            Candidate candidate2 = null;                          
                            boolean check1 = true;                            
                            while(check1 == true){
                                System.out.println("Input id Fresher to update to Experience :");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listFresher.size(); i++){
                                        if(inputId == listFresher.get(i).getCandidate().getCandidateId()){
                                            check1 = false;
                                            candidate2 = listFresher.get(i).getCandidate(); 
                                            fresher = listFresher.get(i);
                                            break;
                                        }
                                    }                                    
                                    if(check1 == false) {
                                        updateCandidate(candidate2);
                                        Experience experience2 = new Experience(candidate2, 0, "");
                                        listFresher.remove(fresher);
                                        do{System.out.println("Update Experience information");
                                            System.out.println("1.Experience");
                                            System.out.println("2.Skills");
                                            System.out.println("3.Exit");
                                            System.out.println("your choice :");
                                            choicefr = sc.nextInt();
                                            switch(choicefr){
                                                case 1:                                                     
                                                    int expF = c.checkInputInt("Input Experience",0, 100);
                                                    experience2.setexpInYear(expF);                                           
                                                    break;
                                                case 2 :                                                  
                                                    String skillF = c.checkInputString("Input Skills :");
                                                    experience2.setproSkill(skillF);
                                                    break;
                                                case 3:break; 
                                            }                                           
                                         } while(choicefr < 3 && choicefr >=1);
                                            listExperience.add(experience2);
                                    }else{
                                        System.out.println("Wrong id");
                                    }                                                                      
                            }
                            break;
                        case 3:
                            int chon1;
                            Fresher fresher123 = null;
                            Candidate candidate4 = null;                          
                            boolean check211 = true;                            
                            while(check211 == true){
                                System.out.println("Input id Fresher to update to Intern :");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listFresher.size(); i++){
                                        if(inputId == listFresher.get(i).getCandidate().getCandidateId()){
                                            check211 = false;
                                            candidate4 = listFresher.get(i).getCandidate(); 
                                            fresher123 = listFresher.get(i);
                                            break;
                                        }
                                    }                                    
                                    if(check211 == false) {
                                        updateCandidate(candidate4);
                                        Intern intern123 = new Intern("", "", "", candidate4);
                                        listFresher.remove(fresher123);
                                        do{System.out.println("Update Intern information");
                                            System.out.println("1.Major");
                                            System.out.println("2.Semeter");
                                            System.out.println("3.University");
                                            System.out.println("4.Exit");
                                            System.out.println("your choice :");
                                            chon1 = sc.nextInt();
                                            switch(chon1){
                                                case 1:                                                     
                                                    String newMajor1 = c.checkInputString("Input Major :");
                                                    intern123.setMajor(newMajor1);                                           
                                                    break;
                                                case 2 :                                                  
                                                    String newSemeter1 = c.checkInputString("Input Semeter");
                                                    intern123.setSemester(newSemeter1);
                                                    break;
                                                case 3:
                                                    String newUniversity1 = c.checkInputString("Input University");
                                                    intern123.setUniversityname(newUniversity1);
                                                    break;
                                                case 4 : break;                                                               
                                            }                                           
                                         } while(chon1 < 4 && chon1 >=1);
                                            listIntern.add(intern123);
                                    }else{
                                        System.out.println("Wrong id");
                                    }                                                                      
                            }
                            break;
                    }
                    break;
            case 3: System.out.println("1.Internship information");
                    System.out.println("2.Internship to Experience");
                    System.out.println("3.Internship to Fresher");
                    System.out.println("Choosen :");
                    int choosen2 = sc.nextInt();
                    switch(choosen2){
                        case 1:
                            int choiceeI;
                            boolean checkI = true;
                            Intern choosenI = new Intern("", "", "", null);
                            while(checkI == true){
                                System.out.println("Input id Intern to update:");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listIntern.size(); i++){
                                        if(inputId == listIntern.get(i).getCandidate().getCandidateId()){
                                            checkI = false;
                                            choosenI = listIntern.get(i);
                                            break;
                                        }
                                    }
                                    if(checkI == false) {
                                        updateCandidate(choosenI.getCandidate());
                                        do{System.out.println("Update Intern information");
                                            System.out.println("1.Major");
                                            System.out.println("2.Semeter");
                                            System.out.println("3.University");
                                            System.out.println("4.Exit");
                                            System.out.println("your choice :");
                                            choiceeI = sc.nextInt();
                                            switch(choiceeI){
                                                case 1:                                                     
                                                    String newMajor12 = c.checkInputString("Input Major :");
                                                    choosenI.setMajor(newMajor12);                                           
                                                    break;
                                                case 2 :                                                  
                                                    String newSemeter12 = c.checkInputString("Input Semeter");
                                                    choosenI.setSemester(newSemeter12);
                                                    break;
                                                case 3:
                                                    String newUniversity12 = c.checkInputString("Input University");
                                                    choosenI.setUniversityname(newUniversity12);
                                                    break;
                                                case 4 : break;                                                                                                                              
                                            }
                                         }while(choiceeI < 4 && choiceeI >=1);
                                    }else{
                                        System.out.println("Wrong id");
                                    }
                            }
                            break;                           
                        case 2:
                            int choiceintern;
                            Intern intern456 = null;
                            Candidate candidate234 = null;                          
                            boolean check312 = true;                            
                            while(check312 == true){
                                System.out.println("Input id Intern to update to Experience :");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listIntern.size(); i++){
                                        if(inputId == listIntern.get(i).getCandidate().getCandidateId()){
                                            check312 = false;
                                            candidate234 = listIntern.get(i).getCandidate(); 
                                            intern456 = listIntern.get(i);
                                            break;
                                        }
                                    }                                    
                                    if(check312 == false) {
                                        updateCandidate(candidate234);
                                        Experience experience22 = new Experience(candidate234, 0, "");
                                        listIntern.remove(intern456);
                                        do{System.out.println("Update Experience information");
                                            System.out.println("1.Experience");
                                            System.out.println("2.Skills");
                                            System.out.println("3.Exit");
                                            System.out.println("your choice :");
                                            choiceintern = sc.nextInt();
                                            switch(choiceintern){
                                                case 1:                                                     
                                                    int expF1 = c.checkInputInt("Input Experience",0, 100);
                                                    experience22.setexpInYear(expF1);                                           
                                                    break;
                                                case 2 :                                                  
                                                    String skillF1 = c.checkInputString("Input Skills :");
                                                    experience22.setproSkill(skillF1);
                                                    break;
                                                case 3:break; 
                                            }                                           
                                         } while(choiceintern < 3 && choiceintern >=1);
                                            listExperience.add(experience22);
                                    }else{
                                        System.out.println("Wrong id");
                                    }                                                                      
                            }
                            break;
                        case 3:
                            int luachon;
                            Intern intern07 = null;
                            Candidate candidate07 = null;                          
                            boolean check07 = true;                            
                            while(check07 == true){
                                System.out.println("Input id Intern to update to Fresher :");
                                int inputId = sc.nextInt();                                                       
                                    for(int i = 0; i < listIntern.size(); i++){
                                        if(inputId == listIntern.get(i).getCandidate().getCandidateId()){
                                            check07 = false;
                                            candidate07 = listIntern.get(i).getCandidate(); 
                                            intern07 = listIntern.get(i);
                                            break;
                                        }
                                    }                                    
                                    if(check07 == false) {
                                        updateCandidate(candidate07);
                                        Fresher fresher07 = new Fresher(0, "", "", candidate07);
                                        listIntern.remove(intern07);
                                        do{System.out.println("Update Fresher information");
                                            System.out.println("1.Major");
                                            System.out.println("2.Semeter");
                                            System.out.println("3.University");
                                            System.out.println("4.Exit");
                                            System.out.println("your choice :");
                                            luachon = sc.nextInt();
                                            switch(luachon){
                                                case 1: 
                                                    int newGraduationDate07 = c.checkInputInt("Input Graduation :", 1900, 2023);
                                                    fresher07.setGraduationdate(newGraduationDate07);
                                                    break;
                                                case 2 :
                                                    String newRanks07 = c.checkInputString("Input Ranks");
                                                    fresher07.setGraduationrank(newRanks07);
                                                    break;
                                                case 3:
                                                    String education07 = c.checkInputString("Input Education :");
                                                    fresher07.setEducation(education07);
                                                    break;
                                                case 4: break;
                                            }                            
                                         } while(luachon < 4 && luachon >=1);
                                            listFresher.add(fresher07);
                                    }else{
                                        System.out.println("Wrong id");
                                    }                                                                      
                            }
                            break;                        
                    }    
                    break;
            }
    }
    public void updateCandidate(Candidate candidate){ 
        int chon;
       do{
        System.err.println("IF you change data please choose 7 to update Candidate type");
        System.out.println("1.Update FirstName");
        System.out.println("2.Update LastName");
        System.out.println("3.Update BirthDate");
        System.out.println("4.Update Address");
        System.out.println("5.Update Phone");
        System.out.println("6.Update Email");
        System.out.println("7.Update Candidate Type");
        System.out.println("8.Exit");
        System.out.println("Your choice :");
        chon = sc.nextInt();
        switch(chon){
            case 1:                
                String firstName = c.checkInputString("Input your new First Name :");
                candidate.setFirstname(firstName);
                break;
            case 2:    
                String lastName = c.checkInputString("Input your new Last Name :");
                candidate.setLastname(lastName);
                break;
            case 3:
                int birthDate = c.checkInputBirthDay("Input new Birth date", 1900, 2023);
                candidate.setBirthdate(birthDate);
                break;
            case 4 :
                String address = c.checkInputString("Input your new address :");
                candidate.setAddress(address);
                break;
            case 5 :
                String phone = c.checkPhone("Input your new Phone :");
                candidate.setPhone(phone);
                break;
            case 6:
                String email = c.checkEmail("Input your new email :");
                candidate.setEmail(email);
                break;  
            case 7:
                int candidateType1 = c.checkInputInt("Input candidate type :(0-Experience)-(1-Fresher)-(2-Intern)", 0, 3); 
                candidate.setCandidatetype(candidateType1);
                break;
        }
    }while( chon < 8 && chon >=1);    
}
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
} 
    
        


