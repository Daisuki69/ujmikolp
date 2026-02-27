package androidx.media3.exoplayer.rtsp;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
final class RtpPacketReorderingQueue {

    @VisibleForTesting
    static final int MAX_SEQUENCE_LEAP_ALLOWED = 1000;
    private static final int QUEUE_SIZE_THRESHOLD_FOR_RESET = 5000;

    @GuardedBy("this")
    private int lastDequeuedSequenceNumber;

    @GuardedBy("this")
    private int lastReceivedSequenceNumber;

    @GuardedBy("this")
    private final TreeSet<RtpPacketContainer> packetQueue = new TreeSet<>(new c());

    @GuardedBy("this")
    private boolean started;

    public static final class RtpPacketContainer {
        public final RtpPacket packet;
        public final long receivedTimestampMs;

        public RtpPacketContainer(RtpPacket rtpPacket, long j) {
            this.packet = rtpPacket;
            this.receivedTimestampMs = j;
        }
    }

    public RtpPacketReorderingQueue() {
        reset();
    }

    private synchronized void addToQueue(RtpPacketContainer rtpPacketContainer) {
        this.lastReceivedSequenceNumber = rtpPacketContainer.packet.sequenceNumber;
        this.packetQueue.add(rtpPacketContainer);
    }

    private static int calculateSequenceNumberShift(int i, int i4) {
        int iMin;
        int i6 = i - i4;
        return (Math.abs(i6) <= 1000 || (iMin = (Math.min(i, i4) - Math.max(i, i4)) + 65535) >= 1000) ? i6 : i < i4 ? iMin : -iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(RtpPacketContainer rtpPacketContainer, RtpPacketContainer rtpPacketContainer2) {
        return calculateSequenceNumberShift(rtpPacketContainer.packet.sequenceNumber, rtpPacketContainer2.packet.sequenceNumber);
    }

    public synchronized boolean offer(RtpPacket rtpPacket, long j) {
        if (this.packetQueue.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = rtpPacket.sequenceNumber;
        if (!this.started) {
            reset();
            this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i);
            this.started = true;
            addToQueue(new RtpPacketContainer(rtpPacket, j));
            return true;
        }
        if (Math.abs(calculateSequenceNumberShift(i, RtpPacket.getNextSequenceNumber(this.lastReceivedSequenceNumber))) < 1000) {
            if (calculateSequenceNumberShift(i, this.lastDequeuedSequenceNumber) <= 0) {
                return false;
            }
            addToQueue(new RtpPacketContainer(rtpPacket, j));
            return true;
        }
        this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i);
        this.packetQueue.clear();
        addToQueue(new RtpPacketContainer(rtpPacket, j));
        return true;
    }

    @Nullable
    public synchronized RtpPacket poll(long j) {
        if (this.packetQueue.isEmpty()) {
            return null;
        }
        RtpPacketContainer rtpPacketContainerFirst = this.packetQueue.first();
        int i = rtpPacketContainerFirst.packet.sequenceNumber;
        if (i != RtpPacket.getNextSequenceNumber(this.lastDequeuedSequenceNumber) && j < rtpPacketContainerFirst.receivedTimestampMs) {
            return null;
        }
        this.packetQueue.pollFirst();
        this.lastDequeuedSequenceNumber = i;
        return rtpPacketContainerFirst.packet;
    }

    public synchronized void reset() {
        this.packetQueue.clear();
        this.started = false;
        this.lastDequeuedSequenceNumber = -1;
        this.lastReceivedSequenceNumber = -1;
    }
}
