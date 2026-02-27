package org.joda.time;

/* JADX INFO: loaded from: classes5.dex */
public interface ReadWritablePeriod extends ReadablePeriod {
    void add(int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14);

    void add(DurationFieldType durationFieldType, int i);

    void add(ReadableInterval readableInterval);

    void add(ReadablePeriod readablePeriod);

    void addDays(int i);

    void addHours(int i);

    void addMillis(int i);

    void addMinutes(int i);

    void addMonths(int i);

    void addSeconds(int i);

    void addWeeks(int i);

    void addYears(int i);

    void clear();

    void set(DurationFieldType durationFieldType, int i);

    void setDays(int i);

    void setHours(int i);

    void setMillis(int i);

    void setMinutes(int i);

    void setMonths(int i);

    void setPeriod(int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14);

    void setPeriod(ReadableInterval readableInterval);

    void setPeriod(ReadablePeriod readablePeriod);

    void setSeconds(int i);

    void setValue(int i, int i4);

    void setWeeks(int i);

    void setYears(int i);
}
