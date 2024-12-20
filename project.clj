(defproject clojure-lab "0.1.0-SNAPSHOT"
  :description "A simple Clojure project"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [prismatic/schema "1.1.12"]]
  :main ^:skip-aot clojure-lab.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})