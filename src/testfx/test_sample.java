package testfx;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import javafx.scene.Scene;
import javafx.stage.Stage;

import static org.testfx.api.FxAssert.verifyThat;

@ExtendWith(ApplicationExtension.class)
public class test_sample {
        @Start
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("../fxml_fill/sample.fxml"));
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        }
        @Test
        void High_school_contain_right_text(FxRobot robot) {
            verifyThat("#HS_id", LabeledMatchers.hasText("High School"));
        }
        @Test
        void college_contain_right_text(FxRobot robot) {
            verifyThat("#C_id", LabeledMatchers.hasText("College"));
        }
        @Test
        void Grad_School_contain_right_text(FxRobot robot) {
            verifyThat("#GS_id", LabeledMatchers.hasText("Grad School"));
        }
        @Test
        void when_button_is_clicked_alert_show_and_button_text_changes(FxRobot robot) {
            // when:
            robot.clickOn("#FN_id");
            robot.write("Morcous");
            robot.clickOn("#LN_id");
            robot.write("Wael");
            robot.clickOn("#JT_id");
            robot.write("College Student");
            robot.clickOn("#HS_id");
            robot.clickOn("#S_id");
            verifyThat("#S_id", LabeledMatchers.hasText("Submitted"));
        }

    }
