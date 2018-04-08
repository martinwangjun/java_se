package redis;

import java.util.List;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {

    @Test
    public void test() {
        Jedis jedis = new Jedis("10.68.69.122", 6379);
        System.out.println("连接成功");
        System.out.println(jedis.ping());

    }
}
