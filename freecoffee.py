bill =int(input())
abill=bill
discount =int(input())
while bill>1:
    output = bill - (bill * discount / 100)
    val=bill-output
    res=bill-val
    money=bill+res
    bill=res
amount=int(money+abill)
print(amount)
