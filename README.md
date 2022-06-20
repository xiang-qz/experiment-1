 # experiment-1
实验一  分治算法
## 20201130456
## 实验目的
通过排序算法的程序实现和执行时间测试，与理论上的结论进行对比分析，深入理解算法时间复杂度渐进性态和和增长率的概念；理解分治算法设计的基本思想、递归程序实现的基本方法，加深对分治算法设计与分析思想的理解。  
## 实验原理
* 1.时间复杂度分析
算法的计算时间取决于算法中某些操作的执行次数，这些操作是算法时间复杂度分析的依据。增长率反映了算法的计算时间复杂度，即随着算法输入规模的增加、算法计算时间增加的趋势。算法的计算时间复杂度针对输入数据的等价类来分析或测试。  
* 2.随机数生成算法
通过程序生成（伪）随机数，作为实验用测试数据。可使用编程语言自带的random 函数生成，也可以采用一些有效的随机数生成算法生成，例如“线性同余法”，基于该算法，只要参数选择合适，所产生的伪随机数就能满足均匀性和独立性，与真正的随机数具有相近的性质。该算法的基本思想如下:  
通过设置 Xi+1=(aXi+c) mod m, n0，其中的 4 个整数参数：m——模数, m>0；a——乘数, 0<=a<m；c——增量, 0<=c<m；X0——开始值, 0<=X0<m。这样得到所求的随机数序列{Xi}，称作线形同余序列。  
* 3.分治算法
分治算法的基本思想是将一个规模为 n 的问题分解为 k 个规模较小的子问题，这些子问题相互独立且与原问题性质相同。求出子问题的解，就可得到原问题的解。分治算法设计的一般步骤包括：
(1) 分解，将要解决的问题划分成若干规模较小的同类问题；
(2) 求解，当子问题划分得足够小时，用较简单的方法解决；
(3) 合并，按原问题的要求，将子问题的解逐层合并构成原问题的解。  

## 实验输入数据
利用随机数生成算法生成具有不同大小（10、100、1000、2000、5000、10000）的数据集，数据集中元素随机。

## 实验内容
1.编程实现冒泡排序、合并排序、快速排序
2.记录三种算法的基本操作执行次数，对它们的时间复杂度进行比较分析
3.记录合并排序和快速排序的子问题规模，并用表格方式记录所有情形各子问题的规模值。  

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
该算法以比较操作为基本操作，对于两组n个不同数据的输入虽然基本操作次数不一样，但相差较小，都属于O(nlogn)，故两组输入数据的执行效率等价  

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
### 快速排序
* 两次生成100个随机数的测试数据
````
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：961
子问题规模：100
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：944
子问题规模：100
````
该算法以比较操作为基本操作，对于两组n个不同数据的输入虽然基本操作次数不一样，但相差较小，都属于O(nlogn)，故两组输入数据的执行效率等价  

* 使用随机数生成方法生成不同规模的测试数据（10、100、1000、2000、5000、10000）
````
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
10
基本操作次数：37
子问题规模：10
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
100
基本操作次数：946
子问题规模：100
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
1000
基本操作次数：16228
子问题规模：1000
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
2000
基本操作次数：34974
子问题规模：2000
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
5000
基本操作次数：105990
子问题规模：5000
gitpod /workspace/experiment-1 (main) $ javac QuickSort.java
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
gitpod /workspace/experiment-1 (main) $ java QuickSort
Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
请输入测试数据个数
10000
基本操作次数：225698
子问题规模：10000
````
## 实验结果分析
1.三种算法的时间复杂度比较图位于![时间复杂度比较图](/workspace/experiment-1/graph1.jpg)中