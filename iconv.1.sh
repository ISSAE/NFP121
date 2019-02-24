#!/bin/bash
#enter input encoding here

#output encoding(UTF-8)
TO_ENCODING="utf-8"
#convert
CONVERT=" iconv  -f   $FROM_ENCODING  -t   $TO_ENCODING"
#loop to convert multiple files 
for  file  in  *.html; do
       x=$(file -i $file)      
       FROM_ENCODING=${x#*charset=}
       echo "$file is $FROM_ENCODING"
       if [[ $FROM_ENCODING != "utf-8" ]]; then
           $CONVERT   "$file"   -o  "${file%.txt}.utf8.converted"
       fi
done
exit 0