(defn titleize
  [topic]
  (str topic " for the Brave and True"))

(map titleize ["Hamsters" "Ragnarok"])

(map titleize '("Empathy" "Decorating"))

(map titleize #{"Elbows" "Soap Carving"})

(defn label-key-value
  [[key val]]
  (str "key: " key ", val: " val))

(map label-key-value {:name "Edward"
                      :occupation "perennial high-schooler"})

(into {}
      (map (fn [[key val]] [key (inc val)])
           {:max 30 :min 10}))

(map identity {:name "Bill Compton" :occupation "Dead mopey guy"})

(map str ["a" "b" "c"] '("A" "B" "C"))

(def sum #(reduce + %))
(def avg #(/ (sum %) (count %)))
(defn stats [numbers]
  (map #(% numbers) [sum count avg]))

(stats [3 4 10])

(stats [80 1 44 13 6])

(reduce (fn [new-map [key val]]
          (assoc new-map key (inc val)))
        {}
        {:max 30 :min 10})

(reduce (fn [new-map [key val]]
          (if (> val 4)
            (assoc new-map key val)
            new-map))
        {}
        {:human 4.1
         :critter 3.9})

(def vampire-database
  {0 {:makes-blood-puns? false, :has-pulse? true  :name "McFishwich"}
   1 {:makes-blood-puns? false, :has-pulse? true  :name "McMackson"}
   2 {:makes-blood-puns? true,  :has-pulse? false :name "Damon Salvatore"}
   3 {:makes-blood-puns? true,  :has-pulse? true  :name "Mickey Mouse"}})

(defn vampire-related-details [social-security-number]
  (Thread/sleep 1000)
  (get vampire-database social-security-number))

(defn vampire? [record]
  (and (:makes-blood-puns? record)
       (not (:has-pulse? record))))

(defn identify-vampire [social-security-numbers]
  (first (filter vampire?
                 (map vampire-related-details social-security-numbers))))

(time (identify-vampire (range 0 1000000)))

(concat (take 8 (repeat "na")) ["Batman!"])

(take 3 (repeatedly (fn [] (rand-int 10))))

(defn even-numbers
  ([] (even-numbers 0))
  ([n] (cons n (lazy-seq (even-numbers (+ n 2))))))

(take 10 (even-numbers))

(into {} (map identity {:sunlight-reaction "Glitter!"}))

(def add10 (partial + 10))

(add10 3)
(add10 5)

(def add-missing-elements
  (partial conj ["water" "earth" "air"]))

(add-missing-elements "unobtainium" "adamantium")

(defn my-partial [partialized-fn & args]
  (fn [& more-args]
    (apply partialized-fn (into more-args (reverse args)))))

(def add20 (my-partial + 20))

(add20 3)

(defn lousy-logger [log-level message]
  (condp = log-level
    :warn (clojure.string/lower-case message)
    :emergency (clojure.string/upper-case message)))

(def warn (partial lousy-logger :warn))

(warn "Red light ahead")
