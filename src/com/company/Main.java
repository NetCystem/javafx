package com.company;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ComboBox;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();

        StackPane holder = new StackPane();
        Canvas canvas = new Canvas(330,250);
        holder.getChildren().add(canvas);
        root.getChildren().add(holder);
        holder.setStyle("-fx-background-color: cadetblue");


        Scene scene = new Scene(root, 330,250);
        primaryStage.setScene(scene);

        //Username
        TextField username = new TextField();
        username.setMinSize(70, 30);
        username.setLayoutX(80);
        username.setLayoutY(25);
        username.setPromptText("Username");

        Text userText = new Text("Enter Your Username:");
        userText.setLayoutX(80);
        userText.setLayoutY(20);
        userText.setFont(Font.font("Vardana",10));
        userText.setFill(Color.ORANGE);

        Text userAlert = new Text("Username Required");
        userAlert.setVisible(false);
        userAlert.setLayoutX(80);
        userAlert.setLayoutY(20);
        userAlert.setFont(Font.font("Vardana",10));
        userAlert.setFill(Color.BROWN);

        //Password
        TextField password = new TextField();
        password.setMinSize(70, 30);
        password.setLayoutX(80);
        password.setLayoutY(80);
        password.setPromptText("Password");


        Text passText = new Text("Enter Your Username:");
        passText.setLayoutX(80);
        passText.setLayoutY(75);
        passText.setFont(Font.font("Vardana",10));
        passText.setFill(Color.ORANGE);

        Text passAlert = new Text("Password Required");
        passAlert.setLayoutX(80);
        passAlert.setLayoutY(75);
        passAlert.setVisible(false);
        passAlert.setFont(Font.font("Vardana",10));
        passAlert.setFill(Color.BROWN);

        //Gender

         ToggleGroup group = new ToggleGroup();

        RadioButton male = new RadioButton();
        male.setToggleGroup(group);
        male.setLayoutX(32);
        male.setLayoutY(140);

        Text maleText = new Text("Male");
        maleText.setLayoutX(28);
        maleText.setLayoutY(136);
        maleText.setFill(Color.ORANGE);
        maleText.setFont(Font.font("Vardana", 11));

        Text genderAlert = new Text("Gender Required");
        genderAlert.setFill(Color.BROWN);
        genderAlert.setFont(Font.font("Vardana", 10));
        genderAlert.setVisible(false);
        genderAlert.setLayoutX(20);
        genderAlert.setLayoutY(170);


        RadioButton female = new RadioButton();
        female.setToggleGroup(group);
        female.setLayoutX(72);
        female.setLayoutY(140);

        Text femaleText = new Text("Female");
        femaleText.setLayoutX(63);
        femaleText.setLayoutY(136);
        femaleText.setFill(Color.ORANGE);
        femaleText.setFont(Font.font("Vardana", 11));


        //Age
        ObservableList<Integer> list = FXCollections.observableArrayList(18,19,20,21,22);
        ChoiceBox choiceBox = new ChoiceBox(list);
        choiceBox.setLayoutX(250);
        choiceBox.setLayoutY(137);
        choiceBox.setMinSize(25, 30);
        choiceBox.setMaxSize(50,50);
//        ComboBox comboBox = new ComboBox(list);
//        comboBox.setLayoutX(250);
//        comboBox.setLayoutY(137);
//        comboBox.setMinSize(25, 30);
//        comboBox.setMaxSize(25,30);

        Text ageText = new Text("Your Age");
        ageText.setLayoutX(245);
        ageText.setLayoutY(131);
        ageText.setVisible(true);
        ageText.setFont(Font.font("Vardana", 10));
        ageText.setFill(Color.ORANGE);



        //Register
        Button register = new Button("Regisater");
        register.setMinSize(75,25);
        register.setLayoutX(120);
        register.setLayoutY(172);

        Text done = new Text("Done!");
        done.setFont(Font.font("Vardana", 50));
        done.setVisible(false);
        done.setLayoutX(100);
        done.setLayoutY(135);




        register.setOnAction(event -> {
            if (!username.getText().isEmpty() && !password.getText().isEmpty() && (male.isSelected() || female.isSelected())){
                username.setVisible(false);
                password.setVisible(false);
                male.setVisible(false);
                female.setVisible(false);
                register.setVisible(false);
                userText.setVisible(false);
                userAlert.setVisible(false);
                passText.setVisible(false);
                passAlert.setVisible(false);
                ageText.setVisible(false);
                maleText.setVisible(false);
                femaleText.setVisible(false);
                genderAlert.setVisible(false);
                choiceBox.setVisible(false);

                done.setVisible(true);


            }else {
                if (username.getText().isEmpty()){
                    userText.setVisible(false);
                    userAlert.setVisible(true);
                }
                if (password.getText().isEmpty()){
                    passText.setVisible(false);
                    passAlert.setVisible(true);
                }
                if (!male.isSelected() || !female.isSelected()){
                    genderAlert.setVisible(true);
                }

            }
        });

        root.getChildren().addAll(username, password, male, female, maleText,femaleText, register,ageText, userText,passText,userAlert,passAlert,done, genderAlert,choiceBox);
        primaryStage.show();



        //Simple Calcuator
