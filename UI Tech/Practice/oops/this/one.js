class Add{
     id;
     name;

    constructor(id,name){
        this.sno=id;
        this.sname=name;
        console.log("constructor")
    }
}
let result=new Add(10,"sunny")
console.log(result)