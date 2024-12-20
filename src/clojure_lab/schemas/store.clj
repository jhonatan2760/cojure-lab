(ns store
    :require [schema.core :as s]
    [product :refer [Product]])

(def Store {:id   s/Int
            :name s/Str
            :type s/Str})
