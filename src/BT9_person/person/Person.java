package BT9_person.person;

public class Person {
    String name;
    int age;
    String gender;
    String address;
    int phone;
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public int getPhone(){
        return phone;
    }

    Person(String name, String address, int age, int phone, String gender){
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.gender  =gender;
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender  =gender;
    }

    public void  display(){
        System.out.println("Thông tin ai đó là:"+ (getName())+ " " + getAge() + " " + getGender()+ " " + (getAddress() )+ " " + (getPhone() ) );
    }

//    public static void main(String[] args) {
//        System.out.println("Thông tin ai đó là:"+ getName() + " " + getAge() + " " + getGender()+ " " + getAddress()+ " " + getPhone() );
////        Person p1 = new Person();
////        p1.display();
//
//    }


}

