#!/bin/bash

. ./env.sh

build_dir=build
mkdir -p $build_dir
rm -rf $build_dir/*


javac -d $build_dir  -sourcepath src -classpath $hadoop_home/lib/*:$hadoop_home/*:$hbase_home/*:$hbase_home/lib/*:$accumulo_home/lib/*  $(find src -name "*.java")


rm  -f a.jar
jar cf a.jar -C $build_dir .

rm -rf $build_dir
