(defproject predictable-proxies "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha8"]]
  :aot :all
  :target-path "target/%s"
  :source-paths      ["src/clojure"]
  :java-source-paths ["src/java"]
  :profiles {:uberjar {:aot :all}})
