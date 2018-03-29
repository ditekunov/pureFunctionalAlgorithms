package listOperations

import utils.ExceptionMessages.{EmptyInput, NoneInput}
import utils.InputException

object ListProperties {

  /**
    * Returns nth element of a sequence
    */
  def get[A](input: List[A], index: Int): A = (index, input) match {
    case (0, element :: _) => element
    case (n,  _  :: tail ) => get(tail, n - 1)
    case (_, Nil         ) => throw new InputException("\"getElement\" " + EmptyInput)
  }

  /**
    * Checks, whether a list is a palindrome
    */
  def isPalindrome[A](input: List[A]): Boolean = {
    if (input.isEmpty) throw new InputException("\"isPalindrome\" " + EmptyInput)
    else input == input.reverse
  }

  /**
    * Checks, whether a value is a palindrome
    */
  def isPalindrome[A](input: A): Boolean = input match {
    case None => throw new InputException("\"isPalindrome\" " + NoneInput)

    case Some(element) => element.toString == element.toString.reverse
  }









}