to="utf-8"
convert=""
for f in *.sh
do
    x=$(file -i $f)
	from=${x#*charset=}
	if [[ $from != $to ]]; then
	    echo "iconv -f $from -t $to $f -o $f"
		iconv -f $from -t $to $f -o $f
	fi
done
