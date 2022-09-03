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
@CrossOrigin(origins = "http://localhost:3000")
public class SensorController {
    @Autowired
    private SensorService sensorService;

    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Sensor> createSensor(@RequestBody Sensor sensor) {
        sensorService.createSensor(sensor);
        return new ResponseEntity<Sensor>(sensorService.createSensor(sensor), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-all-sensor")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Sensor>> getAllSensor() {
        return new ResponseEntity<List<Sensor>>(sensorService.getAllSensor(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-sensor/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Sensor getSensorById(@PathVariable String id) {
        return sensorService.getSensorById(id);
    }

    @DeleteMapping("delete-sensor/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<String> delete(@PathVariable("id") String id) {
        sensorService.delete(id);
        return new ResponseEntity<String>("sensor record deleted!", HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-sensor-count")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Long> getSensorCount() {
        return new ResponseEntity<Long>(sensorService.getSensorCount(), HttpStatus.ACCEPTED);
    }
}