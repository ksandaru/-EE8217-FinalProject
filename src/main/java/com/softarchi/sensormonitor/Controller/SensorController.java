package com.softarchi.sensormonitor.Controller;

import com.softarchi.sensormonitor.Model.Sensor;
import com.softarchi.sensormonitor.Service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sensor-data")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @PostMapping("/create")
    public ResponseEntity<Sensor> createSensor(@RequestBody Sensor sensor) {
        sensorService.createSensor(sensor);
        return new ResponseEntity<Sensor>(sensorService.createSensor(sensor), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-all-sensor")
    public ResponseEntity<List<Sensor>> getAllSensor() {
        return new ResponseEntity<List<Sensor>>(sensorService.getAllSensor(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-sensor/{id}")
    public Sensor getSensorById(@PathVariable String id) {
        return sensorService.getSensorById(id);
    }

    @DeleteMapping("delete-sensor/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") String id) {
        sensorService.delete(id);
        return new ResponseEntity<String>("sensor record deleted!", HttpStatus.ACCEPTED);
    }

}
