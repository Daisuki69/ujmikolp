package Ui;

import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f6001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeZone f6002b;

    static {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, "true", "false");
        f6001a = hashSet;
        f6002b = TimeZone.getTimeZone("UTC");
    }

    public static Long a(Object obj) {
        Calendar calendar;
        Long lC = c(obj);
        if (lC == null) {
            calendar = null;
        } else {
            calendar = Calendar.getInstance();
            calendar.setTimeZone(f6002b);
            calendar.setTimeInMillis(lC.longValue());
        }
        if (calendar == null) {
            return null;
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Long.valueOf(calendar.getTimeInMillis());
    }

    public static Long b(Object obj) {
        Calendar calendar;
        Long lC = c(obj);
        if (lC == null) {
            calendar = null;
        } else {
            calendar = Calendar.getInstance();
            calendar.setTimeZone(f6002b);
            calendar.setTimeInMillis(lC.longValue());
        }
        if (calendar == null) {
            return null;
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Long.valueOf(calendar.getTimeInMillis());
    }

    public static Long c(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static HashSet d(Collection collection) {
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().toString());
        }
        return hashSet;
    }
}