//        AnchorPane root = new AnchorPane();
//        Scene scene = new Scene(root, 225,400, Color.GOLD);
//        primaryStage.setScene(scene);
//
//        Text answer = new Text();
//        answer.setLayoutX(100);
//        answer.setLayoutY(25);
//        answer.setFont(Font.font("Vardana", 20));
//
//        TextField mathArea1 = new TextField();
//        mathArea1.setMinSize(55,25);
//        mathArea1.setPromptText("0");
//        mathArea1.setLayoutX(30);
//        mathArea1.setLayoutY(50);
//
//
//        TextField mathArea2 = new TextField();
//        mathArea2.setMinSize(55,25);
//        mathArea2.setPromptText("0");
//        mathArea2.setLayoutX(30);
//        mathArea2.setLayoutY(100);
//
//
//
//        Button sum = new Button("+");
//        sum.setMinSize(25,25);
//        sum.setLayoutX(25);
//        sum.setLayoutY(150);
//
//        Button sub = new Button("-");
//        sub.setMinSize(25,25);
//        sub.setLayoutX(75);
//        sub.setLayoutY(150);
//
//        Button div = new Button("/");
//        div.setMinSize(25,25);
//        div.setLayoutX(125);
//        div.setLayoutY(150);
//
//        Button mul = new Button("*");
//        mul.setMinSize(25,25);
//        mul.setLayoutX(175);
//        mul.setLayoutY(150);
//
//        Button equal = new Button("=");
//        equal.setMinSize(25,25);
//        equal.setLayoutX(100);
//        equal.setLayoutY(195);
//
//        sum.setOnAction(event -> {
//            double summ = Double.parseDouble(mathArea1.getText()) + Double.parseDouble(mathArea2.getText());
//
//            if (summ%1==0){
//                answer.setText(Integer.toString((int)summ));
//            }else
//                answer.setText(Double.toString(summ));
//        });
//
//        sub.setOnAction(event -> {
//            double subb = Double.parseDouble(mathArea1.getText()) - Integer.parseInt(mathArea2.getText());
//
//            if (subb%1==0){
//                answer.setText(Integer.toString((int)subb));
//            }else
//                answer.setText(Double.toString(subb));
//        });
//
//        div.setOnAction(event -> {
//            double divv = Double.parseDouble(mathArea1.getText()) / Integer.parseInt(mathArea2.getText());
//
//            if (divv %1==0){
//                answer.setText(Integer.toString((int)divv));
//            }else
//                answer.setText(Double.toString(divv));
//        });
//
//        mul.setOnAction(event -> {
//            double mull = Double.parseDouble(mathArea1.getText()) *  Integer.parseInt(mathArea2.getText());
//
//            if (mull%1==0){
//                answer.setText(Integer.toString((int)mull));
//            }else
//                answer.setText(Double.toString(mull));
//
//        });
//
//
//        root.getChildren().addAll(mathArea1,answer, mathArea2,sum,sub,div,mul,equal);
//        primaryStage.show();



        //Real Calculator

