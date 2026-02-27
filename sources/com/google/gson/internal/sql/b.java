package com.google.gson.internal.sql;

import com.google.gson.z;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f10010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10011b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f10012d;
    public static final z e;
    public static final z f;

    static {
        boolean z4;
        try {
            Class.forName("java.sql.Date");
            z4 = true;
        } catch (ClassNotFoundException unused) {
            z4 = false;
        }
        f10010a = z4;
        if (z4) {
            f10011b = new a(Date.class, 0);
            c = new a(Timestamp.class, 1);
            f10012d = SqlDateTypeAdapter.f10004b;
            e = SqlTimeTypeAdapter.f10006b;
            f = SqlTimestampTypeAdapter.f10008b;
            return;
        }
        f10011b = null;
        c = null;
        f10012d = null;
        e = null;
        f = null;
    }
}
