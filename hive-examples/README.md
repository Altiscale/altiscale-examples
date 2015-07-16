# Hive UDF Examples

1. Build the Jar

mvn clean install

2. In Hive CLI: add jar /<path_to_jar>/hive-examples-1.0-SNAPSHOT.jar;

3. In Hive CLI: create temporary function my_lower as 'com.altiscale.example.ToLower';

4. In Hive CLI: select my_lower(<col>) from <table> limit 10;

