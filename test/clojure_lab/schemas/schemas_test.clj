(ns schemas-test
    (:require [clojure.test :refer :all]
      [schema.core :as s]
      [product :refer [Product]]))

(deftest test-product
  (is (s/validate Product {:id 1
                           :name "Product 1"
                           :price 100
                           :description "Description 1"
                           :stock 10})))