numbers = input("Enter numbers separated by commas: ")

numbers = [int(n) for n in numbers.split(",")]

total = sum(numbers)

print("Your list:", numbers)
print("Sum of the list is:", total)
