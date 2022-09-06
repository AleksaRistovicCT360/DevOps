class Regex {

private regex = /(?:[^Groovy]*)/
private match = "This is Groovy" =~ regex

def getMatch() {
if(match) {
    def i = 0
    while(match) {
        println match[i]
        i++
    }
    
    }else {
        println "No match found"
        }
}

private regex2 = /(yo)/
private hi = "Hello everyone how are you today" =~ regex2

def getMatch2() {
if(hi) {
    def i = 0
    while(hi) {
        println hi[i]
        i++
    }
    
    }else {
        println "No match found"
        }

    }
}