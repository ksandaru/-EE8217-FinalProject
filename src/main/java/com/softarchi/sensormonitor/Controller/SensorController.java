package com.softarchi.sensormonitor.Controller;

import com.softarchi.sensormonitor.Model.Sensor;
import com.softarchi.sensormonitor.Service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensor-data")
public class SensorController {
    @Autowired
    SensorService sensorService;

    @PostMapping("/create")
    public Sensor createSensor(@RequestBody Sensor sensor){
        return  sensorService.createSensor(sensor);
    }

}
