package Questions

// Q : Write a Scala program to find contiguous subarray within a given array of integers which has the largest sum
object subArray extends App {

    val arr=Array(1,2,3,4,6,7,8,9,0,23)

  println(l_sum(arr))


  def l_sum(nums: Array[Int]): Int = {
    var max_ele_val = 0;
    var max_end = 0;
    for (i <- 0 to nums.length - 1) {
      max_end = max_end + nums(i);
      max_end = Integer.max(max_end, 0);

      max_ele_val = Integer.max(max_ele_val, max_end);
    }
    max_ele_val;
  }

}
