package Enums;

public enum TypeBuilding {
    SMALL {
        public String getValue() {
            return "SMALL";
        }
    },
    MEDIUM {
        public String getValue() {
            return "MEDIUM";
        }
    },
    HUGE {
        public String getValue() {
            return "HUGE";
        }
    };

    public abstract String getValue();


}
