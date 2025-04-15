package com.keyin.Gate;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("gates")
public class GateController {

    private final GateService gateService;

    public GateController(GateService gateService) {
        this.gateService = gateService;
    }

    @GetMapping
    public List<Gate> getAllGates() {
        return gateService.getAllGates();
    }

    @PostMapping
    public Gate createGate(@RequestBody Gate gate) {
        return gateService.createGate(gate);
    }

    @GetMapping("/{id}")
    public Gate getGate(@PathVariable Long id) {
        return gateService.getGateById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGate(@PathVariable Long id) {
        gateService.deleteGate(id);
    }
}
