import redis.clients.jedis.Jedis

object Jedis{
  def main(args: Array[String]): Unit = {
    val jedis = new Jedis("hadoop02",6379)
    //密码
   // jedis.auth("")
    println(jedis.ping())
    jedis.set("d","123")
    println(jedis.get("d"))
  }

}