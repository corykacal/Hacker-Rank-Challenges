#!/bin/python

from __future__ import print_function

import os
import sys

#
# Complete the findPoint function below.
#
def findPoint(px, py, qx, qy):
    print ((2*qx-px),(2*qy-py))

if __name__ == '__main__':
    n = int(raw_input())

    for n_itr in xrange(n):
        pxPyQxQy = raw_input().split()

        px = int(pxPyQxQy[0])

        py = int(pxPyQxQy[1])

        qx = int(pxPyQxQy[2])

        qy = int(pxPyQxQy[3])

        result = findPoint(px, py, qx, qy)