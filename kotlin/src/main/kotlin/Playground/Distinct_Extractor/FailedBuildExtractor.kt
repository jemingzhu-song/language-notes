package Playground.Distinct_Extractor

class FailedBuildExtractor() : NextBestTaskExtractor {
    override fun getJQLSubFilter(): String {
        return "FailedBuildJQL"
    }
}