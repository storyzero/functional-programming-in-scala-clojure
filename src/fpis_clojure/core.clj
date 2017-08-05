(ns fpis-clojure.core
  (:gen-class)
  (:require [fpis-clojure.ch2.core :as ch2]
            [fpis-clojure.ch3.core :as ch3]))

(defn -main [& args]
  (println (ch2/fib 4)))
  ;(println (is-sorted [1 2 3 4 5 6 7 8 9 10] ordered)))
