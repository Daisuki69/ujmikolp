package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauu {
    private static final String[] zzc = {"/aclk", "/pcs/click", "/dbm/clk"};
    private final String zza = "ad.doubleclick.net";
    private final String[] zzb = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final zzaup zzd;

    @Deprecated
    public zzauu(zzaup zzaupVar) {
        this.zzd = zzaupVar;
    }

    private final Uri zzf(Uri uri, String str) throws zzauv {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.zza)) {
                    if (uri.getPath().contains(Global.SEMICOLON)) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new zzauv("Parameter already exists: dc_ms");
                        }
                        String string = uri.toString();
                        int iIndexOf = string.indexOf(";adurl");
                        if (iIndexOf != -1) {
                            int i = iIndexOf + 1;
                            return Uri.parse(string.substring(0, i) + "dc_ms=" + str + Global.SEMICOLON + string.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int iIndexOf2 = string.indexOf(encodedPath);
                        return Uri.parse(string.substring(0, encodedPath.length() + iIndexOf2) + ";dc_ms=" + str + Global.SEMICOLON + string.substring(iIndexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new zzauv("Query parameter already exists: ms");
            }
            String string2 = uri.toString();
            int iIndexOf3 = string2.indexOf("&adurl");
            if (iIndexOf3 == -1) {
                iIndexOf3 = string2.indexOf("?adurl");
            }
            if (iIndexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i4 = iIndexOf3 + 1;
            return Uri.parse(string2.substring(0, i4) + "ms=" + str + "&" + string2.substring(i4));
        } catch (UnsupportedOperationException unused2) {
            throw new zzauv("Provided Uri is not in a valid state");
        }
    }

    public final boolean zza(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.zzb;
            for (int i = 0; i < 3; i++) {
                if (host.endsWith(strArr[i])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @Deprecated
    public final zzaup zzb() {
        return this.zzd;
    }

    @Deprecated
    public final void zzc(MotionEvent motionEvent) {
        this.zzd.zzd(motionEvent);
    }

    @Deprecated
    public final Uri zzd(Uri uri, Context context, View view, Activity activity) throws zzauv {
        try {
            return zzf(uri, this.zzd.zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzauv("Provided Uri is not in a valid state");
        }
    }

    public final boolean zze(Uri uri) {
        if (zza(uri)) {
            String[] strArr = zzc;
            for (int i = 0; i < 3; i++) {
                if (uri.getPath().endsWith(strArr[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
