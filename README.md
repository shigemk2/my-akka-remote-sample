# my-akka-remote-sample

![architecture](https://cloud.githubusercontent.com/assets/795197/15935072/02f088ea-2ea1-11e6-95b6-ad4a68937384.png)

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
