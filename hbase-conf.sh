#!/bin/bash

. ./env.sh

#HBASE_CLASSPATH=a.jar   $hbase_home/bin/hbase   config.HBaseConfig | sort

java -cp a.jar:$hbase_home/*:$hbase_home/lib/*   config.HBaseConfig | sort

