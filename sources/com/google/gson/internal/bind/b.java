package com.google.gson.internal.bind;

import com.google.gson.z;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9936b = new a(Date.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9937a;

    public b(Class cls) {
        this.f9937a = cls;
    }

    public final z a(int i, int i4) {
        DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i, i4);
        z zVar = i.f9957a;
        return new TypeAdapters$29(this.f9937a, defaultDateTypeAdapter);
    }

    public abstract Date b(Date date);
}
