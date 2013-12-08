#!/bin/bash

. ./env.sh

#HBASE_CLASSPATH=a.jar   $hbase_home/bin/hbase   config.HBaseConfig | sort

java -cp a.jar:$accumulo_home/lib/*:$hadoop_home/lib/*:$hadoop_home/*   config.AccumuloConfig | sort

