package Playground.Distinct_Extractor

class PullRequestReviewExtractor() : NextBestTaskExtractor {
    override fun getJQLSubFilter(): String {
        return "PullRequestReviewJQL"
    }
}