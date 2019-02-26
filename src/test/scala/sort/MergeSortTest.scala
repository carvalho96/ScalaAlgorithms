package sort

import org.scalatest.FlatSpec


class MergeSortTest extends FlatSpec {

  "The Merge Sort" should "return sorted given array" in {
    val arr = Array(13,2,8,3,25,0)
    print("Input Array:\t[")
    print(arr.deep.mkString(", "))
    println("]")
    assert(MergeSort.mergeSort(arr) === Array(0,2,3,8,13,25))
    print("Output Array:\t[")
    print(arr.deep.mkString(", "))
    println("]")
  }

}