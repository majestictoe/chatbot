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
                    output.setText("Are you as happy as a enemy conquering plant?"); }
                if (Objects.equals(input.getText(), "content")) {
                    output.setText("Are you as happy as a enemy conquering plant?"); }
                if (Objects.equals(input.getText(), "sad")) {
                    output.setText("Like a plant who doesn't have a sense of self?"); }
                if (Objects.equals(input.getText(), "upset")) {
                    output.setText("Like a plant who doesn't have a sense of self?"); }
                if (Objects.equals(input.getText(), "angry")) {
                    output.setText("I feel you, man. A dandelion is on my territory."); }
                if (Objects.equals(input.getText(), "mad")) {
                    output.setText("I feel you, man. A dandelion is on my territory."); }
                if (Objects.equals(input.getText(), "frustrated")) {
                    output.setText("I feel you, man. A dandelion is on my territory."); }
                if (Objects.equals(input.getText(), "gross")) {
                    output.setText("Hopefully not as bad as the soil I'm planted in."); }
                if (Objects.equals(input.getText(), "scared")) {
                    output.setText("I'm scared, too. Of sentient plants."); }
            }
        });
        layout.getChildren().addAll(prompt,submit,output);
        Group s1 = new Group();
        s1.getChildren().addAll(layout);
        Scene scene1 = new Scene(s1,310,100);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("fvhvbkbd");
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
