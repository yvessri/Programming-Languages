import re

input_str = input("Enter the input string: ")

# ตรวจสอบว่า input มีแต่อักษร a หรือ b และความยาวหารด้วย 4 ลงตัว
pattern = r'^[ab]{4}([ab]{4})*$'

if re.fullmatch(pattern, input_str):
    print("Accept")
else:
    print("Reject")
