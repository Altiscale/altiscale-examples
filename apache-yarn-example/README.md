apache-yarn-example
===============

Simple YARN application to run n copies of a unix command - deliberately kept simple (with minimal error handling etc.)

Usage:
======

### Unmanaged mode for HAdoop 2.7.1
Copy the JAR to /tmp/, e.g. `scp apache-yarn-example-1.0.1.jar remote_host:/tmp/`

```
$HADOOP_HOME/bin/yarn jar $HADOOP_HOME/share/hadoop/yarn/hadoop-yarn-applications-unmanaged-am-launcher-2.7.1.jar Client -classpath /tmp/apache-yarn-example-1.0.1.jar -cmd "java com.hortonworks.simpleyarnapp.ApplicationMaster /bin/date 2"
```

### Managed mode
Copy the JAR to /tmp/, e.g. `scp apache-yarn-example-1.0.1.jar remote_host:/tmp/`
and then copy the JAR to HDFS. e.g. `hdfs dfs -copyFromLocal /tmp/apache-yarn-example-1.0.1.jar /user/$USER/`
`/user/$USER/` refers to your user directory on HDFS for the current user on the Workbench.

```
$HADOOP_HOME/bin/hdfs dfs -copyFromLocal /tmp/apache-yarn-example-1.0.1.jar /user/$USER/apache-yarn-example-1.0.1.jar

$HADOOP_HOME/bin/yarn jar /tmp/apache-yarn-example-1.0.1.jar com.hortonworks.simpleyarnapp.Client /bin/date 2 /user/$USER/apache-yarn-example-1.0.1.jar
```
    
