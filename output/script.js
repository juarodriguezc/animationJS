const canvas = document.getElementById('canvas1'); 
const ctx = canvas.getContext('2d'); 
const CANVAS_WIDTH = canvas.width = 600; 
const CANVAS_HEIGHT = canvas.height = 600; 
let CanvasPosition = canvas.getBoundingClientRect(); 

class Project {
   constructor() {
       //Store variables
   }
};
class TextClass {
    constructor() {

    }
    write(text, x, y, size, weight=100, color = "rgb(0,0,0)", family = "Arial") {
        ctx.save();
        ctx.font = weight + " " + size + "px " + family;
        ctx.fillStyle = color;
        ctx.fillText(text, x, y);
        ctx.restore();
    };
};     
class BackgroundClass {
    constructor() {

    }
    draw(color = "rgb(255,255,255)") {
        ctx.save();
        ctx.fillStyle = color;
        ctx.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        ctx.restore();
    };
};      
class FillRectClass {
    constructor() {

    }
    draw(x, y, width, height, color = "rgb(0,0,0)") {
        ctx.save();
        ctx.fillStyle = color;
        ctx.fillRect(x, y, width, height);
        ctx.restore();
    };
};     
class RectClass {
    constructor() {

    }
    draw(x, y, width, height, borderW = 1, color = "rgb(0,0,0)") {
        ctx.save();
        ctx.lineWidth = borderW;
        ctx.strokeStyle = color;
        ctx.strokeRect(x, y, width, height);
        ctx.restore();
    };
};     
class CircleClass {
    constructor() {

    }
    draw(x, y, radius, borderW = 1, color = "rgb(0,0,0)") {
        ctx.save();
        ctx.beginPath();
        ctx.lineWidth = borderW;
        ctx.strokeStyle = color;
        ctx.arc(x, y, radius, 0, 2 * Math.PI);
        ctx.stroke();
        ctx.restore();
    };
};     
class FillCircleClass {
    constructor() {

    }
    draw(x, y, radius, color = "rgb(0,0,0)") {
        ctx.save();
        ctx.beginPath();
        ctx.fillStyle = color;
        ctx.arc(x, y, radius, 0, 2 * Math.PI);
        ctx.fill();
        ctx.restore();
    };
};     
class TriangleClass {
    constructor() {

    }
    draw(x1, y1, x2, y2, x3, y3, borderW = 1, color = "rgb(0,0,0)") {
        ctx.save();
        ctx.beginPath();
        ctx.lineWidth = borderW;
        ctx.strokeStyle = color;
        ctx.moveTo(x1, y1);
        ctx.lineTo(x2, y2);
        ctx.lineTo(x3, y3);
        ctx.closePath();
        ctx.stroke();
        ctx.restore();
    };
};     
class FillTriangleClass {
    constructor() {

    }
    draw(x1, y1, x2, y2, x3, y3, color = "rgb(0,0,0)") {
        ctx.save();
        ctx.beginPath();
        ctx.fillStyle = color;
        ctx.moveTo(x1, y1);
        ctx.lineTo(x2, y2);
        ctx.lineTo(x3, y3);
        ctx.fill();
        ctx.restore();
    };
};         
class LineClass {
    constructor() {

    }
    draw(x1, y1, x2, y2, lineW = 1, color = "rgb(0,0,0)") {
        ctx.save();
        ctx.beginPath();
        ctx.strokeStyle = color;
        ctx.lineWidth = lineW;
        ctx.moveTo(x1, y1);
        ctx.lineTo(x2, y2);
        ctx.stroke();
        ctx.closePath();
        ctx.restore();
    };
};         
class AnimationClass {
    constructor(playerImage, spriteWidth, spriteHeight, nSprites, yPosition=0) {
        this.x = 0;
        this.y = 0;

        this.playerImage = playerImage;

        this.timeAnim = 1000; //Default values

        this.spriteWidth = spriteWidth;
        this.spriteHeight = spriteHeight;

        this.width = 100; //Default values
        this.height = 100; //Default values
        this.nSprites = nSprites;

        this.yPosition = yPosition;
        this.last = Date.now();
        this.accumulator = 0;
        this.frame = 0;
    }
    animate(x, y, width, height, timeAnim) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.timeAnim = timeAnim;
        //TimeAnimation
        this.now = Date.now();
        this.passed = this.now - this.last;
        this.last = this.now;
        this.accumulator += this.passed;
        let dt = this.timeAnim / this.nSprites;
        while (this.accumulator >= dt) {
            this.accumulator -= dt;
            this.frame++;
        }
        this.draw();
    };
    draw() {
        let position = this.frame % this.nSprites;
        //ctx.fillText("Position: " + position, 10, 10);
        ctx.drawImage(this.playerImage, position * this.spriteWidth, this.yPosition * this.spriteHeight, this.spriteWidth, this.spriteHeight, this.x, this.y, this.width, this.height);
    };
};     
class RandomClass {
    constructor() {

    }
    get(a, b) {
        let mayor = (a > b) ? a : b;
        let menor = (a <= b) ? a : b;
        let numInt = Math.abs(mayor - menor);
        return (Math.random() * numInt) + menor;
    };
};     
class IntRandomClass {
    constructor() {

    }
    get(a, b) {
        let mayor = Math.floor((a > b) ? a : b);
        let menor = Math.ceil((a <= b) ? a : b);
        let numInt = Math.abs(mayor - menor + 1);
        return Math.floor((Math.random() * numInt) + menor);
    };
};         
class WaitClass {
    constructor() {

    }
    wait(a) {
        let time = Math.floor(a);
        let last = Date.now();
        let now = Date.now();
        let passed = now - last;
        while (passed < time){
            now = Date.now();
            passed = now - last;
        }
    };
};         
function newArray(num,startVal){
    var arr = [];
    for(var i=0;i<num;i++){
        arr.push(startVal);
    }
    return arr;
}      
function Len(array){
    return array.length;
}      
function DrawImg(src, x, y, width, height) {
    var img = new Image();
    img.src = src;
    ctx.drawImage(img, x, y, width, height);
}      
function CheckClick(){
    if(MOUSEPRESSED){
        MOUSECOUNT ++;
        if(MOUSECOUNT == 1){
            CLICK = true;
        }
        else{
            CLICK = false;
        } 
    }
}      

