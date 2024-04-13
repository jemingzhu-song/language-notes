package Behavioural.Strategy.ExtractorStrategies

import Behavioural.Strategy.Graph

// @Component
class FailedBuildExtractorStrategy() : ExtractorStrategy {
    override fun getSprintTasks(graph: Graph.SprintAssociatedRelationQuery): List<String> {
        return graph.sprintAssociatedBuild.edges.map { edge ->
            toFailedBuildNextBestTask(edge.node.build)
        }
    }

    override fun getProjectTasks(graph: Graph.ProjectAssociatedRelationQuery): List<String> {
        return graph.projectAssociatedBuild.edges.map { edge ->
            toFailedBuildNextBestTask(edge.node.build)
        }
    }

    private fun toFailedBuildNextBestTask(build: String): String {
        // business logic...

        return "NextBestTask Failed Build"
    }
}