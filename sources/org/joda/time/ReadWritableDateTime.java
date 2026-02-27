package org.joda.time;

/* JADX INFO: loaded from: classes5.dex */
public interface ReadWritableDateTime extends ReadableDateTime, ReadWritableInstant {
    void addDays(int i);

    void addHours(int i);

    void addMillis(int i);

    void addMinutes(int i);

    void addMonths(int i);

    void addSeconds(int i);

    void addWeeks(int i);

    void addWeekyears(int i);

    void addYears(int i);

    void setDate(int i, int i4, int i6);

    void setDateTime(int i, int i4, int i6, int i10, int i11, int i12, int i13);

    void setDayOfMonth(int i);

    void setDayOfWeek(int i);

    void setDayOfYear(int i);

    void setHourOfDay(int i);

    void setMillisOfDay(int i);

    void setMillisOfSecond(int i);

    void setMinuteOfDay(int i);

    void setMinuteOfHour(int i);

    void setMonthOfYear(int i);

    void setSecondOfDay(int i);

    void setSecondOfMinute(int i);

    void setTime(int i, int i4, int i6, int i10);

    void setWeekOfWeekyear(int i);

    void setWeekyear(int i);

    void setYear(int i);
}
