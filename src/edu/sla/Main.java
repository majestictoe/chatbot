package edu.sla;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import java.util.Objects;

public class Main extends Application{

//    public void start(Stage primaryStage) throws Exception {
//        String emote = ("happy");
//        KeyCombination a = new KeyCodeCombination (KeyCode.ENTER);
//        TextField emotionField = new TextField();
//        emotionField.setPromptText("Enter an emotion.");
//        Group emot = new Group();
//        emot.getChildren().addAll(emotionField);
//        Scene scene1 = new Scene(emot,400,400);
//        primaryStage.setScene(scene1);
//        primaryStage.setTitle("Chat Bot");
//        primaryStage.show();
//        scene1.setOnKeyPressed(ke -> (
//                emote = emotionField.getText()
//                        ))
//
//    }
    public void start (Stage primaryStage) throws Exception {
        Label question = new Label("How are you feeling?");
        TextField input = new TextField ();
        HBox prompt = new HBox();
        prompt.getChildren().addAll(question, input);
        prompt.setSpacing(10);
        Button submit = new Button("Submit");
        Label output = new Label("");
        VBox layout = new VBox();
        layout.setSpacing(10);
        submit.setOnAction((e) -> {
            if (input.getText() != null) {
                if (Objects.equals(input.getText(), "happy")) {
                    output.setText("I'm glad! I'm happy too."); }
                if (Objects.equals(input.getText(), "sad")) {
                    output.setText("That sucks, may I interest you in a cat picture?"); }
                if (Objects.equals(input.getText(), "angry")) {
                    output.setText("Not at me, I hope!"); }
                if (Objects.equals(input.getText(), "gross")) {
                    output.setText("Try taking a shower and getting some rest."); }
                if (Objects.equals(input.getText(), "scared")) {
                    output.setText("Oh dear."); }
            }
        });
        layout.getChildren().addAll(prompt,submit,output);
        Group s1 = new Group();
        s1.getChildren().addAll(layout);
        Scene scene1 = new Scene(s1,310,400);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("fvhvbkbd");
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
