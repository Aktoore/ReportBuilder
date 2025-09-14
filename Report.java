
public class Report {
    private final String title;
    private final String author;
    private final String content;
    private final String date;
    private final boolean hasSignature;

    private Report(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.content = builder.content;
        this.date = builder.date;
        this.hasSignature = builder.hasSignature;
    }

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public String getContent() {return content;}

    public String getDate() {return date;}

    public boolean hasSignature() {return hasSignature;}

    public static class Builder {
        private String title = "Untitled Report";
        private String author = "Anonymous author";
        private String content = "";
        private String date = "empty";
        private boolean hasSignature = false;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }
        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }
        public Builder setContent(String content) {
            this.content = content;
            return this;
        }
        public Builder setDate(String date) {
            this.date = date;
            return this;
        }
        public Builder setSignature(boolean hasSignature) {
            this.hasSignature = hasSignature;
            return this;
        }
        public Report build() {
            return new Report(this);
        }
    }

    @Override
    public String toString() {
        return "Report [title=" + title + ", author=" + author + ", content=" + content + ", date=" + date + ", hasSignature=" + hasSignature + "]";
    }
}


