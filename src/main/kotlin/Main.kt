fun main(){
    var person = Human("Brenda", 10, 35.6)
    println(person.name)
    println(person.age)
    println(person.weight)

    person.eat(1)
    person.speak("it gets easier")
    person.birthday()
    var student=User("Kelvin","Kivuva","kelvinkivuva@gmail.com","0717579088","lmode23")

println(student.email)
    println(student.phoneNumber)
}
//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
////and increments the human’s weight by the weight of the food eaten
//- speak(speech: String) :Prints the string passed to it (2
//points)
//- birthday( ) :Increments the human’s age by 1

//Create an instance of this human class and invoke all its functions
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println(" I am eating $foodWeight kgs of food" )
        weight += foodWeight
    }
    fun speak(speech:String){
//        println("It gets better")
        println("$speech")}

       fun birthday() {
           age +=1
           println(age)
       }
    }
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
class User(var firstName:String,var lastName: String,var email:String,var phoneNumber:String,var password:String)

