#!/bin/bash

mvn clean install

docker build . -t babichevandrey/cats-api:1.0.0
docker push babichevandrey/cats-api:1.0.0

