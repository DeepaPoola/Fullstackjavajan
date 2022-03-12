class Add{
    constructor(){
        console.log("Parent")
    }
}
class Sub extends Add{
    constructor(){
        super()
        console.log("child")
    }
    multi(){
        console.log("Method")
    }
}
let s=new Sub()
s.multi()
