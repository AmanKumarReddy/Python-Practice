while True:
    
    print("============enter your birthday dates============\n")
    
    r = int(input("enter your born year: "))
    m = int(input("enter the month number: "))
    d = int(input("enter the date of your day: "))
    
    o = input(f"\ncheck once again! Your Date of birth is {d}/{m}/{r}. Is it correct? (yes/no): \n")
    
    if o.lower() == "no":
        print("\nthen plz re-enter again...........\n ")
    elif o.lower() == "yes":
        
        print("\n===========enter the current dates======  \n")
        
        ar = int(input("now enter the present year: "))
        mo = int(input("enter the present month: "))
        da = int(input("and enter the present day: "))
        break


D = 30
if da < d:
    da += D
    mo -= 1

if mo < m:
    mo += 12
    ar -= 1

years = ar - r
months = mo - m
days = da - d

print("\n\n")
print("so finally you are", years, "years +", months, "months and +", days, "days old")