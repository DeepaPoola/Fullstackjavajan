class Add{
    constructor(sno,sname){
      this.sno=sno;
      this.sname=sname
    }
  }
  class Sub{
    constructor(name,salary,address){
        this.name=name
        this.salary=salary
        this.address=address;
    }
  }
  let result=new Sub("Deepa",25000,new Add(20,"Pochampally"))
  console.log(result)
  