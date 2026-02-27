package com.shield.android.context;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public class s implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15182d = {600279940, 1112405521, 1302095700, 561984863, 1191771446};
    private u dJ;
    private final Context eA;
    private final LocationManager ez;
    private final String ex = CmcdData.Factory.STREAMING_FORMAT_SS;
    private boolean dL = ((int) f15182d[0]) ^ 600279940;
    private final LocationListener ey = new LocationListener() { // from class: com.shield.android.context.s.1

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15183d = {1496442648, 154222945};

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            if (s.this.dJ == null || location == null) {
                s.this.aM();
            } else {
                s.a(s.this, ((int) f15183d[0]) ^ 1496442649);
                s.this.dJ.getLocation(location);
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            com.shield.android.k.a aVarK = com.shield.android.k.a.K(s.this.ex);
            long[] jArr = f15183d;
            Object[] objArr = new Object[((int) jArr[0]) ^ 1496442649];
            objArr[((int) jArr[1]) ^ 154222945] = str;
            aVarK.b("Request updates from %s provider disabled", objArr);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            com.shield.android.k.a aVarK = com.shield.android.k.a.K(s.this.ex);
            long[] jArr = f15183d;
            Object[] objArr = new Object[((int) jArr[0]) ^ 1496442649];
            objArr[((int) jArr[1]) ^ 154222945] = str;
            aVarK.b("Request updates from %s provider enabled.", objArr);
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public s(Context context) {
        this.eA = context;
        this.ez = (LocationManager) com.shield.android.internal.i.c(context, g("蠡蠢蠮蠬蠹蠤蠢蠣"));
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15182d[0]) ^ 600279940;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15182d;
            long j = jArr[4];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1191736699) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1191736699) + (((int) j6) ^ 1112405520), i4 | (~(((int) j) ^ 1191736699)), i6, (((int) j) ^ 1191736699) + cCharAt + (((int) j6) ^ 1112405520) + ((~(((int) j) ^ 1191736699)) | i4)));
            long j7 = f15182d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1112405520) + (((int) j7) ^ 1112405520) + ((~(((int) j7) ^ 1112405520)) | i10) + (((((int) j7) ^ 1112405520) + i) - ((((((int) j7) ^ 1112405520) + i) + (((int) j7) ^ 1112405520)) + ((~(((int) j7) ^ 1112405520)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str) {
        if (this.dL) {
            return;
        }
        try {
            this.ez.removeUpdates(this.ey);
            u uVar = this.dJ;
            if (uVar != null) {
                uVar.getLocation(this.ez.getLastKnownLocation(str));
            }
        } catch (Exception unused) {
            u uVar2 = this.dJ;
            if (uVar2 != null) {
                uVar2.getLocation(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.shield.android.context.t
    @SuppressLint({"MissingPermission"})
    public final void aM() {
        if (com.shield.android.internal.i.j(this.eA, g("蠬蠣蠩蠿蠢蠤蠩衣蠽蠨蠿蠠蠤蠾蠾蠤蠢蠣衣蠌蠎蠎蠈蠞蠞蠒蠋蠄蠃蠈蠒蠁蠂蠎蠌蠙蠄蠂蠃")) || com.shield.android.internal.i.j(this.eA, g("蠬蠣蠩蠿蠢蠤蠩衣蠽蠨蠿蠠蠤蠾蠾蠤蠢蠣衣蠌蠎蠎蠈蠞蠞蠒蠎蠂蠌蠟蠞蠈蠒蠁蠂蠎蠌蠙蠄蠂蠃"))) {
            String bestProvider = this.ez.getBestProvider(new Criteria(), ((int) f15182d[1]) ^ 1112405520);
            if (bestProvider != null) {
                this.ez.requestLocationUpdates(bestProvider, 1302093956 ^ f15182d[2], 0.0f, this.ey, Looper.getMainLooper());
                new Handler(Looper.getMainLooper()).postDelayed(new androidx.media3.common.util.g(21, this, bestProvider), f15182d[3] ^ 561981143);
            }
        }
    }

    @Override // com.shield.android.context.t
    @SuppressLint({"MissingPermission"})
    public final void aN() {
        this.ez.removeUpdates(this.ey);
    }

    @Override // com.shield.android.context.t
    public final void aO() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.shield.android.context.t
    @SuppressLint({"MissingPermission"})
    public final Location aP() {
        try {
            if (!com.shield.android.internal.i.j(this.eA, g("蠬蠣蠩蠿蠢蠤蠩衣蠽蠨蠿蠠蠤蠾蠾蠤蠢蠣衣蠌蠎蠎蠈蠞蠞蠒蠋蠄蠃蠈蠒蠁蠂蠎蠌蠙蠄蠂蠃")) && !com.shield.android.internal.i.j(this.eA, g("蠬蠣蠩蠿蠢蠤蠩衣蠽蠨蠿蠠蠤蠾蠾蠤蠢蠣衣蠌蠎蠎蠈蠞蠞蠒蠎蠂蠌蠟蠞蠈蠒蠁蠂蠎蠌蠙蠄蠂蠃"))) {
                return null;
            }
            String bestProvider = this.ez.getBestProvider(new Criteria(), ((int) f15182d[1]) ^ 1112405520);
            if (bestProvider != null) {
                return this.ez.getLastKnownLocation(bestProvider);
            }
            return null;
        } catch (Exception e) {
            com.shield.android.k.a.dL().a(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean a(s sVar, boolean z4) {
        boolean z5 = ((int) f15182d[1]) ^ 1112405520;
        sVar.dL = z5;
        return z5;
    }

    @Override // com.shield.android.context.t
    public final void a(u uVar) {
        this.dJ = uVar;
    }
}
