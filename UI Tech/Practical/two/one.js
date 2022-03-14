function Change(){
    document.getElementById('demo').style.fontSize='35px';
    document.getElementById('data').style.fontSize='25px';
    document.getElementById('data').style.color='pink'
    document.getElementById('demo').style.color='red'
    document.getElementById('click').style.backgroundColor='blue'
}
//script tag can be write in headtag or body tag or external or both in head & body

//Placing scripts at the bottom of the <body> element improves the display speed, because script interpretation slows down the display.

/*Placing scripts in external files has some advantages:

It separates HTML and code
It makes HTML and JavaScript easier to read and maintain
Cached JavaScript files can speed up page loads*/

/*An external script can be referenced in 3 different ways:

With a full URL (a full web address)
With a file path (like /js/)
Without any path*/
