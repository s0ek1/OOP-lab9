package ooplab9.v2;

import data.Point;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import processor.Processor;

import java.util.List;

public class HelloController {
    @FXML
    private TextField startField;
    @FXML
    private TextField finishField;
    @FXML
    private TextField stepField;
    @FXML
    private Label infoLabel;
    @FXML
    private Label stepsLabel;
    @FXML
    private Label maxLabel;
    @FXML
    private Label minLabel;
    @FXML
    private Label sumLabel;
    @FXML
    private Label averageLabel;

    public void tabulate() {
        Processor processor = new Processor();
        double start = Double.parseDouble(startField.getText());
        double finish = Double.parseDouble(finishField.getText());
        double step = Double.parseDouble(stepField.getText());
        List<Point> points = processor.tabulating(start, finish, step);
        String text = "Start: ["+start+"], Finish: ["+finish+"], Step: ["+step+"]";
        infoLabel.setText(text);
        String steps = "Кількість кроків: "+ processor.countStep(start,finish,step);
        stepsLabel.setText(steps);
        String max = "Найбільше значення: "+processor.getMax(points);
        maxLabel.setText(max);
        String min = "Найменше значення: "+processor.getMin(points);
        minLabel.setText(min);
        String sum = "Сума: "+processor.getSum(points);
        sumLabel.setText(sum);
        String average = "Середнє арифметичне: "+processor.getAverage(points);
        averageLabel.setText(average);


    }
}