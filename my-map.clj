
(def data '(1 2 3 4 5))
(first data)            ; 1
(rest  data)            ; (2 3 4 5)
(cons 0 data)           ; (0 1 2 3 4 5) <== PREPEND

(defn map1
    [f coll]
    (if (empty? coll)
        nil
        (cons (f (first coll)) (map1 f (rest coll)))))
