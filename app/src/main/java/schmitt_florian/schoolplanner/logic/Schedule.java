package schmitt_florian.schoolplanner.logic;

/**
 * The Schedule Class represents an Object in the Schedule SQL table and is usually returned by methods from the DatabaseHelper Interface
 * <br> </br>
 * ### Please note, that a week in the Schedule represents a typical school week that reaches from monday to saturday excluding the sunday ###
 */
public class Schedule {
    /**
     * numeric id of the Schedule (unique)
     */
    private int id;

    /**
     * the name for the schedule, e.g. "Week A" or "Week B" as string
     */
    private String name;

    /**
     * the six days of the week in an array of {@link Weekday} (monday to saturday -> length 6)
     */
    private Weekday[] days;

    /**
     * c'tor for Schedule, that instantiates the day fields from an array
     *
     * @param id       unique numeric id of the Schedule
     * @param name     name for the schedule, e.g. "Week A" or "Week B"
     * @param weekdays an array of {@link Weekday} containing the six days of the week (monday to saturday -> length 6)
     * @throws ArrayIndexOutOfBoundsException if the given {@link Weekday} array doesn't have the length six
     */
    public Schedule(int id, String name, Weekday[] weekdays) {
        if (weekdays.length != 6) {
            throw new ArrayIndexOutOfBoundsException("array length " + weekdays.length + " isn't a supported Week, which length would be 6");
        } else {
            this.id = id;
            this.name = name;
            this.days = weekdays;
        }
    }

    /**
     * id of the Schedule
     *
     * @return numeric id of the Schedule (unique)
     */
    public int getId() {
        return id;
    }

    /**
     * gets name for the schedule
     *
     * @return the name for the schedule, e.g. "Week A" or "Week B" as string
     */
    public String getName() {
        return name;
    }

    /**
     * gets the six days of the week
     *
     * @return the six days of the week in an array of {@link Weekday} (monday to saturday -> length 6)
     */
    public Weekday[] getDays() {
        return days;
    }
}
