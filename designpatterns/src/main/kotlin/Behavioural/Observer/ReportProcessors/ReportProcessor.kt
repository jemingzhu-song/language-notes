package Behavioural.Observer.ReportProcessors

import Behavioural.Observer.Event

/*
    This is the list of "Observers" used in the ReportProcessorService class
*/
interface ReportProcessor {

    fun isInterested(event: Event): Boolean

    fun processEvent(event: Event)
}