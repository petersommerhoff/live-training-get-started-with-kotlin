package _05_inline

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Exclude certain lambda parameters from inlining
inline fun inlined(func: () -> Unit, noinline notInlined: () -> Unit) {
  func()
  notInlined()
}