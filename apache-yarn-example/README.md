apache-yarn-example
===============

Simple YARN application to run n copies of a unix command - deliberately kept simple (with minimal error handling etc.)

Usage:
======

### Unmanaged mode

$ bin/hadoop jar $HADOOP_YARN_HOME/share/hadoop/yarn/hadoop-yarn-applications-unmanaged-am-launcher-2.1.1-SNAPSHOT.jar Client -classpath apache-yarn-example-1.0-SNAPSHOT.jar -cmd "java com.hortonworks.simpleyarnapp.ApplicationMaster /bin/date 2"

### Managed mode

$ bin/hadoop fs -copyFromLocal apache-yarn-example-1.0-SNAPSHOT.jar /apps/simple/apache-yarn-example-1.0-SNAPSHOT.jar

$ bin/hadoop jar apache-yarn-example-1.0-SNAPSHOT.jar com.hortonworks.simpleyarnapp.Client /bin/date 2 /apps/simple/apache-yarn-example-1.0-SNAPSHOT.jar
  
    
