package _05_visibilities

import _01_basics.Repository

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) public (default): accessible everywhere, even other modules (if dependent)
// Note: use judiciously
public val REPO = Repository()

// (2) internal: accessible everywhere inside same module
internal val PI = Math.PI

// (3) private: only accessible inside same file
private val ID = "TopLevel"

// Note: on file-level, protected makes no sense

