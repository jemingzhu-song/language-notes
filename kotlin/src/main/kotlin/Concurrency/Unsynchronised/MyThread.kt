package Concurrency.Unsynchronised

class MyThread(var identifier: String): Runnable {
    override fun run() {
        for (i in 0..5) {
            println("$i from identifier: $identifier | at time: ${System.nanoTime()}")
        }
    }
}