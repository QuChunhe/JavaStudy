package common;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSentinels {

  public static void main(String[] args) {
    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
    jedisPoolConfig.setMaxTotal(10);
    jedisPoolConfig.setMaxIdle(5);
    jedisPoolConfig.setMinIdle(5);
    // 哨兵信息
    Set<String> sentinels = new HashSet<>(Arrays.asList("192.168.11.128:26379",
            "192.168.11.129:26379","192.168.11.130:26379"));
    // 创建连接池
    JedisSentinelPool pool = new JedisSentinelPool("mymaster", sentinels,jedisPoolConfig,"123456");
    // 获取客户端
    Jedis jedis = pool.getResource();
    // 执行两个命令
    jedis.set("mykey", "myvalue");
    String value = jedis.get("mykey");
    System.out.println(value);
  }
}
