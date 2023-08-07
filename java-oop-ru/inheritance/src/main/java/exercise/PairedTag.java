package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private List<Tag> children;

    public PairedTag(String name, Map<String, String> attributes, String content, List<Tag> children) {
        super(name, content);
        this.children = children;
        setAttributes(attributes);
    }

    @Override
    public String toString() {
        StringBuilder tagBuilder = new StringBuilder("<" + getName());

        for (Map.Entry<String, String> entry : getAttributes().entrySet()) {
            tagBuilder.append(" ")
                    .append(entry.getKey())
                    .append("=\"")
                    .append(entry.getValue())
                    .append("\"");
        }

        tagBuilder.append(">");

        if (!getContent().isEmpty()) {
            tagBuilder.append(getContent());
        } else {
            for (Tag child : children) {
                tagBuilder.append(child.toString());
            }
        }

        tagBuilder.append("</" + getName() + ">");

        return tagBuilder.toString();
    }
}
// END
