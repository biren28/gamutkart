job('paymentbank-biru') {
    scm {
        git('https://github.com/biren28/gamutkart.git')
    }
    
    steps {
        maven('-e clean test')
    }
}
