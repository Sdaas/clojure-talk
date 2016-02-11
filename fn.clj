(defn foo
    "Add one to the input"
    [x]
    (inc x))

;Multiple arities
(defn bar
    "Comments about the function"
    ([x] (inc x))
    ([x y] (+ x y)))

;Return a function
(defn getAdder [] (fn [x y] (+ x y)))  ; return a fn
(def f (getAdder))                     ; store in var
(f 10 20)                              ; returns 30

; Anonymous Functions
#(+ %1 %2)              ; a function that returns two num

