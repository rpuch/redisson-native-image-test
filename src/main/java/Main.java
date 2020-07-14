import org.redisson.Redisson;
import org.redisson.config.Config;

public class Main {
	public static void main(String[] args) {
		Config config = new Config();
		config.useSingleServer().setAddress("redis://localhost:6379");

		var client = Redisson.createReactive(config);
		var map = client.getMap("test");
		map.put("key", "value").block();

		client.shutdown();

		System.out.println("That's all folks!");
	}
}
