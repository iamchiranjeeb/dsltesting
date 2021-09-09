job('NodeJS example'){
    scm {
        git('git://github.com/iamchiranjeeb/jenkintesting.git'){ node ->
            node / gitConfigName('iamchiranjeeb')
            node / gitConfigmail('chandanchiranjeebsahoo@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers{
        nodejs('nodejs')
    }
    steps{
        shell('npm install')
    }
}