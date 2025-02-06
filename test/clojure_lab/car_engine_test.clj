(ns clojure-lab.car-engine-test
  (:require [clojure.test :refer :all]
            [clojure_lab.car-engine :as car_engine]))

(def car_pulse_abarth {:model "Pulse Abarth" :engine "GSE-T270" :fuel-level 100
                       :turbo-pressure 0.0})

(deftest test-car-controll-flow
  (testing "When requested to fill gas and the gas level is less than the limit, SHOULD
   fill gas amount."
    (is (= 250 (get (car_engine/insert-more-gas! car_pulse_abarth 150) :fuel-level))))

  (testing "When requested to fill gas and the gas level is more than the limite, SHOULDN'T]
  fill the car gas"
    (is (= 250 (get (car_engine/insert-more-gas! car_pulse_abarth 150) :fuel-level)))))