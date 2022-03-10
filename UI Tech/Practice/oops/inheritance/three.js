class Add{
    constructor(sno,sname){
      this.sno=sno;
      this.sname=sname
    }
  }
  class Sub{
    constructor(sno,sname,address){
        this.sno=sno
        this.sname=sname
        this.address=address
        
    }
  }
  let result=new Sub(10,"Guntur",new Add(20,"Pochampally"))
  console.log(result)
  