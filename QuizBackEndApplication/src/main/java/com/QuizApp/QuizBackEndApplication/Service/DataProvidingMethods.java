package com.QuizApp.QuizBackEndApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuizApp.QuizBackEndApplication.Dao.RepoInterface;
import com.QuizApp.QuizBackEndApplication.Model.questions;

@Service
public class DataProvidingMethods {
     @Autowired
	RepoInterface repo;
     
     public List<questions> getallquestions(){
    	 
    	 return repo.findAll();
     }

	public List<questions> getbycat(String cat) {
		// TODO Auto-generated method stub
		
		return repo.findByTopic(cat);
	}

	public String  addquestion(questions question) {
		// TODO Auto-generated method stub
		  questions res =repo.save(question);
		return (res!=null)?"Added SuccesFully":"incorect data Format";
	}
	
}
