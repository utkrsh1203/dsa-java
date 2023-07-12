class UDPPacketDropper {
    public static int calculateDroppedPackets(int[][] requests, int maxPackets, int rate) {
        int totalDroppedPackets = 0;
        int currentPackets = 0;

        for (int[] request : requests) {
            int time = request[0];
            int packets = request[1];

            // Calculate how many packets can be delivered at the current time
            int availablePackets = Math.min(rate, currentPackets);
            currentPackets = Math.max(0, currentPackets - rate);

            // Calculate the packets that need to be dropped if the pipeline is full
            int droppedPackets = Math.max(0, packets - (maxPackets - availablePackets));

            // Update the current packets in the pipeline
            currentPackets += packets - droppedPackets;

            // Update the total number of dropped packets
            totalDroppedPackets += droppedPackets;
        }

        return totalDroppedPackets;
    }

    public static void main(String[] args) {
        int[][] requests = { { 1, 88058 }, { 22, 23848 }, { 101, 76825 }, { 73, 19339 }, { 45, 59342 } };
        int maxPackets = 163;
        int rate = 52;

        int droppedPackets = calculateDroppedPackets(requests, maxPackets, rate);
        System.out.println("Total dropped packets: " + droppedPackets);
    }
}
