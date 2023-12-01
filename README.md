# Commands

```bash
yarrrml-parser -i rules.yml -o rules.rml.ttl

javac CustomFunctions.java && jar cvf CustomFunctions.jar CustomFunctions.class

java -jar rmlmapper-6.2.2-r371-all.jar -f functions.ttl -m rules.rml.ttl -o dump.ttl
```

# Requirements

Requires yarrrml-parser and rmlmapper.

`npm i @rmlio/yarrrml-parser -g`

rmlmapper-java: https://github.com/RMLio/rmlmapper-java
