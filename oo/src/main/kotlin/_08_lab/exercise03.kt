package _08_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Exercise: define an interface Function<T1, T2, R> representing a binary function (two inputs, one output) (5 min)
// - it should be contravariant w.r.t. T1 and T2, and covariant w.r.t. R
// - its only member is a method apply(T1, T2): R
// - create at least one implementation Plus that is a Function<Number, Number, Double> and check its variance in assignments
