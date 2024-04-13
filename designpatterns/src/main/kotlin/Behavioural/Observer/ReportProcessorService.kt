package Behavioural.Observer

import Behavioural.Observer.ReportProcessors.ReportProcessor

// @Service
class ReportProcessorService(
    /*
     @Autowired list of classes that implement the ReportProcessor interface, which includes:
     • BurndownProcessor
     • CycleTimeProcessor
     • MigrationProcessor
     • SoftDeleteProcessor

     Using the Observer pattern makes it easy to create new "Observers" as you only have to create a new class that
     implements the ReportProcessor (Observer) interface, and that's it!
    */
    private val processors: Set<ReportProcessor>
) {
    fun processEvents(events: List<Event>) {

        /*
            The "Subject" (this ReportProcessorService class) loops through its list of ConcreteObservers
            and calls each of its update functions to notify the observers.
        */
        processors.forEach { processor ->
            for (event in events) {
                if (processor.isInterested(event)) {
                    processor.processEvent(event)
                } else {
                    println("Not interested in event")
                }
            }
        }
    }
}

data class Event(val name: String, val type: EventType) {
    enum class EventType {
        CREATE,
        UPDATE,
        DELETE,
        SOFT_DELETE,
        MIGRATE;
    }
}