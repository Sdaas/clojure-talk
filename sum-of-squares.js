var data = [1, 2, 3, 4, 5, 6];
var i;
var out = 0;
for (i=0; i<data.length; i++){
   if (data[i] % 2 !== 0 ) {
      out += data[i]*data[i];
   }
}