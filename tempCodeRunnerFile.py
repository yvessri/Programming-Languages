import re

input_str = input("Enter the input string: ")

# FA Pattern: starts with a, followed by at least two b's
pattern = r"^(a|b)*abb+"

if re.fullmatch(pattern, input_str):
    print("Accept")
else:
    print("Reject")