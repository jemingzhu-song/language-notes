package Behavioural.Strategy.ExtractorStrategies

import Behavioural.Strategy.Graph

// @Component
class FailedDeploymentExtractorStrategy() : ExtractorStrategy {
    override fun getSprintTasks(graph: Graph.SprintAssociatedRelationQuery): List<String> {
        return graph.sprintAssociatedDeployment.edges.map { edge ->
            toFailedDeploymentNextBestTask(edge.node.deployment)
        }
    }

    override fun getProjectTasks(graph: Graph.ProjectAssociatedRelationQuery): List<String> {
        return graph.projectAssociatedDeployment.edges.map { edge ->
            toFailedDeploymentNextBestTask(edge.node.deployment)
        }
    }

    private fun toFailedDeploymentNextBestTask(deployment: String): String {
        // business logic...

        return "NextBestTask Failed Deployment"
    }
}