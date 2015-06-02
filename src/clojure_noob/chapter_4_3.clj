(or + -)

((or + -) 1 2 3)

(inc 1.1)

(map inc [0 1 2 3])

(+ (inc 199) (/ 100 (- 7 2)))

(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic."
  [name]
  (str "OH. MY. GOD! " name " YOU ARE THE MOST DEFINITELY LIKE THE BEST "
       "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY TO SOMEWHERE!"))

(too-enthusiastic "Zelda")

(doc too-enthusiastic)

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
     (str "I " chop-type " chop " name "! Take that!"))
  ([name]
     (x-chop name "karate")))

(x-chop "Kanye West" "slap")

(x-chop "Kanye West")

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))

(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(codger "Billy" "Anne-Marie" "The Incredible Bulk")

(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
       (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")

(defn my-first
  [[first-thing]]
  first-thing)

(my-first ["oven" "bike" "waraxe"])

(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
                "Here they are in case you need to cry over them: "
                (clojure.string/join ", " unimportant-choices))))

(chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])

(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(defn announce-treasure-location
  [{:keys [lat lng] :as treasure-location}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(announce-treasure-location {:lat 28.22 :lng 81.33})

;; ANONYMOUS FUNCTIONS
(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

((fn [x] (* x 3)) 8)

(def my-special-multiplier (fn [x] (* x 3)))
(my-special-multiplier 12)

#(* % 3)

(#(* % 3) 8)

(map #(str "Hi, " %)
     ["Darth Vader" "Mr. Magoo"])

(#(str %1 " and " %2) "corn bread" "butter beans")

(#(identity %&) 1 "blarg" :yip)

(defn inc-maker
  "Create a custom incrementor."
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))

(inc3 7)
