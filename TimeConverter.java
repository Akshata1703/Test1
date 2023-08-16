public class TimeConverter {
    public static String convertToMilitaryTime(String time){
        String militaryTime = "";
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1].substring(0,2));
        String period = timeParts[1].substring(2);

        if(period.equalsIgnoreCase("am")){
            if(hours == 12){
                hours = 0;
            }
        }
            else{
                if(hours != 12){
                    hours += 12;
                }
            }
            militaryTime = String.format("%02d:%02d", hours,minutes);
            return militaryTime;
        }
        public static void main(String[] args) {
            String time12Hour = "10:30pm";
            String militaryTime = convertToMilitaryTime(time12Hour);
            System.out.println("Military Time:" +militaryTime);
        }
}
