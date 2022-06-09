package com.initial.afakecontroller;
import lombok.*;

/***
 User
 ***/
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sategory {
    private int id;
    private String categoryName;
    private int priority;
    private boolean publish;
    private Action action;

    public Sategory(Action action) {
        this.action = action;
    }

    class Action{
        private boolean markAsTrending;
//        private boolean delete;
//        private boolean update;

        private Action(boolean markAsTrending) {
            this.markAsTrending = markAsTrending;
        }

        @Override
        public String toString() {
            return "Action{" +
                    "markAsTrending=" + markAsTrending +
                    '}';
        }
    }

    public void main() {
        Category c = Category.builder()
                .id(1)
                .categoryName("categoryone")
                .priority(10)
                .publish(true)
                .action(new Action(true))
                .build();
        System.out.println("here is the printed object" + c.toString());
    }
    public static void main(String[] args) {
        new Category().main();
    }
}