(ns project-euler.problem-002)

(def fib-seq
  ((fn fib [a b] (lazy-seq (cons a (fib b (+' a b))))) 1 1))

(defn sum-even-fib [max]
  (reduce + (filter even? (take-while #(< % max) fib-seq))))

(sum-even-fib 4000000)