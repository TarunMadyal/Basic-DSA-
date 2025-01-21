def is_palindrome(s):
    return s == s[::-1]

s = "madam"
print(f"Is {s} a Palindrome ?\n",is_palindrome(s))
