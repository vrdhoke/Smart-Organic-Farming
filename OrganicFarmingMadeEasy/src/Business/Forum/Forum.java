/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Forum;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaibhavdhoke
 */
public class Forum {
    
    private List<Question> questionList;

    public Forum() {
        questionList= new ArrayList<Question>();
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
    

    
}
