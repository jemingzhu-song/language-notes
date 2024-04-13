package Behavioural.Observer.ReportProcessors

import Behavioural.Observer.Event

// @Component
class BurndownProcessor() : ReportProcessor {
    override fun isInterested(event: Event): Boolean {
        return (event.type == Event.EventType.CREATE) || (event.type == Event.EventType.UPDATE) || (event.type == Event.EventType.DELETE)
    }

    override fun processEvent(event: Event) {
        // ... business logic here
    }
}