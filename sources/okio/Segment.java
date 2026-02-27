package okio;

import cj.C1127m;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i;
        Segment segment = this.prev;
        if (segment == this) {
            throw new IllegalStateException("cannot compact");
        }
        j.d(segment);
        if (segment.owner) {
            int i4 = this.limit - this.pos;
            Segment segment2 = this.prev;
            j.d(segment2);
            int i6 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            j.d(segment3);
            if (segment3.shared) {
                i = 0;
            } else {
                Segment segment4 = this.prev;
                j.d(segment4);
                i = segment4.pos;
            }
            if (i4 > i6 + i) {
                return;
            }
            Segment segment5 = this.prev;
            j.d(segment5);
            writeTo(segment5, i4);
            pop();
            SegmentPool.recycle(this);
        }
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        j.d(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        j.d(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        j.g(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        j.d(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i) {
        Segment segmentTake;
        if (i <= 0 || i > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i4 = this.pos;
            C1127m.d(0, i4, i4 + i, bArr, bArr2);
        }
        segmentTake.limit = segmentTake.pos + i;
        this.pos += i;
        Segment segment = this.prev;
        j.d(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        j.f(bArrCopyOf, "copyOf(...)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment sink, int i) {
        j.g(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = sink.limit;
        int i6 = i4 + i;
        if (i6 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i10 = sink.pos;
            if (i6 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            C1127m.d(0, i10, i4, bArr, bArr);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i11 = sink.limit;
        int i12 = this.pos;
        C1127m.d(i11, i12, i12 + i, bArr2, bArr3);
        sink.limit += i;
        this.pos += i;
    }

    public Segment(byte[] data, int i, int i4, boolean z4, boolean z5) {
        j.g(data, "data");
        this.data = data;
        this.pos = i;
        this.limit = i4;
        this.shared = z4;
        this.owner = z5;
    }
}
