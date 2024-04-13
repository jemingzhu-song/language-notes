package Behavioural.Strategy

import Behavioural.Strategy.ExtractorStrategies.ExtractorStrategy

// @Service
class NextBestTaskService(
    /*
        This is an @Autowired list of Strategies that implement the "ExtractoryStrategy" interface. The implementation
        of this Strategy pattern is almost identical to the Observer Pattern implementation.

        Using the Strategy pattern makes it easy to create new Strategies as you only have to create a new class that
        implements the ExtractoryStrategy (Strategy) interface, and that's it!
    */
    private val extractorStrategies: Set<ExtractorStrategy>
) {

    fun buildSprintNextBestTasks(graph: Graph): List<String> {
        /*
            Build a list of "Next Best Tasks" (Strings) by using the list of ExtractorStrategies:
            • PullRequestReviewExtractorStrategy
            • PulLRequestNeedsWorkExtractorStrategy
            • FailedBuildExtractorStrategy
            • FailedDeploymentExtractorStrategy

            To extract out and build the corresponding Next Best Task object (String)
        */

        return extractorStrategies.flatMap { extractor ->
            extractor.getSprintTasks(graph.sprintAssociatedRelationQuery)
        }
    }

    fun buildProjectNextBestTasks(graph: Graph): List<String> {
        return extractorStrategies.flatMap { extractor ->
            extractor.getProjectTasks(graph.projectAssociatedRelationQuery)
        }
    }
}

// Models
sealed class Graph(
    val sprintAssociatedRelationQuery: SprintAssociatedRelationQuery,
    val projectAssociatedRelationQuery: ProjectAssociatedRelationQuery
) {
    sealed class SprintAssociatedRelationQuery(
        val sprintAssociatedPullRequestReview: SprintAssociatedPullRequestReview,
        val sprintAssociatedPullNeedsWork: SprintAssociatedPullNeedsWork,
        val sprintAssociatedBuild: SprintAssociatedBuild,
        val sprintAssociatedDeployment: SprintAssociatedDeployment
    ) {

        class SprintAssociatedPullRequestReview(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                   val pullRequestReview: String
                ) {}
            }
        }

        class SprintAssociatedPullNeedsWork(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                    val pullRequestNeedsWork: String
                ) {}
            }
        }

        class SprintAssociatedBuild(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                    val build: String
                ) {}
            }
        }

        class SprintAssociatedDeployment(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                    val deployment: String
                ) {}
            }
        }
    }

    sealed class ProjectAssociatedRelationQuery(
        val projectAssociatedPullRequestReview: ProjectAssociatedPullRequestReview,
        val projectAssociatedPullNeedsWork: ProjectAssociatedPullNeedsWork,
        val projectAssociatedBuild: ProjectAssociatedBuild,
        val projectAssociatedDeployment: ProjectAssociatedDeployment
    ) {

        class ProjectAssociatedPullRequestReview(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                    val pullRequestReview: String
                ) {}
            }
        }

        class ProjectAssociatedPullNeedsWork(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                    val pullRequestNeedsWork: String
                ) {}
            }
        }

        class ProjectAssociatedBuild(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                    val build: String
                ) {}
            }
        }

        class ProjectAssociatedDeployment(val edges: List<Edge>) {
            class Edge(val node: Node) {
                class Node(
                    val deployment: String
                ) {}
            }
        }
    }
}