package com.HospitalManagement.doclogin.controller;

import com.HospitalManagement.doclogin.enity.Appointment;
import com.HospitalManagement.doclogin.repository.AppointmentsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class AppointmentController {
    AppointmentsRepository appointmentsRepository;

    public AppointmentController(AppointmentsRepository appointmentsRepository) {
        super();
        this.appointmentsRepository = appointmentsRepository;
    }
    @PostMapping("/appointments")
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return  appointmentsRepository.save(appointment);
    }
    @GetMapping("/appointments")
   public List<Appointment>getAllAppoints(){
        return appointmentsRepository.findAll();

    }
    @DeleteMapping("/appointments/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteAppointment(@PathVariable long id) throws AttributeNotFoundException {
       Appointment appointment= appointmentsRepository.findById(id).orElseThrow(() -> new AttributeNotFoundException("Appointment not found with id" + id ));
 appointmentsRepository.delete(appointment);
 Map<String,Boolean> response=new HashMap<String,Boolean>();
 response.put("Deleted",Boolean.TRUE);
 return ResponseEntity.ok(response);
    }

}
