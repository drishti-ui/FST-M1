import pandas

dataframe = pandas.read_csv("textfile.csv")

print(dataframe)

print("*************************")
print("Usernames :")
print(dataframe["Usernames"])

print("*************************")
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])

print("*************************")
print("Sort usernames in ascending orders : ")
print(dataframe.sort_values('Usernames'))

print("*************************")
print("Sort passwords in descending orders : ")
print(dataframe.sort_values('Usernames',ascending=False))