(ns clojure-lab.garage.logic.engine-logic)

;We are using the IF control-flow to handle it example
(defn insert-more-gas! [current-fuel gas-amount]
  (let [current-fuel-level current-fuel]
    (if (< (+ current-fuel-level gas-amount) 300)
      (+ current-fuel-level gas-amount))))

;We are using the WHEN control-flow to handle it example, when is used on cases that
;you dimmiss the else branch
(defn increase-turbo-pressure [current-pressure new-pressure-bar]
  (let [new-turbo-pressure (+ current-pressure new-pressure-bar)
        max-turbo-pressure 1.8]
    (when (< new-turbo-pressure max-turbo-pressure)
      (println (str "..:::.. Turbo Boost: [||||||||] "
                    (int (* (/ new-turbo-pressure max-turbo-pressure) 100))
                    "% ..:::..")))))