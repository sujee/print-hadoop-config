#!/bin/bash

. ./env.sh

java -cp target/*:$accumulo_home/lib/*:$hadoop_home/lib/*:$hadoop_home/*   config.AccumuloConfig  $* | sort

