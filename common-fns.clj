

(def data '(1 2 3 4 5 6))

; Map
; Apply a function on each element of the collection
(map inc data)          ; (2 3 4 5 6 7)
(map #(* % 2) data)     ; (2 4 6 8 10 12)

; Filter
; Return only those elements that match a criteria
(filter odd? data)      ; (1 3 5)
(filter #(> % 4) data)  ; (5 6)

; Reduce
; takes a function that accepts two arguments
; applies that function on the first two elements
; then applies it on the output and next element, etc 
(reduce * data)   ; ((1*2) *3 ) * 4) ...
