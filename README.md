## Java Primitive Pairs

Provides pair classes with the same interface as the [Apache Commons Pair
classes](https://commons.apache.org/proper/commons-lang/javadocs/api-3.4/org/apache/commons/lang3/tuple/package-summary.html),
but with versions specialized to `double`, `int`, and `long`, allowing users
to avoid the cost of working with boxed types.

To include the library in your project (Java 7+ supported), add the following
to your POM:

```xml
<project>
...
    <dependencies>
        ...
        <dependency>
            <groupId>net.mintern</groupId>
            <artifactId>primitive-pairs</artifactId>
            <version>1.0</version>
        </dependency>
        ...
    </dependencies>
...
</project>
```

### Sample usage

```java
List<ObjIntPair<String>> enumerated = new ArrayList<>();
int i = 0;
for (String s: myStrings) {
    enumerated.add(ObjIntPair.of(s, i++));
}
```

### Pair types

As with the Apache Commons Pair, each pair type is comprised of a base
`FooPair`, an `ImmutableFooPair`, and a `MutableFooPair`. The supported
combinations are:

- `ObjDoublePair`
- `ObjLongPair`
- `ObjIntPair`
- `DoublePair` (two `double`s)
- `DoubleLongPair`
- `DoubleIntPair`
- `LongPair` (two `long`s)
- `LongIntPair`
- `IntLongPair`
- `IntPair` (two `int`s)

For these four types, this provides all possible combinations.  (The
`ObjPair`, of course, is simply Apache's `Pair`.) If you order the types as
`Object`, `Double`, `Long`, `Int`, then the widest type comes first.

`IntLongPair` is the only exception to this pattern. Because of the shape of
classes like `ObjIntPair` and `DoubleIntPair`, a pair that consists of a value
and its corresponding index would typically have the index second. Since
`long` can also be used to number sequences, it seemed useful to provide an
`IntLongPair` for numbering a series of `int` values without reversing the
typical `(value, index)` pattern encouraged by the rest of this library.

### Contributing

I will happily accept Pull Requests. If you have any questions, ask away.
Please keep changes to a minimum; do not make gratuitous style changes.

#### Building

In the root directory, run `mvn install`. That will build everything.

### Related projects

All of my Java libraries are available in the
[mintern-java](https://github.com/mintern-java) organization.
