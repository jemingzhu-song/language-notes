package Playground.Distinct_Extractor

fun main() {
    var nextBestTaskExtractors: List<NextBestTaskExtractor> =
        listOf(
            FailedBuildExtractor(),
            FailedDeploymentExtractor(),
            PullRequestNeedsWorkExtractor(),
            PullRequestReviewExtractor()
        )

    var filter = nextBestTaskExtractors
        .map { extractor -> extractor.getJQLSubFilter() }.distinct()
        .joinToString(" OR ")
    println(filter)
}