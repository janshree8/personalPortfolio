package com.portfolio.personal.controller;

import com.portfolio.personal.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class WebController {
    @GetMapping(value = "/")
    public String index(Model model){
        PersonalDetail personalDetail = new PersonalDetail("Janshree Prajapati", 23, "janshreeprajapati@gmail.com" , "Texas, USA", "I am a Java Full Stack Developer. I can create a web application from scratch with all the requirements included. Delivering work within time and budget which meets client’s requirements is my moto.");
        Experience experience = new Experience(2, 10, 20, 3);
        personalDetail.setExperience(experience);
        model.addAttribute("personalDetail", personalDetail);

        ArrayList<MyService> myServices = new ArrayList<>();
        myServices.add(new MyService("Android Development", "I am specialized in developing android application in various framework","fab fa-android"));
        myServices.add(new MyService("IOS Development", "I am specialized in developing IOS application in various framework", "fab fa-apple"));
        myServices.add(new MyService("Website Development", "I am specialized in developing Website in various framework", "fab fa-react"));
        myServices.add(new MyService("Electronics Development", "I am specialized in developing electonics development","fas fa-charging-station"));

        model.addAttribute("myServices", myServices);

        ArrayList<MyEducation> myEducations = new ArrayList<>();
        myEducations.add(new MyEducation("2019-2021", "B.S. in Computer Science", "Texas A&M University-Commerce", "Overall GPA: 3.92" +
                "Member of Honor Society.\n" +
                "Minor: Mathematics"));
        myEducations.add(new MyEducation("2018-2019", "Associate Degree in Science", "Mountain View College, Dallas, TX","Graduated with 3.86 GPA\n" +
                "\nMember of Phi Theta Kappa- Honors Society\n" +
                "\tAwarded with Presidential High Honors"));
        myEducations.add(new MyEducation("2014-2016", "High School Diploma in Science", "Capital College and Research Center", "Graduated with 4.0 GPA.\n" +
                "\nAwarded with presidential scholarship.\n" +
                "\nExecutive Member of IT Club"));
        model.addAttribute("myEducations", myEducations);

        ArrayList<MySkills> mySkills = new ArrayList<>();
        mySkills.add(new MySkills("Web Design", "55"));
        mySkills.add(new MySkills("HTML/CSS", "90"));
        mySkills.add(new MySkills("JavaScript", "30"));
        mySkills.add(new MySkills("ReactJS", "30"));
        mySkills.add(new MySkills("Python", "70"));
        mySkills.add(new MySkills("Bootstrap", "75"));

        model.addAttribute("mySkills", mySkills);

        return "index";
    }
}
