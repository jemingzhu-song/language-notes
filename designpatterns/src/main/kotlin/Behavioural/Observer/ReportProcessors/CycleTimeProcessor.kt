package Behavioural.Observer.ReportProcessors

import Behavioural.Observer.Event

// @Component
class CycleTimeProcessor() : ReportProcessor {
    override fun isInterested(event: Event): Boolean {
        return event.type == Event.EventType.UPDATE
    }

    override fun processEvent(event: Event) {
        // ... business logic here
    }
}