numbers = input("Enter numbers: ")
numbers = [int(n) for n in numbers.split(",")]
first_num = numbers[0];
last_num = numbers[-1] 
if (first_num == last_num) :
    print(True)
else :
    print(False)
