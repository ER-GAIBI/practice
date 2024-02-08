package service.registry;

import dtos.Child1;
import dtos.Child2;
import dtos.Parent;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Registry {

    private final Map<String, Function<String, Parent>> functions = new HashMap<>();

    public Registry() {
        this.functions.put("child1", this::buildChild1);
        this.functions.put("child2", this::buildChild2);
    }

    public Parent getChild(String key) {
        Function<String, Parent> function = this.functions.get(key);
        return function.apply(key);
    }

    private Child1 buildChild1(String child) {
        return new Child1(child);
    }

    private Child2 buildChild2(String child) {
        return new Child2(child);
    }
}
