package Behavioural.Strategy.ExtractorStrategies

import Behavioural.Strategy.Graph

// @Component
class PullRequestReviewExtractorStrategy() : ExtractorStrategy {
    override fun getSprintTasks(graph: Graph.SprintAssociatedRelationQuery): List<String> {
        return graph.sprintAssociatedPullRequestReview.edges.map { edge ->
            toPRReviewNextBestTask(edge.node.pullRequestReview)
        }
    }

    override fun getProjectTasks(graph: Graph.ProjectAssociatedRelationQuery): List<String> {
        return graph.projectAssociatedPullRequestReview.edges.map { edge ->
            toPRReviewNextBestTask(edge.node.pullRequestReview)
        }
    }

    private fun toPRReviewNextBestTask(pullRequestReview: String): String {
        // business logic...

        return "NextBestTask Pull Request Review"
    }
}