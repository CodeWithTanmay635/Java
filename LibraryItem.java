abstract class LibraryItem {

        protected String title;
        protected String id;

    public LibraryItem(String title, String id) {
            this.title = title;
            this.id = id;
        }

        public abstract void displayInfo ();
        public abstract double calculateFine ( int daysLate);
    }

    class Book1 extends LibraryItem {
        private String author;

        public Book1(String title, String id, String author) {
            super(title, id);
            this.author = author;
        }

        @Override
        public void displayInfo() {
            System.out.println("Book: " + title + " by " + author);
        }

        @Override
        public double calculateFine(int daysLate) {
            return daysLate * 2.0; // $2 per day
        }
    }

    interface Borrowable {
        void borrowItem();

        void returnItem();
    }

    class Magazine extends LibraryItem implements Borrowable {

        private int issueNumber;

        public Magazine(String title, String id, int issueNumber) {
            super(title, id);
            this.issueNumber = issueNumber;
        }

        @Override
        public void displayInfo() {
            System.out.println("Magazine: " + title + " Issue #" + issueNumber);
        }

        @Override
        public double calculateFine(int daysLate) {
            return daysLate * 1.0; // $1 per day
        }

        @Override
        public void borrowItem() {
            System.out.println("Magazine borrowed: " + title);
        }

        @Override
        public void returnItem() {
            System.out.println("Magazine returned: " + title);
        }
    }
