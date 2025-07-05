class Solution:
    def isValid(self, s: str) -> bool:
        # Time: O(n), Space: O(n) in case all the chars are opening brackets stored in stack
        stack = []
        closeToOpen = {")" : "(", "}" : "{", "]" : "[",}

        for ch in s: # Loops through each char in string s
            if ch in closeToOpen: # checks if the current char is one of the keys in the dict
                if stack and stack[-1] == closeToOpen[ch]: # checking if stack is not empty and the stack peek is the corresponding open parenthesis
                    stack.pop()
                else:
                    return False
            else:
                stack.append(ch)

        return True if not stack else False