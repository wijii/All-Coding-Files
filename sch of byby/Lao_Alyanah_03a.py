#Alyanah Casandra R Lao 
#2024-30273 
#Checks if the number is even or add and prints the largest number

x = int(input("Enter #1: ")) #gets the user input
y = int(input("Enter #2: "))

if x%2 == 0 and y%2 == 0: #checks if the x and y are divisible by 2
    if x>y: 
        print(x, "is the Largest even number") #this code runs if the x is greater than y 
    else:
        print(y, "Is the largest even number") #this code runs if the y is greater than x
    
elif x%2 != 0 and y%2 != 0: #checks if the numbers are odd
    print("Both numbers are odd")

elif x % 2 == 0 and y % 2 != 0:  # if x is even and y is odd
    print(x, "is the largest even number") #this code runs if the x is greater than y 

elif x % 2 != 0 and y % 2 == 0:  # if y is even and x is odd
    print(y, "is the largest even number") #this code runs if the y is greater than x

    



