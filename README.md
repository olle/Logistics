Logistics Business Domain
=========================

**FORKED: This fork will, from now on diverge from the original 
  _contargo-domain_ project, with the intention to keep away from any type of
  domain implementation, and remain just a business domain definition library.**

This is a small project aimed at defining a logistics business
domain, in a structured way. The goal is to provide a business language
(primarily to use for writing/speaking) in a format that is both
familiar and useful to Java developers - **a Java library, with a `jar`
artifact**.

## This is not...

* A central implementation of any kind of functionality
* Common utilities library
* Collection of re-usable objects or classes

## This should be used for...

* Tagging local Java solutions, to create correlation between projects
* Referencing actual Java-types and documentation
* Defining the business domain, with revision control
* Sharing information about the business domain

And more. It's up to you, so join in on the fun!

## Getting started

Using `Logistics` as a library in your project, means simply including it as a 
Maven dependency. We suggest that you look at the fabulous project
[Jitpack][100], to quickly get started.

  [100]: https://jitpack.io

```xml
<dependency>
  <groupId>net.contargo</groupId>
  <artifactId>contargo-domain</artifactId>
  <version>LATEST</version>
</dependency>
```

Now you should be good to go for tagging types or linking to the
domain definitions (interfaces) from your source code.

### View locally

You may also build and read the Javadoc documentation locally,
using:

```bash
mvn javadoc:javadoc
```

You should be able to locally view the `target/site/apidocs/index.html`
document in any web browser.

## License

This project is distributed under the Apache 2.0 License, just as the original
project. The full set of terms and conditions can be seen in the 
[LICENSE](LICENSE.txt) file.

Happy hacking!