//System variables                                
const project = new Project();                    
const Background = new BackgroundClass();         
const Random = new RandomClass();                 
const IntRandom = new IntRandomClass();           
const Wait = new WaitClass();                     
//Shapes                                          
const Text = new TextClass();                     
const FillRect = new FillRectClass();             
const Rect = new RectClass();                     
const Circle = new CircleClass();                 
const FillCircle = new FillCircleClass();         
const Triangle = new TriangleClass();             
const FillTriangle = new FillTriangleClass();     
const Line = new LineClass();     
//Keyboard vars                                   
let KEYPRESSED = '';                              
let KEYRELEASED = '';                             
//Mouse vars                                      
let MOUSEX = '';                                  
let MOUSEY = '';                                  
let CLICK = false;                                
let MOUSEPRESSED = false;                         
let MOUSEXCLICK = '';                             
let MOUSEYCLICK = '';                             
let MOUSECOUNT = 0;;                              
let FRAMES = 0                                    
const A = "A";                                  
const S = "S";                                  
const D = "D";                                  
const W = "W";                                  
const ENTER = "ENTER";                          
const SPACE = "SPACE";                          
const BACKSPACE = "BACKSPACE";                  
const UP = "UP";                                
const DOWN = "DOWN";                            
const LEFT = "LEFT";                            
const RIGHT = "RIGHT";                          

setup();                   
function setup(){          
	project.state = parseInt( 0 );       
	project.xPos = parseInt( 100 );       
	project.yPos = parseInt( 300 );       
	project.paso = parseInt( 5 );       
	project.background = new Image();      
	project.background.src = "/assets/background.jpg";     
	project.idle_dog = new Image();      
	project.idle_dog.src = "/assets/dog_idle.png";     
	project.idleAnim = new AnimationClass( project.idle_dog, 575, 523, 7);    
	project.walk_dog = new Image();      
	project.walk_dog.src = "/assets/dog_walk.png";     
	project.walkAnim = new AnimationClass( project.walk_dog, 575, 523, 9);    
	project.sit_dog = new Image();      
	project.sit_dog.src = "/assets/dog_sit.png";     
	project.sitAnim = new AnimationClass( project.sit_dog, 575, 523, 5);    
	animate();                         
};                         

