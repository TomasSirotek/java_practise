package oop_basics.dao_pattern;

public class User {

        private int id;
        private String user_name;

        private String email;

        private String password_hash;


        public User(int id, String name, String email, String passwordHash) {
            this.id = id;
            this.user_name = name;
            this.email = email;
            password_hash = passwordHash;
        }

        @Override
        public String toString() {
            return "Entity{}";
        }

        public String getName() {
            return user_name;
        }

        public void setName(String name) {
            this.user_name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

