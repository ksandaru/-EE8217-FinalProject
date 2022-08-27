package com.softarchi.sensormonitor.Repository;

import com.softarchi.sensormonitor.Model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends MongoRepository<Sensor, String> {

}
