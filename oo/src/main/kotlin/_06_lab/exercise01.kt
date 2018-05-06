package _06_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Exercise: implement the following class hierarchy: (5 min)
// 1) on the top, there's an interface Drinkable that defines a drink() method and a property calories
// 2) an abstract class Beverage implements Drinkable and provides a generic implementation for drink() and takes calories as a constructor parameter
// 3) an open class Juice that extends Beverage, has 43 calories by default, and has an additional property hasPulp
// 4) a closed class Softdrink that extends Beverage and has 39 calories by default