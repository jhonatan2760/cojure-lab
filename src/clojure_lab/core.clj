(ns clojure-lab.core
  (:require [clojure_lab.car-engine :as car]))

(def pulse-abarth
  {:model "Pulse Abarth"
   :engine "GSE-T270"
   :fuel-level 100
   :turbo-pressure 0.0})

(defn -main
  "Execute car routine..."
  [& args]
  (println (car/insert-more-gas! pulse-abarth 120)))
