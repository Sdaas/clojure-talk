;some simple code to determine if a number is prime. 
(defn isPrime? 
    "returns true if input is a prime number"
    [n]
    (let [divisors (range 2 (inc (int (Math/sqrt n)))) 
          remainders (map #(mod n %) divisors)]
          (not-any? #(= % 0) remainders)))

(defn nPrimes
    "compute list of first N primes and optionally apply a function to each"
    ([n] (take n (filter isPrime? (iterate inc 2))))
    ([n f] (map f (nPrimes n))))

(nPrimes 20)                 ; first 20 prime numbers
(nPrimes 20 #(Math/sqrt %))  ; .. and their sqrt

; take iterate math/sqrt


