package com.github.adrienpessu.sarifviewer.exception

class SarifViewerException(val code: Int, override val message: String): Exception(message) {
    companion object {
        val INVALID_PAT = SarifViewerException(1, "Invalid GitHub PAT")
        val UNAUTHORIZED = SarifViewerException(2, "Unauthorized: \nthe token provided doesn't have the authorization to access the current repository\nor the current branch haven't been pushed")
        val INVALID_REPOSITORY = SarifViewerException(4, "Invalid repository or no analyses available")
        val INVALID_BRANCH = SarifViewerException(5, "Invalid branch")
        val INVALID_SARIF = SarifViewerException(7, "Invalid SARIF file")
        val INVALID_VIEW = SarifViewerException(8, "Invalid view type")
    }
}