This prints configuration of a Hadoop cluster.
Extracted with thanks from Tom White's Hadoop book.

Edit compile.sh
    set hadoop_home variable

compile
    $ ./compile.sh
this will create a jar file : a.jar

Run using:
    $  hadoop jar a.jar   config.ConfigurationPrinter | sort
or
    $  ./run.sh

Example:
    say we want to look for 'dfs.support.append' variable

    $  ./run.sh  | grep dfs.support.append

