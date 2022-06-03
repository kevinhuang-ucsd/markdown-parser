import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

class TryCommonMark {
    public static void main(String[] arg) {
        Parser parser = Parser.builder().build();
        LinkVisitor visitor = new LinkVisitor();
        node.accept(visitor);
        System.out.println(visitor.links);
    }
}

class WordCountVisitor extends AbstractVisitor {
    int wordCount = 0;
    @Override
    public void visit(Text text) {
        wordCount += text.getLiteral().split("\\W+").length;
        visitChildren(text);
    }
}

class LinkVisitor extends AbstractVisitor {
    ArrayList<String> links = new ArrayList<>();
    @Override
    public void visit(Link link) {
        links.add(link.getDestination());
        visitChildren(link);
    }
}
