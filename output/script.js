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
	project.state = parseInt( 0 );       
	project.letterJ = parseInt( 0 );       
	project.letterS = parseInt( 1 );       
	project.endPos = newArray( 2 , 0 );       
	project.endPos[0] = parseInt( 550 );       
	project.endPos[1] = parseInt( 350 );       
	project.startPos = newArray( 2 , 0 );       
	project.startPos[0] = parseInt( -100 );       
	project.startPos[1] = parseInt( -250 );       
	project.cont = parseInt( 0 );       
	animate();                         
};                         

function animate(){          
	if( project.state==0 ){    
		ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
		Background.draw("rgb("+(247)+", "+(223)+", "+(30)+")");      
		Text.write("J", 160, project.startPos[0], 350, 600, "rgb("+(0)+", "+(0)+", "+(0)+")", "Arial");     
		Text.write("S", project.startPos[1], 550, 350, 600, "rgb("+(0)+", "+(0)+", "+(0)+")", "Arial");     
		if( project.startPos[1]<project.endPos[1]&&project.letterS==1 ){    
			project.startPos[1] = parseInt( project.startPos[1]+5 );       
		}    
		else{    
			project.letterS = parseInt( 0 );       
			project.letterJ = parseInt( 1 );       
		}    
		if( project.startPos[0]<project.endPos[0]&&project.letterJ==1 ){    
			project.startPos[0] = parseInt( project.startPos[0]+5 );       
		}    
		else{    
			project.letterJ = parseInt( 0 );       
		}    
		if( KEYPRESSED==SPACE&&project.letterJ==0&&project.letterS==0 ){    
			project.state = parseInt( 1 );       
		}    
	}    
	else if( project.state==1 ){    
		ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
		Background.draw("rgb("+(2)+", "+(22)+", "+(49)+")");      
		project.state = parseInt( 2 );       
	}    
	else if( project.state==2 ){    
		Wait.wait( 3000 );      
		project.state = parseInt( 3 );       
	}    
	else if( project.state==3 ){    
		ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
		Background.draw("rgb("+(2)+", "+(22)+", "+(49)+")");      
		Text.write("Animation", 20, 170, 90, 600, "rgb("+(project.cont+2)+", "+(project.cont+22)+", "+(project.cont+49)+")", "century gothic");     
		FillCircle.draw(152, 108, 10,"rgb("+(2)+", "+(22)+", "+(49)+")");     
		FillCircle.draw(345, 108, 10,"rgb("+(2)+", "+(22)+", "+(49)+")");     
		if( project.cont<255-49 ){    
			project.cont += parseInt( 3 );       
		}    
		else{    
			project.state = parseInt( 4 );       
		}    
	}    
	else if( project.state==4 ){    
		ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
		Background.draw("rgb("+(2)+", "+(22)+", "+(49)+")");      
		Text.write("Animation", 20, 170, 90, 600, "rgb("+(255)+", "+(255)+", "+(255)+")", "century gothic");     
		Text.write("J", 160, project.startPos[0], 350, 600, "rgb("+(255)+", "+(255)+", "+(255)+")", "Arial");     
		Text.write("S", project.startPos[1], 550, 350, 600, "rgb("+(255)+", "+(255)+", "+(255)+")", "Arial");     
		FillCircle.draw(152, 108, 10,"rgb("+(2)+", "+(22)+", "+(49)+")");     
		FillCircle.draw(345, 108, 10,"rgb("+(2)+", "+(22)+", "+(49)+")");     
		project.state = parseInt( 5 );       
	}    
	else if( project.state==5 ){    
		FillCircle.draw(152+5*Math.sin(FRAMES), 95+5*Math.cos(FRAMES), 7,"rgb("+(IntRandom.get(50,255))+", "+(IntRandom.get(50,255))+", "+(IntRandom.get(50,255))+")");     
		FillCircle.draw(345+5*Math.sin(FRAMES), 95+5*Math.cos(FRAMES), 7,"rgb("+(IntRandom.get(50,255))+", "+(IntRandom.get(50,255))+", "+(IntRandom.get(50,255))+")");     
	}    
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

