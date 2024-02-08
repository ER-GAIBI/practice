package service.impl;

import dtos.Parent;
import service.registry.Registry;

public class Service {

    private final Registry registry;

    public Service(Registry registry) {
        this.registry = registry;
    }

    public Parent buildDTO(String child) {
        return this.registry.getChild(child);
    }
}
