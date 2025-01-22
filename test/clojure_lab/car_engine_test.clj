(ns clojure-lab.car-engine-test
  (:require [clojure.test :refer :all]
            [clojure_lab.car_engine :as car_engine]
            ))

(def car_pulse_abarth {:model "Pulse Abarth" :engine "GSE-T270" :fuel-level 100
                       :turbo-pressure 0.0})

(deftest test-car-controll-flow
  (testing "When requested to insert more gas and the gas level is bellow the limit, SHOULD
   increase the car gas amount."
    (is (= 250 (get (car_engine/insert-more-gas! car_pulse_abarth 150) :fuel-level)))))