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
    draw(x1, y1, x2, y2, x3, y3, borderW = 1, color = "rgb(0,0,0)") {
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
        ctx.fillText("Position: " + position, 10, 10);
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
//Keyboard vars                                   
let KEYPRESSED = '';                              
let KEYRELEASED = '';                             
//Mouse vars                                      
let MOUSEX = '';                                  
let MOUSEY = '';                                  
let CLICK = false;                                
let MOUSEXCLICK = '';                             
let MOUSEYCLICK = '';                             
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
	ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
	Background.draw("rgb("+(255)+", "+(0)+", "+(255)+")");      
	project.a = 0.0;       
	project.b = parseFloat( 2 );       
	project.c = parseFloat( Math.sin(2^(project.a+3)) );       
	project.x = parseInt( 0 );       
	console.log(project.c);     
	project.a = parseFloat( 0.5 );       
	project.a++;     
	project.a += parseFloat( (Math.sin(0.5)) );       
	project.c = parseFloat( Math.sin(2^(project.a+3)) );       
	console.log(project.a);     
	project.sum = parseInt( 0 );       
	project.test = 0;       
	project.newImage = new Image();      
	project.newImage.src = '/assets/shadow_dog.png';     
	project.i = parseInt( 10 );       
	for( let i=0; i<10; i++ ){        
		for( let j=0; j<10; j++ ){        
			for( let k=0; k<10; k++ ){        
				FillCircle.draw(100+i*50, 100+j*50, 10-k,"rgb("+(25*k)+", "+(20)+", "+(20)+")");     
			}          
		}          
	}          
	project.anim1 = new AnimationClass( project.newImage, 575, 523, 7);    
	animate();                         
};                         

function animate(){          
	ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
	Background.draw("rgb("+(255)+", "+(255)+", "+(0)+")");      
	let as = parseFloat( 2 );       
	Text.write(as+as-as, 100, 100, 20, undefined, undefined, undefined);     
	let test2 = parseFloat( "holo" );       
	ctx.drawImage( project.newImage, 0, 100, CANVAS_WIDTH, 200);     
	let suma = parseInt( 2 );       
	switch( suma ){    
		case 0:          
			Text.write("Zero", 20, 20, 10, 200, undefined, undefined);     
			break;     
		case 1:          
			Text.write("One", 20, 20, 10, 200, undefined, undefined);     
			break;     
		default:             
			Text.write("None", 20, 20, 10, 200, undefined, undefined);     
	}          
	project.anim1.animate( 200, 200, 200, 200, 500 );        
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
    CLICK = true;
    MOUSEXCLICK = e.clientX - CanvasPosition.x;
    MOUSEYCLICK = e.clientY - CanvasPosition.y;
});        
window.addEventListener('mouseup', (e) => {
    CLICK = false;
});        

