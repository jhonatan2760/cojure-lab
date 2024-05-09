(ns clojure-lab.symbols)

;;Symbols and conditions

;; sum
(println (+ 10 5))

;; subtract
(println (- 10 5))

;; multiple
(println (* 10 5))

;; divide
(println (/ 10 5))

;; functions

(defn simple-print-function
  "This function shows a String that was inputed when called."
  [message]
  (println "Secret message:" message))

(println (simple-print-function "Hello clojure world!"))

;; global symbol (bad use)

(def amount 10)

(println "Call A "amount)

(println "Call B "amount)

