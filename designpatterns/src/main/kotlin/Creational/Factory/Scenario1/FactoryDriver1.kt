package Creational.Factory.Scenario1

import java.util.*

/*
    Scenario 1

    When constructing objects with lots of fields from another object (also with a lot of fields)
*/

fun main() {
    /*
        Suppose this "rawIssueEvent" is sent to this Microservice via an API, or is received by this Microservice
        from listening to an SQS queue
    */
    val rawIssueEvent = IssueEvent(
        timestamp = Date(1712983967),
        title = "Integrate JIS with ARIS for FedRAMP prod-fedm-east",
        status = IssueEvent.IssueEventStatus.TODO,
        storyPoints = 5,
        description = "Update the application.yml and aris.sd.yml files to integrate JIS queue with ARIS",
        priority = IssueEvent.IssueEventPriority.MEDIUM,
        assignee = "jzhusong",
        reporter = "manager",
        changeType = IssueEvent.IssueEventChangeType.ASSIGNEE_UPDATED
    )

    val eventFactory = SimplifiedIssueEventFactory()

    val simplifiedIssueEvent = eventFactory.createSimplifiedEvent(rawIssueEvent)

    println(simplifiedIssueEvent)
}

/*
    Typically, the SimplifiedIssueEventFactory would be a @Component class that can be @Autowired
    into the Client class (i.e. the class that is calling/using this Factory)
*/
// @Service
class EventHandler(
    private val simplifiedIssueEventFactory: SimplifiedIssueEventFactory
) {
    fun handleEvents(rawIssueEvents: List<IssueEvent>): List<SimplifiedIssueEvent> {
        var simplifiedEvents = arrayListOf<SimplifiedIssueEvent>()

        rawIssueEvents.forEach { rawIssueEvent ->
            simplifiedEvents.add(simplifiedIssueEventFactory.createSimplifiedEvent(rawIssueEvent))
        }

        return simplifiedEvents
    }
}