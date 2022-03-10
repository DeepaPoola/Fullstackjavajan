class Add{
    constructor(sno,sname){
      sno=sno;
      sname=sname
    }
  }
  class Sub{
    constructor(sno,sname,address){
        sno=sno
        sname=sname
        address=address
        
    }
  }
  let result=new Sub(10,"Guntur",new Add(20,"Pochampally"))
  console.log(result)