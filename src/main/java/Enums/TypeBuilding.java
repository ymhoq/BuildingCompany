package Enums;
//not true
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
