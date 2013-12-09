#!/bin/bash

. ./env.sh

$hadoop_home/bin/hadoop jar target/print-hadoop-config-*jar   config.HadoopConfig | sort
