class Add{
    constructor(){
        console.log("Parent")
    }
}
class Sub extends Add{
    constructor(name){
        super()
        //this.name=name;
        name=name
        console.log(name)
    }
}
new Sub("Sunny")