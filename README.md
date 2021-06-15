# ビルド方法

## Javaのソースの自動生成

serverもclientも同じ

```
$ mvn compile
```

## jarのビルド

serverもclientも同じ

```
$ mvn clean compile assembly:single package
```

# 実行方法

```
$ cd server/target
$ java -jar server-server-1.0-SNAPSHOT.jar
```

```
$ cd client/target
$ java -jar client-1.0-SNAPSHOT.jar
```
