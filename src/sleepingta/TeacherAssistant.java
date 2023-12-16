/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingta;

/**
 *
 * @author mostafa
 */
public class TeacherAssistant implements Runnable{
    
    private Hall hall;
    private int TA_ID;

    public TeacherAssistant(Hall hall, int TA_ID) {
        this.hall = hall;
        this.TA_ID = TA_ID;
    }
    
    @Override
    public void run(){
        while (true) {            
            hall.AnswerQuestion(TA_ID);
        }
    }
}
