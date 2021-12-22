# emp_Un-upTownLeopardRock: Lea Kwok and Raven (Ruiwen) Tang
## Test Performed
Our experiment tested different sized sorted Arrays. Each was populated with elements equal to the index. Our Array sizes were 100, 1000, 1_000_000. 2^29, and 1_000_000_000. Our target was the last element of the Array. We began with some "disposable" code which simply ran some unrecorded processes at the beginning to ensure that there would be no initial lag for the first test case. Then, for each test case, we measured the current time before BinSearch (which we completed 10_000 times) and the current time after. Then, we took the difference of the times. We repeated this with LinSearch (also repeated 10_000 times) and compared the differences to see which was faster. 

## Results
    Testing Array size 100:
    BinSearch difference: 0 ms
    LinSearch difference: 1 ms
    Testing Array size 1000:
    BinSearch difference: 0 ms
    LinSearch difference: 0 ms
    Testing Array size 1_000_000:
    BinSearch difference: 0 ms
    LinSearch difference: 2 ms
    Testing Array size 2^29:
    BinSearch difference: 0 ms
    LinSearch difference: 103 ms
    Testing Array size 1_000_000_000:
    BinSearch difference: 0 ms
    LinSearch difference: 191 ms
The numbers typically stayed in the same range every time we ran the program. For the Array of size 2^29, the LinSearch Difference was between 100-104. For the Array of size 1_000_000_000, the LinSearch Difference was between 190-194. As we can see, LinSearch always takes longer than BinSearch, however, the difference is more pronounced with different Array sizes, especially as the magnitude increases.

## Conclusions
BinSearch is faster than LinSearch, and the difference increases as you increase the magnitude of the Array size. BinSearch is almost always 0 ms even when the Array size is nearing the maximum size for integers in Java. The last element of the Array being the target is one of the worst cases for both LinSearch and BinSearch; other worse cases would be the target not being in the Array for both LinSearch and BinSearch and the target being at either one of the ends of the Array for BinSearch. However, we felt the difference was negligble when the Array sizes have great magnitude because the difference in steps is only 1.
