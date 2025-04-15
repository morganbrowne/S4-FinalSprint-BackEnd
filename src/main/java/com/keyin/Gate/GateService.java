package com.keyin.Gate;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GateService {

    private final GateRepository gateRepository;

    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public List<Gate> getAllGates() {
        return gateRepository.findAll();
    }

    public Gate createGate(Gate gate) {
        return gateRepository.save(gate);
    }

    public Gate getGateById(Long id) {
        return gateRepository.findById(id).orElse(null);
    }

    public void deleteGate(Long id) {
        gateRepository.deleteById(id);
    }
}