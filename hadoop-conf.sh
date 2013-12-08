#!/bin/bash

. ./env.sh

$hadoop_home/bin/hadoop jar a.jar   config.HadoopConfig | sort
