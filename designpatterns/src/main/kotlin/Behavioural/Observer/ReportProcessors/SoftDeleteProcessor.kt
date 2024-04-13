package Behavioural.Observer.ReportProcessors

import Behavioural.Observer.Event

// @Component
class SoftDeleteProcessor() : ReportProcessor {
    override fun isInterested(event: Event): Boolean {
        return event.type == Event.EventType.SOFT_DELETE
    }

    override fun processEvent(event: Event) {
        // ... business logic here
    }
}