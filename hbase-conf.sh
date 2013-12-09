#!/bin/bash

. ./env.sh

java -cp target/*:$hbase_home/*:$hbase_home/lib/*   config.HBaseConfig  $* | sort

