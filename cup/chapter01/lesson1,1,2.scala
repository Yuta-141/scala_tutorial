class ChecksumActor extends Actor {
    var sum = 0
    def receive = {
        case Data(byte) => sum += byte
        case GetChecksum(requester) => val checksum = ~(sum & 0xFF) + 1
        requester ! checksum
    }
}