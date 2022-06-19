# experiment-1
实验一  分治算法
## 实验预期结果与实际结果
### 冒泡排序
* 两次生成100个随机数的测试数据
````
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：4950
gitpod /workspace/experiment-1 (main) $ 100
bash: 100: command not found
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：4950
````
该冒泡排序对于任何输入都具有相同的比较操作次数，数量级均为n^2，即时间复杂度无论输入都为O(n^2)，故两组输入数据在执行效率上是等价的  

* 使用随机数生成方法生成不同规模的测试数据（10、100、1000、2000、5000、10000）
````
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
10
基本操作次数：45
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：4950
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
1000
基本操作次数：499500
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
2000
基本操作次数：1999000
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
5000
基本操作次数：12497500
gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java BubbleSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
10000
基本操作次数：49995000
````

### 合并排序
* 两次生成100个随机数的测试数据
````
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：537
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：532
````
该算法以比较操作为基本操作，对于两组n个不同数据的输入虽然基本操作次数有一定差距，但都属于O(nlogn)，故两组输入数据的执行效率等价  

* 使用随机数生成方法生成不同规模的测试数据（10、100、1000、2000、5000、10000）
````
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
10
基本操作次数：21
子问题规模：9
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：551
子问题规模：99
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
1000
基本操作次数：8697
子问题规模：999
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
2000
基本操作次数：19410
子问题规模：1999
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
5000
基本操作次数：55283
子问题规模：4999
gitpod /workspace/experiment-1 (main) $ javac MergeSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java MergeSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
10000
基本操作次数：120611
子问题规模：9999
````