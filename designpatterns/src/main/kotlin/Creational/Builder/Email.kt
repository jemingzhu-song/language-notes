package Creational.Builder

class Email private constructor(
    val from: String,
    val to: String,
    val subject: String,
    val content: String,
    val attachments: List<String>
) {
    override fun toString(): String {
        return "From: $from | To: $to | Subject: $subject\nContent: $content\nAttachments: $attachments"
    }

    data class EmailBuilder(
        var from: String = "",
        var to: String = "",
        var subject: String = "",
        var content: String = "",
        var attachments: ArrayList<String> = arrayListOf()
    ) {
        /*
            This is called the "Fluent Builder Pattern", where you allow method chaining by returning "this"
            for each "Builder" function
        */
        fun setFrom(from: String): EmailBuilder {
            this.from = from
            return this
        }
        fun setTo(to: String): EmailBuilder {
            this.to = to
            return this
        }
        // You can also use the Kotlin "apply" function instead of returning "this"
        fun setSubject(subject: String) = apply { this.subject = subject }
        fun setContent(content: String) = apply { this.content = content }
        fun setAttachment(attachment: String) = apply { this.attachments.add(attachment) }

        fun build(): Email {
            if (from.isEmpty() || to.isEmpty() || subject.isEmpty()) {
                throw IllegalStateException("Required fields are not set")
            }
            return Email(from, to, subject, content, attachments)
        }
    }
}