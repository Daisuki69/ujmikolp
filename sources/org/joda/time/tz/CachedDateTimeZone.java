package org.joda.time.tz;

import io.flutter.embedding.android.KeyboardMap;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final transient Info[] iInfoCache;
    private final DateTimeZone iZone;

    public static final class Info {
        private String iNameKey;
        Info iNextInfo;
        public final long iPeriodStart;
        public final DateTimeZone iZoneRef;
        private int iOffset = Integer.MIN_VALUE;
        private int iStandardOffset = Integer.MIN_VALUE;

        public Info(DateTimeZone dateTimeZone, long j) {
            this.iPeriodStart = j;
            this.iZoneRef = dateTimeZone;
        }

        public String getNameKey(long j) {
            Info info = this.iNextInfo;
            if (info != null && j >= info.iPeriodStart) {
                return info.getNameKey(j);
            }
            if (this.iNameKey == null) {
                this.iNameKey = this.iZoneRef.getNameKey(this.iPeriodStart);
            }
            return this.iNameKey;
        }

        public int getOffset(long j) {
            Info info = this.iNextInfo;
            if (info != null && j >= info.iPeriodStart) {
                return info.getOffset(j);
            }
            if (this.iOffset == Integer.MIN_VALUE) {
                this.iOffset = this.iZoneRef.getOffset(this.iPeriodStart);
            }
            return this.iOffset;
        }

        public int getStandardOffset(long j) {
            Info info = this.iNextInfo;
            if (info != null && j >= info.iPeriodStart) {
                return info.getStandardOffset(j);
            }
            if (this.iStandardOffset == Integer.MIN_VALUE) {
                this.iStandardOffset = this.iZoneRef.getStandardOffset(this.iPeriodStart);
            }
            return this.iStandardOffset;
        }
    }

    static {
        Integer integer;
        int i;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = 512;
        } else {
            int i4 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i4++;
            }
            i = 1 << i4;
        }
        cInfoCacheMask = i - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iInfoCache = new Info[cInfoCacheMask + 1];
        this.iZone = dateTimeZone;
    }

    private Info createInfo(long j) {
        long j6 = j & (-4294967296L);
        Info info = new Info(this.iZone, j6);
        long j7 = KeyboardMap.kValueMask | j6;
        Info info2 = info;
        while (true) {
            long jNextTransition = this.iZone.nextTransition(j6);
            if (jNextTransition == j6 || jNextTransition > j7) {
                break;
            }
            Info info3 = new Info(this.iZone, jNextTransition);
            info2.iNextInfo = info3;
            info2 = info3;
            j6 = jNextTransition;
        }
        return info;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private Info getInfo(long j) {
        int i = (int) (j >> 32);
        Info[] infoArr = this.iInfoCache;
        int i4 = cInfoCacheMask & i;
        Info info = infoArr[i4];
        if (info != null && ((int) (info.iPeriodStart >> 32)) == i) {
            return info;
        }
        Info infoCreateInfo = createInfo(j);
        infoArr[i4] = infoCreateInfo;
        return infoCreateInfo;
    }

    @Override // org.joda.time.DateTimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public String getNameKey(long j) {
        return getInfo(j).getNameKey(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getOffset(long j) {
        return getInfo(j).getOffset(j);
    }

    @Override // org.joda.time.DateTimeZone
    public int getStandardOffset(long j) {
        return getInfo(j).getStandardOffset(j);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    @Override // org.joda.time.DateTimeZone
    public int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    @Override // org.joda.time.DateTimeZone
    public long nextTransition(long j) {
        return this.iZone.nextTransition(j);
    }

    @Override // org.joda.time.DateTimeZone
    public long previousTransition(long j) {
        return this.iZone.previousTransition(j);
    }
}
