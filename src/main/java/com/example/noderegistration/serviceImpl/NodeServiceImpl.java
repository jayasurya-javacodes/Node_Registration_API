package com.example.noderegistration.serviceImpl;

import com.example.noderegistration.dto.NodeDto;
import com.example.noderegistration.entity.Node;
import com.example.noderegistration.repository.NodeRepository;
import com.example.noderegistration.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    NodeRepository repository;

    @Override
    public String registerNode(NodeDto dto) {

        Node node = new Node();
        node.setNodeName(dto.getNodeName());
        node.setIpAddress(dto.getIpAddress());
        node.setStatus(dto.getStatus());
        node.setCreatedAt(LocalDateTime.now());

        repository.save(node);

        return "Node registered successfully!!!";
    }
}
