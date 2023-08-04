#!/bin/bash

conf_file="1x1_0_0.yaml"
log4j_file="log4j-server_0.properties"

./bin/cassandra -Dcassandra.config=${conf_file} -Dlog4j.configuration=${log4j_file}
