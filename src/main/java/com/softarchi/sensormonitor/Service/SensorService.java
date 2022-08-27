package com.softarchi.sensormonitor.Service;

import com.softarchi.sensormonitor.Model.Sensor;
import com.softarchi.sensormonitor.Repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    @Autowired
    SensorRepository sensorRepository;
    public Sensor createSensor(Sensor sensor){
        return sensorRepository.save(sensor);

    }

}
