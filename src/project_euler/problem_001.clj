(ns project-euler.problem-001)

(defn sum-multi-3-and-5 [limit]
  (reduce + (filter (fn [n]
                      (or (zero? (rem n 3))
                          (zero? (rem n 5))))
                    (range 1 limit))))

(sum-multi-3-and-5 1000)
