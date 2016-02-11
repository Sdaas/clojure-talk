
(10 20)                 ; collection of values
(\a "hello" 10 (2 3))   ; can be heterogeneous


(list 10 20 30 )     ; creating a list
'(10 20 30)          ; shortcut for creating lists

; The leading quote prevents Clojure from evaluating
; this as a function.

; first/rest are the most fundamental operations to access
; data from a list. Everything else is built on top of this
(first '(10 20 30))    ; 10
(rest '(10 20 30))     ; (10 20)


; conj function returns returns a new collection with 
; everything added to the natural position
(conj '(10 20) 5)       ; (5 10 20)

;Not possible to locate an element by index
;List grow "naturally" by prepending
;Prepending and looking up first element is an O(1) operation
;Looking up the nth element is an O(n) operation



; Original list is not modified, it returns
; a new list. This "immutability" of dat structures is
; a big feature in clojure and key to functional programming
