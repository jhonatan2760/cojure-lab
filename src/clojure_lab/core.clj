(ns clojure-lab.core
  (:require [clojure-lab.garage.model.car :as garage.model]
            [clojure-lab.garage.logic.engine-logic :as garage.logic]))

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
  (let [pressured-cars (map #(garage.logic/increase-turbo-pressure (:turbo-pressure %) 1.2) [pulse-abarth fastback-abarth])]
    (println pressured-cars)))