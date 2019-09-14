package by.sheka.app.javaFX.dao.tableDateDAO;

import by.sheka.app.javaFX.dao.DAO;
import by.sheka.app.javaFX.entity.tables.StatisticsData;
import by.sheka.app.javaFX.entity.tables.StatisticsDataProperty;

import java.util.List;

public interface TableDateDAO extends DAO<StatisticsData> {
    StatisticsData find(int id);
    boolean delete(List<StatisticsData> entities);



}
