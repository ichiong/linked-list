(ns try
  (:use clojure.repl))

(defrecord Cons [car cdr])

(defn take [n xx]
  (if (= n 0) nil (Cons. (:car xx) (take (- n 1) (:cdr xx)))))