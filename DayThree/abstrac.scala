abstract class Profession(){
         var profession: String = null
         var salary: Double = 0.0
         def isEmployed: Boolean = profession != null
     }
               
     class Person(var name: String, var age: Int) extends Profession{
         
         val id = Person.assignUID
                  
         def this(){
             this("No body",0)
         }
         
         def this(age: Int){
             this("No body", age)
         }
         
         def setName(name: String){
             this.name =  name
         }
         
         def setAge(age: Int){
             this.age =  age
         }
                  
         override def toString(): String ={
             "Name: "+name+" Age: "+age+" UID: "+id
         }
     }
     
     object Person{
     
       private var UID: BigInt = 0;
       private def assignUID = { UID = UID+1 ; UID }
     
     }
     
     val p = new Person                           //> p  : dayone.Wksht1.Person = Name: No body Age: 0 UID: 1
     println(p.toString)                          //> Name: No body Age: 0 UID: 1
     
     val s = new Person(2)                        //> s  : dayone.Wksht1.Person = Name: No body Age: 2 UID: 2
     println(s.toString)                          //> Name: No body Age: 2 UID: 2
     
     val t = new Person("Scala",13)               //> t  : dayone.Wksht1.Person = Name: Scala Age: 13 UID: 3
     println(t.toString)                          //> Name: Scala Age: 13 UID: 3
     t.age                                        //> res14: Int = 13
     t.name                                       //> res15: String = Scala
     t.salary = 100
     t.profession = "IT Pro"
     t.isEmployed                                 //> res16: Boolean = true
     
