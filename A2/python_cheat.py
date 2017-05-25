def solve_hanoi(n, from_peg, to_peg, aux_peg): 
    if (n>0):
       solve_hanoi(n-1, from_peg, aux_peg, to_peg)
       solve_hanoi(n-1, aux_peg, to_peg, from_peg)

       print "Move disk", n-1, "from Peg", from_peg, "to Peg", to_peg

    if (n <= 0):
        print "base case"

N =1
solve_hanoi(N, 0, 1, 2)
