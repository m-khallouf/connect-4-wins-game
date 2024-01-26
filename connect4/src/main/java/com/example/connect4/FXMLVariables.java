package com.example.connect4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;



public class FXMLVariables {


    @FXML
    public GridPane boardGridPane;

    @FXML
    public Circle firstCircle;

    @FXML
    public Circle secondCircle;

    @FXML
    public Circle thirdCircle;

    @FXML
    public Circle fourthCircle;

    @FXML
    public Circle fifthCircle;

    @FXML
    public Circle sixthCircle;

    @FXML
    public Circle seventhCircle;

    @FXML
    public Circle eighthCircle;

    @FXML
    public Circle ninthCircle;

    @FXML
    public Circle tenthCircle;

    @FXML
    public Circle eleventhCircle;

    @FXML
    public Circle twelfthCircle;

    @FXML
    public Circle thirteenthCircle;

    @FXML
    public Circle fourteenthCircle;

    @FXML
    public Circle fifteenthCircle;

    @FXML
    public Circle sixteenthCircle;

    @FXML
    public Circle seventeenthCircle;

    @FXML
    public Circle eighteenthCircle;

    @FXML
    public Circle nineteenthCircle;

    @FXML
    public Circle twentiethCircle;

    @FXML
    public Circle twentyFirstCircle;

    @FXML
    public Circle twentySecondCircle;

    @FXML
    public Circle twentyThirdCircle;

    @FXML
    public Circle twentyFourthCircle;

    @FXML
    public Circle twentyFifthCircle;

    @FXML
    public Circle twentySixthCircle;

    @FXML
    public Circle twentySeventhCircle;

    @FXML
    public Circle twentyEighthCircle;

    @FXML
    public Circle twentyNinthCircle;

    @FXML
    public Circle thirtiethCircle;

    @FXML
    public Circle thirtyFirstCircle;

    @FXML
    public Circle thirtySecondCircle;

    @FXML
    public Circle thirtyThirdCircle;

    @FXML
    public Circle thirtyFourthCircle;

    @FXML
    public Circle thirtyFifthCircle;

    @FXML
    public Circle thirtySixthCircle;

    @FXML
    public Circle thirtySeventhCircle;

    @FXML
    public Circle thirtyEighthCircle;

    @FXML
    public Circle thirtyNinthCircle;

    @FXML
    public Circle fortiethCircle;

    @FXML
    public Circle fortyFirstCircle;

    @FXML
    public Circle fortySecondCircle;

    @FXML
    public Button setNamesButton;

    @FXML
    public TextField playerOneNameLabel;

    @FXML
    public TextField playerTwoNameLabel;

    @FXML
    public List<Rectangle> columnRectangles;

    @FXML
    public List<Circle> circles;
    final List<Circle[]> currentCircle = new ArrayList<>();

    @FXML
    public Circle[] first = {firstCircle, eighthCircle, fifteenthCircle, twentySecondCircle, twentyNinthCircle, thirtySixthCircle};

    @FXML
    public Circle[] second = {secondCircle, ninthCircle, sixteenthCircle, twentyThirdCircle, thirtiethCircle, thirtySeventhCircle};


    @FXML
    public Circle[] third = {thirdCircle, tenthCircle, seventeenthCircle, twentyFourthCircle, thirtyFirstCircle, thirtyEighthCircle};

    @FXML
    public Circle[] fourth = {fourthCircle, eleventhCircle, eighteenthCircle, twentyFifthCircle, thirtySecondCircle, thirtyNinthCircle};

    @FXML
    public Circle[] fifth = {fifthCircle, twelfthCircle, nineteenthCircle, twentySixthCircle, thirtyThirdCircle, fortiethCircle};

    @FXML
    public Circle[] sixth = {sixthCircle, thirteenthCircle, twentiethCircle, twentySeventhCircle, thirtyFourthCircle, fortyFirstCircle};

    @FXML
    public Circle[] seventh = {seventhCircle, fourteenthCircle, twentyFirstCircle, twentyEighthCircle, thirtyFifthCircle, fortySecondCircle};


    @FXML
    public void initializeCircles() {
        // Add individual columns to the list
        currentCircle.add(first);
        currentCircle.add(second);
        currentCircle.add(third);
        currentCircle.add(fourth);
        currentCircle.add(fifth);
        currentCircle.add(sixth);
        currentCircle.add(seventh);
    }

    public Circle[] getFirst() {
        return first;
    }

    public void setFirst(Circle[] first) {
        this.first = first;
    }

    public Circle[] getSecond() {
        return second;
    }

    public void setSecond(Circle[] second) {
        this.second = second;
    }

    public Circle[] getThird() {
        return third;
    }

    public void setThird(Circle[] third) {
        this.third = third;
    }

    public Circle[] getFourth() {
        return fourth;
    }

    public void setFourth(Circle[] fourth) {
        this.fourth = fourth;
    }

    public Circle[] getFifth() {
        return fifth;
    }

    public void setFifth(Circle[] fifth) {
        this.fifth = fifth;
    }

    public Circle[] getSixth() {
        return sixth;
    }

    public void setSixth(Circle[] sixth) {
        this.sixth = sixth;
    }

    public Circle[] getSeventh() {
        return seventh;
    }

    public void setSeventh(Circle[] seventh) {
        this.seventh = seventh;
    }

    //Controller controller = new Controller();
}