package snakeyaml;

import org.yaml.snakeyaml.Yaml;

public class demo {
    public static void main(String[] args) {
        String yamlStr = "key: hello yaml";
        Yaml yaml = new Yaml();
        Object ret = yaml.load(yamlStr);
        System.out.println(ret);
    }
}
