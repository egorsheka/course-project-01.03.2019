package by.sheka.app.javaFX.dao.goalsDAO.statistics;

import by.sheka.app.javaFX.dao.DAO;
import by.sheka.app.javaFX.entity.tables.Goal;
import by.sheka.app.javaFX.entity.tables.StatisticsData;
import by.sheka.app.javaFX.entity.tables.StatisticsDataProperty;

import java.util.List;

public interface GoalsStatistics extends DAO<Goal> {

    List<StatisticsData> getStatistics(int id);
}
