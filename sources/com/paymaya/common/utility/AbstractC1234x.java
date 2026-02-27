package com.paymaya.common.utility;

import android.text.TextUtils;
import android.text.format.DateFormat;
import com.dynatrace.android.agent.Global;
import com.paymaya.PayMayaApplication;
import com.paymaya.common.exception.PayMayaRuntimeException;
import d2.C1328c;
import java.util.Calendar;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.PeriodFormatter;
import ph.C2070f1;

/* JADX INFO: renamed from: com.paymaya.common.utility.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1234x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f11248a = DateTimeFormat.forPattern("dd MMMM, YYYY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DateTimeFormatter f11249b = DateTimeFormat.forPattern("MMMM dd, YYYY");
    public static final DateTimeFormatter c = DateTimeFormat.forPattern("dd MMM YYYY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final DateTimeFormatter f11250d = DateTimeFormat.forPattern("dd MMMM YYYY,\nhh:mm aa");
    public static final DateTimeFormatter e = DateTimeFormat.forPattern("MMMM dd, YYYY \nhh:mm aa");
    public static final DateTimeFormatter f = DateTimeFormat.forPattern("dd MMMM YYYY, hh:mmaa");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DateTimeFormatter f11251g = DateTimeFormat.forPattern("hh:mm aa");
    public static final DateTimeFormatter h;
    public static final DateTimeFormatter i;
    public static final DateTimeFormatter j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final DateTimeFormatter f11252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final DateTimeFormatter f11253l;
    public static final DateTimeFormatter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DateTimeFormatter f11254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final DateTimeFormatter f11255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final DateTimeFormatter f11256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final DateTimeFormatter f11257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final DateTimeFormatter f11258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final DateTimeFormatter f11259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DateTimeFormatter f11260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static PayMayaApplication f11261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static PeriodFormatter f11262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static PeriodFormatter f11263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static String f11264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static String f11265y;

    static {
        DateTimeFormat.forPattern("MM/dd/yyyy");
        h = DateTimeFormat.forPattern("E MMM dd yyyy HH:mm:ss 'GMT'Z '(UTC)'").withZoneUTC();
        i = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        j = DateTimeFormat.forPattern("E, dd MMM yyyy HH:mm:ss 'GMT'");
        f11252k = DateTimeFormat.forPattern("yyyy-MM-dd");
        f11253l = DateTimeFormat.forPattern("MMM dd, YYYY hh:mm:ss aa");
        m = DateTimeFormat.forPattern("MMM d, yyyy");
        DateTimeFormat.forPattern("MMMM d, yyyy hh:mma");
        f11254n = DateTimeFormat.forPattern("MMM d, yyyy, hh:mma");
        f11255o = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f11256p = DateTimeFormat.forPattern("MMM dd, yyyy, hh:mm aa");
        f11257q = DateTimeFormat.forPattern("MMM d, yyyy, hh:mm aa");
        f11258r = DateTimeFormat.forPattern("MMM d, yyyy\nhh:mm aa");
        f11259s = DateTimeFormat.forPattern("d MMM · h:mm aa");
        f11260t = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    }

    public static String a(String str, String str2, String str3) {
        if (str2 == null) {
            return null;
        }
        try {
            DateTime dateTime = DateTimeFormat.forPattern(str2).parseDateTime(str);
            if (dateTime != null) {
                return DateTimeFormat.forPattern(str3).withLocale(l()).print(dateTime);
            }
            return null;
        } catch (Exception unused) {
            yk.a.f21331b.getClass();
            C2070f1.m();
            return null;
        }
    }

    public static DateTime b(String str) {
        return new DateTime(DateTimeZone.UTC.convertUTCToLocal(DateTime.parse(str).getMillis()));
    }

    public static LocalDateTime c(String str) {
        try {
            return LocalDateTime.parse(str, h);
        } catch (Exception e7) {
            C1328c.a().b(e7);
            return null;
        }
    }

    public static LocalDateTime d(String str) {
        try {
            return LocalDateTime.parse(str, j);
        } catch (Exception e7) {
            C1328c.a().b(e7);
            return null;
        }
    }

    public static LocalDateTime e(String str) {
        try {
            return LocalDateTime.parse(str, i);
        } catch (Exception e7) {
            C1328c.a().b(e7);
            return null;
        }
    }

    public static String f(DateTime dateTime) {
        return f11257q.withLocale(l()).print(dateTime).replace("AM", "am").replace("PM", "pm");
    }

    public static String g(DateTime dateTime) {
        if (!dateTime.isBefore(DateTime.now())) {
            return f11264x;
        }
        Period period = new Period(dateTime, DateTime.now());
        String strPrint = new Interval(DateTime.now().minusHours(1), Hours.ONE).contains(dateTime) ? f11263w.print(period) : f11262v.print(period);
        return TextUtils.isEmpty(strPrint) ? f11264x : strPrint;
    }

    public static String h(DateTime dateTime) {
        return f11249b.withLocale(l()).print(dateTime);
    }

    public static String i(String str) {
        String[] strArrSplit = str.split(Global.HYPHEN);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]) - 1, Integer.parseInt(strArrSplit[2]));
        return DateFormat.format("MM/dd/yyyy", calendar).toString();
    }

    public static String j(DateTime dateTime) {
        return f11254n.withLocale(Locale.getDefault()).print(dateTime).replace("AM", "am").replace("PM", "pm");
    }

    public static String k(String str, String str2, String str3) {
        try {
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(str);
            DateTimeFormatter dateTimeFormatterForPattern2 = DateTimeFormat.forPattern(str3);
            return dateTimeFormatterForPattern2.withLocale(l()).print(dateTimeFormatterForPattern.parseDateTime(str2));
        } catch (Exception unused) {
            yk.a.b();
            return str2;
        }
    }

    public static synchronized Locale l() {
        PayMayaApplication payMayaApplication;
        payMayaApplication = f11261u;
        if (payMayaApplication == null) {
            throw new PayMayaRuntimeException("DateUtils was not initialized");
        }
        return payMayaApplication.getResources().getConfiguration().locale;
    }

    public static boolean m(String str, String str2) {
        try {
            DateTimeFormatter dateTimeFormatter = f11260t;
            DateTime dateTime = dateTimeFormatter.withZoneUTC().parseDateTime(str);
            DateTime dateTime2 = dateTimeFormatter.withZoneUTC().parseDateTime(str2);
            DateTime dateTimeNow = DateTime.now(DateTimeZone.UTC);
            if (dateTime.isBefore(dateTimeNow)) {
                if (dateTimeNow.isBefore(dateTime2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            yk.a.b();
            return false;
        }
    }

    public static boolean n(DateTime dateTime) {
        return new Interval(DateTime.now().withTimeAtStartOfDay(), Days.ONE).contains(dateTime);
    }
}
