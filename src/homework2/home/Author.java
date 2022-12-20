package homework2.home;
public class Author
{
        private String Name;
        private String eMail;
        private char Butler;
        Author(String name, String email, char butler)
        {
            Name = name;
            eMail = email;
            Butler = butler;
        }

        public String GetName()
        {
            return Name;
        }

        public String GetEmail()
        {
            return eMail;
        }

        public void SetEmail(String eMail)
        {
            this.eMail = eMail;
        }

        public char GetButler()
        {
            return Butler;
        }

    public String toString() {
        return "Author{" +
                "Name=" + Name +
                ", eMail=" + eMail +
                ", Butler=" + Butler +
                '}';
    }
}
