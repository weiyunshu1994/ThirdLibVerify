package tomlj;

import org.tomlj.Toml;
import org.tomlj.TomlParseResult;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class demo {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("C:\\Users\\liliming\\code\\Java\\java\\src\\main\\java\\tomlj\\a.toml");
        TomlParseResult result = Toml.parse(source);
        result.errors().forEach(error -> System.err.println(error.toString()));

        String value = result.getString("owner.name");
        System.out.println(value);
    }
}