//        AnchorPane root = new AnchorPane();
//        Scene scene = new Scene(root, 330,450, Color.GOLD);
//        primaryStage.setScene(scene);
//
//        Text calculator = new Text("Calculator");
//        calculator.setLayoutX(115);
//        calculator.setLayoutY(25);
//        calculator.setFont(Font.font("Vardana", 20));
//        calculator.setFill(Color.DEEPSKYBLUE);
//
//        TextField mathArea = new TextField();
//        mathArea.setMinSize(275,50);
//        mathArea.setPromptText("0");
//        mathArea.setLayoutX(25);
//        mathArea.setLayoutY(50);
//
//
//
//        Button one = new Button("1");
//        one.setMinSize(50,50);
//        one.setLayoutX(25);
//        one.setLayoutY(150);
//        one.setTextFill(Color.RED);
//
//
//        Button two = new Button("2");
//        two.setMinSize(50,50);
//        two.setLayoutX(100);
//        two.setLayoutY(150);
//
//        Button three = new Button("3");
//        three.setMinSize(50,50);
//        three.setLayoutX(175);
//        three.setLayoutY(150);
//
//        Button four = new Button("4");
//        four.setMinSize(50,50);
//        four.setLayoutX(25);
//        four.setLayoutY(225);
//
//        Button five = new Button("5");
//        five.setMinSize(50,50);
//        five.setLayoutX(100);
//        five.setLayoutY(225);
//
//        Button six = new Button("6");
//        six.setMinSize(50,50);
//        six.setLayoutX(175);
//        six.setLayoutY(225);
//        six.setTextFill(Color.RED);
//
//        Button seven = new Button("7");
//        seven.setMinSize(50,50);
//        seven.setLayoutX(25);
//        seven.setLayoutY(300);
//
//        Button eight = new Button("8");
//        eight.setMinSize(50,50);
//        eight.setLayoutX(100);
//        eight.setLayoutY(300);
//
//        Button nine = new Button("9");
//        nine.setMinSize(50,50);
//        nine.setLayoutX(175);
//        nine.setLayoutY(300);
//
//        Button zero = new Button("0");
//        zero.setMinSize(75,50);
//        zero.setLayoutX(25);
//        zero.setLayoutY(375);
//
//        Button equal = new Button("=");
//        equal.setMinSize(100,50);
//        equal.setLayoutX(125);
//        equal.setLayoutY(375);
//
//        Button sum = new Button("+");
//        sum.setMinSize(50,50);
//        sum.setLayoutX(250);
//        sum.setLayoutY(150);
//
//        Button sub = new Button("-");
//        sub.setMinSize(50,50);
//        sub.setLayoutX(250);
//        sub.setLayoutY(225);
//
//        Button div = new Button("/");
//        div.setMinSize(50,50);
//        div.setLayoutX(250);
//        div.setLayoutY(300);
//
//        Button mul = new Button("*");
//        mul.setMinSize(50,50);
//        mul.setLayoutX(250);
//        mul.setLayoutY(375);
//
//        one.setOnAction(event -> {
//
//
//        });
//
//
//
//        root.getChildren().addAll(calculator,mathArea, one,two,three,four,five,six,seven,eight,nine, zero,equal,sum,sub,div,mul);
//        primaryStage.show();


        //        TextField login = new TextField();
//        login.setMinSize(150,50);
//        login.setPromptText("Login");
//        login.setLayoutX(225);
//        login.setLayoutY(50);
//
//        TextField pass = new TextField();
//        pass.setMinSize(150,50);
//        pass.setPromptText("Password");
//        pass.setLayoutX(225);
//        pass.setLayoutY(150);
//
//        Button button = new Button("Sign In");
//        button.setMinSize(120,50);
//        button.setLayoutX(250);
//        button.setLayoutY(250);
//
//        Text textLog = new Text("Login required");
//        textLog.setVisible(false);
//        textLog.setLayoutX(225);
//        textLog.setLayoutY(60);
//
//        Text textPass = new Text("Password required");
//        textPass.setVisible(false);
//
//
//        button.setOnAction(event -> {
//            if(!login.getText().isEmpty() && !pass.getText().isEmpty()){
//
//                System.out.println(login.getText());
//                System.out.println(pass.getText());
//
//            }else {
//                textLog.setVisible(true);
//
//            }
//
//        });
//        root.getChildren().addAll(login, pass,button, textLog, textPass);
    }
}
