#!/usr/bin/env bash
docker-machine create --driver virtualbox remote-1
eval $(docker-machine env remote-1)
