package by.sheka.app.javaFX.dao.goalsDAO;

import by.sheka.app.javaFX.dao.DAO;
import by.sheka.app.javaFX.entity.tables.Goal;
import javafx.collections.ObservableList;

import java.util.List;

public interface GoalsDAO extends DAO<Goal> {
    List<Goal> findAll();
}
