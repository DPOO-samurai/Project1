package backend;

import java.nio.file.Path;

public class Global {
    public static final Path rootPath = Path.of(Path.of(System.getProperty("user.dir")).getParent() + "/data");
    public  static final Path dataPath = Path.of(rootPath.getParent() + "/data");
}
