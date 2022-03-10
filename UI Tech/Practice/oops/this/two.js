class Add{
    id;
    name;

   constructor(id,name){
       this.id=id;
       this.name=name;
       console.log("constructor")
   }
}
let result=new Add(10,"sunny")
console.log(result)