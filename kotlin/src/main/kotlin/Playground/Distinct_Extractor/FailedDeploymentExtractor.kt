package Playground.Distinct_Extractor

class FailedDeploymentExtractor() : NextBestTaskExtractor {
    override fun getJQLSubFilter(): String {
        return "FailedDeploymentJQL"
    }
}