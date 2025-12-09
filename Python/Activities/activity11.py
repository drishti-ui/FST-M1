fruits_dict =	{
  "apple": "320",
  "orange": "80",
  "banana": "50",
  "Strawberry": "120"
}
print(fruits_dict)

fruit_check = input("Enter the fruit to check if it is available or not : ")
if fruit_check in fruits_dict :
    print("Fruit is available")
else :
    print("Fruit is not available")
