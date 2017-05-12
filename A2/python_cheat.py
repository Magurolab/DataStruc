def countRPal(N):
        if (N <=1):
            return 1;
        elif (N ==2 | N == 3):
            return 2;
        else:
            return countRPal(N/2) + countRPal(N -2);

xs = [countRPal(i)for i in range(1,100)]

for i in range(10,1, -2):
    print i