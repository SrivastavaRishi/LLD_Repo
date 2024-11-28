package StructuralDesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, Tree> treeMap;

    public TreeFactory() {
        treeMap = new HashMap<>();
    }

    public Tree getTree(String color) {
        if(color == null) return null;

        if (!color.equals("green") && !color.equals("brown")) return null;

        if(treeMap.containsKey(color)) {
            return treeMap.get(color);
        }

        Tree tree = new Tree(color);
        treeMap.put(color, tree);

        return tree;
    }
}


