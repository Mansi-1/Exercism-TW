class TwelveDays {
	private final static int one = 1;
    private final static int twelve = 12;
    private final static String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

    private final static String[] gift = {"Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds",
            "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing",
            "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};

    String verse(int num) {
        StringBuilder sb = new StringBuilder("On the " + days[num - one] + " day of Christmas my true love gave to me:");

        for (int i = num; i > one; i--) {
            sb.append(" "+gift[i - one] +",");
        }

        sb.append((num > one ? " and a " : " a ") + gift[0]+"."+"\n");
        return sb.toString();
    }

    String verses(int first, int last) {
        StringBuilder sb = new StringBuilder();

        for (int i = first; i <= last; i++) {
            sb.append(verse(i) + (i != last ? "\n" : ""));
        }

        return sb.toString();
    }

    String sing() {
        return verses(one, twelve);
    }   
}
