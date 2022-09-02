package com.softarchi.sensormonitor.Service;

import com.softarchi.sensormonitor.Model.Sensor;
import com.softarchi.sensormonitor.Repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    public Sensor createSensor(Sensor sensor) {
        return sensorRepository.save(sensor);

    }

    public List<Sensor> getAllSensor() {

        return sensorRepository.findAll();
    }

    public Sensor getSensorById(String id) {
            return sensorRepository.findById(id).get();

    }
    public void delete(String id){
        sensorRepository.deleteById(id);
    }
}