function animate(){          
	ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
	Background.draw("rgb("+(255)+", "+(255)+", "+(255)+")");      
	ctx.drawImage( project.background, 0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);     
	if( KEYPRESSED==RIGHT ){    
		project.state = parseInt( 1 );       
		if( project.xPos<700 ){    
			project.xPos += parseInt( project.paso );       
		}    
		else{    
			project.xPos = parseInt( -200 );       
		}    
	}    
	else if( KEYPRESSED==DOWN ){    
		project.state = parseInt( 2 );       
	}    
	else{    
		project.state = parseInt( 0 );       
	}    
	switch( project.state ){    
		case 0:          
			project.idleAnim.animate( project.xPos, project.yPos, 200, 200, 500 );        
			break;     
		case 1:          
			project.walkAnim.animate( project.xPos, project.yPos, 200, 200, 500 );        
			break;     
		case 2:          
			project.sitAnim.animate( project.xPos, project.yPos+5, 200, 200, 400 );        
			break;     
		default:             
			project.idleAnim.animate( project.xPos, project.yPos, 200, 200, 500 );        
	}          
	CheckClick();      
	FRAMES++;      
	requestAnimationFrame(animate);      
}              

window.addEventListener('keydown', (e) => {
    switch (e.key) {
        case "ArrowLeft":
            KEYPRESSED = "LEFT";
            break;
        case "ArrowRight":
            KEYPRESSED = "RIGHT";
            break;
        case "ArrowDown":
            KEYPRESSED = "DOWN";
            break;
        case "ArrowUp":
            KEYPRESSED = "UP";
            break;
        case "A":
        case "a":
            KEYPRESSED = "A";
            break;
        case "D":
        case "d":
            KEYPRESSED = "D";
            break;
        case "W":
        case "w":
            KEYPRESSED = "W";
            break;
        case "S":
        case "s":
            KEYPRESSED = "S";
            break;
        case " ":
            KEYPRESSED = "SPACE";
            break;
        case "Enter":
            KEYPRESSED = "ENTER";
            break;
        case "Backspace":
            KEYPRESSED = "BACKSPACE";
            break;

    }
});        
window.addEventListener('keyup', (e) => {
    switch (e.key) {
        case "ArrowLeft":
            KEYRELEASED = "LEFT";
            KEYPRESSED = "";
            break;
        case "ArrowRight":
            KEYRELEASED = "RIGHT";
            KEYPRESSED = "";
            break;
        case "ArrowDown":
            KEYRELEASED = "DOWN";
            KEYPRESSED = "";
            break;
        case "ArrowUp":
            KEYRELEASED = "UP";
            KEYPRESSED = "";
            break;
        case "A":
        case "a":
            KEYRELEASED = "A";
            KEYPRESSED = "";
            break;
        case "D":
        case "d":
            KEYRELEASED = "D";
            KEYPRESSED = "";
            break;
        case "W":
        case "w":
            KEYRELEASED = "W";
            KEYPRESSED = "";
            break;
        case "S":
        case "s":
            KEYRELEASED = "S";
            KEYPRESSED = "";
            break;
        case " ":
            KEYRELEASED = "SPACE";
            KEYPRESSED = "";
            break;
        case "Enter":
            KEYRELEASED = "ENTER";
            KEYPRESSED = "";
            break;
        case "Backspace":
            KEYRELEASED = "BACKSPACE";
            KEYPRESSED = "";
            break;
    }
});        

window.addEventListener('mousemove', (e) => {
    MOUSEX = e.clientX - CanvasPosition.x;
    MOUSEY = e.clientY - CanvasPosition.y;
});        
 window.addEventListener('mousedown', (e) => {
    MOUSEPRESSED = true;
    MOUSEXCLICK = e.clientX - CanvasPosition.x;
    MOUSEYCLICK = e.clientY - CanvasPosition.y;
});        
window.addEventListener('mouseup', (e) => {
    CLICK = false;
    MOUSECOUNT = 0;
    MOUSEPRESSED = false;
});        

