#Alyanah Casandra R Lao
#2024-30273 
#this program calculates all even numbers from 1 to the desired number of the user
x = int(input("Enter a number: ")) #gets the user input
result = 0
if x >0: #checks if the number is greater than 0
    for i in range (1, x+1): #this code loops until it reached the end value
        if i%2 == 0: #this line checks if the current number is divisible by 2
            result += i #if it is divisible by 2 the current number adds on the varible "result"
    print("The sum of all even numbers from 1 to", x, "is",result)
elif x == 0:  #if the number is equal to 0 this line of code runs
    print("Only positive integers are allowed")
else: #if the number is less than 0 this line of code runs
    print("Only positive integers are allowed")



