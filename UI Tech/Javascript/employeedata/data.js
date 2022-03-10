let employees = [{id:101,name:"Sunny",sal:50000},
    {id:102,name:"Deepa",sal:25000},
    {id:103,name:"Nallapu",sal:20000}]
function displayData(){
    row = " ";
    for(emp of employees)
    {
        row = row +"Good Morning"
    }
    document.getElementById('1').innerHTML=row;
}