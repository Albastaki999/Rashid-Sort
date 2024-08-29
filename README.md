Function RashidSort(a: Array of Integers):
    
    Initialize b as an empty list
    high = Find the maximum value in array a
    low = Find the minimum value in array a
    
    For i from low to high:
        For each element in array a:
            If element equals i:
                Append i to list b
    
    Copy elements from list b back to array a
End Function

Time Complexity - O(n^2)
Space Complexity - O(n)
