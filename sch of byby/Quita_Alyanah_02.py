# Alyanah Casandra Lao
# 2024-30273 
# GWA computation of three subjects

'''
this program asks for user to enter subject codes, grades, units. then calculates rhe weighted average using the given formula.
it displays the subject details and the computed GWA.
'''
# user input for subject 1
subject1 = input("Enter subject #1 code: ") # String variable
grade1 = float(input("Enter subject #1 units: ")) # float variable
unit1 = float(input("Enter subject #1 grade: "))  # float variable


# user input for subject 2
print(" ")
subject2 = input("Enter subject #2 code: ")
grade2 = float(input("Enter subject #2 units: "))
unit2 = float(input("Enter subject #2 grade: "))


# user input for subject 3
print(" ")
subject3 = input("Enter subject #3 code: ")
grade3 = float(input("Enter subject #3 units: "))
unit3 = float(input("Enter subject #3 grade: "))

#all user inputs
print("You have entered the following:")
print(" ")

print("Subject code: " , subject1)
print("Units: " , subject1)
print("Grade: " , grade1)

print(" ")
print("Subject code: " , subject2)
print("Units: " , subject2)
print("Grade: " , grade2)


print(" ")
print("Subject code: " , subject3)
print("Units: " , subject3)
print("Grade: " , grade3)


# Computation for sum of grade x unit
g_units = (grade1 * unit1) + (grade2 * unit2) + (grade3 * unit3)

# Computation for total number of units 
u_total = unit1 + unit2 + unit3

# Computation for GWA
gwa = g_units / u_total

# Display of gwa
print(" ")
print("Your GWA is " , gwa)
