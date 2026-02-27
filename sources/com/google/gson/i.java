package com.google.gson;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f9873d = new i("", "", false);
    public static final i e = new i(Global.NEWLINE, "  ", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9875b;
    public final boolean c;

    public i(String str, String str2, boolean z4) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f9874a = str;
        this.f9875b = str2;
        this.c = z4;
    }
}
