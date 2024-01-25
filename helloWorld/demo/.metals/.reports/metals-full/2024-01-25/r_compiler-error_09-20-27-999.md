file://<WORKSPACE>/src/main/java/com/example/demo/controller/HelloWorldApi.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 353
uri: file://<WORKSPACE>/src/main/java/com/example/demo/controller/HelloWorldApi.java
text:
```scala
package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springf@@ramework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("path", method=RequestMethod.GET)
public SomeData requestMethodName(@RequestParam String param) {
    return new SomeData();
}

public class HelloWorldApi {

    @GetMapping("/saludoApi")
    public Map< String, Object > saludoApi( ) {
        Map< String, Object > result = new HashMap<>();

        result.put( "title", "hello world  sprint boot" );
        result.put("name" ,"dgc7");
        

        return result;
    }
}
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:342)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator