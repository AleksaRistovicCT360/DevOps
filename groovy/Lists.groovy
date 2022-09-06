class Lists {

    private fruits = ["Apples", "Oranges", "Grapes"]
    private myList = [1,2,3,['a','b',"Groovy"],4]

    def getAllFruits() {
        fruits.each { val -> println val}
    }

    def getAllMyList() {
        myList.each { println it}
    }
    

}