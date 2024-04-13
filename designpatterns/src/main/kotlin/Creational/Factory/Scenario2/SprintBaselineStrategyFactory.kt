class SprintBaselineStrategyFactory(
    // All the classes below are @Autowired classes
    private val jiraClient: JiraClient,
    private val sprintFilterService: SprintFilterService,
    private val tenantContextService: TenantContextService,
    private val sprintHistoryRepository: sprintHistoryRepository,
    private val issueBuilderComponent: IssueBuilderComponent
) {
    fun getSprintBaselineStrategy(): SprintBaselineStrategy {
        // ... business logic here

        return SprintBaselineStrategy(
            jiraClient,
            sprintFilterService,
            tenantContextService
        )
    }
}

class SprintBaselineStrategy(
    private val jiraClient: JiraClient,
    private val sprintFilterService: SprintFilterService,
    private val tenantContextService: TenantContextService,
)


// @Service
class JiraClient() {}

// @Service
class SprintFilterService() {}

// @Service
class TenantContextService() {}

// @Repository
class sprintHistoryRepository() {}

// @Component
class IssueBuilderComponent () {}