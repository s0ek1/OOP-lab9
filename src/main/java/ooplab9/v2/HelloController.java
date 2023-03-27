package ooplab9.v2;

import data.Point;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
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
    private ListView pointsTable;

    public void tabulate() {
        Processor processor = new Processor();
        double start = Double.parseDouble(startField.getText());
        double finish = Double.parseDouble(finishField.getText());
        double step = Double.parseDouble(stepField.getText());
        List<Point> points = processor.tabulating(start, finish, step);
        String text = "Start: ["+start+"], Finish: ["+finish+"], Step: ["+step+"]";
        pointsTable.getItems().addAll(text);
        String steps = "Кількість кроків: "+ processor.countStep(start,finish,step);
        pointsTable.getItems().addAll(steps);
        String max = "Найбільше значення: "+processor.getMax(points);
        pointsTable.getItems().addAll(max);
        String min = "Найменше значення: "+processor.getMin(points);
        pointsTable.getItems().addAll(min);
        String sum = "Сума: "+processor.getSum(points);
        pointsTable.getItems().addAll(sum);
        String average = "Середнє арифметичне: "+processor.getAverage(points);
        pointsTable.getItems().addAll(average);
        pointsTable.getItems().addAll("");


    }
}