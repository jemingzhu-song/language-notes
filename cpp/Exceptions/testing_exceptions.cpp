/*
 * Testing Exceptions in C++ with Catch2
*/

/*
 * 1. CHECK_NOTHROW(expr);
 *
 * Checks "expr" doesn't throw an exception
*/

/*
 * 2. CHECK_THROWS(expr);
 *
 * Checks "expr" throws an exception
*/

/*
 * 3. CHECK_THROWS_AS(expr, type);
 *
 * Checks "expr" throws "type" (or something derived from type (i.e. a superclass of "type")).
*/

/*
 * 4. CHECK_THROWS_WITH(expr, Catch::Matchers::Message("modify this message example string"));
 *
 * Checks "expr" throws an exception with a message
*/

/*
 * 5. CHECK_THROWS_MATCHES(expr, type, Catch::Matchers::Message("modify this message example string"));
 *
 * CHECK_THROWS_AS and CHECK_THROWS_WITH combined in a single check
*/

/*
 * 6. REQUIRE_NOTHROW(expr), REQUIRE_THROWS(expr), REQUIRE_THROWS_AS(expr, type),
 *    REQUIRE_THROWS_WITH(expr, Catch::Matchers::Message("message"))
 *    REQUIRE_THROWS_MATCHES(expr, Catch::Matchers::Message("message"))
 *
 *    are also available
*/

