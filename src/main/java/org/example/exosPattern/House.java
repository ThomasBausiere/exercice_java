package org.example.creational.builder;

public class House {
    private int staires;
    private String roof;
    private String color;
    private boolean pool;

    @Override
    public String toString() {
        return "House{" +
                "staires=" + staires +
                ", roof='" + roof + '\'' +
                ", color='" + color + '\'' +
                ", pool=" + pool +
                '}';
    }
    private House(Builder builder){
            staires=builder.staires;
            roof=builder.roof;
            color=builder.color;
            pool=builder.pool;
    }

    public static class Builder{
        private int staires;
        private String roof;
        private String color;
        private boolean pool;

        public Builder staires(int staires){
            this.staires=staires;
            return this;
        }

        public Builder roof(String roof){
            this.roof=roof;
            return this;
        }
        public Builder color(String color){
            this.color=color;
            return this;
        }

        public Builder pool(boolean pool){
            this.pool=pool;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }

}
