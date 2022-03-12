class Add{
    constructor(){
        console.log("Parent")
    }
    m1(){
        console.log("Parent Method")
    }
}
class Sub extends Add{
    constructor(){
        super()
        super.m1()
        console.log("child")
    }
    multi(){
        console.log("Method")
    }
}
let s=new Sub()
s.multi()