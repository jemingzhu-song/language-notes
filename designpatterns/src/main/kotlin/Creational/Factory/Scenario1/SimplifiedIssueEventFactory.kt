package Creational.Factory.Scenario1

import java.util.Date

// @Component class
class SimplifiedIssueEventFactory() {
    fun createSimplifiedEvent(issueEvent: IssueEvent): SimplifiedIssueEvent {
        val simplifiedIssueEventChangeType = when(issueEvent.changeType) {
            IssueEvent.IssueEventChangeType.ISSUE_CREATED -> SimplifiedIssueEvent.SimplifiedIssueEventChangeType.CREATED
            IssueEvent.IssueEventChangeType.TITLE_UPDATED,
            IssueEvent.IssueEventChangeType.STATUS_UPDATED,
            IssueEvent.IssueEventChangeType.STORY_POINTS_UPDATED,
            IssueEvent.IssueEventChangeType.DESCRIPTION_UPDATED,
            IssueEvent.IssueEventChangeType.PRIORITY_UPDATED,
            IssueEvent.IssueEventChangeType.ASSIGNEE_UPDATED,
            IssueEvent.IssueEventChangeType.STORY_POINTS_UPDATED,
            IssueEvent.IssueEventChangeType.STORY_POINTS_DELETED,
            IssueEvent.IssueEventChangeType.DESCRIPTION_DELETED,
            IssueEvent.IssueEventChangeType.PRIORITY_DELETED -> SimplifiedIssueEvent.SimplifiedIssueEventChangeType.UPDATED
            IssueEvent.IssueEventChangeType.ISSUE_DELETED -> SimplifiedIssueEvent.SimplifiedIssueEventChangeType.DELETED
        }

        return SimplifiedIssueEvent(
            timestamp = issueEvent.timestamp,
            title = issueEvent.title,
            status = SimplifiedIssueEvent.SimplifiedEventStatus.valueOf(issueEvent.status.name),
            storyPoints = issueEvent.storyPoints,
            changeType = simplifiedIssueEventChangeType
        )
    }
}

// Models
data class IssueEvent(
    val timestamp: Date,
    val title: String,
    val status: IssueEventStatus,
    val storyPoints: Int,
    val description: String,
    val priority: IssueEventPriority,
    val assignee: String,
    val reporter: String,
    val changeType: IssueEventChangeType,
) {
    enum class IssueEventStatus {
        TODO,
        IN_PROGRESS,
        DONE;
    }

    enum class IssueEventPriority {
        URGENT,
        HIGH,
        MEDIUM,
        LOW
    }

    enum class IssueEventChangeType {
        ISSUE_CREATED,
        ISSUE_DELETED,
        TITLE_UPDATED,
        STATUS_UPDATED,
        STORY_POINTS_UPDATED,
        DESCRIPTION_UPDATED,
        PRIORITY_UPDATED,
        ASSIGNEE_UPDATED,
        STORY_POINTS_DELETED,
        DESCRIPTION_DELETED,
        PRIORITY_DELETED,
        // Can't Update or Delete the "reporter" field
    }
}

data class SimplifiedIssueEvent(
    val timestamp: Date,
    val title: String,
    val status: SimplifiedEventStatus,
    val storyPoints: Int,
    val changeType: SimplifiedIssueEventChangeType
) {
    enum class SimplifiedEventStatus {
        TODO,
        IN_PROGRESS,
        DONE;
    }

    enum class SimplifiedIssueEventChangeType {
        CREATED,
        UPDATED,
        DELETED
    }
}