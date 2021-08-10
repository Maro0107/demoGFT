package com.example.demoGFT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @RequestMapping(method = RequestMethod.GET)
    public String listAppointments(){
        return "appointmenstView";
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public Appointment createAppointment(@RequestBody Appointment appointment)(
            return appointmentService.save(appointment);
            )
}

