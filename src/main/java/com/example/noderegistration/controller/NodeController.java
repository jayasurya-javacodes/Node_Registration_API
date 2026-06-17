package com.example.noderegistration.controller;

import com.example.noderegistration.dto.NodeDto;
import com.example.noderegistration.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {

    @Autowired
    private NodeService service;

    @PostMapping("/register")
    public String registerNode(@RequestBody NodeDto dto) {
        return service.registerNode(dto);
    }
}
