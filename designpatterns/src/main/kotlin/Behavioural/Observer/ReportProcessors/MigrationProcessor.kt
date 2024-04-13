package Behavioural.Observer.ReportProcessors

import Behavioural.Observer.Event

// @Component
class MigrationProcessor() : ReportProcessor {
    override fun isInterested(event: Event): Boolean {
        return event.type == Event.EventType.MIGRATE
    }

    override fun processEvent(event: Event) {
        // ... business logic here
    }
}