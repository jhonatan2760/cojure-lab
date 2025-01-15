(ns clojure-lab.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (map inc [1 2 3 4]))
  (println (str "Hello" "there" "i'm using a String"))
  (println "Hello, World!"))
