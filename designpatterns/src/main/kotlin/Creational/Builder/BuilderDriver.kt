package Creational.Builder

fun main() {
    val email1 = Email.EmailBuilder()
        .setTo("mail@gmail.com")
        .setFrom("Test@gmail.com")
        .setSubject("Introducing myself")
        .setContent("Required Field Test with No Attachments")
        .build()

    println("email1 Details\n$email1\n")

    val email2 = Email.EmailBuilder()
        .setContent("Hey there! Here's a copy of your transcripts. See the attachments.")
        .setTo("user@gmail.com")
        .setFrom("michael@gmail.com")
        .setSubject("Sending a file")
            .setAttachment("File 1")
            .setAttachment("File 2")
            .setAttachment("Image 1")
        .build()

    println("email2 Details\n$email2\n")
}