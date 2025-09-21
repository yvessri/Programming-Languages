s1 = "This is the house that Jack built."

print(s1[0:4])          # This
print(s1[5:7])          # is
print(s1.find("This"))  # 0
print(s1.find('J'))     # 21
print(s1.find("is", 4)) # 5
print(len(s1))          # 31
print(s1[5:])           # is the house that Jack built.
print(len(s1[5:]))      # 26
