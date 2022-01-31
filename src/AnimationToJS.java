import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AnimationToJS extends AnimationJSBaseListener {
    //Strings de traduccion
    String[] tradPart = new String[3]; //(0 - html, 1 - css, 2 - js)
    String[] tradJS = new String[7]; //(0 - Setup. 1 - Objects, 2 - Variables, 3 - Setup, 4 - Animate, 5 - KeyBoardConfig, 6 - MouseConfig )
    HashSet<String> sVars = new HashSet<>();
    HashMap<String, String> vars = new HashMap<>();
    HashMap<String, HashMap<String, String>> varsTableF = new HashMap<>();
    HashMap<String, List<String>> varsTableFor = new HashMap<>();
    int currentCode = 0;
    int width = 300;
    int height = 300;
    int tabs = 0;
    boolean errors = false;
    boolean hideCursor = false;
    AnimationJSLexer lexer;
    String currFunction = "";

    public AnimationToJS(AnimationJSLexer lexer) {
        this.lexer = lexer;
        for (int i = 0; i < tradPart.length; i++) {
            tradPart[i] = "";
        }
        for (int i = 0; i < tradJS.length; i++) {
            tradJS[i] = "";
        }
        //Add system functions:
        sVars.add("setup");
        sVars.add("animate");
        sVars.add("Console");
        sVars.add("SetCanvas");
        sVars.add("SetBackground");
        sVars.add("RGB");
        sVars.add("Draw");
        sVars.add("Text");
        sVars.add("HideCursor");
        sVars.add("true");
        sVars.add("false");
        sVars.add("Break");
        sVars.add("Wait");
        sVars.add("while");
        sVars.add("for");
        sVars.add("if");
        sVars.add("else");
        sVars.add("switch");
        sVars.add("case");
        sVars.add("default");
        sVars.add("Len");
        //Shapes
        sVars.add("Rect");
        sVars.add("FillRect");
        sVars.add("Circle");
        sVars.add("FillCircle");
        sVars.add("Triangle");
        sVars.add("FillTriangle");
        //Math functions
        sVars.add("Sin");
        sVars.add("Cos");
        sVars.add("Random");
        sVars.add("IntRandom");
        //Math constant
        sVars.add("PI");
        //Vars
        sVars.add("KEYPRESSED");
        sVars.add("KEYRELEASED");
        sVars.add("MOUSEX");
        sVars.add("MOUSEY");
        sVars.add("CLICK");
        sVars.add("MOUSEXCLICK");
        sVars.add("MOUSEYCLICK");
        sVars.add("CANVAS_WIDTH");
        sVars.add("CANVAS_HEIGHT");

    }

    public String printTabs() {
        String retString = "";
        for (int i = 0; i < tabs; i++) {
            retString += "\t";
        }
        return retString;
    }

    public String trExpr(String expr) {
        String nExpr = expr.replaceAll("\\+", "#+#");
        nExpr = nExpr.replaceAll("\\-", "#-#");
        nExpr = nExpr.replaceAll("\\*", "#*#");
        nExpr = nExpr.replaceAll("\\/", "#/#");
        nExpr = nExpr.replaceAll("\\%", "#%#");
        nExpr = nExpr.replaceAll("\\^", "#^#");
        nExpr = nExpr.replaceAll("\\(", "#(#");
        nExpr = nExpr.replaceAll("\\)", "#)#");
        nExpr = nExpr.replaceAll("\\[", "#[#");
        nExpr = nExpr.replaceAll("\\]", "#]#");
        nExpr = nExpr.replaceAll("\\,", "#,#");
        nExpr = nExpr.replaceAll("\\==", "#==#");
        nExpr = nExpr.replaceAll("\\!=", "#!=#");
        nExpr = nExpr.replaceAll("\\>", "#>#");
        nExpr = nExpr.replaceAll("\\>=", "#>=#");
        nExpr = nExpr.replaceAll("\\<", "#<#");
        nExpr = nExpr.replaceAll("\\<=", "#<=#");
        nExpr = nExpr.replaceAll("\\|\\|", "#||#");
        nExpr = nExpr.replaceAll("\\&\\&", "#&&#");


        String[] aExpr = nExpr.split("#");

        List<String> lExpr = new ArrayList<>();
        //System.out.println("Nexpr: "+nExpr);
        for (String str : aExpr) {
            //System.out.println(str);
            if (!str.equals("")) {
                if (sVars.contains(str)) {
                    if (str.equals("Sin") || str.equals("Cos")) lExpr.add("Math." + str.toLowerCase());
                    else if (str.equals("PI")) lExpr.add("Math." + str);
                    else if (str.equals("Random")) lExpr.add("Random.get");
                    else if (str.equals("IntRandom")) lExpr.add("IntRandom.get");
                    else if (str.equals("Len")) lExpr.add(str);
                    else lExpr.add(str);
                } else {
                    if(varsTableFor.get(currFunction).contains(str))lExpr.add(str);
                    else if(vars.containsKey(str))lExpr.add("project." + str);
                    else lExpr.add(str);
                }
            }
        }
        String rExpr = "";
        for (String str : lExpr) rExpr += str;
        return rExpr;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public void enterCode(AnimationJSParser.CodeContext ctx) {
        {
            tradJS[1] +=    "class TextClass {\n" +
                            "    constructor() {\n" +
                            "\n" +
                            "    }\n" +
                            "    write(text, x, y, size, weight=100, color = \"rgb(0,0,0)\", family = \"Arial\") {\n" +
                            "        ctx.save();\n" +
                            "        ctx.font = weight + \" \" + size + \"px \" + family;\n" +
                            "        ctx.fillStyle = color;\n" +
                            "        ctx.fillText(text, x, y);\n" +
                            "        ctx.restore();\n" +
                            "    };\n" +
                            "};     \n";
        }
        {
            tradJS[1] +=    "class BackgroundClass {\n" +
                            "    constructor() {\n" +
                            "\n" +
                            "    }\n" +
                            "    draw(color = \"rgb(255,255,255)\") {\n" +
                            "        ctx.save();\n" +
                            "        ctx.fillStyle = color;\n" +
                            "        ctx.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);\n" +
                            "        ctx.restore();\n" +
                            "    };\n" +
                            "};      \n";
        }
        {
            tradJS[1] += "class FillRectClass {\n" +
                    "    constructor() {\n" +
                    "\n" +
                    "    }\n" +
                    "    draw(x, y, width, height, color = \"rgb(0,0,0)\") {\n" +
                    "        ctx.save();\n" +
                    "        ctx.fillStyle = color;\n" +
                    "        ctx.fillRect(x, y, width, height);\n" +
                    "        ctx.restore();\n" +
                    "    };\n" +
                    "};     \n";
        }
        {
            tradJS[1] += "class RectClass {\n" +
                    "    constructor() {\n" +
                    "\n" +
                    "    }\n" +
                    "    draw(x, y, width, height, borderW = 1, color = \"rgb(0,0,0)\") {\n" +
                    "        ctx.save();\n" +
                    "        ctx.lineWidth = borderW;\n" +
                    "        ctx.strokeStyle = color;\n" +
                    "        ctx.strokeRect(x, y, width, height);\n" +
                    "        ctx.restore();\n" +
                    "    };\n" +
                    "};     \n";
        }
        {
            tradJS[1] += "class CircleClass {\n" +
                    "    constructor() {\n" +
                    "\n" +
                    "    }\n" +
                    "    draw(x, y, radius, borderW = 1, color = \"rgb(0,0,0)\") {\n" +
                    "        ctx.save();\n" +
                    "        ctx.beginPath();\n" +
                    "        ctx.lineWidth = borderW;\n" +
                    "        ctx.strokeStyle = color;\n" +
                    "        ctx.arc(x, y, radius, 0, 2 * Math.PI);\n" +
                    "        ctx.stroke();\n" +
                    "        ctx.restore();\n" +
                    "    };\n" +
                    "};     \n";
        }
        {
            tradJS[1] += "class FillCircleClass {\n" +
                    "    constructor() {\n" +
                    "\n" +
                    "    }\n" +
                    "    draw(x, y, radius, color = \"rgb(0,0,0)\") {\n" +
                    "        ctx.save();\n" +
                    "        ctx.beginPath();\n" +
                    "        ctx.fillStyle = color;\n" +
                    "        ctx.arc(x, y, radius, 0, 2 * Math.PI);\n" +
                    "        ctx.fill();\n" +
                    "        ctx.restore();\n" +
                    "    };\n" +
                    "};     \n";
        }
        {
            tradJS[1] += "class TriangleClass {\n" +
                    "    constructor() {\n" +
                    "\n" +
                    "    }\n" +
                    "    draw(x1, y1, x2, y2, x3, y3, borderW = 1, color = \"rgb(0,0,0)\") {\n" +
                    "        ctx.save();\n" +
                    "        ctx.beginPath();\n" +
                    "        ctx.lineWidth = borderW;\n" +
                    "        ctx.strokeStyle = color;\n" +
                    "        ctx.moveTo(x1, y1);\n" +
                    "        ctx.lineTo(x2, y2);\n" +
                    "        ctx.lineTo(x3, y3);\n" +
                    "        ctx.closePath();\n" +
                    "        ctx.stroke();\n" +
                    "        ctx.restore();\n" +
                    "    };\n" +
                    "};     \n";
        }
        {
            tradJS[1] += "class FillTriangleClass {\n" +
                    "    constructor() {\n" +
                    "\n" +
                    "    }\n" +
                    "    draw(x1, y1, x2, y2, x3, y3, borderW = 1, color = \"rgb(0,0,0)\") {\n" +
                    "        ctx.save();\n" +
                    "        ctx.beginPath();\n" +
                    "        ctx.fillStyle = color;\n" +
                    "        ctx.moveTo(x1, y1);\n" +
                    "        ctx.lineTo(x2, y2);\n" +
                    "        ctx.lineTo(x3, y3);\n" +
                    "        ctx.fill();\n" +
                    "        ctx.restore();\n" +
                    "    };\n" +
                    "};     \n";
        }
        {
            tradJS[1] += "class AnimationClass {\n" +
                    "    constructor(playerImage, spriteWidth, spriteHeight, nSprites, yPosition=0) {\n" +
                    "        this.x = 0;\n" +
                    "        this.y = 0;\n" +
                    "\n" +
                    "        this.playerImage = playerImage;\n" +
                    "\n" +
                    "        this.timeAnim = 1000; //Default values\n" +
                    "\n" +
                    "        this.spriteWidth = spriteWidth;\n" +
                    "        this.spriteHeight = spriteHeight;\n" +
                    "\n" +
                    "        this.width = 100; //Default values\n" +
                    "        this.height = 100; //Default values\n" +
                    "        this.nSprites = nSprites;\n" +
                    "\n" +
                    "        this.yPosition = yPosition;\n" +
                    "        this.last = Date.now();\n" +
                    "        this.accumulator = 0;\n" +
                    "        this.frame = 0;\n" +
                    "    }\n" +
                    "    animate(x, y, width, height, timeAnim) {\n" +
                    "        this.x = x;\n" +
                    "        this.y = y;\n" +
                    "        this.width = width;\n" +
                    "        this.height = height;\n" +
                    "        this.timeAnim = timeAnim;\n" +
                    "        //TimeAnimation\n" +
                    "        this.now = Date.now();\n" +
                    "        this.passed = this.now - this.last;\n" +
                    "        this.last = this.now;\n" +
                    "        this.accumulator += this.passed;\n" +
                    "        let dt = this.timeAnim / this.nSprites;\n" +
                    "        while (this.accumulator >= dt) {\n" +
                    "            this.accumulator -= dt;\n" +
                    "            this.frame++;\n" +
                    "        }\n" +
                    "        this.draw();\n" +
                    "    };\n" +
                    "    draw() {\n" +
                    "        let position = this.frame % this.nSprites;\n" +
                    "        ctx.fillText(\"Position: \" + position, 10, 10);\n" +
                    "        ctx.drawImage(this.playerImage, position * this.spriteWidth, this.yPosition * this.spriteHeight, this.spriteWidth, this.spriteHeight, this.x, this.y, this.width, this.height);\n" +
                    "    };\n" +
                    "};     \n";
        }
        {
            tradJS[1] +=    "class RandomClass {\n" +
                            "    constructor() {\n" +
                            "\n" +
                            "    }\n" +
                            "    get(a, b) {\n" +
                            "        let mayor = (a > b) ? a : b;\n" +
                            "        let menor = (a <= b) ? a : b;\n" +
                            "        let numInt = Math.abs(mayor - menor);\n" +
                            "        return (Math.random() * numInt) + menor;\n" +
                            "    };\n" +
                            "};     \n";
        }
        {
            tradJS[1] +=    "class IntRandomClass {\n" +
                            "    constructor() {\n" +
                            "\n" +
                            "    }\n" +
                            "    get(a, b) {\n" +
                            "        let mayor = Math.floor((a > b) ? a : b);\n" +
                            "        let menor = Math.ceil((a <= b) ? a : b);\n" +
                            "        let numInt = Math.abs(mayor - menor + 1);\n" +
                            "        return Math.floor((Math.random() * numInt) + menor);\n" +
                            "    };\n" +
                            "};         \n";
        }
        {
            tradJS[1] +=    "class WaitClass {\n" +
                            "    constructor() {\n" +
                            "\n" +
                            "    }\n" +
                            "    wait(a) {\n" +
                            "        let time = Math.floor(a);\n" +
                            "        let last = Date.now();\n" +
                            "        let now = Date.now();\n" +
                            "        let passed = now - last;\n" +
                            "        while (passed < time){\n" +
                            "            now = Date.now();\n" +
                            "            passed = now - last;\n" +
                            "        }\n" +
                            "    };\n" +
                            "};         \n";
        }
        {
            tradJS[1] +=    "function newArray(num,startVal){\n" +
                            "    var arr = [];\n" +
                            "    for(var i=0;i<num;i++){\n" +
                            "        arr.push(startVal);\n" +
                            "    }\n" +
                            "    return arr;\n" +
                            "}      \n";
        }
        {
            tradJS[1] +=    "function Len(array){\n" +
                            "    return array.length;\n" +
                            "}      \n";
        }
        {
            tradJS[1] +=    "function DrawImg(src, x, y, width, height) {\n" +
                            "    var img = new Image();\n" +
                            "    img.src = src;\n" +
                            "    ctx.drawImage(img, x, y, width, height);\n" +
                            "}      \n";
        }
        {
            tradJS[2] += "//System variables                                \n";
            tradJS[2] += "const project = new Project();                    \n";
            tradJS[2] += "const Background = new BackgroundClass();         \n";
            tradJS[2] += "const Random = new RandomClass();                 \n";
            tradJS[2] += "const IntRandom = new IntRandomClass();           \n";
            tradJS[2] += "const Wait = new WaitClass();                     \n";
            tradJS[2] += "//Shapes                                          \n";
            tradJS[2] += "const Text = new TextClass();                     \n";
            tradJS[2] += "const FillRect = new FillRectClass();             \n";
            tradJS[2] += "const Rect = new RectClass();                     \n";
            tradJS[2] += "const Circle = new CircleClass();                 \n";
            tradJS[2] += "const FillCircle = new FillCircleClass();         \n";
            tradJS[2] += "const Triangle = new TriangleClass();             \n";
            tradJS[2] += "const FillTriangle = new FillTriangleClass();     \n";
            tradJS[2] += "//Keyboard vars                                   \n";
            tradJS[2] += "let KEYPRESSED = '';                              \n";
            tradJS[2] += "let KEYRELEASED = '';                             \n";
            tradJS[2] += "//Mouse vars                                      \n";
            tradJS[2] += "let MOUSEX = '';                                  \n";
            tradJS[2] += "let MOUSEY = '';                                  \n";
            tradJS[2] += "let CLICK = false;                                \n";
            tradJS[2] += "let MOUSEXCLICK = '';                             \n";
            tradJS[2] += "let MOUSEYCLICK = '';                             \n";
            tradJS[2] += "let FRAMES = 0                                    \n";
            tradJS[2] += "const A = \"A\";                                  \n";
            tradJS[2] += "const S = \"S\";                                  \n";
            tradJS[2] += "const D = \"D\";                                  \n";
            tradJS[2] += "const W = \"W\";                                  \n";
            tradJS[2] += "const ENTER = \"ENTER\";                          \n";
            tradJS[2] += "const SPACE = \"SPACE\";                          \n";
            tradJS[2] += "const BACKSPACE = \"BACKSPACE\";                  \n";
            tradJS[2] += "const UP = \"UP\";                                \n";
            tradJS[2] += "const DOWN = \"DOWN\";                            \n";
            tradJS[2] += "const LEFT = \"LEFT\";                            \n";
            tradJS[2] += "const RIGHT = \"RIGHT\";                          \n";








        }
        {
            tradJS[5] +=    "window.addEventListener('keydown', (e) => {\n" +
                            "    switch (e.key) {\n" +
                            "        case \"ArrowLeft\":\n" +
                            "            KEYPRESSED = \"LEFT\";\n" +
                            "            break;\n" +
                            "        case \"ArrowRight\":\n" +
                            "            KEYPRESSED = \"RIGHT\";\n" +
                            "            break;\n" +
                            "        case \"ArrowDown\":\n" +
                            "            KEYPRESSED = \"DOWN\";\n" +
                            "            break;\n" +
                            "        case \"ArrowUp\":\n" +
                            "            KEYPRESSED = \"UP\";\n" +
                            "            break;\n" +
                            "        case \"A\":\n" +
                            "        case \"a\":\n" +
                            "            KEYPRESSED = \"A\";\n" +
                            "            break;\n" +
                            "        case \"D\":\n" +
                            "        case \"d\":\n" +
                            "            KEYPRESSED = \"D\";\n" +
                            "            break;\n" +
                            "        case \"W\":\n" +
                            "        case \"w\":\n" +
                            "            KEYPRESSED = \"W\";\n" +
                            "            break;\n" +
                            "        case \"S\":\n" +
                            "        case \"s\":\n" +
                            "            KEYPRESSED = \"S\";\n" +
                            "            break;\n" +
                            "        case \" \":\n" +
                            "            KEYPRESSED = \"SPACE\";\n" +
                            "            break;\n" +
                            "        case \"Enter\":\n" +
                            "            KEYPRESSED = \"ENTER\";\n" +
                            "            break;\n" +
                            "        case \"Backspace\":\n" +
                            "            KEYPRESSED = \"BACKSPACE\";\n" +
                            "            break;\n" +
                            "\n" +
                            "    }\n" +
                            "});        \n";
        }
        {
            tradJS[5] +=    "window.addEventListener('keyup', (e) => {\n" +
                    "    switch (e.key) {\n" +
                    "        case \"ArrowLeft\":\n" +
                    "            KEYRELEASED = \"LEFT\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"ArrowRight\":\n" +
                    "            KEYRELEASED = \"RIGHT\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"ArrowDown\":\n" +
                    "            KEYRELEASED = \"DOWN\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"ArrowUp\":\n" +
                    "            KEYRELEASED = \"UP\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"A\":\n" +
                    "        case \"a\":\n" +
                    "            KEYRELEASED = \"A\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"D\":\n" +
                    "        case \"d\":\n" +
                    "            KEYRELEASED = \"D\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"W\":\n" +
                    "        case \"w\":\n" +
                    "            KEYRELEASED = \"W\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"S\":\n" +
                    "        case \"s\":\n" +
                    "            KEYRELEASED = \"S\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \" \":\n" +
                    "            KEYRELEASED = \"SPACE\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"Enter\":\n" +
                    "            KEYRELEASED = \"ENTER\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "        case \"Backspace\":\n" +
                    "            KEYRELEASED = \"BACKSPACE\";\n" +
                    "            KEYPRESSED = \"\";\n" +
                    "            break;\n" +
                    "    }\n" +
                    "});        \n";
        }
        {
            tradJS[6] +=    "window.addEventListener('mousemove', (e) => {\n" +
                            "    MOUSEX = e.clientX - CanvasPosition.x;\n" +
                            "    MOUSEY = e.clientY - CanvasPosition.y;\n" +
                            "});        \n";
        }
        {
            tradJS[6] +=    "window.addEventListener('mousedown', (e) => {\n" +
                            "    CLICK = true;\n" +
                            "    MOUSEXCLICK = e.clientX - CanvasPosition.x;\n" +
                            "    MOUSEYCLICK = e.clientY - CanvasPosition.y;\n" +
                            "});        \n";
        }
        {
            tradJS[6] +=    "window.addEventListener('mouseup', (e) => {\n" +
                            "    CLICK = false;\n" +
                            "});        \n";
        }
    }

    @Override
    public void exitCode(AnimationJSParser.CodeContext ctx) {
        //Generar los archivos html, css y javascript
        {
            tradPart[0] =   "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                            "    <title>Project Test</title>\n" +
                            "    <link rel=\"stylesheet\" href=\"style.css\" />\n" +
                            "</head>\n" +
                            "\n" +
                            "<body>\n" +
                            "    <h1>AnimationJS</h1>\n" +
                            "    <canvas id=\"canvas1\"></canvas>\n" +
                            "\n" +
                            "    <script src=\"script.js\"></script>\n" +
                            "</body>\n" +
                            "\n" +
                            "</html>";
            try {
                FileWriter myWriter = new FileWriter("output/index.html");
                myWriter.write(tradPart[0]);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Error en la escritura del archivo HTML.");
                e.printStackTrace();
            }
        }
        {
            tradPart[1] +=      "h1{\n" +
                                "    text-align: center;\n" +
                                "    font-family: 'Courier New', Courier, monospace;\n" +
                                "}\n" +
                                "#canvas1 {\n" +
                                "    border: 1px solid black;\n" +
                                "    position: absolute;\n" +
                                "    top: 50%;\n" +
                                "    left: 50%;\n" +
                                "    transform: translate(-50%, -50%);\n" +
                                "    width: " + width + "px;\n" +
                                "    height: " + height + "px;\n";
            if(hideCursor)
                tradPart[1] +=  "    cursor: none;";
            tradPart[1] +=      "}";
            try {
                FileWriter myWriter = new FileWriter("output/style.css");
                myWriter.write(tradPart[1]);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Error en la escritura del archivo CSS.");
                e.printStackTrace();
            }
        }
        {
            System.out.println(tradJS[3]);
            System.out.println(tradJS[4]);
            for (String str : tradJS) {
                tradPart[2] += str + "\n";
            }
            try {
                FileWriter myWriter = new FileWriter("output/script.js");
                myWriter.write(tradPart[2]);
                myWriter.close();
            } catch (IOException e) {
                System.out.println("Error en la escritura del archivo JS.");
                e.printStackTrace();
            }
        }
        System.out.println("\n\n\n");
        if (errors) {
            System.out.println("Proyecto creado con posibles errores semánticos");
            System.out.println("La ejecución del programa puede no ser la esperada.");
        } else {
            System.out.println("Proyecto creado correctamente.");
        }
        //System.out.println(vars);
        //System.out.println(varsTableF);
    }


    @Override
    public void enterSetup(AnimationJSParser.SetupContext ctx) {
        currentCode = 3;
        currFunction = "setup";
        varsTableF.put(currFunction, new HashMap<>());
        varsTableFor.put(currFunction, new ArrayList<>());

        tradJS[currentCode] += printTabs() + "setup();                   \n";
        tradJS[currentCode] += printTabs() + "function setup(){          \n";
        tabs += 1;
    }

    @Override
    public void exitSetup(AnimationJSParser.SetupContext ctx) {
        tradJS[currentCode] += printTabs() + "animate();                         \n";
        tabs -= 1;
        tradJS[currentCode] += printTabs() + "};                         \n";
        {
            tradJS[0] += printTabs() + "const canvas = document.getElementById('canvas1'); \n";
            tradJS[0] += printTabs() + "const ctx = canvas.getContext('2d'); \n";
            tradJS[0] += printTabs() + "const CANVAS_WIDTH = canvas.width = " + width + "; \n";
            tradJS[0] += printTabs() + "const CANVAS_HEIGHT = canvas.height = " + height + "; \n";
            tradJS[0] += printTabs() + "let CanvasPosition = canvas.getBoundingClientRect(); \n";
            tradJS[0] += printTabs() + "\n";
            tradJS[0] += printTabs() +  "class Project {\n" +
                                        "   constructor() {\n" +
                                        "       //Store variables\n" +
                                        "   }\n" +
                                        "};";
        }
    }

    @Override
    public void enterAnimate(AnimationJSParser.AnimateContext ctx) {
        currentCode = 4;
        currFunction = "animate";
        varsTableF.put(currFunction, new HashMap<>());
        varsTableFor.put(currFunction, new ArrayList<>());
        tradJS[currentCode] += printTabs() + "function animate(){          \n";
        tabs += 1;
    }

    @Override
    public void exitAnimate(AnimationJSParser.AnimateContext ctx) {
        tradJS[currentCode] += printTabs() + "FRAMES++;      \n";
        tradJS[currentCode] += printTabs() + "requestAnimationFrame(animate);      \n";
        tabs -= 1;
        tradJS[currentCode] += printTabs() + "}              \n";
    }

    @Override
    public void enterSetCanvas(AnimationJSParser.SetCanvasContext ctx) {
        width = Integer.parseInt(ctx.DT_INT(0).toString());
        height = Integer.parseInt(ctx.DT_INT(1).toString());
    }

    @Override
    public void exitSetCanvas(AnimationJSParser.SetCanvasContext ctx) {

    }

    @Override
    public void enterDeclarationG(AnimationJSParser.DeclarationGContext ctx) {
        if (vars.containsKey(ctx.ID().getText())) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" ya existe.\n", line, col);
            errors = true;
        } else {
            if(ctx.COR_IZQ() != null){
                tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText() +" = newArray( "+trExpr(ctx.num_expr().getText())+" , ";
                switch (ctx.dtype().getText()){
                    case "int":
                        tradJS[currentCode] += "0 ";
                        break;
                    case "float":
                        tradJS[currentCode] += "0.0 ";
                        break;
                    case "bool":
                        tradJS[currentCode] += "false ";
                        break;
                    case "string":
                        tradJS[currentCode] += "\"\" ";
                        break;
                }
                tradJS[currentCode] +=  ")";
                vars.put(ctx.ID().getText(), ctx.dtype().getText()+"[]");
            }
            else{
                tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText()+" = ";
                if (ctx.EQU() != null) {
                    switch (ctx.dtype().getText()){
                        case "int":
                            tradJS[currentCode] += "parseInt( ";
                            break;
                        case "float":
                            tradJS[currentCode] += "parseFloat( ";
                            break;
                        case "bool":
                            tradJS[currentCode] += "Boolean( ";
                            break;
                        case "string":
                            tradJS[currentCode] += "String( ";
                            break;
                    }
                    tradJS[currentCode] += trExpr(ctx.expr().getText())+" )";
                }
                else{
                    switch (ctx.dtype().getText()){
                        case "int":
                            tradJS[currentCode] += "0";
                            break;
                        case "float":
                            tradJS[currentCode] += "0.0";
                            break;
                        case "bool":
                            tradJS[currentCode] += "false";
                            break;
                        case "string":
                            tradJS[currentCode] += "\"\"";
                            break;
                    }
                }
                vars.put(ctx.ID().getText(), ctx.dtype().getText());
            }
        }
    }

    @Override
    public void exitDeclarationG(AnimationJSParser.DeclarationGContext ctx) {
        tradJS[currentCode] += ";       \n";
    }

    @Override public void enterDeclarationL(AnimationJSParser.DeclarationLContext ctx) {
        if (vars.containsKey(ctx.ID().getText())) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable GLOBAL con nombre \"" + ctx.ID().getText() + "\" ya existe.\n", line, col);
            errors = true;
        }
        else if(varsTableF.get(currFunction).containsKey(ctx.ID().getText())){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable LOCAL con nombre \"" + ctx.ID().getText() + "\" ya existe.\n", line, col);
            errors = true;
        }
        else {
            if(ctx.COR_IZQ() != null){
                tradJS[currentCode] += printTabs() + "let " + ctx.ID().getText() +" = newArray( "+trExpr(ctx.num_expr().getText())+" , ";
                switch (ctx.dtype().getText()){
                    case "int":
                        tradJS[currentCode] += "0 ";
                        break;
                    case "float":
                        tradJS[currentCode] += "0.0 ";
                        break;
                    case "bool":
                        tradJS[currentCode] += "false ";
                        break;
                    case "string":
                        tradJS[currentCode] += "\"\" ";
                        break;
                }
                tradJS[currentCode] +=  ") ";
                varsTableF.get(currFunction).put(ctx.ID().getText(), ctx.dtype().getText()+"[]");
            }
            else {
                tradJS[currentCode] += printTabs() + "let " + ctx.ID().getText() +" = ";
                if (ctx.EQU() != null) {
                    switch (ctx.dtype().getText()){
                        case "int":
                            tradJS[currentCode] += "parseInt( ";
                            break;
                        case "float":
                            tradJS[currentCode] += "parseFloat( ";
                            break;
                        case "bool":
                            tradJS[currentCode] += "Boolean( ";
                            break;
                        case "string":
                            tradJS[currentCode] += "String( ";
                            break;
                    }
                    tradJS[currentCode] += trExpr(ctx.expr().getText())+" )";
                }
                else{
                    switch (ctx.dtype().getText()){
                        case "int":
                            tradJS[currentCode] += "0";
                            break;
                        case "float":
                            tradJS[currentCode] += "0.0";
                            break;
                        case "bool":
                            tradJS[currentCode] += "false";
                            break;
                        case "string":
                            tradJS[currentCode] += "\"\"";
                            break;
                    }
                }
                varsTableF.get(currFunction).put(ctx.ID().getText(), ctx.dtype().getText());
            }
        }
    }

    @Override public void exitDeclarationL(AnimationJSParser.DeclarationLContext ctx) {
        tradJS[currentCode] += ";       \n";
    }

    @Override public void enterDeclarationImg(AnimationJSParser.DeclarationImgContext ctx) {
        if (vars.containsKey(ctx.ID().getText())) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" ya existe.\n", line, col);
            errors = true;
        }else{
            tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText() + " = new Image();      \n" ;
            tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText() + ".src = "+ ctx.DT_STRING().getText()+";     \n" ;
            vars.put(ctx.ID().getText(), ctx.IMG().getText());
        }
    }

    @Override public void exitDeclarationImg(AnimationJSParser.DeclarationImgContext ctx) {  }

    @Override public void enterDeclarationImgArray(AnimationJSParser.DeclarationImgArrayContext ctx) {
        if (vars.containsKey(ctx.ID().getText())) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" ya existe.\n", line, col);
            errors = true;
        }else{
            tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText() +" = newArray( "+trExpr(ctx.num_expr().getText())+" , \"\" );      \n";
            vars.put(ctx.ID().getText(), ctx.IMG().getText()+"[]");
        }
    }

    @Override public void exitDeclarationImgArray(AnimationJSParser.DeclarationImgArrayContext ctx) { }

    @Override public void enterDeclarationAnim(AnimationJSParser.DeclarationAnimContext ctx) {
        if (vars.containsKey(ctx.ID(0).getText())) {
            int line = ctx.ID(0).getSymbol().getLine();
            int col = ctx.ID(0).getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID(0).getText() + "\" ya existe.\n", line, col);
            errors = true;
        }
        else if(!vars.containsKey(ctx.ID(1).getText())){
            int line = ctx.ID(0).getSymbol().getLine();
            int col = ctx.ID(0).getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID(0).getText() + "\" no existe.\n", line, col);
            errors = true;
        }
        else if(!vars.get(ctx.ID(1).getText()).equals("img")){
            int line = ctx.ID(0).getSymbol().getLine();
            int col = ctx.ID(0).getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID(0).getText() + "\" no existe.\n", line, col);
            errors = true;
        }
        else{
            tradJS[currentCode] += printTabs() + "project." + ctx.ID(0).getText() + " = new AnimationClass( project."+ ctx.ID(1);
            for(int i = 0; i < ctx.num_expr().size(); i++){
                tradJS[currentCode] +=  ", "+trExpr(ctx.num_expr(i).getText());
            }
            vars.put(ctx.ID(0).getText(),ctx.ANIMATION().getText());
        }
    }

    @Override public void exitDeclarationAnim(AnimationJSParser.DeclarationAnimContext ctx) {
        tradJS[currentCode] +=  ");    \n";
    }

    @Override
    public void enterAssignation(AnimationJSParser.AssignationContext ctx) {
        String ID = "";
        if(ctx.assigUsual()!=null)ID = ctx.assigUsual().ID().getText();
        else if(ctx.assigMinEq()!=null)ID = ctx.assigMinEq().ID().getText();
        else if(ctx.assigPlEq()!=null)ID = ctx.assigPlEq().ID().getText();
        else if(ctx.assigPlPl()!=null)ID = ctx.assigPlPl().ID().getText();
        else if(ctx.assigArr()!=null)ID = ctx.assigArr().ID().getText();

        if (vars.containsKey(ID) || varsTableF.get(currFunction).containsKey(ID)) {
            if(vars.containsKey(ID))tradJS[currentCode] += printTabs() + "project." + ID;
            else tradJS[currentCode] += printTabs() + ID;
            if (ctx.assigUsual() != null || ctx.assigPlEq() != null || ctx.assigMinEq() != null || ctx.assigArr() != null){
                if(ctx.assigUsual() != null)tradJS[currentCode] +=  " = ";
                else if(ctx.assigPlEq() != null)tradJS[currentCode] +=  " += ";
                else if(ctx.assigMinEq() != null)tradJS[currentCode] +=  " -= ";
                else if(ctx.assigArr() != null)tradJS[currentCode] +=  "["+trExpr(ctx.assigArr().num_expr().getText())+"] = ";
                String dtype = "";
                if(vars.get(ID) != null)dtype = vars.get(ID) ;
                else dtype = varsTableF.get(currFunction).get(ID) ;
                if(dtype.equals("img[]")){
                    int line = ctx.PYC().getSymbol().getLine();
                    int col = ctx.PYC().getSymbol().getCharPositionInLine() + 1;
                    System.err.printf("<%d:%d> Error semantico, el arreglo \"" + ID + "\" se debe asignar con la función Src().\n", line, col);
                    errors = true;
                }
                switch (dtype){
                    case "int[]":
                    case "int":
                        tradJS[currentCode] += "parseInt( ";
                        break;
                    case "float[]":
                    case "float":
                        tradJS[currentCode] += "parseFloat( ";
                        break;
                    case "bool[]":
                    case "bool":
                        tradJS[currentCode] += "Boolean( ";
                        break;
                    case "string[]":
                    case "string":
                        tradJS[currentCode] += "String( ";
                        break;
                }
                if(ctx.assigUsual() != null)tradJS[currentCode] += trExpr(ctx.assigUsual().expr().getText()) + " );       \n";
                else if(ctx.assigPlEq() != null)tradJS[currentCode] += trExpr(ctx.assigPlEq().num_expr().getText()) + " );       \n";
                else if(ctx.assigMinEq() != null)tradJS[currentCode] += trExpr(ctx.assigMinEq().num_expr().getText()) + " );       \n";
                else if(ctx.assigArr() != null)tradJS[currentCode] += trExpr(ctx.assigArr().expr().getText()) + " );       \n";
            }
            else{
                tradJS[currentCode] += "++;     \n";
            }
        }
        else{
            int line = 0;
            int col = 0;
            if(ctx.assigUsual() != null){
                line = ctx.assigUsual().ID().getSymbol().getLine();
                col = ctx.assigUsual().ID().getSymbol().getCharPositionInLine() + 1;
            }
            else if(ctx.assigPlEq() != null){
                line = ctx.assigPlEq().ID().getSymbol().getLine();
                col = ctx.assigPlEq().ID().getSymbol().getCharPositionInLine() + 1;
            }
            else if(ctx.assigMinEq() != null){
                line = ctx.assigMinEq().ID().getSymbol().getLine();
                col = ctx.assigMinEq().ID().getSymbol().getCharPositionInLine() + 1;
            }
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ID + "\" no existe.\n", line, col);
            errors = true;
        }
    }

    @Override
    public void exitAssignation(AnimationJSParser.AssignationContext ctx) {
    }

    @Override public void enterAssignationImgArray(AnimationJSParser.AssignationImgArrayContext ctx) {
        if (!vars.containsKey(ctx.ID().getText())){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" no existe.\n", line, col);
            errors = true;
        }
        else if(!vars.get(ctx.ID().getText()).equals("img[]")){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" no es un arreglo de imagenes. \n", line, col);
            errors = true;
        }
        else{
            tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText()+"["+trExpr(ctx.num_expr().getText())+"] = String("+trExpr(ctx.expr().getText())+");    \n";
        }
    }

    @Override public void exitAssignationImgArray(AnimationJSParser.AssignationImgArrayContext ctx) {

    }

    @Override public void enterLength(AnimationJSParser.LengthContext ctx) {
        if(vars.containsKey(ctx.ID().getText())){
            String dtype = vars.get(ctx.ID().getText());
            if (!dtype.equals("int[]") && !dtype.equals("float[]") && !dtype.equals("string[]") && !dtype.equals("bool[]") && !dtype.equals("img[]") ){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" no es un arreglo.\n", line, col);
                errors = true;
            }
        }
        else if(varsTableF.get(currFunction).containsKey(ctx.ID().getText())){
            String dtype = varsTableF.get(currFunction).get(ctx.ID().getText());
            if (!dtype.equals("int[]") && !dtype.equals("float[]") && !dtype.equals("string[]") && !dtype.equals("bool[]")){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
                System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" no es un arreglo.\n", line, col);
                errors = true;
            }
        }
        else{
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" no existe.\n", line, col);
            errors = true;
        }
    }

    @Override public void exitLength(AnimationJSParser.LengthContext ctx) { }

    @Override
    public void enterConsole(AnimationJSParser.ConsoleContext ctx) {
        tradJS[currentCode] += printTabs() + "console.log(";
        for (int i = 0; i < ctx.expr().size(); i++) {
            if (i != 0) tradJS[currentCode] += ", ";
            tradJS[currentCode] += trExpr(ctx.expr(i).getText());
        }
    }

    @Override
    public void exitConsole(AnimationJSParser.ConsoleContext ctx) {
        tradJS[currentCode] += ");     \n";
    }

    @Override
    public void enterSetBackground(AnimationJSParser.SetBackgroundContext ctx) {
        tradJS[currentCode] += printTabs() + "ctx.clearRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);      \n";
        tradJS[currentCode] += printTabs() + "Background.draw(\"rgb(";
        for (int i = 0; i < ctx.rgb().num_expr().size(); i++) {
            if (i != 0) tradJS[currentCode] += ", ";
            tradJS[currentCode] += "\"+(" + trExpr(ctx.rgb().num_expr(i).getText()) + ")+\"";
        }

    }

    @Override
    public void exitSetBackground(AnimationJSParser.SetBackgroundContext ctx) {
        tradJS[currentCode] += ")\");      \n";
    }

    @Override
    public void enterDraw(AnimationJSParser.DrawContext ctx) {
        boolean imgArr = false;
        if(ctx.CIRCLE() != null)tradJS[currentCode] += printTabs() + "Circle.draw(";
        else if(ctx.FILLCIRCLE() != null) tradJS[currentCode] += printTabs() + "FillCircle.draw(";
        else if(ctx.RECT() != null) tradJS[currentCode] += printTabs() + "Rect.draw(";
        else if(ctx.FILLRECT() != null) tradJS[currentCode] += printTabs() + "FillRect.draw(";
        else if(ctx.TRIANGLE() != null) tradJS[currentCode] += printTabs() + "Triangle.draw(";
        else if(ctx.FILLTRIANGLE() != null) tradJS[currentCode] += printTabs() + "FillTriangle.draw(";
        else if(ctx.ID() != null){
            if(!vars.containsKey(ctx.ID().getText())){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la imagen \"" + ctx.ID().getText() + "\" no existe.\n",line,col);
                errors = true;
            }
            else{
                if(ctx.COR_IZQ() != null){
                    imgArr = true;
                    if(vars.get(ctx.ID().getText()).equals("img[]"))
                        tradJS[currentCode] += printTabs() + "DrawImg( "+trExpr(ctx.ID().getText())+"["+trExpr(ctx.num_expr(0).getText())+"], ";
                    else{
                        int line = ctx.ID().getSymbol().getLine();
                        int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                        System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no es una imagen.\n",line,col);
                        errors = true;
                    }
                }
                else{
                    if(vars.get(ctx.ID().getText()).equals("img")) tradJS[currentCode] += printTabs() + "ctx.drawImage( "+trExpr(ctx.ID().getText())+", ";
                    else{
                        int line = ctx.ID().getSymbol().getLine();
                        int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                        System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no es una imagen.\n",line,col);
                        errors = true;
                    }
                }
            }
        }
        if(imgArr){
            for(int i=1; i<ctx.num_expr().size(); i++){
                if(i != 1)tradJS[currentCode] +=    ", ";
                tradJS[currentCode] +=  trExpr(ctx.num_expr(i).getText());
            }
        }
        else{
            for(int i=0; i<ctx.num_expr().size(); i++){
                if(i != 0)tradJS[currentCode] +=    ", ";
                tradJS[currentCode] +=  trExpr(ctx.num_expr(i).getText());
            }
            if(ctx.rgb() != null){
                tradJS[currentCode] +=  ",\"rgb(";
                for (int i = 0; i < ctx.rgb().num_expr().size(); i++) {
                    if (i != 0) tradJS[currentCode] += ", ";
                    tradJS[currentCode] += "\"+(" + trExpr(ctx.rgb().num_expr(i).getText()) + ")+\"";
                }
                tradJS[currentCode] += ")\"";
            }
        }
    }

    @Override public void exitDraw(AnimationJSParser.DrawContext ctx) {
        tradJS[currentCode] +=  ");     \n";
    }

    @Override public void enterAnim(AnimationJSParser.AnimContext ctx) {
        if(!vars.containsKey(ctx.ID().getText())){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la animación  \"" + ctx.ID().getText() + "\" no existe.\n",line,col);
            errors = true;
        }
        else if(!vars.get(ctx.ID().getText()).equals("animation")){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable  \"" + ctx.ID().getText() + "\" no es una animación.\n",line,col);
            errors = true;
        }
        else{
            tradJS[currentCode] += printTabs() +    "project." +ctx.ID().getText() +".animate( ";
            for(int i=0; i<ctx.num_expr().size(); i++){
                if(i != 0) tradJS[currentCode] +=   ", ";
                tradJS[currentCode] += trExpr(ctx.num_expr(i).getText());
            }
        }
    }

    @Override public void exitAnim(AnimationJSParser.AnimContext ctx) {
        tradJS[currentCode] +=  " );        \n";
    }

    @Override public void enterText(AnimationJSParser.TextContext ctx) {
        tradJS[currentCode] += printTabs()+ "Text.write("+ trExpr(ctx.expr().getText()) +", "+ trExpr(ctx.num_expr(0).getText())+
                ", "+trExpr(ctx.num_expr(1).getText())+", "+trExpr(ctx.num_expr(2).getText());
        if(ctx.num_expr(3) != null) tradJS[currentCode] +=  ", "+trExpr(ctx.num_expr(3).getText());
        else tradJS[currentCode] +=  ", undefined";
        if(ctx.rgb() != null){
            tradJS[currentCode] +=  ", \"rgb(";
            for (int i = 0; i < ctx.rgb().num_expr().size(); i++) {
                if (i != 0) tradJS[currentCode] += ", ";
                tradJS[currentCode] += "\"+(" + trExpr(ctx.rgb().num_expr(i).getText()) + ")+\"";
            }
            tradJS[currentCode] += ")\"";
        }
        else tradJS[currentCode] +=  ", undefined";
        if(ctx.DT_STRING() != null) tradJS[currentCode] +=  ", "+ctx.DT_STRING().getText();
        else tradJS[currentCode] +=  ", undefined";
    }

    @Override public void exitText(AnimationJSParser.TextContext ctx) {
        tradJS[currentCode] +=  ");     \n";
    }

    @Override public void enterNum_expr(AnimationJSParser.Num_exprContext ctx) {
        if(ctx.ID() != null){
            if(!vars.containsKey(ctx.ID().getText()) && !sVars.contains(ctx.ID().getText()) &&
                    !varsTableF.get(currFunction).containsKey(ctx.ID().getText()) && !varsTableFor.get(currFunction).contains(ctx.ID().getText())){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no existe.\n",line,col);
                errors = true;
            }
        }
    }

    @Override public void exitNum_expr(AnimationJSParser.Num_exprContext ctx) { }

    @Override public void enterExpr(AnimationJSParser.ExprContext ctx) {
        if(ctx.ID() != null){
            if(!vars.containsKey(ctx.ID().getText()) && !sVars.contains(ctx.ID().getText()) &&
                    !varsTableF.get(currFunction).containsKey(ctx.ID().getText()) && !varsTableFor.get(currFunction).contains(ctx.ID().getText())){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no existe.\n",line,col);
                errors = true;
            }
        }
    }

    @Override public void exitExpr(AnimationJSParser.ExprContext ctx) { }

    @Override public void enterHideCursor(AnimationJSParser.HideCursorContext ctx) {
        hideCursor = true;
    }

    @Override public void exitHideCursor(AnimationJSParser.HideCursorContext ctx) { }

    @Override public void enterIfStr(AnimationJSParser.IfStrContext ctx) {  }

    @Override public void exitIfStr(AnimationJSParser.IfStrContext ctx) { }

    @Override public void enterIfPart(AnimationJSParser.IfPartContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "if( "+trExpr(ctx.expr().getText())+" ){    \n";
        tabs += 1;
    }

    @Override public void exitIfPart(AnimationJSParser.IfPartContext ctx) {
        tabs -= 1;
        tradJS[currentCode] +=  printTabs()+    "}    \n";
    }

    @Override public void enterElseIfPart(AnimationJSParser.ElseIfPartContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "else if( "+trExpr(ctx.expr().getText())+" ){    \n";
        tabs += 1;
    }

    @Override public void exitElseIfPart(AnimationJSParser.ElseIfPartContext ctx) {
        tabs -= 1;
        tradJS[currentCode] +=  printTabs()+    "}    \n";
    }

    @Override public void enterElsePart(AnimationJSParser.ElsePartContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "else{    \n";
        tabs += 1;
    }

    @Override public void exitElsePart(AnimationJSParser.ElsePartContext ctx) {
        tabs -= 1;
        tradJS[currentCode] +=  printTabs()+    "}    \n";
    }

    @Override public void enterWhileStr(AnimationJSParser.WhileStrContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "while( "+ trExpr(ctx.expr().getText()) +" ){    \n";
        tabs += 1;
    }

    @Override public void exitWhileStr(AnimationJSParser.WhileStrContext ctx) {
        tabs -= 1;
        tradJS[currentCode] +=  printTabs()+    "}          \n";

    }

    @Override public void enterSwitchStr(AnimationJSParser.SwitchStrContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "switch( "+ trExpr(ctx.expr().getText()) +" ){    \n";
        tabs += 1;
    }

    @Override public void exitSwitchStr(AnimationJSParser.SwitchStrContext ctx) {
        tabs -= 1;
        tradJS[currentCode] +=  printTabs()+    "}          \n";
    }

    @Override public void enterSwitchCase(AnimationJSParser.SwitchCaseContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "case "+ trExpr(ctx.expr().getText()) +":          \n";
        tabs += 1;
    }

    @Override public void exitSwitchCase(AnimationJSParser.SwitchCaseContext ctx) {
        tabs -= 1;
    }

    @Override public void enterSwitchDefault(AnimationJSParser.SwitchDefaultContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "default:             \n";
        tabs += 1;
    }

    @Override public void exitSwitchDefault(AnimationJSParser.SwitchDefaultContext ctx) {
        tabs -= 1;
    }


    @Override public void enterBreakStr(AnimationJSParser.BreakStrContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "break;     \n";
    }

    @Override public void exitBreakStr(AnimationJSParser.BreakStrContext ctx) { }

    @Override public void enterWaitStr(AnimationJSParser.WaitStrContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "Wait.wait( "+trExpr(ctx.num_expr().getText())+" );      \n";
    }

    @Override public void exitWaitStr(AnimationJSParser.WaitStrContext ctx) { }

    @Override public void enterForStr(AnimationJSParser.ForStrContext ctx) {
        tradJS[currentCode] +=  printTabs()+    "for( ";
    }

    @Override public void exitForStr(AnimationJSParser.ForStrContext ctx) {
        tabs -= 1;
        tradJS[currentCode] +=  printTabs()+    "}          \n";
        varsTableFor.get(currFunction).remove(ctx.forDecl().ID().getText());
    }


    @Override public void enterForDecl(AnimationJSParser.ForDeclContext ctx) {
        if(varsTableFor.get(currFunction).contains(ctx.ID().getText())){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" del ciclo FOR ya existe.\n",line,col);
            errors = true;
        }
        else{
            tradJS[currentCode] +=  "let "+ctx.ID().getText() + "=" + trExpr(ctx.num_expr().getText())+"; ";
            varsTableFor.get(currFunction).add(ctx.ID().getText());
        }

    }

    @Override public void exitForDecl(AnimationJSParser.ForDeclContext ctx) { }

    @Override public void enterForExpr(AnimationJSParser.ForExprContext ctx) {
        tradJS[currentCode] +=  trExpr(ctx.expr().getText())+"; ";
    }

    @Override public void exitForExpr(AnimationJSParser.ForExprContext ctx) { }

    @Override public void enterForAssig(AnimationJSParser.ForAssigContext ctx) {
        if (ctx.assigUsual() != null)
            tradJS[currentCode] +=  ctx.assigUsual().ID().getText() + " = " + trExpr(ctx.assigUsual().expr().getText());
        else if (ctx.assigPlPl() != null)
            tradJS[currentCode] +=  ctx.assigPlPl().ID().getText() + "++";
        else if (ctx.assigPlEq() != null)
            tradJS[currentCode] +=  ctx.assigPlEq().ID().getText() + " += "+trExpr(ctx.assigPlEq().num_expr().getText());
        else if (ctx.assigMinEq() != null)
            tradJS[currentCode] +=  ctx.assigMinEq().ID().getText() + " -= "+trExpr(ctx.assigMinEq().num_expr().getText());
    }

    @Override public void exitForAssig(AnimationJSParser.ForAssigContext ctx) {
        tradJS[currentCode] +=  " ){        \n" ;
        tabs += 1;
    }

    @Override public void visitTerminal(TerminalNode node) {

    }

    @Override public void visitErrorNode(ErrorNode node) { }
}
