package by.sheka.app.javaFX.dateHandler;

import by.sheka.app.javaFX.dao.ConnectorDB;
import by.sheka.app.javaFX.entity.tables.StatisticsDataProperty;

import java.util.List;

public class StatisticsDataHandler implements DataHandler<StatisticsDataProperty> {

    private List<StatisticsDataProperty> statistics;


    @Override
    public void add(StatisticsDataProperty data) {
        if(data != null){

        }
    }

    @Override
    public void update(int id, StatisticsDataProperty data) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<StatisticsDataProperty> find(StatisticsDataProperty data) {
        return null;
    }
}
