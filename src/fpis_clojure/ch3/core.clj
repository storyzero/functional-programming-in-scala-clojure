(ns fpis-clojure.ch3.core
  (:require [clojure.core.match :refer [match]]))

(defn sum [xs]
  (match xs
    [] 0
    [h & t] (+ h (sum t))))
  
(defn product [xs]
  (match xs
    [] 1.0
    [0.0 & r] 0.0
    [h & t] (* h (product t))))

; 3.1
; List matches the third pattern therefore answer is 3
(let [x [1 2 3 4 5]]
  (match x
    [a 2 4 & _] a
    [] 42
    [a b 3 4 & _] (+ a b)
    [h & t] (+ h (sum t))
    :else (println "failed")))

; 3.2
(defn tail [xs]
  (match xs
    [] (throw (IllegalArgumentException.))
    [_ & t] t))
