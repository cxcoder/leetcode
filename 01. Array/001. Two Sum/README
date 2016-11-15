在一个整数数组中，寻找两个元素之和等于指定值的元素下标。

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

1. 第一种两个指针i，j遍历数组求和，j的初始值为i+1，找到两个元素返回，否则返回 null，或抛出异常。这种的时间复杂度O(n^2),空间复杂度O(1)

2. 看了答案发现，可以用 HashMap 先缓存nums数组的数据，利用containsKey来实现，时间复杂度O(n)，空间复杂度O(n)，以空间换时间。
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }


