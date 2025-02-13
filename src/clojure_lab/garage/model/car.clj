(ns clojure-lab.garage.model.car
  (:require [schema.core :as s]))

(def carSchema {
               :model          s/Str
               :engine         s/Str
               :fuel-level     s/Int
               :turbo-pressure s/Num
               })