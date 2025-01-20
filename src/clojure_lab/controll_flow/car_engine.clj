(ns clojure-lab.controll-flow.car-engine)

(def max-fuel-amount 300)
(def max-turbo-pressure 1.8)

(defn get-car-fuel-level
  [car]
  (:fuel-level car))

;We are using the IF control-flow to handle it example
(defn insert-more-gas! [car gas-amount]
  (let [current-fuel-level (get-car-fuel-level car)]
  (if (< (+ current-fuel-level gas-amount) max-fuel-amount)
    (assoc car :fuel-level (+ current-fuel-level gas-amount))
   car)))

;We are using the WHEN control-flow to handle it example, when is used on cases that
;you dimmiss the else branch
(defn increase-turbo-pressure [car new-pressure-bar]
  (let [turbo-pressure (get car :turbo-pressure )
        new-turbo-pressure (+ turbo-pressure new-pressure-bar)]
    (println new-turbo-pressure)
    (println (< max-turbo-pressure new-turbo-pressure))
    (when (< new-turbo-pressure max-turbo-pressure )
      (println (str "..:::.. Turbo Boost: [||||||||] "
                    (int (* (/ new-turbo-pressure max-turbo-pressure) 100))
                    "% ..:::.."))
    )))


