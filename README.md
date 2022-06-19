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
    基本操作次数：2698
    gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    gitpod /workspace/experiment-1 (main) $ java BubbleSort
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    请输入测试数据个数
    100
    基本操作次数：2209 
````
* 使用随机数生成方法生成不同规模的测试数据（10、100、1000、2000、5000、10000）
````
    gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    gitpod /workspace/experiment-1 (main) $ java BubbleSort
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    请输入测试数据个数
    10
    基本操作次数：5
    gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    gitpod /workspace/experiment-1 (main) $ java BubbleSort
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    请输入测试数据个数
    100
    基本操作次数：2184
    gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    gitpod /workspace/experiment-1 (main) $ java BubbleSort
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    请输入测试数据个数
    1000
    基本操作次数：246278
    gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    gitpod /workspace/experiment-1 (main) $ java BubbleSort
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    请输入测试数据个数
    10000
    基本操作次数：24975890
    gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    gitpod /workspace/experiment-1 (main) $ java BubbleSort
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    请输入测试数据个数
    2000
    基本操作次数：1005659
    gitpod /workspace/experiment-1 (main) $ javac BubbleSort.java
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    gitpod /workspace/experiment-1 (main) $ java BubbleSort
    Picked up JAVA_TOOL_OPTIONS:  -Xmx3435m
    请输入测试数据个数
    5000
    基本操作次数：6241172
````