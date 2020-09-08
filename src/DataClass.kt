
fun main ()
{
    var emp=Employee()
    emp.displayInfo()
}

class Employee {
    data class Emp(var name: String, var contactNumber: String, var address: String, var salary: Double)


    fun displayInfo() = Emp("Fatma", "100601", "Dhamar", 200.000)
        .let {
            println(it)
            it.address = "sanaa"
            it.salary = 150.000
            println( it)
        }

}












