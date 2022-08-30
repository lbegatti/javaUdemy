import java.util.*;

public class TicketReservation {

    private static final int CONFIRMEDLIST_LIMIT = 10;
    private static final int WAITINGLIST_LIMIT = 3;

    private static List<Passenger> confirmedList = new ArrayList<>();
    private static Deque<Passenger> waitingList = new ArrayDeque<>();



    // This getter is used only by the junit test case.
    public List<Passenger> getConfirmedList() {
        return confirmedList;
    }

    /**
     * Returns true if passenger could be added into either confirmedList or
     * waitingList. Passenger will be added to waitingList only if confirmedList
     * is full.
     *
     * Return false if both passengerList & waitingList are full
     */
    public static boolean bookFlight(String firstName, String lastName, int age, String gender, String travelClass, String confirmationNumber) {

        if ((confirmedList.size() == CONFIRMEDLIST_LIMIT) && (waitingList.size() == WAITINGLIST_LIMIT)){
            return false;
        } else if (confirmedList.size() < CONFIRMEDLIST_LIMIT){
            Passenger p = new Passenger(firstName,lastName,age,gender,travelClass,confirmationNumber);
            confirmedList.add(p);
            return true;
        } else {
            Passenger p = new Passenger(firstName,lastName,age,gender,travelClass,confirmationNumber);
            waitingList.offer(p);
            return true;
        }
    }

    /**
     * Removes passenger with the given confirmationNumber. Passenger could be
     * in either confirmedList or waitingList. The implementation to remove the
     * passenger should go in removePassenger() method and removePassenger method
     * will be tested separately by the uploaded test scripts.

     * If passenger is in confirmedList, then after removing that passenger, the
     * passenger at the front of waitingList (if not empty) must be moved into
     * passengerList. Use poll() method (not remove()) to extract the passenger
     * from waitingList.
     */
    public static boolean cancel(String confirmationNumber) {

        if(confirmedList.isEmpty() && waitingList.isEmpty()){
            return false;
        } else if (!confirmedList.isEmpty() && waitingList.isEmpty()){
            return removePassenger(confirmedList.iterator(),confirmationNumber);
        } else if (confirmedList.isEmpty() && !waitingList.isEmpty()) {
            System.out.println("This does not make sense because confirmed list cannot be empty if waiting list is not empty!");
            return false;
        } else {
            boolean cl = removePassenger(confirmedList.iterator(), confirmationNumber);
            boolean wl = removePassenger(waitingList.iterator(), confirmationNumber);
            if (cl){
                Passenger movedToConfirmationList = waitingList.poll();
                confirmedList.add(movedToConfirmationList);
                return true;
            } else return wl;

        }
    }

    /**
     * Removes passenger with the given confirmation number.
     * Returns true only if passenger was present and removed. Otherwise, return false.
     */
    public static boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {

        while(iterator.hasNext()){
            //System.out.println("true");
            Passenger element = iterator.next();
            //System.out.println("element: " + element);
            if(Objects.equals(element.getConfirmationNumber(), confirmationNumber)){
                iterator.remove();
                return true;
            }/* else {
                return false;
            }*/
        }
        return false;
    }


    public static void main(String[] args) {
        boolean booked = bookFlight("Luca", "Lu", 28, "M", "economy", "49304");
        boolean booked1 = bookFlight("Luca", "Jo", 29, "M", "economy", "49305");
        boolean booked2 = bookFlight("Luca", "Nu", 30, "M", "economy", "49306");
        boolean booked3 = bookFlight("Luca", "Lu", 28, "M", "economy", "49307");
        boolean booked4 = bookFlight("Luca", "Jo", 29, "M", "economy", "49308");
        boolean booked5 = bookFlight("Luca", "Nu", 30, "M", "economy", "49309");
        boolean booked6 = bookFlight("Luca", "Lu", 28, "M", "economy", "493010");
        boolean booked7 = bookFlight("Luca", "Jo", 29, "M", "economy", "493011");
        boolean booked8 = bookFlight("Luca", "Nu", 30, "M", "economy", "493012");
        boolean booked9 = bookFlight("Luca", "Lu", 28, "M", "economy", "493013");
        boolean booked10 = bookFlight("Luca", "Jo", 29, "M", "economy", "493014");
        boolean booked11= bookFlight("Luca", "Nu", 30, "M", "economy", "493015");
        //System.out.println("Has the flight been booked? : " + booked + booked1 + booked2);
        System.out.println("the confirmed list:" + confirmedList);
        System.out.println("the waiting list:" + waitingList);
        boolean cancelled = cancel("49304");
        System.out.println("Has the booking been cancelled?: " + cancelled);
        System.out.println("final confirmed list: " + confirmedList);
        System.out.println("final waiting list: " + waitingList);
    }



}
