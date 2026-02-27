package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdg {
    private final zzauu zza;

    @VisibleForTesting
    public zzfdg(zzauu zzauuVar) {
        this.zza = zzauuVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzauv {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(Global.SEMICOLON)) {
                            if (uri.toString().contains("dc_ms=")) {
                                throw new zzauv("Parameter already exists: dc_ms");
                            }
                            String string = uri.toString();
                            int iIndexOf = string.indexOf(";adurl");
                            if (iIndexOf != -1) {
                                int i = iIndexOf + 1;
                                StringBuilder sb2 = new StringBuilder(string.substring(0, i));
                                sb2.append("dc_ms=");
                                sb2.append(str);
                                sb2.append(Global.SEMICOLON);
                                sb2.append((CharSequence) string, i, string.length());
                                return Uri.parse(sb2.toString());
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath == null) {
                                throw new UnsupportedOperationException();
                            }
                            int iIndexOf2 = string.indexOf(encodedPath);
                            StringBuilder sb3 = new StringBuilder(string.substring(0, encodedPath.length() + iIndexOf2));
                            sb3.append(";dc_ms=");
                            sb3.append(str);
                            sb3.append(Global.SEMICOLON);
                            sb3.append((CharSequence) string, iIndexOf2 + encodedPath.length(), string.length());
                            return Uri.parse(sb3.toString());
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new zzauv("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
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
        StringBuilder sb4 = new StringBuilder(string2.substring(0, i4));
        sb4.append("ms=");
        sb4.append(str);
        sb4.append("&");
        sb4.append((CharSequence) string2, i4, string2.length());
        return Uri.parse(sb4.toString());
    }

    public final Uri zza(Uri uri, Context context, View view, @Nullable Activity activity) throws zzauv {
        try {
            return zzb(uri, this.zza.zzb().zzf(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzauv("Provided Uri is not in a valid state");
        }
    }
}
