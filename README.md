

```bash
# run redis via docker
docker run --name local-redis -d -p 6379:6379 redis

# connect to redis server via redis-cli
docker exec -it local-redis sh
redis-cli

# basic redis commands
keys *
get N12345
get N54321


```

References:
- <https://www.tutorialspoint.com/redis/redis_commands.htm>


