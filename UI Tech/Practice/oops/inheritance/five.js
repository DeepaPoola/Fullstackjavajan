class Add{
    constructor(){
        console.log("Parent")
    }
}
class Sub extends Add{
    constructor(sname){
        super()
        this.sname=sname;
    }
}
let result = new Sub("Sunny")
console.log(result)