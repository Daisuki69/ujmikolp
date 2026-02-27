package androidx.media3.exoplayer.rtsp;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class RtpPacket {
    public static final int CSRC_SIZE = 4;
    private static final byte[] EMPTY = new byte[0];
    public static final int MAX_SEQUENCE_NUMBER = 65535;
    public static final int MAX_SIZE = 65507;
    public static final int MIN_HEADER_SIZE = 12;
    public static final int MIN_SEQUENCE_NUMBER = 0;
    public static final int RTP_VERSION = 2;
    public final byte[] csrc;
    public final byte csrcCount;
    public final boolean extension;
    public final boolean marker;
    public final boolean padding;
    public final byte[] payloadData;
    public final byte payloadType;
    public final int sequenceNumber;
    public final int ssrc;
    public final long timestamp;
    public final byte version;

    public static final class Builder {
        private boolean marker;
        private boolean padding;
        private byte payloadType;
        private int sequenceNumber;
        private int ssrc;
        private long timestamp;
        private byte[] csrc = RtpPacket.EMPTY;
        private byte[] payloadData = RtpPacket.EMPTY;

        public RtpPacket build() {
            return new RtpPacket(this);
        }

        public Builder setCsrc(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.csrc = bArr;
            return this;
        }

        public Builder setMarker(boolean z4) {
            this.marker = z4;
            return this;
        }

        public Builder setPadding(boolean z4) {
            this.padding = z4;
            return this;
        }

        public Builder setPayloadData(byte[] bArr) {
            Assertions.checkNotNull(bArr);
            this.payloadData = bArr;
            return this;
        }

        public Builder setPayloadType(byte b8) {
            this.payloadType = b8;
            return this;
        }

        public Builder setSequenceNumber(int i) {
            Assertions.checkArgument(i >= 0 && i <= 65535);
            this.sequenceNumber = i & 65535;
            return this;
        }

        public Builder setSsrc(int i) {
            this.ssrc = i;
            return this;
        }

        public Builder setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }
    }

    public static int getNextSequenceNumber(int i) {
        return X5.f.v(i + 1);
    }

    public static int getPreviousSequenceNumber(int i) {
        return X5.f.v(i - 1);
    }

    @Nullable
    public static RtpPacket parse(ParsableByteArray parsableByteArray) {
        byte[] bArr;
        if (parsableByteArray.bytesLeft() < 12) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        byte b8 = (byte) (unsignedByte >> 6);
        boolean z4 = ((unsignedByte >> 5) & 1) == 1;
        byte b10 = (byte) (unsignedByte & 15);
        if (b8 != 2) {
            return null;
        }
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        boolean z5 = ((unsignedByte2 >> 7) & 1) == 1;
        byte b11 = (byte) (unsignedByte2 & 127);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int i = parsableByteArray.readInt();
        if (b10 > 0) {
            bArr = new byte[b10 * 4];
            for (int i4 = 0; i4 < b10; i4++) {
                parsableByteArray.readBytes(bArr, i4 * 4, 4);
            }
        } else {
            bArr = EMPTY;
        }
        byte[] bArr2 = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr2, 0, parsableByteArray.bytesLeft());
        return new Builder().setPadding(z4).setMarker(z5).setPayloadType(b11).setSequenceNumber(unsignedShort).setTimestamp(unsignedInt).setSsrc(i).setCsrc(bArr).setPayloadData(bArr2).build();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RtpPacket.class == obj.getClass()) {
            RtpPacket rtpPacket = (RtpPacket) obj;
            if (this.payloadType == rtpPacket.payloadType && this.sequenceNumber == rtpPacket.sequenceNumber && this.marker == rtpPacket.marker && this.timestamp == rtpPacket.timestamp && this.ssrc == rtpPacket.ssrc) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (((((527 + this.payloadType) * 31) + this.sequenceNumber) * 31) + (this.marker ? 1 : 0)) * 31;
        long j = this.timestamp;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.ssrc;
    }

    public String toString() {
        return Util.formatInvariant("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.payloadType), Integer.valueOf(this.sequenceNumber), Long.valueOf(this.timestamp), Integer.valueOf(this.ssrc), Boolean.valueOf(this.marker));
    }

    public int writeToBuffer(byte[] bArr, int i, int i4) {
        int length = (this.csrcCount * 4) + 12 + this.payloadData.length;
        if (i4 < length || bArr.length - i < length) {
            return -1;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i4);
        byte b8 = (byte) (((this.padding ? 1 : 0) << 5) | 128 | ((this.extension ? 1 : 0) << 4) | (this.csrcCount & 15));
        byteBufferWrap.put(b8).put((byte) (((this.marker ? 1 : 0) << 7) | (this.payloadType & 127))).putShort((short) this.sequenceNumber).putInt((int) this.timestamp).putInt(this.ssrc).put(this.csrc).put(this.payloadData);
        return length;
    }

    private RtpPacket(Builder builder) {
        this.version = (byte) 2;
        this.padding = builder.padding;
        this.extension = false;
        this.marker = builder.marker;
        this.payloadType = builder.payloadType;
        this.sequenceNumber = builder.sequenceNumber;
        this.timestamp = builder.timestamp;
        this.ssrc = builder.ssrc;
        byte[] bArr = builder.csrc;
        this.csrc = bArr;
        this.csrcCount = (byte) (bArr.length / 4);
        this.payloadData = builder.payloadData;
    }

    @Nullable
    public static RtpPacket parse(byte[] bArr, int i) {
        return parse(new ParsableByteArray(bArr, i));
    }
}
