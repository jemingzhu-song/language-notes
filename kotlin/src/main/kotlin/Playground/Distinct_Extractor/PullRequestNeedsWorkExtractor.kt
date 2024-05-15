package Playground.Distinct_Extractor

class PullRequestNeedsWorkExtractor() : NextBestTaskExtractor {
    override fun getJQLSubFilter(): String {
        return "PullRequestReviewJQL"
    }
}