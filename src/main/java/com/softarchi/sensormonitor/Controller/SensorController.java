package com.softarchi.sensormonitor.Controller;

import com.softarchi.sensormonitor.Model.Sensor;
import com.softarchi.sensormonitor.Service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensor-data")
public class SensorController {
    @Autowired
    SensorService sensorService;

    @PostMapping("/create")
    public Sensor createSensor(@RequestBody Sensor sensor){
        return  sensorService.createSensor(sensor);
    }
    @GetMapping("/get-all-sensor")
    public List<Sensor> getAllSensor(){
        return sensorService.getAllSensor();
    }
    @GetMapping("/get-sensor/{id}")
    public Sensor getSensorById(@PathVariable String id ){
        return sensorService.getSensorById(id);
    }

}
