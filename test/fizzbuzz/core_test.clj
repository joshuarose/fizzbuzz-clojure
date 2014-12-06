(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizz
  (is (= "fizz" (fizzbuzz 3))))
  (deftest buzz
    (is (= "buzz" (fizzbuzz 5))))
    (deftest both-fizz-and-buzz
      (is (= "fizzbuzz" (fizzbuzz 15))))
      (deftest neither
        (is (= 7 (fizzbuzz 7))))

        (run-tests)
