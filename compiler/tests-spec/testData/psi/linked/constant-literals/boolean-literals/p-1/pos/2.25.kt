/*
 * KOTLIN PSI SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 25
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the valueArgument.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun f1() {
    f2(`true` = expr)

    f3(`false` = (0L - 10 + throw E() - -.09))

    f4(
        `true` = return return,
        `false` = try {} finally {},
        `true` = 0x10
    )
}