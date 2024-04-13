package Behavioural.Strategy.ExtractorStrategies

import Behavioural.Strategy.Graph

// @Component
class PullRequestNeedsWorkExtractorStrategy() : ExtractorStrategy {
    override fun getSprintTasks(graph: Graph.SprintAssociatedRelationQuery): List<String> {
        return graph.sprintAssociatedPullNeedsWork.edges.map { edge ->
            toPRNeedsWorkNextBestTask(edge.node.pullRequestNeedsWork)
        }
    }

    override fun getProjectTasks(graph: Graph.ProjectAssociatedRelationQuery): List<String> {
        return graph.projectAssociatedPullNeedsWork.edges.map { edge ->
            toPRNeedsWorkNextBestTask(edge.node.pullRequestNeedsWork)
        }
    }

    private fun toPRNeedsWorkNextBestTask(pullRequestNeedsWork: String): String {
        // business logic...

        return "NextBestTask Pull Request Needs Work"
    }
}