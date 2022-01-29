const canvas = document.getElementById('canvas1'); 
const ctx = canvas.getContext('2d'); 
const CANVAS_WIDTH = canvas.width = 600; 
const CANVAS_HEIGHT = canvas.height = 600; 

class Project {
   constructor() {
       //Store variables
   }
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
class Animation {
    constructor(playerImage, spriteWidth, spriteHeight, nSprites, yPosition) {
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

//System variables                                
const project = new Project();                    
const Background = new BackgroundClass();         
const FillRect = new FillRectClass();             
const Rect = new RectClass();                     
const Circle = new CircleClass();                 
const FillCircle = new FillCircleClass();         
const Triangle = new TriangleClass();             
const FillTriangle = new FillTriangleClass();     

setup();                   
function setup(){          
	ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
	Background.draw("rgb("+(0)+", "+(255)+", "+(0)+")");      
	project.a = 1;       
	project.b = 2;       
	project.c = Math.sin(2**(project.a+3));       
	project.x = 0;       
	console.log(project.c);     
	project.a = 0;       
	project.c = Math.sin(2**(project.a+3));       
	console.log(project.c);     
	animate();                         
};                         

function animate(){          
	ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      
	Background.draw("rgb("+(project.x)+", "+(255)+", "+(0)+")");      
	Circle.draw(100+project.x, 100, 100, 50,"rgb("+(20)+", "+(20)+", "+(20)+")");     
	FillCircle.draw(100+project.x, 250, 50,"rgb("+(200)+", "+(20)+", "+(20)+")");     
	Rect.draw(100+project.x, 350, 50, 50, 20,"rgb("+(200)+", "+(20)+", "+(20)+")");     
	FillRect.draw(100+project.x, 450, 50, 50,"rgb("+(200)+", "+(20)+", "+(200)+")");     
	Triangle.draw(500, 100, 550, 100, 550, 150, 5,"rgb("+(00)+", "+(200)+", "+(200)+")");     
	FillTriangle.draw(500, 300, 550, 300, 550, 250,"rgb("+(00)+", "+(200)+", "+(200)+")");     
	project.x = (project.x+1)%255;       
	console.log(project.c);     
	requestAnimationFrame(animate);      
}              

