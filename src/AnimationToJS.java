import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AnimationToJS extends AnimationJSBaseListener {
    //Strings de traduccion
    String[] tradPart = new String[3]; //(0 - html, 1 - css, 2 - js)
    String[] tradJS = new String[5]; //(0 - Setup. 1 - Objects, 2 - Variables, 3 - Setup, 4 - Animate, 5... )
    HashSet<String> sVars = new HashSet<>();
    HashMap<String, String> vars = new HashMap<>();
    int currentCode = 0;
    int width = 300;
    int height = 300;
    int tabs = 0;
    boolean errors = false;
    AnimationJSLexer lexer;

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
        sVars.add("Sin");
        sVars.add("Cos");
        sVars.add("PI");
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

        String[] aExpr = nExpr.split("#");

        List<String> lExpr = new ArrayList<>();
        //System.out.println("Nexpr: "+nExpr);
        for (String str : aExpr) {
            if (!str.equals("")) {
                if (sVars.contains(str)) {
                    if (str.equals("Sin") || str.equals("Cos")) lExpr.add("Math." + str.toLowerCase());
                    else if (str.equals("PI")) lExpr.add("Math." + str);
                } else {
                    if (str.equals("^")) lExpr.add("**");
                    else if (str.equals("+") || str.equals("-") ||
                            str.equals("*") || str.equals("/") ||
                            str.equals("%") || str.equals("(") ||
                            str.equals(")") || str.equals("[") ||
                            str.equals("]")
                    ) lExpr.add(str);
                    else if (isNumeric(str)) lExpr.add(str);
                    else lExpr.add("project." + str);
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
            tradJS[1] += "class BackgroundClass {\n" +
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
            tradJS[1] += "class Animation {\n" +
                    "    constructor(playerImage, spriteWidth, spriteHeight, nSprites, yPosition) {\n" +
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
            tradJS[2] += "//System variables                                \n";
            tradJS[2] += "const project = new Project();                    \n";
            tradJS[2] += "const Background = new BackgroundClass();         \n";
            tradJS[2] += "const FillRect = new FillRectClass();             \n";
            tradJS[2] += "const Rect = new RectClass();                     \n";
            tradJS[2] += "const Circle = new CircleClass();                 \n";
            tradJS[2] += "const FillCircle = new FillCircleClass();         \n";
            tradJS[2] += "const Triangle = new TriangleClass();             \n";
            tradJS[2] += "const FillTriangle = new FillTriangleClass();     \n";

        }
    }

    @Override
    public void exitCode(AnimationJSParser.CodeContext ctx) {
        //Generar los archivos html, css y javascript
        {
            tradPart[0] = "<!DOCTYPE html>\n" +
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
            tradPart[1] = "h1{\n" +
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
                    "    height: " + height + "px;\n" +
                    "}";
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
            for (String str : tradJS) {
                System.out.println(str);
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
    }


    @Override
    public void enterSetup(AnimationJSParser.SetupContext ctx) {
        currentCode = 3;
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
            tradJS[0] += printTabs() + "\n";
            tradJS[0] += printTabs() + "class Project {\n" +
                    "   constructor() {\n" +
                    "       //Store variables\n" +
                    "   }\n" +
                    "};";
        }
    }

    @Override
    public void enterAnimate(AnimationJSParser.AnimateContext ctx) {
        currentCode = 4;
        tradJS[currentCode] += printTabs() + "function animate(){          \n";
        tabs += 1;
    }

    @Override
    public void exitAnimate(AnimationJSParser.AnimateContext ctx) {
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
    public void enterDeclaration(AnimationJSParser.DeclarationContext ctx) {
        if (vars.containsKey(ctx.ID().getText())) {
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine() + 1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre \"" + ctx.ID().getText() + "\" ya existe.\n", line, col);
            errors = true;
        } else {
            tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText();
            if (ctx.EQU() != null) {
                tradJS[currentCode] += " = " + trExpr(ctx.num_expr().getText());
            }
            vars.put(ctx.ID().getText(), ctx.DTYPE().getText());
        }

    }

    @Override
    public void exitDeclaration(AnimationJSParser.DeclarationContext ctx) {
        tradJS[currentCode] += ";       \n";
    }

    @Override
    public void enterAsignation(AnimationJSParser.AsignationContext ctx) {
        if (ctx.num_expr() != null)
            tradJS[currentCode] += printTabs() + "project." + ctx.ID().getText() + " = " + trExpr(ctx.num_expr().getText()) + ";       \n";
    }

    @Override
    public void exitAsignation(AnimationJSParser.AsignationContext ctx) {
    }

    @Override
    public void enterConsole(AnimationJSParser.ConsoleContext ctx) {
        tradJS[currentCode] += printTabs() + "console.log(";
        for (int i = 0; i < ctx.num_expr().size(); i++) {
            if (i != 0) tradJS[currentCode] += ", ";
            tradJS[currentCode] += trExpr(ctx.num_expr(i).getText());
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
        if(ctx.CIRCLE() != null)tradJS[currentCode] += printTabs() + "Circle.draw(";
        else if(ctx.FILLCIRCLE() != null) tradJS[currentCode] += printTabs() + "FillCircle.draw(";
        else if(ctx.RECT() != null) tradJS[currentCode] += printTabs() + "Rect.draw(";
        else if(ctx.FILLRECT() != null) tradJS[currentCode] += printTabs() + "FillRect.draw(";
        else if(ctx.TRIANGLE() != null) tradJS[currentCode] += printTabs() + "Triangle.draw(";
        else if(ctx.FILLTRIANGLE() != null) tradJS[currentCode] += printTabs() + "FillTriangle.draw(";
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


    @Override public void exitDraw(AnimationJSParser.DrawContext ctx) {
        tradJS[currentCode] +=  ");     \n";
    }

    @Override public void enterNum_expr(AnimationJSParser.Num_exprContext ctx) {
        if(ctx.ID() != null){
            if(!vars.containsKey(ctx.ID().getText()) && !sVars.contains(ctx.ID().getText())){
                int line = ctx.ID().getSymbol().getLine();
                int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
                System.err.printf("<%d:%d> Error semantico, la variable \"" + ctx.ID().getText() + "\" no existe.\n",line,col);
                errors = true;
            }
        }

    }

    @Override public void exitNum_expr(AnimationJSParser.Num_exprContext ctx) { }

    @Override public void visitTerminal(TerminalNode node) {

    }

    @Override public void visitErrorNode(ErrorNode node) { }
}
