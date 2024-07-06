package KotlinOperatorsAndFunctions

/*
 * .apply{} calls the specified function block with this value as its receiver and returns this value.
 *
 *      data class Person(var name: String, var tutorial : String)
 *      var person = Person("Anupam", "Kotlin")
 *      person.apply { this.tutorial = "Swift" }
 *      println(person)
 *
 * It is useful when you want to call certain methods on a "builder" class conditionally
 */

fun main() {
    val largeCustomer = false

    val operationalEvent = OperationalEvent.builder()
        .source("JTMP")
        .actionSubject("user")
        .action("clicked")
        .attributes(listOf("button", "fast"))
        .apply {
            if (largeCustomer) {
                this.orgId("999")
            } else {
                this.orgId("0")
            }
        }
        .tenantContext(
            OperationalEvent.TenantContext("cah2b1-fasash", "82j1ja-sd123")
        )
        .build()
}

class OperationalEvent() {
    var source: String? = null
    var actionSubject: String? = null
    var action: String? = null
    var attributes: List<String>? = null
    var tenantContext: TenantContext? = null
    var orgId: String? = null
    var workspaceAri: String? = null

    private constructor(
        source: String?,
        actionSubject: String?,
        action: String?,
        attributes: List<String>?,
        tenantContext: TenantContext?,
        orgId: String?,
        workspaceAri: String?
    ) : this () {
        this.source = source
        this.actionSubject = actionSubject
        this.action = action
        this.attributes = attributes
        this.tenantContext = tenantContext
        this.orgId = orgId
        this.workspaceAri = workspaceAri
    }

    data class TenantContext(
        val cloudId: String,
        val activationId: String
    )

    companion object {
        fun builder(): OperationalEventBuilder {
            return OperationalEventBuilder()
        }

        class OperationalEventBuilder() {
            var source: String? = null
            var actionSubject: String? = null
            var action: String? = null
            var attributes: List<String>? = null
            var tenantContext: TenantContext? = null
            var orgId: String? = null
            var workspaceAri: String? = null

            fun build(): OperationalEvent {
                return OperationalEvent(
                    source = source,
                    actionSubject = actionSubject,
                    action = action,
                    attributes = attributes,
                    tenantContext = tenantContext,
                    orgId = orgId,
                    workspaceAri = workspaceAri
                )
            }

            fun source(source: String): OperationalEventBuilder {
                this.source = source
                return this
            }

            fun actionSubject(actionSubject: String): OperationalEventBuilder {
                this.actionSubject = actionSubject
                return this
            }

            fun action(action: String): OperationalEventBuilder {
                this.action = action
                return this
            }

            fun attributes(attributes: List<String>): OperationalEventBuilder {
                this.attributes = attributes
                return this
            }

            fun tenantContext(tenantContext: TenantContext): OperationalEventBuilder {
                this.tenantContext = tenantContext
                return this
            }

            fun orgId(orgId: String): OperationalEventBuilder {
                this.orgId = orgId
                return this
            }

            fun workspaceAri(workspaceAri: String): OperationalEventBuilder {
                this.workspaceAri = workspaceAri
                return this
            }
        }
    }
}