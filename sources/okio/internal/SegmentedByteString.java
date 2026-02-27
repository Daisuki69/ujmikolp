package okio.internal;

import We.s;
import androidx.camera.core.impl.a;
import cj.C1127m;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.ByteString;
import okio.C1994SegmentedByteString;
import okio.Segment;
import qj.n;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i, int i4, int i6) {
        j.g(iArr, "<this>");
        int i10 = i6 - 1;
        while (i4 <= i10) {
            int i11 = (i4 + i10) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i) {
                i4 = i11 + 1;
            } else {
                if (i12 <= i) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return (-i4) - 1;
    }

    public static final void commonCopyInto(C1994SegmentedByteString c1994SegmentedByteString, int i, byte[] target, int i4, int i6) {
        j.g(c1994SegmentedByteString, "<this>");
        j.g(target, "target");
        long j = i6;
        okio.SegmentedByteString.checkOffsetAndCount(c1994SegmentedByteString.size(), i, j);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i4, j);
        int i10 = i6 + i;
        int iSegment = segment(c1994SegmentedByteString, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : c1994SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i12 = c1994SegmentedByteString.getDirectory$okio()[iSegment] - i11;
            int i13 = c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            int i14 = (i - i11) + i13;
            C1127m.d(i4, i14, i14 + iMin, c1994SegmentedByteString.getSegments$okio()[iSegment], target);
            i4 += iMin;
            i += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C1994SegmentedByteString c1994SegmentedByteString, Object obj) {
        j.g(c1994SegmentedByteString, "<this>");
        if (obj == c1994SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c1994SegmentedByteString.size() && c1994SegmentedByteString.rangeEquals(0, byteString, 0, c1994SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C1994SegmentedByteString c1994SegmentedByteString) {
        j.g(c1994SegmentedByteString, "<this>");
        return c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length - 1];
    }

    public static final int commonHashCode(C1994SegmentedByteString c1994SegmentedByteString) {
        j.g(c1994SegmentedByteString, "<this>");
        int hashCode$okio = c1994SegmentedByteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c1994SegmentedByteString.getSegments$okio().length;
        int i = 0;
        int i4 = 1;
        int i6 = 0;
        while (i < length) {
            int i10 = c1994SegmentedByteString.getDirectory$okio()[length + i];
            int i11 = c1994SegmentedByteString.getDirectory$okio()[i];
            byte[] bArr = c1994SegmentedByteString.getSegments$okio()[i];
            int i12 = (i11 - i6) + i10;
            while (i10 < i12) {
                i4 = (i4 * 31) + bArr[i10];
                i10++;
            }
            i++;
            i6 = i11;
        }
        c1994SegmentedByteString.setHashCode$okio(i4);
        return i4;
    }

    public static final byte commonInternalGet(C1994SegmentedByteString c1994SegmentedByteString, int i) {
        j.g(c1994SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length - 1], i, 1L);
        int iSegment = segment(c1994SegmentedByteString, i);
        return c1994SegmentedByteString.getSegments$okio()[iSegment][(i - (iSegment == 0 ? 0 : c1994SegmentedByteString.getDirectory$okio()[iSegment - 1])) + c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length + iSegment]];
    }

    public static final boolean commonRangeEquals(C1994SegmentedByteString c1994SegmentedByteString, int i, ByteString other, int i4, int i6) {
        j.g(c1994SegmentedByteString, "<this>");
        j.g(other, "other");
        if (i < 0 || i > c1994SegmentedByteString.size() - i6) {
            return false;
        }
        int i10 = i6 + i;
        int iSegment = segment(c1994SegmentedByteString, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : c1994SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i12 = c1994SegmentedByteString.getDirectory$okio()[iSegment] - i11;
            int i13 = c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            if (!other.rangeEquals(i4, c1994SegmentedByteString.getSegments$okio()[iSegment], (i - i11) + i13, iMin)) {
                return false;
            }
            i4 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }

    public static final ByteString commonSubstring(C1994SegmentedByteString c1994SegmentedByteString, int i, int i4) {
        j.g(c1994SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c1994SegmentedByteString, i4);
        if (i < 0) {
            throw new IllegalArgumentException(s.g(i, "beginIndex=", " < 0").toString());
        }
        if (iResolveDefaultParameter > c1994SegmentedByteString.size()) {
            StringBuilder sbT = s.t(iResolveDefaultParameter, "endIndex=", " > length(");
            sbT.append(c1994SegmentedByteString.size());
            sbT.append(')');
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i6 = iResolveDefaultParameter - i;
        if (i6 < 0) {
            throw new IllegalArgumentException(a.c(iResolveDefaultParameter, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && iResolveDefaultParameter == c1994SegmentedByteString.size()) {
            return c1994SegmentedByteString;
        }
        if (i == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c1994SegmentedByteString, i);
        int iSegment2 = segment(c1994SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) C1127m.l(iSegment, iSegment2 + 1, c1994SegmentedByteString.getSegments$okio());
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i10 = iSegment;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(c1994SegmentedByteString.getDirectory$okio()[i10] - i, i6);
                int i12 = i11 + 1;
                iArr[i11 + bArr.length] = c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length + i10];
                if (i10 == iSegment2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = iSegment != 0 ? c1994SegmentedByteString.getDirectory$okio()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i - i13) + iArr[length];
        return new C1994SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C1994SegmentedByteString c1994SegmentedByteString) {
        j.g(c1994SegmentedByteString, "<this>");
        byte[] bArr = new byte[c1994SegmentedByteString.size()];
        int length = c1994SegmentedByteString.getSegments$okio().length;
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        while (i < length) {
            int i10 = c1994SegmentedByteString.getDirectory$okio()[length + i];
            int i11 = c1994SegmentedByteString.getDirectory$okio()[i];
            int i12 = i11 - i4;
            C1127m.d(i6, i10, i10 + i12, c1994SegmentedByteString.getSegments$okio()[i], bArr);
            i6 += i12;
            i++;
            i4 = i11;
        }
        return bArr;
    }

    public static final void commonWrite(C1994SegmentedByteString c1994SegmentedByteString, Buffer buffer, int i, int i4) {
        j.g(c1994SegmentedByteString, "<this>");
        j.g(buffer, "buffer");
        int i6 = i + i4;
        int iSegment = segment(c1994SegmentedByteString, i);
        while (i < i6) {
            int i10 = iSegment == 0 ? 0 : c1994SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i11 = c1994SegmentedByteString.getDirectory$okio()[iSegment] - i10;
            int i12 = c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i6, i11 + i10) - i;
            int i13 = (i - i10) + i12;
            Segment segment = new Segment(c1994SegmentedByteString.getSegments$okio()[iSegment], i13, i13 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                j.d(segment2);
                Segment segment3 = segment2.prev;
                j.d(segment3);
                segment3.push(segment);
            }
            i += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i4));
    }

    public static final void forEachSegment(C1994SegmentedByteString c1994SegmentedByteString, n action) {
        j.g(c1994SegmentedByteString, "<this>");
        j.g(action, "action");
        int length = c1994SegmentedByteString.getSegments$okio().length;
        int i = 0;
        int i4 = 0;
        while (i < length) {
            int i6 = c1994SegmentedByteString.getDirectory$okio()[length + i];
            int i10 = c1994SegmentedByteString.getDirectory$okio()[i];
            action.invoke(c1994SegmentedByteString.getSegments$okio()[i], Integer.valueOf(i6), Integer.valueOf(i10 - i4));
            i++;
            i4 = i10;
        }
    }

    public static final int segment(C1994SegmentedByteString c1994SegmentedByteString, int i) {
        j.g(c1994SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c1994SegmentedByteString.getDirectory$okio(), i + 1, 0, c1994SegmentedByteString.getSegments$okio().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C1994SegmentedByteString c1994SegmentedByteString, int i, int i4, n nVar) {
        int iSegment = segment(c1994SegmentedByteString, i);
        while (i < i4) {
            int i6 = iSegment == 0 ? 0 : c1994SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i10 = c1994SegmentedByteString.getDirectory$okio()[iSegment] - i6;
            int i11 = c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i4, i10 + i6) - i;
            nVar.invoke(c1994SegmentedByteString.getSegments$okio()[iSegment], Integer.valueOf((i - i6) + i11), Integer.valueOf(iMin));
            i += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C1994SegmentedByteString c1994SegmentedByteString, int i, byte[] other, int i4, int i6) {
        j.g(c1994SegmentedByteString, "<this>");
        j.g(other, "other");
        if (i < 0 || i > c1994SegmentedByteString.size() - i6 || i4 < 0 || i4 > other.length - i6) {
            return false;
        }
        int i10 = i6 + i;
        int iSegment = segment(c1994SegmentedByteString, i);
        while (i < i10) {
            int i11 = iSegment == 0 ? 0 : c1994SegmentedByteString.getDirectory$okio()[iSegment - 1];
            int i12 = c1994SegmentedByteString.getDirectory$okio()[iSegment] - i11;
            int i13 = c1994SegmentedByteString.getDirectory$okio()[c1994SegmentedByteString.getSegments$okio().length + iSegment];
            int iMin = Math.min(i10, i12 + i11) - i;
            if (!okio.SegmentedByteString.arrayRangeEquals(c1994SegmentedByteString.getSegments$okio()[iSegment], (i - i11) + i13, other, i4, iMin)) {
                return false;
            }
            i4 += iMin;
            i += iMin;
            iSegment++;
        }
        return true;
    }
}
