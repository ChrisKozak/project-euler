(ns project-euler.problems)

(defn numbers-divisible-by-3-or-5 [integer]
  (or (= 0 (mod integer 3))
       (= 0 (mod integer 5))))

(defn sum-of-the-multiples-of-3-or-5-below [threshhold]
  (reduce + (filter numbers-divisible-by-3-or-5 (range 1 threshhold))))



(defn fibs-less-than [limit]
  (loop [back2 0 back1 1 result []]
    (if (< (+ back2 back1) limit)
      (recur back1 (+ back2 back1) (conj result (+ back2 back1)))
      result)))


(defn sum-of-even-fibonacci-terms-less-than [limit]
  (reduce + (filter even? (fibs-less-than limit))))
