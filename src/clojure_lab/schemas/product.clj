(ns clojure_lab.schemas.product
    :require [schema.core :as s])

(def Product {:id s/Int
              :name s/Str
              :price s/Int  ; price is in cents
              :description s/Str
              :stock s/Int
              })
