/*
    Scenario 1

    If the object you are creating requires a lot of `@Autowired` dependencies. This helps avoid the need for the
    Client (i.e. the class that is calling/using this Factory) to define these `@Autowired` dependencies themselves.
*/

class IssuesForAttentionService(
    /*
        By @Autowiring the SprintBaselineStrategyFactory here and using it to get back an instance of the
        concrete SprintBaselineStrategy class, you avoid the need to @Autowire all the other dependencies required
        by the concrete SprintBaselineStrategy class, which include:

            private val jiraClient: JiraClient,
            private val sprintFilterService: SprintFilterService,
            private val tenantContextService: TenantContextService,
            private val sprintHistoryRepository: sprintHistoryRepository,
            private val issueBuilderComponent: IssueBuilderComponent
    */
    private val sprintBaselineStrategyFactory: SprintBaselineStrategyFactory
) {
    fun getIssuesForAttention(): List<String> {
        val strategy = sprintBaselineStrategyFactory.getSprintBaselineStrategy()

        // ... business logic here

        return emptyList()
    }
}