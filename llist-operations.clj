; In this code examples, we will see how  all the functions
; in list can be built using "first" and "rest"

(defn second-element
    "return the second element of the list"
    [coll]
    (first (rest coll)))

(defn nth-element
    "return the nth element of the list"
    [n coll]
    (if (= n 1) 
        (first coll)
        (nth-element (dec n) (rest coll))))

