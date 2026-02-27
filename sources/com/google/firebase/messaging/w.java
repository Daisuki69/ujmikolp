package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f9814d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9816b;
    public final String c;

    public w(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f9814d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(We.s.j("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f9815a = strSubstring;
        this.f9816b = str;
        this.c = androidx.camera.core.impl.a.j(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f9815a.equals(wVar.f9815a) && this.f9816b.equals(wVar.f9816b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f9816b, this.f9815a);
    }
}
