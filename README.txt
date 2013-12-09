Prints configuration of a Hadoop, HBase and Accumulo cluster.

Hadoop configuration printer is extracted with thanks from Tom White's Hadoop book.


To compile
    $ mvn package
this will create a jar file : target/print-hadoop-config-VERSION.jar

Running:
    Edit env.sh file and set the environment variables.

    Hadoop configuration:
        $  ./hadoop-conf.sh

    HBase configuration
        $  ./hbase-conf.sh

    Accumulo configuration
        $  ./accumulo-conf.sh

