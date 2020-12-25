import java.util.concurrent.ConcurrentHashMap;

public class test {

    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("key", "key");
        concurrentHashMap.get("key");
    }
}
