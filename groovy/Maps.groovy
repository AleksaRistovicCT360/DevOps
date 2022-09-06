class Maps {

    private employee = ['name' : 'Dragan', 'age' : 40, 'city' : 'Paris']
    private map = [tik : 64, bomb : 'Planted', alive : 100, dead : 20]

    def getAllEmployee() {
        employee.each { println "key: ${it.key}, value: ${it.value}"}
    } 

    def getAllMap() {
        map.each { k, v -> println "key: $k, value: $v"}
    }

    /*
    def employee = [
        'name' : 'Dragan', 
        'age' : 40,
        'city' : 'Paris'
        ]

    employee.each { println "key: ${it.key}, value: ${it.value}"}

    def map = [
        tik : 64,
        bomb : 'Planted',
        alive : 100,
        dead : 20
        ]

    map.each { k, v -> println "key: $k, value: $v"}
    */
}