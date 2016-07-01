# predictable-proxies

Example of generating proxies with Clojure

All current versions of Clojure (https://github.com/clojure/clojure/releases/tag/clojure-1.9.0-alpha8 at the time of writing) produce class files with unpredictable method order.
 
# running

Run ```lein do clean, jar``` a few times, and examine (diff or decompile and diff) target/classes/predictable_proxies/core/proxy$predictable_proxies/StatefulOverlord$ff19274a.class