package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String name;
    private String content;
    private Map<String, String> attributes;

    public Tag(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public String toString() {
        StringBuilder tagBuilder = new StringBuilder("<" + name);

        if (attributes != null) {
            for (Map.Entry<String, String> entry : attributes.entrySet()) {
                tagBuilder.append(" ")
                        .append(entry.getKey())
                        .append("=\"")
                        .append(entry.getValue())
                        .append("\"");
            }
        }

        tagBuilder.append(">");

        if (!content.isEmpty()) {
            tagBuilder.append(content);
        }

        return tagBuilder.toString();
    }
}
// END
