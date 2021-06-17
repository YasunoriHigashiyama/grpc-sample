#!/bin/sh

DIR="$( cd "$(dirname "$0")" ; pwd -P )"

java -jar ${DIR}/target/client-1.0-SNAPSHOT.jar
