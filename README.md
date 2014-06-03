###### Eyeview Interview Assignment


The goal of the assignment is to find the top trending hashtags in the file.
Repeated hashtags by the same user id should be counted once

Please implement the following functions in `FileProcessor.java`:

1. `apply` in `forEachLine` callback function (line 22). This function would be called with a batch of 1-100 lines
2. `apply` in `onDoneGetTrends` callback function (line 30). This function would be called after the file has be read with a number of trends to fetch.
