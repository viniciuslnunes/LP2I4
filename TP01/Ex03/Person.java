//Vinicius Lopes Nunes CB1640879
//Diego negrete Alves CB1740229

package tp01;

abstract class Person {
    protected String name;
    protected String address;

    protected String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }
        
    protected Person(String name, String address){
        this.name = name;
        this.address = address;
    }
        
    public String toString(){
        return "Person[ name = " + name + ", address = " + address + " ]";
    }
}