/** 
  *  True if the string with all spaces and punctuation removed is a palindrome
  *  
  *  Hint: the Scala collections API is your friend
  *  https://docs.scala-lang.org/overviews/scala-book/collections-methods.html
  */
def isPalindrome(s: String): Boolean = 
  val s_list = s.toList
  val s_rev = s.reverse
  if s == s_rev then true
  else false
