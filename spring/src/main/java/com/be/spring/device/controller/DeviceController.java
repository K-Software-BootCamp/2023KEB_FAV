package com.be.spring.device.controller;


import com.be.spring.device.service.DeviceService;
import com.be.spring.device.entity.Device;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/{userId}")
    public Device addDevice(@RequestBody String farmLabel, @PathVariable String userId) {
        return deviceService.addDeviceToUser(farmLabel, userId);
    }
}
