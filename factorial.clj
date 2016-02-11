
(defn fact
    [n]
    (if (< n 2) 
        1
        (* n (fact (dec n)))))

(defn factorial
    [n]
    (reduce * (rest (range (inc n)))))

(factorial 5)               ; returns 120