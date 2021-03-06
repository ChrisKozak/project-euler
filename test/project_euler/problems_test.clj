(ns project-euler.problems-test
  (:require [midje.sweet :refer :all]
            [project-euler.problems :refer :all]))


(fact "Problem 1"
      (fact "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
             The sum of these multiples is 23."
            (sum-of-the-multiples-of-3-or-5-below 10) => 23)

      (fact "The sum of all the natural numbers below 1000 that are multiples of 3 or 5 multiples is 233168."
            (sum-of-the-multiples-of-3-or-5-below 1000) => 233168))


(fact "Problem 2"
      (fact "Each new term in the Fibonacci sequence is generated by adding the previous two terms.
             By starting with 1 and 2, the first 10 terms will be:
             1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... "
            (sum-of-even-fibonacci-terms-less-than 10) => 10)

      (fact "By considering the terms in the Fibonacci sequence whose values do not exceed four million,
             find the sum of the even-valued terms."
            (sum-of-even-fibonacci-terms-less-than 4000000) => 4613732))