function Display(){
var myParagraph=document.createElement("p")
var myText=document.createTextNode("This is my text")
myParagraph.appendChild(myText)
document.body.appendChild(myParagraph)
}
