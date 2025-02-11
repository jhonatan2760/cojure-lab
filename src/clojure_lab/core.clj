(ns clojure-lab.core
  (:require [clojure_lab.car-engine :as car]))

(def pulse-abarth
  {:model "Pulse Abarth"
   :engine "GSE-T270"
   :fuel-level 100
   :turbo-pressure 0.0})

(def fastback-abarth
  {:model "Fastback Abarth"
   :engine "GSE-T270"
   :fuel-level 99.3
   :turbo-pressure 0.5})

(defn -main
  "Execute car routine..."
  [& args]
  (-> pulse-abarth
      (car/insert-more-gas! 120)
      (println)))