(defproject fusoya "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-core "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [environ "1.1.0"]]
  :plugins [[lein-environ "1.1.0"]]
  :profiles {:dev [:profiles/dev]
             :profiles/dev {}}
  :main fusoya.core)
