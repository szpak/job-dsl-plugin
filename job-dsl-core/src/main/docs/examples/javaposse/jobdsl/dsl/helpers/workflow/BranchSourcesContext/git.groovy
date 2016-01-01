multibranchWorkflowJob('example') {
    branchSources {
        git {
            remote('https://github.com/jenkinsci/job-dsl-plugin.git')
            credentialsId('github-ci')
            includes('JENKINS-*')
        }
    }
}
