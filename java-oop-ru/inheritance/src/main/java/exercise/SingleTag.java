package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    private Map<String, String> attributes;

    public SingleTag(String name, Map<String, String> attributes) {
        super(name, "");
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder tagBuilder = new StringBuilder("<" + getName());

        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            tagBuilder.append(" ")
                    .append(entry.getKey())
                    .append("=\"")
                    .append(entry.getValue())
                    .append("\"");
        }

        tagBuilder.append(">");

        return tagBuilder.toString();
    }
}
// END
