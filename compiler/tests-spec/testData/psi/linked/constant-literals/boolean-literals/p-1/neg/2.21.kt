/*
 * KOTLIN PSI SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 21
 * DESCRIPTION: The use of Boolean literals as the identifier (without backtick) in the catchBlock.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 */

fun f() {
    try {} catch (true: Any) {}

    try {} catch (@a false: Any) {}
}