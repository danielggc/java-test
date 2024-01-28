file://<WORKSPACE>/src/main/java/com/example/api/models/Item.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

action parameters:
offset: 490
uri: file://<WORKSPACE>/src/main/java/com/example/api/models/Item.java
text:
```scala
package com.example.api.models;

public class Item {
    private Product product;
    private Integer quiantiti;
    
    public Item(Product product, Integer quiantiti) {
        this.product = product;
        this.quiantiti = quiantiti;
    }

    
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuiantiti() {
        return quiantiti;
    }
    public void setQui@@antiti(Integer quiantiti) {
        this.quiantiti = quiantiti;
    }


    public Integer getTotalProduct( ){
        return product.getValue() * this.quiantiti;
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