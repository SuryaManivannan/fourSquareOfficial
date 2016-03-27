package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.util.Random;

public class Controller {
    @FXML private Button num1, num2, num3, num4, clickToStart;
    @FXML private Label operation, targetValue, right, wrong;
    private int[] numberStore = new int[4];
    private String[] operations = {"Addition", "Subtraction", "Multiplication", "Division"};
    private int target, amountPressed = 0, userChoice1, userChoice2, amountRight, amountWrong;
    private String method, previousMethod = "";
    Timeline timeline;
    public void start(){

        clickToStart.setVisible(false);
        changeButtonNumbers();
        setMethodAndTarget();
        timeline = new Timeline(new KeyFrame(
                Duration.millis(3000),
                ae -> {
                    changeButtonNumbers();
                    setMethodAndTarget();
                    amountPressed = 0;
                    amountWrong++;
                    wrong.setText(amountWrong+"");
                }));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void changeButtonNumbers(){
        Random rand = new Random();
        for(int i=0; i<numberStore.length; i++){
            int num = rand.nextInt(9);
            for(int k=0; k<=i; k++){
                if(i==0 && k==i && num!= 0){
                    numberStore[i] = num;
                } else if(i!=0  && numberStore[0]!=num && numberStore[k]!=num && k==i && num!= 0) {
                    numberStore[k]=num;
                } else if(i!=0 && numberStore[k]==num || num==0){
                    i=i-1;
                    k=0;
                }
            }
        }


        // For Button 1
        if (numberStore[0] == 1)
            num1.setStyle("-fx-background-image: url('img/1.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 2)
            num1.setStyle("-fx-background-image: url('img/2.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 3)
            num1.setStyle("-fx-background-image: url('img/3.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 4)
            num1.setStyle("-fx-background-image: url('img/4.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 5)
            num1.setStyle("-fx-background-image: url('img/5.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 6)
            num1.setStyle("-fx-background-image: url('img/6.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 7)
            num1.setStyle("-fx-background-image: url('img/7.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 8)
            num1.setStyle("-fx-background-image: url('img/8.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[0] == 9)
            num1.setStyle("-fx-background-image: url('img/9.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");

        // For Button 2
        if (numberStore[1] == 1)
            num2.setStyle("-fx-background-image: url('img/1.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 2)
            num2.setStyle("-fx-background-image: url('img/2.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 3)
            num2.setStyle("-fx-background-image: url('img/3.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 4)
            num2.setStyle("-fx-background-image: url('img/4.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 5)
            num2.setStyle("-fx-background-image: url('img/5.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 6)
            num2.setStyle("-fx-background-image: url('img/6.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 7)
            num2.setStyle("-fx-background-image: url('img/7.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 8)
            num2.setStyle("-fx-background-image: url('img/8.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[1] == 9)
            num2.setStyle("-fx-background-image: url('img/9.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");

        // For Button 3
        if (numberStore[2] == 1)
            num3.setStyle("-fx-background-image: url('img/1.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 2)
            num3.setStyle("-fx-background-image: url('img/2.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 3)
            num3.setStyle("-fx-background-image: url('img/3.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 4)
            num3.setStyle("-fx-background-image: url('img/4.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 5)
            num3.setStyle("-fx-background-image: url('img/5.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 6)
            num3.setStyle("-fx-background-image: url('img/6.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 7)
            num3.setStyle("-fx-background-image: url('img/7.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 8)
            num3.setStyle("-fx-background-image: url('img/8.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[2] == 9)
            num3.setStyle("-fx-background-image: url('img/9.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");

        // For Button 4
        if (numberStore[3] == 1)
            num4.setStyle("-fx-background-image: url('img/1.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 2)
            num4.setStyle("-fx-background-image: url('img/2.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 3)
            num4.setStyle("-fx-background-image: url('img/3.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 4)
            num4.setStyle("-fx-background-image: url('img/4.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 5)
            num4.setStyle("-fx-background-image: url('img/5.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 6)
            num4.setStyle("-fx-background-image: url('img/6.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 7)
            num4.setStyle("-fx-background-image: url('img/7.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 8)
            num4.setStyle("-fx-background-image: url('img/8.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");
        if (numberStore[3] == 9)
            num4.setStyle("-fx-background-image: url('img/9.PNG');-fx-background-repeat: stretch; -fx-background-size: stretch;");

    }
    public void setMethodAndTarget(){
        Random rand = new Random();
        while (true) {
            int operationChooser = rand.nextInt(4);
            method = operations[operationChooser];
            if(!method.equals(previousMethod)) {
                break;
            }
        }
        previousMethod = method;
        operation.setText(method);

        int a = rand.nextInt(4);
        int b = rand.nextInt(4);

        if (method.equals("Addition")) {
            target = numberStore[a] + numberStore[b];
        } else if (method.equals("Subtraction")){
            target = Math.abs(numberStore[a] - numberStore[b]);
        } else if (method.equals("Multiplication")) {
            target = numberStore[a] * numberStore[b];
        } else if (method.equals("Division")) {
            if (numberStore[a]!=0 || numberStore[b]!=0)
                target = numberStore[a] / numberStore[b];
            else {
                target = numberStore[a] * numberStore[b];
                operation.setText("Multiplication");
            }
        }

        targetValue.setText(String.valueOf(target));

    }
    public void checker(){
        int checker = 0;
        if (method.equals("Addition")) {
            checker = userChoice1 + userChoice2;
        } else if (method.equals("Subtraction")){
            checker = Math.abs(userChoice1 - userChoice2);
        } else if (method.equals("Multiplication")) {
            checker = userChoice1 * userChoice2;
        } else if (method.equals("Division")) {
            checker = userChoice1/userChoice2;
        }

        if (checker == target) {
            System.out.println(true);
            amountRight++;
            right.setText(amountRight+"");
            timeline.playFromStart();
            start();
        } else {
            System.out.println(false);
            amountWrong++;
            wrong.setText(amountWrong+"");
            amountPressed=0;
        }
    }

    public void button1(){
        if(amountPressed == 0){
            userChoice1 = numberStore[0];
            amountPressed++;
        } else if (amountPressed == 1){
            userChoice2 = numberStore[0];
            amountPressed = 0;
            checker();
        }
    }
    public void button2(){
        if(amountPressed == 0){
            userChoice1 = numberStore[1];
            amountPressed++;
        } else if (amountPressed == 1){
            userChoice2 = numberStore[1];
            amountPressed = 0;
            checker();
        }
    }
    public void button3(){
        if(amountPressed == 0){
            userChoice1 = numberStore[2];
            amountPressed++;
        } else if (amountPressed == 1){
            userChoice2 = numberStore[2];
            amountPressed = 0;
            checker();
        }
    }
    public void button4(){
        if(amountPressed == 0){
            userChoice1 = numberStore[3];
            amountPressed++;
        } else if (amountPressed == 1){
            userChoice2 = numberStore[3];
            amountPressed = 0;
            checker();
        }
    }
}