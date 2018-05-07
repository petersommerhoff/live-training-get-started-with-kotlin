package _01_oo

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Annotation for classes
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class WebService

// (2) Annotation for functions/methods
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class Get(val path: String)

// (3) Using annotations
@WebService
class UserService() {
  // ...

  @Get("/users")
  fun getUsers() {
    // ...
  }

  // (4) Java annotations can be used just as well
  @java.lang.Deprecated
  fun getAllUsers() {}
}

// See: https://kotlinlang.org/docs/reference/annotations.html