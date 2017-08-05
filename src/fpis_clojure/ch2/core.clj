(ns fpis-clojure.ch2.core)

; 2.1
(defn fib [n]
  (loop [cnt n
         prev 0
         curr 1]
    (if (zero? cnt)
      curr
      (recur (dec cnt) curr (+ prev curr)))))

(defn ordered [a1 a2]
  (> a2 a1))

;2.2
(defn sortedd? [ns f]
  (loop [xs ns]
    ; seq...
    (if (= (count xs) 1)
      true
      (if (f (first xs) (first (rest xs)))
        (recur (rest xs))
        false))))

;2.3
(defn curry [f]
  (fn [a]
    (fn [b]
      (f a b))))
    ;(partial f a)

;2.4
(defn uncurry [f]
  (fn [a b] ((f a) b)))

;2.5
(defn compose [f, g]
  (fn [a] (f (g a))))