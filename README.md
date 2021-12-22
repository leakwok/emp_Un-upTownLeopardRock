# emp_Un-upTownLeopardRock: Lea Kwok and Raven (Ruiwen) Tang
## Test Performed
Our experiment tested different sized sorted Arrays. Each was populated with elements equal to the index. Our Array sizes were 100, 1000, 1_000_000. 2^29, and 1_000_000_000. Our target was the last element of the Array. We began with some "disposable" code which simply ran some unrecorded processes at the beginning to ensure that there would be no initial lag for the first test case. Then, for each test case up to 1_000_000, we measured the current time before BinSearch (which we completed 10_000 times) and the current time after. Then, we took the difference of the times. We repeated this with LinSearch (also repeated 10_000 times) and compared the differences to see which was faster. For the cases of 2^29 and 1_000_000_000, we only ran one iteration as our machines were not able to handle greater numbers of iterations in a reasonable amount of time.

## Results
For a machine with significantly greater RAM and CPU (TLK's machine)
    Testing Array size 100:
    BinSearch difference for 10000 iterations: 1 ms
    LinSearch difference for 10000 iterations: 2 ms
    Testing Array size 1000:
    BinSearch difference for 10000 iterations: 0 ms
    LinSearch difference for 10000 iterations: 3 ms
    Testing Array size 1_000_000:
    BinSearch difference for 10000 iterations: 0 ms
    LinSearch difference for 10000 iterations: 1164 ms
    Testing Array size 2^29:
    BinSearch difference for 1 iteration: 0 ms
    LinSearch difference for 1 iteration: 108 ms
    Testing Array size 1_000_000_000:
    BinSearch difference for 1 iteration: 0 ms
    LinSearch difference for 1 iteration: 195 ms
For a machine with relatively less RAM and CPU (TRT's machine)
    Testing Array size 100:
    BinSearch difference for 10000 iterations: 1 ms
    LinSearch difference for 10000 iterations: 10 ms
    Testing Array size 1000:
    BinSearch difference for 10000 iterations: 1 ms
    LinSearch difference for 10000 iterations: 11 ms
    Testing Array size 1_000_000:
    BinSearch difference for 10000 iterations: 1 ms
    LinSearch difference for 10000 iterations: 5412 ms
    Testing Array size 2^29:
    Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at SearchDriver.main(SearchDriver.java:100)
As can be seen, the "trash" procedure at the beginning of the program is not entirely effective in reducing lag on the first case (especially in TLK's machine results). However, as we progress through the cases, it becomes apparent that greater array sizes drastically increase LinSearch runtime and the difference between BinSearch and LinSearch runtimes. However, one other point to note is that on a machine with less RAM and CPU (TRT's machine in this case), it takes less iterations of each search to produce significant times. For TLK's machine, even though we repeated the procedure 10_000 times, BinSearch still only takes very close to 0 ms. Additionally, TRT's machine is unable to handle especially large arrays and hits an exception because there is not enough heap space.

## Conclusions
- Hypothesis verified/not refuted: "Relative to the size of the dataset, binary search is faster than linear search."
- BinSearch is faster than LinSearch, and the difference increases as you increase the magnitude of the Array size. 
- The last element of the Array being the target is one of the worst cases for both LinSearch and BinSearch; other worse cases would be the target not being in the Array for both LinSearch and BinSearch and the target being at either one of the ends of the Array for BinSearch. However, we felt the difference was negligble when the Array sizes have great magnitude because the difference in # of steps is only 1.
- Machines with greater RAM and CPU require more iterations of "trash" procedures at the beginning of the program to reduce initial lag and more iterations of BinSearch to produce "significant" runtimes.
- The target being the worst case is essentially the only case we care about, because all other cases will definitely be faster. So, by checking the worst case, we have covered all the other cases.
