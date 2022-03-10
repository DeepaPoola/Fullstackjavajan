class Add{
  constructor(sno,sname){
    this.sno=10;
    this.sname="guntur"
  }
}
class Sub{
  constructor(name,salary,address){
      this.name="Sunny"
      this.salary=50000
      this.address=address;
  }
}
let result=new Sub("Deepa",25000,new Add(20,"Pochampally"))//this values are not taken because we already given values in constructor
console.log(result)
