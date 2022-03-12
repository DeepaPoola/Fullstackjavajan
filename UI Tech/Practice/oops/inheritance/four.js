class Add{
    constructor(name,sal){
    
      this.name=name;
      this.sal=sal
    }
  }
  class Sub extends Add{
    constructor(sno,sname,name,sal){
      super(name,sal);
        this.sno=sno
        this.sname=sname
        //super(name,sal);//if we write here it will give error because first we have to call parent class constructor
        
    }
  }
  let result=new Sub(10,"Guntur","Sunny",50000)
  console.log(result)