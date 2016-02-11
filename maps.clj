;Collection of unordered KV pairs. 
{ 1 "dog" "cat" 2 true 10  :k1 42 }
(hash-map :k1 10 :k2 20)

;The keys can be anything - numbers, string, boolean, even maps
(count m)           ; Get the number of keys in a map
(keys m)            ; Get all the keys in the map

;Looking up the values
(get m :k1) 
(:k1 m)   
(m :k1)   

;Add/Update keys/values in a map
(assoc {:k1 10 :k2 20} :k2 0 :k3 30) ; {:k1 10, :k2 0, :k3 30}

; Remove the keys from the map
(dissoc {:a 10 :b 20 :c 30 :k 40} :a :b) 

; Apply the function f to the key k1
(update m :k1 f) 
