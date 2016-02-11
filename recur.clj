; The dangers of recursion and how to deal with it

(defn nth-element
    "return the nth element of the list"
    [n coll]
    (if (= n 1) 
        (first coll)
        (nth-element (dec n) (rest coll))))

; What happens when we run this on a list of 100k ?
(def coll (range 100000))
(nth-element 100000 coll)

; Same thing implemented using tail recursion
(defn nth-element2
    "return the nth element of the list"
    [n coll]
    (if (= n 1) 
        (first coll)
        (recur (dec n) (rest coll))))  