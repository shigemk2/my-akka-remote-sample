# my-akka-remote-sample

![architecture](https://cacoo.com/diagrams/2YzgEaNKX3VP1imA-C73D6.png)

[remoting](http://doc.akka.io/docs/akka/snapshot/scala/remoting.html)

### Requirements

* docker
* docker-compose

### Installation 

Execute these commands in a terminal.
```sh
$ cd docker/server
$ ./install.sh
$ docker-compose build && docker-compose up
```

Execute these commands in another terminal.
```sh
$ cd docker/client
$ ./install.sh
$ docker-compose build && docker-compose up
```
