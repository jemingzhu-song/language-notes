package Behavioural.Strategy.ExtractorStrategies

import Behavioural.Strategy.Graph

interface ExtractorStrategy {
    fun getSprintTasks(graph: Graph.SprintAssociatedRelationQuery): List<String>

    fun getProjectTasks(graph: Graph.ProjectAssociatedRelationQuery): List<String>
}