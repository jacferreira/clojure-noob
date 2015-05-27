(str "a" "string")

(if true
  (do (println "Success!")
    "abra cadabra")
  (do (println "Failure :(")
    "hocus pocus"))

(def failed-protagonist-names
  ["Larry Potter"
   "Doreen the Explorer"
   "The Incredible Hulk"])

failed-protagonist-names

(nil? false)
(nil? nil)

{}

{:a 1
 :b "boring example"
 :c []}

{"string-key" +}

{:name {:first "John" :middle "Jacob" :last "Jingleheimer"}}

;; MAPS
(get {:a 0 :b 1} :b)

(get {:a 0 :b {:c "ho hum"}} :b)

(get {:a 0 :b 1} :c)

(get {:a 0 :b 1} :c "UNICORNS")

(get-in {:a 0 :b {:c "ho hum"}} [:b :c])

({:name "The Human Coffee Pot"} :name)

(:a {:a 1 :b 2 :c 3})

(get {:a 1 :b 2 :c 3} :a)

(:d {:a 1 :b 2 :c 3} "FAERIES")

(hash-map :a 1 :b 2)

;; VECTORS
[3 2 1]

(get [3 2 1] 0)

(get ["a" {:name "Pugsley Winterbotton"} "c"] 1)

(vector "creepy" "full" "moon")

(conj [1 2 3] 4)

;; LISTS
'(1 2 3 4)

(get '(100 200 300 400) 0)

(nth '(100 200 300 400) 3)

(list 1 2 3 4)

(conj '(1 2 3) 4)

;; SETS
#{"hannah montanna" "miley cyrus" 20 45}

(conj #{:a :b} :b)

(get #{:a :b} :a)

(:a #{:a :b })

(get #{:a :b} "hannah montanna")

(set [3 3 3 4 4])

(get (set [3 3 3 4 4]) 3)

(get (set [3 3 3 4 4]) 5)

(hash-set 1 1 3 1 2)

(sorted-set :b :a :c)

;; QUOTING
failed-protagonist-names

(first failed-protagonist-names)

'failed-protagonist-names

(eval 'failed-protagonist-names)

(first 'failed-protagonist-names)