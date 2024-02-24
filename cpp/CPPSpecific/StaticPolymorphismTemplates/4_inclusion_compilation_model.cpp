/*
 * Inclusion Compilation Model
 *
 * https://youtu.be/l1E8GLZwP2E?t=3208
 *
 * • When it comes to templates, we include definitions (i.e. implementation) in the ".h" file
 * • This is because template definitions need to be known at COMPILE TIME (template definitions can't
 *   be instantiated at link time because that would require instantiation for all types)
 * • We need to expose implementation details in the ".h" file.
 * • This can cause slowdown in compilation as every file using ".h" file will have to instantiate the
 *   template, then it's up to the linker to ensure there is only 1 instantiation.
*/

/*
 * Therefore, we need to implement template functions or template classes in the ".h" file (i.e.
 * we need to include the definitions/implementation in the ".h" file as well), instead of the
 * ".cpp" file.
 *
 * This is different to normal functions/classes, where the declaration can be in the ".h" file but the
 * definition must be in the ".cpp" file.
 */

/*
 * Lazy Instantiation
 *
 * In Templated Classes, only member functions that are called are instantiated. Member functions that
 * are not used/called will not be instantiated.
*/
