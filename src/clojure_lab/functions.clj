(ns clojure-lab.functions)
;;Functions, high order functions and anonymous functions


;;Simple function that receive salary input and deduct a fixed tax of 0.25

;;First form

(defn deductTax
  "deduct tax from salary"
  [salary]
  (let [tax 0.25 deducted (- salary (* salary tax)) ]
    deducted))

(println (deductTax 2500))


;;Second form, evolving the function using a conditional if to validate a salary range > 2500 - 25%

(defn deductTax
  "deduct tax from salary"
  [salary]
  (if (> salary 2500)
  (let [tax 0.25 deducted (- salary (* salary tax)) ]
    deducted)salary))

(println (deductTax 2700))

;;Third form, evolving the function using a high order function to validate if salary should be deducted

(defn deductSalary?
  "validate amount range"
  [salary] (> salary 2500))

(defn deductTax
  "deduct tax from salary"
  [salary]
  )