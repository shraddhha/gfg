
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
        // add your code here
        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meetings.add(new Meeting(start[i], end[i]));
        }
        
        meetings.sort(Comparator.comparingInt(m -> m.end));
        
     
        int count = 0;
        int lastEndTime = -1;
        
        for (Meeting meeting : meetings) {
            if (meeting.start > lastEndTime) {
                
                count++;
                lastEndTime = meeting.end;
            }
        }
        
        return count;
    }


    private static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    
    }
}
