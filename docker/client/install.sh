#!/usr/bin/env bash
docker-machine create --driver virtualbox local-1
eval $(docker-machine env local-1)
