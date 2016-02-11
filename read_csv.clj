; Given a CSV file and a list of column names, this function loads all the records into a in-memory data structure.
; For example, consider a CSV file that contains the first/last name of persons, their age, and zip code
;
;Smith,John,45,90210
;Frank,Peter,25,90110
;Dalton,Timothy,38,90110
;Hayes,Fred,45,92101
;
;Define a vector that contains the column names [ :firstname :lastname :age :zip ]
;And a vector of functions specifying how each column is to be transformed after reading  [ identity identity #(Integer. %) #(Integer. %)]
;
; calling this function will result in the following output
;
; ({:zip 90210, :age 45, :firstname "John", :lastname "Smith"}
; {:zip 90110, :age 25, :firstname "Peter", :lastname "Frank"}
; {:zip 90110, :age 38, :firstname "Timothy", :lastname "Dalton"}
; {:zip 92101, :age 45, :firstname "Fred", :lastname "Hayes"})

; Given a record [ "John" "Smith" "30" ] and a vector of column names [ :first_name :last_name :age ]
; it produces a map that looks like { :first_name "John" :last_name "Smith" :age 30 ]. Note that the age has
; been transformed from a string to an integer. The transformation function for each column is specified by the
; column_mapper
(defn create_record
  "rec - vector of strings that has been read from the CSV file (e.g. [ John Smith 30 Cincinati]
   column_names - vector of the column names (e.g., [:first_name :last_name :age :city]
   column_mapper - vector of functions to be applied to each column
  "
  [column_names column_mapper rec]
  (into {} (map #(hash-map %1 (%2 %3)) column_names column_mapper rec)))

(defn create_records_from_csv
  "column_names needs to be a vector containing the names of the columns in the same order as in the file.
   filename is the name of the CSV file to read from"
  [column_names column_mapper filename]
  (->> (slurp filename) 
     (clojure.string/split-lines)
     (map #(clojure.string/split % #","))
     (map #(create_record column_names column_mapper %))))

(def column_names [ :firstname :lastname :age :zip ])
(def column_mapper [ identity identity #(Integer. %) #(Integer. %)])

(create_records_from_csv column_names column_mapper "data.csv")
