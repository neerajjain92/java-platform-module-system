# Java Platform Module System

### Building Module 1

```
javac -d target/com.javaworld.module1 com.javaworld.module1/module-info.java com.javaworld.module1/com/javaworld/package1/Name.java
```

### Building Module 2

```
 javac --module-path target -d target/com.javaworld.module2 com.javaworld.module2/module-info.java com.javaworld.module2/com/javaworld/package2/Hello.java
 ```

The `module-path` argument to javac. This allows us to define the module path in similar fashion to the `--class-path` switch. In this example, we are passing in the target directory because that is where previous command outputs Module 1.


### Executing the module main class

```
java --module-path target -m com.javaworld.module2/com.javaworld.package2.Hello
```

The `--module-path` switch tells Java to use /target directory as the module root, i.e., where to search for the modules. The -m switch is where we tell Java what our main class is. Notice that we preface the fully qualified class name with its module.

You will be greeted with the output `Hello Java World.`
