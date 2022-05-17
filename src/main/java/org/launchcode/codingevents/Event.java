package org.launchcode.codingevents;

public class Event {

    private String eventName;
    private String date;
    private String venue;

    public Event(String eventName, String date, String venue) {
        this.eventName = eventName;
        this.date = date;
        this.venue = venue;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", date='" + date + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }
}
