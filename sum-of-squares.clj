

(def data (list 1 2 3 4 5 6 7 8))
(defn square [x] (* x x))

; sum of square of all all odd numbers 
(reduce + (map square (filter odd? data)))

;To improve the readability, we rewrite this
;using the "thread-last" macro
(->> (filter odd? data)
     (map square)
     (reduce + ))

; sum of square of all odd numbers that are
; divisible by 7. Note use of anonymous functions
(->> (filter odd? data)
     (filter #(= 0 (mod %1 7)))
     (map #(* %1 %1))
     (reduce + ))