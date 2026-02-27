package kotlin.time;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.ranges.d;
import okhttp3.internal.http2.Http2Connection;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0097a f18208b = new C0097a(null);
    public static final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f18209d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18210a;

    /* JADX INFO: renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0097a {
        public C0097a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i = Aj.a.f329a;
        c = b.a(4611686018427387903L);
        f18209d = b.a(-4611686018427387903L);
    }

    public static final long a(long j, long j6) {
        long j7 = PlaybackException.CUSTOM_ERROR_CODE_BASE;
        long j9 = j6 / j7;
        long j10 = j + j9;
        if (-4611686018426L > j10 || j10 >= 4611686018427L) {
            return b.a(d.c(j10, -4611686018427387903L, 4611686018427387903L));
        }
        return b.c((j10 * j7) + (j6 - (j9 * j7)));
    }

    public static final void b(StringBuilder sb2, int i, int i4, int i6, String str, boolean z4) {
        sb2.append(i);
        if (i4 != 0) {
            sb2.append('.');
            String strK = C2576A.K(i6, String.valueOf(i4));
            int i10 = -1;
            int length = strK.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (strK.charAt(length) != '0') {
                        i10 = length;
                        break;
                    } else if (i11 < 0) {
                        break;
                    } else {
                        length = i11;
                    }
                }
            }
            int i12 = i10 + 1;
            if (z4 || i12 >= 3) {
                sb2.append((CharSequence) strK, 0, ((i10 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strK, 0, i12);
            }
        }
        sb2.append(str);
    }

    public static int c(long j, long j6) {
        long j7 = j ^ j6;
        if (j7 >= 0 && (((int) j7) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j6) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j6) {
            return -1;
        }
        return j == j6 ? 0 : 1;
    }

    public static final long d(long j) {
        return ((((int) j) & 1) != 1 || e(j)) ? g(j, Aj.b.c) : j >> 1;
    }

    public static final boolean e(long j) {
        return j == c || j == f18209d;
    }

    public static final long f(long j, long j6) {
        if (e(j)) {
            if (!e(j6) || (j6 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j6)) {
            return j6;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j6) & 1)) {
            return i == 1 ? a(j >> 1, j6 >> 1) : a(j6 >> 1, j >> 1);
        }
        long j7 = (j >> 1) + (j6 >> 1);
        return i == 0 ? (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) ? b.a(j7 / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE)) : b.c(j7) : b.b(j7);
    }

    public static final long g(long j, Aj.b unit) {
        j.g(unit, "unit");
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == f18209d) {
            return Long.MIN_VALUE;
        }
        long j6 = j >> 1;
        Aj.b sourceUnit = (((int) j) & 1) == 0 ? Aj.b.f330b : Aj.b.c;
        j.g(sourceUnit, "sourceUnit");
        return unit.f333a.convert(j6, sourceUnit.f333a);
    }

    public static String h(long j) {
        long j6;
        int iG;
        int i;
        int i4;
        int i6;
        long j7 = j;
        if (j7 == 0) {
            return "0s";
        }
        if (j7 == c) {
            return "Infinity";
        }
        if (j7 == f18209d) {
            return "-Infinity";
        }
        boolean z4 = j7 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z4) {
            sb2.append('-');
        }
        if (j7 < 0) {
            j7 = ((long) (((int) j7) & 1)) + ((-(j7 >> 1)) << 1);
            int i10 = Aj.a.f329a;
        }
        long jG = g(j7, Aj.b.f332g);
        if (e(j7)) {
            j6 = 0;
            iG = 0;
        } else {
            j6 = 0;
            iG = (int) (g(j7, Aj.b.f) % ((long) 24));
        }
        int iG2 = e(j7) ? 0 : (int) (g(j7, Aj.b.e) % ((long) 60));
        int iG3 = e(j7) ? 0 : (int) (g(j7, Aj.b.f331d) % ((long) 60));
        if (e(j7)) {
            i = 0;
        } else {
            i = (int) ((((int) j7) & 1) == 1 ? ((j7 >> 1) % ((long) 1000)) * ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE) : (j7 >> 1) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        }
        boolean z5 = jG != j6;
        boolean z8 = iG != 0;
        boolean z9 = iG2 != 0;
        boolean z10 = (iG3 == 0 && i == 0) ? false : true;
        if (z5) {
            sb2.append(jG);
            sb2.append('d');
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (z8 || (z5 && (z9 || z10))) {
            int i11 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(iG);
            sb2.append('h');
            i4 = i11;
        }
        if (z9 || (z10 && (z8 || z5))) {
            int i12 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            sb2.append(iG2);
            sb2.append('m');
            i4 = i12;
        }
        if (z10) {
            i6 = i4 + 1;
            if (i4 > 0) {
                sb2.append(' ');
            }
            if (iG3 != 0 || z5 || z8 || z9) {
                b(sb2, iG3, i, 9, CmcdData.Factory.STREAMING_FORMAT_SS, false);
            } else if (i >= 1000000) {
                b(sb2, i / PlaybackException.CUSTOM_ERROR_CODE_BASE, i % PlaybackException.CUSTOM_ERROR_CODE_BASE, 6, "ms", false);
            } else if (i >= 1000) {
                b(sb2, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb2.append(i);
                sb2.append("ns");
            }
        } else {
            i6 = i4;
        }
        if (z4 && i6 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return c(this.f18210a, aVar.f18210a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f18210a == ((a) obj).f18210a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f18210a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return h(this.f18210a);
    }
}
