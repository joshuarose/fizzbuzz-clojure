(ns fizzbuzz.core)

(defn fizzbuzz [x]
  (cond
      (= (mod x 3) (mod x 5) 0) "fizzbuzz"
      (= (mod x 3) 0) "fizz"
      (= (mod x 5) 0) "buzz"
      :else x
))
